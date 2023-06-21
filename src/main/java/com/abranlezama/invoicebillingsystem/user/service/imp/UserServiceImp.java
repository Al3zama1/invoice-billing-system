package com.abranlezama.invoicebillingsystem.user.service.imp;

import com.abranlezama.invoicebillingsystem.user.User;
import com.abranlezama.invoicebillingsystem.user.dto.RegisterUserRequestDto;
import com.abranlezama.invoicebillingsystem.user.dto.UserDto;
import com.abranlezama.invoicebillingsystem.user.dtomapper.UserDTOMapper;
import com.abranlezama.invoicebillingsystem.user.repository.UserRepository;
import com.abranlezama.invoicebillingsystem.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository<User> userRepository;
    private final UserDTOMapper userDTOMapper;

    @Override
    public UserDto createUser(RegisterUserRequestDto requestDto) {
        User user = userDTOMapper.toUser(requestDto);
        return userDTOMapper.fromUser(userRepository.create(user));
    }
}
