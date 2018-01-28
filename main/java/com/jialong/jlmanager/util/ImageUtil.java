package com.jialong.jlmanager.util;

import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class ImageUtil {
    /**
     * 保存文件，直接以multipartFile形式
     * @param multipartFile
     * @param path 文件保存绝对路径
     * @return 返回文件名
     * @throws IOException
     */
    public static String saveImg(MultipartFile multipartFile, String path,String userId ,String imgPakage,String imgType) throws IOException {
        // 路径 基本路径+用户ID+图片类型
        path = path+imgPakage+"/"+userId+"/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileInputStream fileInputStream = (FileInputStream) multipartFile.getInputStream();
        Date date = new Date();
         // 文件的命名 随机数+时间戳
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        String fileName = rannum+"_"+date.getTime()+imgType;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + File.separator + fileName));
        byte[] bs = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bos.flush();
        bos.close();
        String url = "";
        // 图片的绝对路径
        url = path + fileName;
        return url;
    }

}
