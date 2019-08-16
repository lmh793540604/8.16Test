package com.example.api.entity;

import java.util.Date;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
public final class AchDto {

    private String id;

    private String perId;
    /**
     *  科目名称
     */
    private String subjectName;
    /**
     * 成绩
     */
    private Integer achievement;
    /**
     * 当前时间
     */
    private Date workTime;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getAchievement() {
        return achievement;
    }

    public void setAchievement(Integer achievement) {
        this.achievement = achievement;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }
}