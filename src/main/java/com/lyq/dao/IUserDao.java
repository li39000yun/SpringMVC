package com.lyq.dao;

import com.lyq.model.User;

/**
 * Created by lyq on 2016/11/21.
 */
public interface IUserDao {
    User selectByPrimaryKey(int id);
}
