package com.nuonuo.authorization.repository;

import com.nuonuo.authorization.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2019/12/22 0:57:30.
 */
public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {

}
