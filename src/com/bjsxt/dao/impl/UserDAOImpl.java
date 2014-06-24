package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/**
 * Author: fs302
 * Date: 14-6-24
 * Time: ионГ11:34
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User u) {
        System.out.println("a user saved.");
    }
}
