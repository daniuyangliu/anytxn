package com.linktree.sikehome.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

@Getter
@Setter
@ToString
@Builder
public class Address {
    private Long id;

    private String code;

    private String name;

    private String pid;

    private Integer type;

    private Integer lit;
    @Tolerate
    public Address() {
    }
}