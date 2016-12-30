package com.lyq.dao;

import com.lyq.model.User;

import java.util.List;

/**
 * Created by lyq on 2016/11/21.
 */
public interface IUserDao {
    User selectByPrimaryKey(int id);

    public int insertUser(User user);

    public void updateUser(User user);

    public List<User> selectAllUser();

    public void deleteUser(int id);

}
