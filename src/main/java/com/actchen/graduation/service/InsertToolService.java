package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.Questionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 3:04 下午
 */
@Service
public class InsertToolService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public void insert(Questionnaire data){

        conclusionInfoMapper.insertQuestion(data);
    }

}
