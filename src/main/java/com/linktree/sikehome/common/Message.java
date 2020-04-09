package com.linktree.sikehome.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

@Getter
@Setter
@ToString
@Builder
public class Message {
    private Boolean res;
    private String msg;
    private Integer code;
    private Object data;
    @Tolerate
    public Message() {
    }
}
