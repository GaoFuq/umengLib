package com.gfq.umenglib.umlogin;

import android.app.Activity;
import android.util.Log;

import com.google.gson.Gson;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;


/**
 * @created GaoFuq
 * @Date 2020/7/13 15:10
 * @Descaption
 */
public class UmThirdLogin {
    public static void thirdPartLogin(Activity activity, SHARE_MEDIA platform, LibAuthListener authListener) {
        UMShareAPI.get(activity).getPlatformInfo(activity, platform, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                Gson gson = new Gson();
                String s = gson.toJson(map);
                UmThirdPartLoginBean bean = gson.fromJson(s, UmThirdPartLoginBean.class);
                authListener.onComplete(bean);
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                authListener.onError(throwable);
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {
                authListener.onCancel();
            }
        });
    }
}
