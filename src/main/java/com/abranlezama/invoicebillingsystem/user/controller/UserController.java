package com.abranlezama.invoicebillingsystem.user.controller;

import com.abranlezama.invoicebillingsystem.user.User;
import com.abranlezama.invoicebillingsystem.user.dto.RegisterUserRequestDto;
import com.abranlezama.invoicebillingsystem.user.dto.UserDto;
import com.abranlezama.invoicebillingsystem.user.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;
import java.util.Map;

import static java.time.LocalDateTime.*;
import static java.util.Map.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<HttpResponse> saveUser(@Valid @RequestBody RegisterUserRequestDto requestDto,
                                                 UriComponentsBuilder uriComponentsBuilder) {
        UserDto userDto = userService.createUser(requestDto);
        UriComponents uri = uriComponentsBuilder.path("/users/{userId}").buildAndExpand(userDto.userId());
        return ResponseEntity.created(uri.toUri()).body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .data(of("user", userDto))
                        .message("user created")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }
}
