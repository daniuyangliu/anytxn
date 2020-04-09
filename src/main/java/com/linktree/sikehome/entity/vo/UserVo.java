package com.linktree.sikehome.entity.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

@Getter
@Setter
@ToString
@Builder
public class UserVo {
    private String loginName;
    private String password;

    @Tolerate
    public UserVo() {
    }
}
