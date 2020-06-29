package com.actchen.graduation.model;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/6/8 5:43 下午
 */
public class ResultDto {

    private String conclusion;

    private String advise;

    public ResultDto(){

    }

    public ResultDto(String conclusion, String advise) {
        this.conclusion = conclusion;
        this.advise = advise;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }
}
