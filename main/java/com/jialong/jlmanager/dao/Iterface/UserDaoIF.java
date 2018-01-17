package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.UserLoginEntity;

public interface UserDaoIF {
    UserLoginEntity getPassword(String userName);
    void insertUserLogin(UserLoginEntity userLoginEntity);
}
