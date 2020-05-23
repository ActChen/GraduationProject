package com.actchen.graduation.controller;

import com.actchen.graduation.service.SelectTestHistoryService;
import com.actchen.graduation.util.SubmitRequestBodyModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/5 9:52 下午
 */
@Controller
@RequestMapping("/get")
public class GetTestHistoryController {

    @Autowired
    private SelectTestHistoryService selectTestHistoryService;

    @RequestMapping(value = "/history", method = RequestMethod.POST)
    @ResponseBody
    public List<JSONObject> getTestHistory(@RequestBody SubmitRequestBodyModel param) {

        /**
         * 查看历史评测记录  返回为诊断结果和诊断时间
         */

        String userId = param.getUserId();
        System.out.println(userId);
        return selectTestHistoryService.selectHistoryByUserId(userId);

    }

}
