package com.yqssqy.notificationservice.controller;

import com.yqssqy.notificationservice.domain.MessageStatus;
import com.yqssqy.notificationservice.domain.dto.MessageDto;
import com.yqssqy.notificationservice.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/send-message")
    public ResponseEntity<MessageStatus> sendMessage(@RequestBody MessageDto messageDto) {
        logger.debug("Invoke sendMessage({})", messageDto);
        return ResponseEntity.ok(notificationService.sendMessage(messageDto));
    }
}
