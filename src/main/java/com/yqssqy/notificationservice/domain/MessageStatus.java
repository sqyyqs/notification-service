package com.yqssqy.notificationservice.domain;

public class MessageStatus {
    private final String uuid;

    public MessageStatus(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
