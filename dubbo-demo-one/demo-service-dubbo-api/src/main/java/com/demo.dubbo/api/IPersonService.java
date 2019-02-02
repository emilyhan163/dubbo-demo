package com.demo.dubbo.api;

import com.demo.dubbo.domain.User;

/**
 * @author 韩美娟
 * @date 2019/2/1
 */
public interface IPersonService {

    /**
     * 保存user
     *
     * @param user
     * @return
     */
    User saveUser(User user);
}
