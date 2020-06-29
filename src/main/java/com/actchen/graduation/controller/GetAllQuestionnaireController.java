package com.actchen.graduation.controller;

import com.actchen.graduation.service.GetQuestionnaireService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 3:34 下午
 */
@RestController
@RequestMapping("/get")
public class GetAllQuestionnaireController {
    /**
     * 获取问卷
     */

    @Autowired
    private GetQuestionnaireService getQuestionnaireService;

    @RequestMapping(value = "/questionnaire", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray getQuestionnaire(){
        return getQuestionnaireService.getQuestionnaire();
    }

}
