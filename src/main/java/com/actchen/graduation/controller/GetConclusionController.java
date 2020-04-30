package com.actchen.graduation.controller;

import com.actchen.graduation.model.SubmitRequestBodyModel;
import com.actchen.graduation.service.GetUnionIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/conclusion", method = RequestMethod.POST)
    public String getUnionId(@RequestBody SubmitRequestBodyModel param) {
        //根据问卷得出结论
        List greatCount = param.getGreadCount();
        Integer tableNum = param.getTableNum();


        return "返回成功";
    }

}
