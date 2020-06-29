package com.actchen.graduation.model;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 2:29 下午
 * mysql conclusionInfo表实体类
 */
public class Conclusion {

    private String userId;

    private String conclusion;

    private String advise;

    private Integer tableNum;

    private String time;

    public Conclusion(){ }

    public Conclusion(String userId, String conclusion, String advise, Integer tableNum, String time) {
        this.userId = userId;
        this.conclusion = conclusion;
        this.advise = advise;
        this.tableNum = tableNum;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    @Override
    public String toString() {
        return "Conclusion{" +
                "userId='" + userId + '\'' +
                ", conclusion='" + conclusion + '\'' +
                ", advise='" + advise + '\'' +
                ", tableNum=" + tableNum +
                ", time='" + time + '\'' +
                '}';
    }
}
