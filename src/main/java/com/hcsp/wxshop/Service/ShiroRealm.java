package com.hcsp.wxshop.Service;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * 鉴权内部类
 */
public class ShiroRealm extends AuthorizingRealm {

    private final VerificationCodeCheck verificationCodeCheck;

    @Autowired
    public ShiroRealm(VerificationCodeCheck verificationCodeCheck) {
        this.verificationCodeCheck = verificationCodeCheck;
        /**
         * 将用户信息进行比对
         */
        this.setCredentialsMatcher((token, info) -> new String((char[]) token.getCredentials()).equals(info.getCredentials()));
    }

    /**
     * 是否有权限访问资源
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    /**
     * 是否是合法用户
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        String tel = (String) token.getPrincipal();

        /**
         * 通过电话号码获取改手机验证码
         */
        String correctCode = verificationCodeCheck.getCorrectCode(tel);

        /**
         * 返回通过关键信息鉴权后的结果
         */
        return new SimpleAuthenticationInfo(tel, correctCode, getName());
    }
}
