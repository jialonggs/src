package com.jialong.jlmanager.util;

public class SplitUrlUtil {

    /**
     * 获取存储图片绝对地址
     * @param urls
     * @param slipT
     */
    public static String getFirstUrl(String urls,String slipT) {
        String url = "";
        if(null == urls || urls == "") {
            return url;
        }
        try {
            System.out.print(urls);
            String[] urlArray = urls.split(slipT);
            url = urlArray[0];
            return url;
        } catch (Exception e) {
            return url;
        }
    }
}
