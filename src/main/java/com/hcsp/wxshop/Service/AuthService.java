package com.hcsp.wxshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserService userService;

    private final VerificationCodeCheck verificationCodeCheck;

    private final SmsCodeService smsCodeService;

    @Autowired
    public AuthService(UserService userService, VerificationCodeCheck verificationCodeCheck, SmsCodeService smsCodeService) {
        this.userService = userService;
        this.verificationCodeCheck = verificationCodeCheck;
        this.smsCodeService = smsCodeService;
    }

    public void sendVerificationCode(String tel) {
        this.userService.createUserIfNotExist(tel);
        String correctCode = smsCodeService.sendSmsCode(tel);

        verificationCodeCheck.addCode(tel, correctCode);
    }

}
