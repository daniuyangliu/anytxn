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
*
*  @author author
*/
@Getter
@Setter
@ToString
@Builder

public class address implements Serializable {

    private static final long serialVersionUID = 1585925889173L;
    //避免 java8 lambda表达式转map报错。。增加这个注解
    @Tolerate
    public address() {
    }

    /**
     * 主键
     *
     * isNullAble:0
     */
    private Long id;

    /**
     * 编码
     * isNullAble:1
     */
    private String code;

    /**
     * 名称
     * isNullAble:1
     */
    private String name;

    /**
     * 父id
     * isNullAble:0,defaultVal:0
     */
    private String pid;

    /**
     * 1国家2省3市4县区
     * isNullAble:1
     */
    private Integer type;

    /**
     *
     * isNullAble:1
     */
    private Integer lit;
}
