package com.chat.demo.model;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private Long sendPersonId;
    private User fromUser;
    private Chat toChat;
    private LocalDateTime sendAt;
}
