package com.lyq.service.impl;

import javax.annotation.Resource;

import com.lyq.dao.IUserDao;
import com.lyq.model.User;
import com.lyq.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
  