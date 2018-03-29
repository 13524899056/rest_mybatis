package com.jack.rest.service;

import com.jack.rest.intf.HelloDto;
import com.jack.rest.intf.RpcIntf;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/29.
 */
@Component
public class RpcService implements RpcIntf {

    public HelloDto sayHello(HelloDto h){
        System.out.println(h.getHello());
        h.setHello("you are wll come" + h.getHello());
        return h;
    }
}
