package com.lyq.service;

import com.lyq.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户信息服务层
 * Created by lyq on 2016/11/21.
 */
public interface IUserService {
    public User getUserById(int userId);

    public int addUser(User user);

    public List<User> selectAllUser();

    public void updateUser(User user);

    public void deleteUser(int userId);

}
