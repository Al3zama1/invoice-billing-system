package com.abranlezama.invoicebillingsystem.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record RegisterUserRequestDto(
        Long userId,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String email,
        @Size(min = 8, max = 15) String password,
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
