package com.day.isky.domain;

import lombok.Data;

@Data
public class MqMsg {

    public MqMsg(Integer id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    private Integer id;

    private String msg;
}
