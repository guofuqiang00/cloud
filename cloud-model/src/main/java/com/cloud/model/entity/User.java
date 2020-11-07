package com.cloud.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@ApiModel(description="")
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    @ApiModelProperty(value="用户名称")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_pwd")
    @ApiModelProperty(value="用户密码")
    private String userPwd;
}