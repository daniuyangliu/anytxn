package com.linktree.sikehome.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

import java.util.Date;
@Getter
@Setter
@ToString
@Builder
public class User {
    private Long id;

    private String name;

    private Integer cityId;

    private Boolean sex;

    private String phone;

    private String email;

    private Date createTime;

    private String password;

    private String loginName;
    @Tolerate
    public User() {
    }
}