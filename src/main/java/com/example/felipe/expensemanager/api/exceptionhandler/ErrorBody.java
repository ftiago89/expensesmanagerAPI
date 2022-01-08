package com.example.felipe.expensemanager.api.exceptionhandler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class ErrorBody {

    private final Integer status;
    private final OffsetDateTime timeStamp;
    private final String type;
    private final String title;
    private final String detail;
    private final String userMessage;
    private final List<Object> objects;

    @Getter
    @Builder
    public static class Object {

        private final String name;
        private final String userMessage;
    }
}
