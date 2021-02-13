package com.hcsp.wxshop.Service;

import com.hcsp.wxshop.Dao.UserDao;
import com.hcsp.wxshop.generate.User;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 获取用户实体
 */
@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 根据手机号码创建用户
     * @param tel 手机号码
     * @return 返回创建的用户
     */
    public User createUserIfNotExist(String tel) {
        User user = new User();
        user.setTel(tel);
        user.setCreateAt(new Date());
        user.setUpdateAt(new Date());
        try {
            userDao.insertUser(user);
        } catch (PersistenceException e) {
            return null;
        }

        return user;
    }
}
