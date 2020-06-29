package com.actchen.graduation.controller;

import com.actchen.graduation.model.Answer;
import com.actchen.graduation.model.Conclusion;
import com.actchen.graduation.model.ResultDto;
import com.actchen.graduation.service.SaveAnswerService;
import com.actchen.graduation.service.SaveTestConclusionService;
import com.actchen.graduation.util.SubmitRequestBodyModel;
import com.actchen.graduation.service.GetConclusionService;
import com.actchen.graduation.service.GetUnionIdService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/25 3:07 下午
 */
@RestController
@RequestMapping("/get")
public class GetConclusionController {

    private static final String appId = "wx4306e37acec238f7";

    private static final String appSecret = "3ead96cd1c1fa453c06a235592db6e47";

    @Autowired
    private GetUnionIdService getUnionIdService;

    @Autowired
    private GetConclusionService conclusionService;

    @Autowired
    private SaveTestConclusionService saveTestConclusionService;

    @Autowired
    private SaveAnswerService saveAnswerService;

    @RequestMapping(value = "/conclusion", method = RequestMethod.POST)
    public String getUnionId(@RequestBody SubmitRequestBodyModel param) {
        //根据问卷得出结论
        List<Integer> greatCount = param.getGreadCount();
        Integer tableNum = param.getTableNum();

        String userId = param.getUserId();
        JSONArray question = param.getQuestion();

        System.out.println(greatCount);
        System.out.println(tableNum);
        System.out.println(userId);
        System.out.println(question);

        //将评测记录存入数据库
        ResultDto resultDto = conclusionService.getConclusion(greatCount, tableNum);
        //时间戳
        long time = new Date().getTime();
        Conclusion conclusionInfo = new Conclusion(userId,resultDto.getConclusion(),resultDto.getAdvise(),tableNum,String.valueOf(time));

        //保存诊断结论
        saveTestConclusionService.saveConclusion(conclusionInfo);

        //保存答卷信息
        Answer answer = new Answer(userId, question.toJSONString() , String.valueOf(time));
        saveAnswerService.saveAnswer(answer);

        return resultDto.getConclusion();
    }

}
