package com.actchen.graduation.controller;

import com.actchen.graduation.model.User;
import com.actchen.graduation.service.SaveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 4:41 下午
 */
@RestController
@RequestMapping("/save")
public class SaveUserInfoController {

    @Autowired
    private SaveUserService saveUserService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public void save(@RequestBody User user){
        long time = new Date().getTime();
        user.setTime(String.valueOf(time));
        saveUserService.save(user);
    }

}
