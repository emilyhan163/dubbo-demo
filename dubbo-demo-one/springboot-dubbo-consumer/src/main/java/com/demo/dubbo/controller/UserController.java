package com.demo.dubbo.controller;

import com.demo.dubbo.api.IPersonService;
import com.demo.dubbo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 韩美娟
 * @date 2019/2/1
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "saveUser")
    public String saveUser() {
        logger.info("============saveUser============");
        User uu = new User();
        uu.setId(12);
        uu.setName("oo");
        uu.setAge(23);
        User u2 = personService.saveUser(uu);
        System.out.println("u2=" + u2.toString());
        return u2.getName();
    }
}
