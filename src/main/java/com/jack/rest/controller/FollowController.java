package com.jack.rest.controller;

import com.jack.rest.model.Follow;
import com.jack.rest.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/3/29.
 */
@RestController
@RequestMapping("v1/follow")
public class FollowController {

    @Autowired
    private FollowService followService;

    @RequestMapping("/list")
    public List<Follow> list(){
        return followService.getFollows();
    }
}
