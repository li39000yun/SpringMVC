package com.lyq.service.impl;

import javax.annotation.Resource;

import com.lyq.dao.IUserDao;
import com.lyq.model.User;
import com.lyq.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int addUser(User user) {
        return this.userDao.insertUser(user);
    }

    @Override
    public List<User> selectAllUser() {
        return this.userDao.selectAllUser();
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        this.userDao.deleteUser(userId);
    }
}
  