package com.linktree.sikehome.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
@Getter
@Setter
@ToString
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 1585933724946L;

    @Tolerate
    public User() {
    }

    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 名称
     * isNullAble:1
     */
    private String name;

    /**
     * 城市
     * isNullAble:1
     */
    private Integer cityId;

    /**
     * 性别
     * isNullAble:1
     */
    private Integer sex;

    /**
     * 电话
     * isNullAble:1
     */
    private String phone;

    /**
     * 邮箱
     * isNullAble:1
     */
    private String email;

    /**
     * 创建时间
     * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
     */
    private java.time.LocalDateTime createTime;

    /**
     * 密码
     * isNullAble:1
     */
    private String password;

    /**
     * 登录账号
     * isNullAble:1
     */
    private String loginName;

}
