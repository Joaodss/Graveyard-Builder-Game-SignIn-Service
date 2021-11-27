package com.ironhack.signinservice.service;

import com.ironhack.signinservice.dto.UserAuthDTO;

public interface UserAuthService {

    UserAuthDTO getUserAuthDetails(String username);

}
