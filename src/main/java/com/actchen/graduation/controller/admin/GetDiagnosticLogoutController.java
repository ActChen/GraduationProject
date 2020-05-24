package com.actchen.graduation.controller.admin;

import com.actchen.graduation.service.admin.GetDiagnosticLogOutService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/23 5:31 下午
 */
@RestController
@RequestMapping("/get")
public class GetDiagnosticLogoutController {

    @Autowired
    private GetDiagnosticLogOutService getDiagnosticLogOutService;

    /**
     * 尿失禁后台管理系统
     */
    @RequestMapping(value = "/static", method = RequestMethod.POST)
    @ResponseBody
    public List<JSONObject> getDiagnosticLog (){
        return getDiagnosticLogOutService.getStatic();
    }

}
