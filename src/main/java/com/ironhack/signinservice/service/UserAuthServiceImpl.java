package com.ironhack.signinservice.service;

import com.ironhack.signinservice.dto.UserAuthDTO;
import com.ironhack.signinservice.proxy.UserModelProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserAuthServiceImpl implements UserAuthService {
    private final UserModelProxy userModelProxy;


    public UserAuthDTO getUserAuthDetails(String username) {
        var userResponse = userModelProxy.getUserAuth(username);
        if (userResponse.getStatusCodeValue() == 404 &&
                Objects.equals(userResponse.getHeaders().getFirst("error"), "User not found"))
            return null;
        return userResponse.getBody();
    }

}
