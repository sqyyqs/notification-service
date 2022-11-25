package com.yqssqy.notificationservice.service;

import com.yqssqy.notificationservice.domain.MessageStatus;
import com.yqssqy.notificationservice.domain.dto.MessageDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NotificationService {
    public MessageStatus sendMessage(MessageDto messageDto) {
        return new MessageStatus(UUID.randomUUID().toString());
    }
}
