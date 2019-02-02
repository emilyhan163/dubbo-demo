package com.demo.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.api.IPersonService;
import com.demo.dubbo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 韩美娟
 * @date 2019/2/1
 */
@Service
public class PersonServiceImpl implements IPersonService {
    private Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

    /**
     * 保存user
     *
     * @param user
     * @return
     */
    @Override
    public User saveUser(User user) {
        logger.info("=====PersonServiceImpl  saveUser=====");
        User u = new User();
        u.setId(user.getId());
        u.setName(user.getName());
        u.setAge(user.getAge());
        return u;
    }
}
