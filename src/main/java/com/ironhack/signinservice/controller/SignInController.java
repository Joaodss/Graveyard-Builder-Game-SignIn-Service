package com.ironhack.signinservice.controller;

import com.ironhack.signinservice.dto.*;

public interface SignInController {

    UserAuthDTO getUserAuthDetails(String username);

    UserDTO registerUser(RegisterUserDTO registerUserDTO);

    boolean checkValidUsername(UsernameDTO username);

    boolean checkValidEmail(EmailDTO email);

}


