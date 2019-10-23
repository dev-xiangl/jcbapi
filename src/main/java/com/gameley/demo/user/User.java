package com.gameley.demo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by B038 on 2018/1/26 0026.
 */
@ApiModel(value = "User", description = "用户对象")
public class User {

    @ApiModelProperty(value = "ID",example = "1")
    private Long id;
    @ApiModelProperty(value = "姓名",example = "user1")
    private String name;
    @ApiModelProperty(value = "年龄",example = "10",hidden=true)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}