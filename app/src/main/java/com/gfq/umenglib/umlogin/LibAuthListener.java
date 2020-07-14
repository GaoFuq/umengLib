package com.gfq.umenglib.umlogin;

import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

/**
 * @created GaoFuq
 * @Date 2020/7/14 13:14
 * @Descaption
 */
public interface LibAuthListener {
    void onComplete( UmThirdPartLoginBean bean);

    void onError( Throwable var3);

    void onCancel();
}
