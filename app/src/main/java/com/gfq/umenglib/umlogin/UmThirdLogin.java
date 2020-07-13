package com.gfq.umenglib.umlogin;

import android.app.Activity;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.HashMap;
import java.util.Map;

/**
 * @created GaoFuq
 * @Date 2020/7/13 15:10
 * @Descaption
 */
public class UmThirdLogin {
   public static void thirdPartLogin(Activity activity, SHARE_MEDIA platform, UMAuthListener authListener) {
        UMShareAPI.get(activity).getPlatformInfo(activity, platform, authListener);
    }
}
