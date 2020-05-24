package com.actchen.graduation.controller.admin;

import com.actchen.graduation.service.admin.GetQuestionInfoService;
import com.actchen.graduation.util.SubmitRequestBodyModel;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/24 1:15 下午
 */
@RestController
@RequestMapping("/get")
public class GetQuestionInfoController {

    @Autowired
    private GetQuestionInfoService getQuestionInfoService;

    @RequestMapping(value = "/question", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray getQuestionInfo(@RequestBody SubmitRequestBodyModel param){
        /**
         * 获取问卷信息
         */
        String time = param.getTime();
        String userId = param.getUserId();

        System.out.println(time);
        System.out.println(userId);

        return getQuestionInfoService.getQuestion(userId, time);
    }

}
