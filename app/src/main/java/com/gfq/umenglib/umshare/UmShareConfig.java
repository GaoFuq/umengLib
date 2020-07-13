package com.gfq.umenglib.umshare;

import com.umeng.socialize.PlatformConfig;

/**
 * @created GaoFuq
 * @Date 2020/7/13 14:27
 * @Descaption
 */
public class UmShareConfig {
    public static void setWeiXin(String key, String secret) {
        PlatformConfig.setWeixin(key, secret);
    }

    public static void setSinaWeibo(String key, String secret, String url) {
        PlatformConfig.setSinaWeibo(key, secret, url);
    }

    public static void setQQZone(String key, String secret) {
        PlatformConfig.setQQZone(key, secret);
    }

    public static void setAlipay(String key) {
        PlatformConfig.setAlipay(key);
    }


    //豆瓣RENREN平台目前只能在服务器端配置
//        PlatformConfig.setSinaWeibo("3921700954","04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
//        PlatformConfig.setYixin("yxc0614e80c9304c11b0391514d09f13bf");
//        PlatformConfig.setQQZone("100424468","c7394704798a158208a74ab60104f0ba");
//        PlatformConfig.setTwitter("3aIN7fuF685MuZ7jtXkQxalyi","MK6FEYG63eWcpDFgRYw4w9puJhzDl0tyuqWjZ3M7XJuuG7mMbO");
//        PlatformConfig.setAlipay("2015111700822536");
//        PlatformConfig.setLaiwang("laiwangd497e70d4","d497e70d4c3e4efeab1381476bac4c5e");
//        PlatformConfig.setPinterest("1439206");
//        PlatformConfig.setKakao("e4f60e065048eb031e235c806b31c70f");
//        PlatformConfig.setDing("dingoalmlnohc0wggfedpk");
//        PlatformConfig.setVKontakte("5764965","5My6SNliAaLxEm3Lyd9J");
//        PlatformConfig.setDropbox("oz8v5apet3arcdy","h7p2pjbzkkxt02a");
//        PlatformConfig.setYnote("9c82bf470cba7bd2f1819b0ee26f86c6ce670e9b");
}
