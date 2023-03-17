package com.itheima.feign.fallback;

import com.itheima.domain.User;
import com.itheima.feign.UserClient;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public User findById(Integer id) {

        User user = new User();
        user.setUsername("feign的服务降级");

        return user;
    }
}
