package com.gfq.umenglib.umshare;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.os.Build;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.editorpage.ShareActivity;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

import java.util.ArrayList;

/**
 * @created GaoFuq
 * @Date 2020/7/13 14:20
 * @Descaption
 */
public class UmShareUtil {
    public static void shareText(Activity activity, String shareContent, SHARE_MEDIA[] shareMedias, UMShareListener shareListener,boolean withBoard) {
        if(withBoard) {
            new ShareAction(activity).withText(shareContent).setDisplayList(shareMedias).setCallback(shareListener).open();
        }else {
            new ShareAction(activity).withText(shareContent).setPlatform(shareMedias[0]).setCallback(shareListener).share();
        }
    }

    public static void shareImage(Activity activity,  UMImage umImage, SHARE_MEDIA[] shareMedias, UMShareListener shareListener,boolean withBoard) {
        if(withBoard) {
            new ShareAction(activity).withMedia(umImage).setDisplayList(shareMedias).setCallback(shareListener).open();
        }else {
            new ShareAction(activity).withMedia(umImage).setPlatform(shareMedias[0]).setCallback(shareListener).share();
        }
    }


    //UMImage image = new UMImage(ShareActivity.this, "imageurl");//网络图片
    //UMImage image = new UMImage(ShareActivity.this, file);//本地文件
    //UMImage image = new UMImage(ShareActivity.this, R.drawable.xxx);//资源文件
    //UMImage image = new UMImage(ShareActivity.this, bitmap);//bitmap文件
    //UMImage image = new UMImage(ShareActivity.this, byte[]);//字节流
    public static void shareImgWithNoBoard(Activity activity, SHARE_MEDIA shareMedia, UMImage umImage, UMShareListener shareListener) {
        new ShareAction(activity)
                .setPlatform(shareMedia)//传入平台
                .withMedia(umImage)//分享内容
                .setCallback(shareListener)//回调监听器
                .share();
    }


    public static void shareUrl(Activity activity,String url,String title,UMImage thumb,String description,boolean withBoard){
        UMWeb web = new UMWeb(url);
        web.setTitle(title);//标题
        web.setThumb(thumb);  //缩略图
        web.setDescription(description);//描述
        if(withBoard){
            new ShareAction(activity).withMedia(web).open();
        }else {
            new ShareAction(activity).withMedia(web).share();
        }
    }

}
