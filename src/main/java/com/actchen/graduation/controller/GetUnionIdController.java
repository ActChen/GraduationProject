package com.actchen.graduation.controller;

import com.actchen.graduation.util.SubmitRequestBodyModel;
import com.actchen.graduation.service.GetUnionIdService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/26 3:13 下午
 */
@Controller
@RequestMapping("/getId")
public class GetUnionIdController {

    @Autowired
    private GetUnionIdService getUnionIdService;

    @RequestMapping(value = "/unionId", method = RequestMethod.POST)
    @ResponseBody
    public String getUnionId(@RequestBody SubmitRequestBodyModel param) {
        String code = param.getCode();
        JSONObject res = getUnionIdService.getUnionId(code);
        return res.getString("openid");
    }
}
