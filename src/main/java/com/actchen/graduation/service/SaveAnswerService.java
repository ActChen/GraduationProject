package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 5:39 下午
 */
@Service
public class SaveAnswerService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public void saveAnswer(Answer answer){
        conclusionInfoMapper.saveAnswer(answer);
    }

}
