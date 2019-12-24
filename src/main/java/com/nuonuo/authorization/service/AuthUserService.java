package com.nuonuo.authorization.service;

import com.nuonuo.authorization.model.AuthUser;

import java.util.List;

/**
 * Created by admin on 2019/12/23 9:57:53.
 */
public interface AuthUserService {
    
    List<AuthUser> getAllUser();
}
