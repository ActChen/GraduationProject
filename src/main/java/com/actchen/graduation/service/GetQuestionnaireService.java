package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.Questionnaire;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 3:36 下午
 */
@Service
public class GetQuestionnaireService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public JSONArray getQuestionnaire(){
        List<Questionnaire> questionnaireList = conclusionInfoMapper.getQuestion();
        System.out.println(questionnaireList);

        JSONArray result = new JSONArray();

        for (Questionnaire questionnaire: questionnaireList){
            JSONObject res = new JSONObject();
            String questionStr = questionnaire.getQuestion();
            JSONArray questionArr = JSONArray.parseArray(questionStr);
            Integer num = questionnaire.getNum();

            res.put("questionnaire", questionArr);
            res.put("num", num);

            result.add(res);
        }

        return result;
    }

}
