package com.actchen.graduation.controller.admin;

import com.actchen.graduation.service.admin.SearchService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/6/8 10:47 上午
 */
@RestController
@RequestMapping("/do")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/search/{key}", method = RequestMethod.GET)
    public List<JSONObject> search(@PathVariable("key") String key) {
        return searchService.search(key);
    }

}
