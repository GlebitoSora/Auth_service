package com.example.auth_service.controller;

import com.example.auth_service.dto.JwtAuthenticationResponse;
import com.example.auth_service.dto.UserDto;
import com.example.auth_service.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signUp(@RequestBody UserDto userDto) {
        return authenticationService.signUp(userDto);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signIn(@RequestBody UserDto userDto) {
        return authenticationService.signIn(userDto);
    }
    @PostMapping("/check")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(authenticationService.saveUser(userDto));
    }
}
