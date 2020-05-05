package com.actchen.graduation.model;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 2:29 下午
 * mysql conclusionInfo表实体类
 */
public class ConclusionInfo {

    private String userId;

    private String question;

    private String conclusion;

    private String time;

    public ConclusionInfo(String userId, String question, String conclusion, String time) {
        this.userId = userId;
        this.question = question;
        this.conclusion = conclusion;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "userId:   " + userId + "   question:   " + question + "   conclusion:   " + conclusion + "   time:   " + time;
    }
}
