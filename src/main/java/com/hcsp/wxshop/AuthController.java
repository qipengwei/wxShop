package com.hcsp.wxshop;

import com.hcsp.wxshop.Service.AuthService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/code")
    public void code(@RequestBody TelAndCode telAndCode) {
          authService.sendVerificationCode(telAndCode.getTel());
    }

    @PostMapping("/login")
    public void login(@RequestBody TelAndCode telAndCode) {
        /**
         * 通过手机号加验证码登录 生成token
         */
        UsernamePasswordToken token = new UsernamePasswordToken(telAndCode.getTel(), telAndCode.getCode());

        SecurityUtils
                .getSubject()
                   .login(token);

        /**
         * 记住token
         */
        token.setRememberMe(true);
    }

    public static class TelAndCode {
        String tel;
        String code;

        public TelAndCode() {
        }

        public TelAndCode(String tel, String code) {
            this.tel = tel;
            this.code = code;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TelAndCode that = (TelAndCode) o;
            return Objects.equals(tel, that.tel) &&
                    Objects.equals(code, that.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tel, code);
        }
    }
}
