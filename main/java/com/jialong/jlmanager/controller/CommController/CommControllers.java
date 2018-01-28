package com.jialong.jlmanager.controller.CommController;

import com.jialong.jlmanager.model.ResponseDataEntity;
import com.jialong.jlmanager.util.ImageUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.*;

@RestController
@RequestMapping("/comm")
public class CommControllers {

    /**
     *
     * @param multipartFiles | 文件
     * @param userId |用户id
     * @param imgPakage | 存放文件夹
     * @return
     */
    @RequestMapping(value = "/upload/image", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity toAddImageFile(@RequestParam("imageFile[]")  MultipartFile[] multipartFiles,String userId,String imgPakage) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        if(null == multipartFiles || multipartFiles.length == 0 ) {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("文件为空");
            return responseDataEntity;
        }
        List<String> fileUrls = new ArrayList<String>();
        for (MultipartFile file : multipartFiles){
            // 获取文件类型
            String fileTyle= file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String path = "D:/image/test/"; //地址需要调整
            String fileUrl = ""; //文件的绝对路径
            try {
                // 存储文件
                System.out.print("测试");
                fileUrl = ImageUtil.saveImg(file,path,userId,imgPakage,fileTyle);
                fileUrls.add(fileUrl);
            } catch (Exception e) {
                responseDataEntity.setCode(2);
                responseDataEntity.setMsg("上传出现异常");
                return  responseDataEntity;
            }
        }
        responseDataEntity.setCode(0);
        responseDataEntity.setData(fileUrls);
        return  responseDataEntity;

    }

}
