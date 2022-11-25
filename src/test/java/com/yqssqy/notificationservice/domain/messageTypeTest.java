package com.yqssqy.notificationservice.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class messageTypeTest {

    @Test
    void getByValue() {
        assertEquals(MessageType.TELEGRAM, MessageType.getByValue("TELEGRAM"));
        assertEquals(MessageType.SMS, MessageType.getByValue("SMS"));
    }

}