package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 4:45 下午
 */
@Service
public class SaveUserService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public void save(User user){
        conclusionInfoMapper.saveUser(user);
    }

}
