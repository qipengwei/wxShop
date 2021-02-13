package com.hcsp.wxshop.Service;

public class MockSmsService implements SmsCodeService{
    @Override
    public String sendSmsCode(String tel) {
        return "000000";
    }
}
