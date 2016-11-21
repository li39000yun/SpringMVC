package com.lyq.service;

import com.lyq.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lyq on 2016/11/21.
 */
public interface IUserService {
    public User getUserById(int userId);
}
