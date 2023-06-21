package com.abranlezama.invoicebillingsystem.user.service;

import com.abranlezama.invoicebillingsystem.user.User;
import com.abranlezama.invoicebillingsystem.user.dto.RegisterUserRequestDto;
import com.abranlezama.invoicebillingsystem.user.dto.UserDto;

public interface UserService {
    UserDto createUser(RegisterUserRequestDto requestDto);
}
