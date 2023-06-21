package com.abranlezama.invoicebillingsystem.user.controller;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Builder
public record HttpResponse(
        String timeStamp,
        int statusCode,
        HttpStatus status,
        String message,
        String developerMessage,
        Map<?, ?> data
) { }
