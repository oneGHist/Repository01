package com.itheima.feign;

import com.itheima.domain.User;
import com.itheima.feign.conf.FeignConfig;
import com.itheima.feign.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Feign客户端入门
 * @author Steven
 * @description com.itheima.feign
 */
@FeignClient(
        value = "user-provider",
        fallback = UserClientFallback.class,
        configuration = FeignConfig.class
            )  //声明Feign的客户端，value:填写生产者的名称
public interface UserClient {

    //注意：此处的请求地址一定要和生产者请求的地址一样
    @RequestMapping("/user/find/{id}")
    public User findById(@PathVariable("id")Integer id);
}
