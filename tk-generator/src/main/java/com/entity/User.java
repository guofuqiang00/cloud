package com.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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