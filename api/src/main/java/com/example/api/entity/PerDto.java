package com.example.api.entity;

import java.util.List;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
public final class PerDto {
    /**
     * 主键
     */
    private String id;
    /**
     *  姓名
     */
    private String name;
    /**
     *  性别（0：男、1：女）
     */
    private Integer sex;
    /**
     *  年龄
     */
    private Integer age;
    /**
     * 关联外表
     */
    private List<AchDto> achDtos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<AchDto> getAchDtos() {
        return achDtos;
    }

    public void setAchDtos(List<AchDto> achDtos) {
        this.achDtos = achDtos;
    }
}
