package com.actchen.graduation.model;

import com.alibaba.fastjson.JSONArray;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 5:36 下午
 */
public class Answer {

    private String userId;

    private String answerInfo;

    private String time;

    public Answer(){}

    public Answer(String userId, String answerInfo, String time) {
        this.userId = userId;
        this.answerInfo = answerInfo;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
