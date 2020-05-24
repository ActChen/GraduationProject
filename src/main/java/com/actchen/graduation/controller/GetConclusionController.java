package com.actchen.graduation.controller;

import com.actchen.graduation.model.ConclusionInfo;
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

    @RequestMapping(value = "/conclusion", method = RequestMethod.POST)
    public String getUnionId(@RequestBody SubmitRequestBodyModel param) {
        //根据问卷得出结论
        List<Integer> greatCount = param.getGreadCount();
        Integer tableNum = param.getTableNum();

        String userId = param.getUserId();
        JSONArray question = param.getQuestion();

        String name = param.getName();
        String phone = param.getPhone();

        System.out.println(greatCount);
        System.out.println(tableNum);
        System.out.println(userId);
        System.out.println(question);
        System.out.println(name);
        System.out.println(phone);

        //将评测记录存入数据库
        String result = conclusionService.getConclusion(greatCount, tableNum);
        //时间戳
        long time = new Date().getTime();
        ConclusionInfo conclusionInfo = new ConclusionInfo(userId, question.toJSONString(), result, String.valueOf(time),name,phone);

        saveTestConclusionService.saveConclusion(conclusionInfo);

        return result;
    }

}
