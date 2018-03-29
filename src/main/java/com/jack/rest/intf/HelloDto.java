package com.jack.rest.intf;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/29.
 */
public class HelloDto implements Serializable {
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
