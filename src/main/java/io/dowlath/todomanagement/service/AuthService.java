package io.dowlath.todomanagement.service;

import io.dowlath.todomanagement.dto.LoginDto;
import io.dowlath.todomanagement.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
