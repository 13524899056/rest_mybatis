package com.jack.rest.service;


import com.jack.rest.mapper.FollowMapper;
import com.jack.rest.model.Follow;
import com.jack.rest.model.FollowExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/28.
 */
@Service
public class FollowService {

    @Autowired
    private FollowMapper followMapper;

    public List<Follow> getFollows() {
        FollowExample f = new FollowExample();

        return followMapper.selectByExample(f);
    }
}
