package com.hcsp.wxshop.Service;

import org.springframework.stereotype.Service;

@Service
public interface SmsCodeService {
    /**
     * 向传入的手机号发送发送验证码
     * @param tel 用户手机号
     * @return 验证码
     */
    String sendSmsCode(String tel);
}
