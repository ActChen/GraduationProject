package com.actchen.graduation.util;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/25 11:01 下午
 */
public class SubmitRequestBodyModel {

    private String userId;     // 用户唯一性ID

    private JSONArray question;   //问卷

    private List<Integer> greadCount;   //问卷成绩

    private Integer tableNum;   //问卷号 每个问卷有不同结论

    private String code;


    public List getGreadCount() {
        return greadCount;
    }

    public void setGreadCount(List greadCount) {
        this.greadCount = greadCount;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public JSONArray getQuestion() {
        return question;
    }

    public void setQuestion(JSONArray question) {
        this.question = question;
    }
}
