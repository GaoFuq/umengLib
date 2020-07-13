package com.gfq.umenglib.umlogin;

/**
 * @created GaoFuq
 * @Date 2020/7/13 15:17
 * @Descaption
 */
public class UmThirdPartLoginBean {
    /**
     * 用户唯一标识
     */
    private String uid;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 用户性别  该字段会直接返回男女
     */
    private String gender;
    /**
     * //用户头像
     */
    private String iconurl;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }
}
