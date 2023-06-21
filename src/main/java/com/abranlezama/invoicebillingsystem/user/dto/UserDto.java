package com.abranlezama.invoicebillingsystem.user.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record UserDto(
        Long userId,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String email,
        String address,
        String phone,
        String title,
        String bio,
        String imageUrl,
        boolean enabled,
        boolean isNotLocked,
        boolean isUsingMfa,
        LocalDateTime createdAt
) { }
