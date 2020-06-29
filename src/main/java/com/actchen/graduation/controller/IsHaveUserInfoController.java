package com.actchen.graduation.controller;

import com.actchen.graduation.service.IsUserService;
import com.actchen.graduation.util.SubmitRequestBodyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 6:05 下午
 */
@RestController
@RequestMapping("/is")
public class IsHaveUserInfoController {

    @Autowired
    private IsUserService isUserService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Boolean isUser(@RequestBody SubmitRequestBodyModel param) {
        String userId = param.getUserId();
        System.out.println(userId);
        return isUserService.isUser(userId);
    }

}
