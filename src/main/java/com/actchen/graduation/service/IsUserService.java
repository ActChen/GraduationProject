package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 6:08 下午
 */
@Service
public class IsUserService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public boolean isUser(String userId){
        List<User> users = conclusionInfoMapper.selectUser(userId);
        return users.isEmpty();
    }

}
