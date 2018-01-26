package com.rsh.framework.weixin_mp.model.shop.product;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created By Rsh
 * 商品属性
 *
 * @Description
 * @Date: 2018/1/26
 * @Time: 11:57
 */
public class Property {

    @JSONField(name = "id")
    private String id;
    @JSONField(name = "vid")
    private String vid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }
}
