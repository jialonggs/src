package com.jialong.jlmanager.controller.CommController;

import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.model.ResponseDataEntity;
import com.jialong.jlmanager.util.ImageUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.*;

@RestController
@RequestMapping("/comm")
public class CommControllers {

    @Value("${img.location}")
    private String location;

    @Value("${imgurl.url}")
    public  String imgurl;


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
            String fileUrl = ""; //文件的绝对路径
            try {
                // 存储文件
//                String path = "src/main/resources/static/img/";
                fileUrl = ImageUtil.saveImg(file,location,userId,imgPakage,fileTyle,imgurl);
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



    /**
     * 删除图片
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/delfile/delImage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity delImage(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        String url = requestBean.getData();
        if(null == url || url == "") {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("图片地址为空");
            return responseDataEntity;
        }
        Boolean delFlag = ImageUtil.delImage(imgurl,url,location);
        if(delFlag){
            responseDataEntity.setCode(0);
        }else {
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("图片删除失败");
        }
        return  responseDataEntity;
    }
}
