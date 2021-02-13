package com.hcsp.wxshop.config;

import com.hcsp.wxshop.Service.ShiroRealm;
import com.hcsp.wxshop.Service.VerificationCodeCheck;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;

import java.util.HashMap;
import java.util.Map;


/**
 * 全局服务钩子
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroRealm myShiroRealm(VerificationCodeCheck verificationCodeCheck) {
        return new ShiroRealm(verificationCodeCheck);
    }

    @Bean
    public ShiroFilterFactoryBean ShiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        /**
         * 标明非拦截服务
         */
        Map<String, String> pattern = new HashMap<>();

        pattern.put("/api/code", "anon");
        pattern.put("/api/login", "anon");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(pattern);

        return shiroFilterFactoryBean;
    }


    @Bean
    public SecurityManager securityManager(ShiroRealm shiroRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        /**
         * 在某个区域内进行鉴权
         */
        securityManager.setRealm(shiroRealm);

        securityManager.setCacheManager(new MemoryConstrainedCacheManager());
        securityManager.setSessionManager(new DefaultSessionManager());

        return securityManager;
    }


}
