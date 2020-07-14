package com.gfq.umenglib;

import android.content.Context;
import android.util.Log;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * @created GaoFuq
 * @Date 2020/7/13 11:51
 * @Descaption  分享的代码 建议使用友盟官方代码。
 * https://developer.umeng.com/docs/128606/detail/129622?acm=lb-zebra-609113-7807334.1003.4.7263708&scm=1003.4.lb-zebra-609113-7807334.OTHER_15782620770131_7263708#h2-u5206u4EAB17
 */
public class UmengLib {
    private static final String TAG = "UmengLib";
    public static void init(Context appContext, String appKey, String Umeng_Message_Secret) {
        UMConfigure.init(appContext, appKey, "Umeng", UMConfigure.DEVICE_TYPE_PHONE, Umeng_Message_Secret);
        //获取消息推送代理示例
        PushAgent mPushAgent = PushAgent.getInstance(appContext);
        //mPushAgent.setNotificationPlaySound(MsgConstant.NOTIFICATION_PLAY_SERVER); //服务端控制声音
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {
            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回deviceToken deviceToken是推送消息的唯一标志
                Log.e(TAG, "注册成功：deviceToken：-------->  " + deviceToken);
            }
            @Override
            public void onFailure(String s, String s1) {
                Log.e(TAG, "注册失败：-------->  " + "s:" + s + ",s1:" + s1);
            }
        });

    }
}
