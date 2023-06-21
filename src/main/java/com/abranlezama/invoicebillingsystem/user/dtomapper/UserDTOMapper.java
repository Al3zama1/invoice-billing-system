package com.abranlezama.invoicebillingsystem.user.dtomapper;

import com.abranlezama.invoicebillingsystem.user.User;
import com.abranlezama.invoicebillingsystem.user.dto.RegisterUserRequestDto;
import com.abranlezama.invoicebillingsystem.user.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserDTOMapper {
    UserDto fromUser(User user);

    User toUser(RegisterUserRequestDto requestDto);
}
