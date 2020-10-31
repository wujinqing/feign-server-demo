package com.jin.feign.server.demo;

import com.jin.feign.server.demo.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu.jinqing
 * @date 2020年01月13日
 */
@SpringBootApplication
@RestController
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

    @RequestMapping("/getUser")
    public User getUser(Long id)
    {
        User u = new User();

        u.setId(id);
        u.setName("zhang san");
        u.setAge(10);

        try {
            Thread.sleep(650L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return u;
    }

    @RequestMapping("/getUser2")
    public User getUser2(Long id)
    {
        User u = new User();

        u.setId(id);
        u.setName("李四");
        u.setAge(30);

        try {
            Thread.sleep(650L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return u;
    }

    @RequestMapping(name = "/getUser3", method = RequestMethod.POST)
    public User getUser3(Long id)
    {
        User u = new User();

        u.setId(id);
        u.setName("李四");
        u.setAge(33);

        return u;
    }
}
