package com.nuonuo.authorization.service.impl;

import com.nuonuo.authorization.model.AuthUser;
import com.nuonuo.authorization.repository.AuthUserRepository;
import com.nuonuo.authorization.service.AuthUserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by admin on 2019/12/23 9:58:04.
 */
@ApplicationScoped
public class AuthUserServiceImpl implements AuthUserService {
    
    @Inject
    AuthUserRepository authUserRepository;
    
    @Override
    public List<AuthUser> getAllUser() {
        Iterable<AuthUser> user = authUserRepository.findAll();
        return (List<AuthUser>) user;
    }
}
