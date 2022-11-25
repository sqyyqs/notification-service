package com.yqssqy.notificationservice.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yqssqy.notificationservice.domain.MessageType;

import java.util.Objects;

public class MessageDto {
    private final long fromId;
    private final long toId;
    private final String message;
    private final MessageType messageType;

    @JsonCreator
    @JsonIgnoreProperties(ignoreUnknown = true)
    public MessageDto(@JsonProperty("fromId") long fromId,
                      @JsonProperty("toId") long toId,
                      @JsonProperty("message") String message,
                      @JsonProperty("messageType") String messageTypeValue
    ) {
        this.fromId = fromId;
        this.toId = toId;
        this.message = Objects.requireNonNull(message, "Message can't be null.");
        this.messageType = Objects.requireNonNull(MessageType.getByValue(messageTypeValue), "Type can't be null.");
    }

    public long getFromId() {
        return fromId;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public long getToId() {
        return toId;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "fromId=" + fromId +
                ", toId=" + toId +
                ", message='" + message + '\'' +
                ", messageType=" + messageType +
                '}';
    }
}
