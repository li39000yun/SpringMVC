package com.lyq.testmybatis;

import com.alibaba.fastjson.JSON;
import com.lyq.model.User;
import com.lyq.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lyq on 2016/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        User user = userService.getUserById(3);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
        System.out.println(user);
    }

    @Test
    public void test2() {
        User user = new User();
        user.setName("中文测试");
        System.out.println(userService.addUser(user));
    }

    @Test
    public void testUpdateUser() {
        User user = new User(2, "旺财");
        userService.updateUser(user);
        System.out.println(userService.getUserById(2));
    }

    @Test
    public void testDeleteUser() {
        userService.deleteUser(2);
    }

    @Test
    public void testSelectAll() {
        System.out.println();
        List<User> list = userService.selectAllUser();
        System.out.println("---------------");
        for (User user : list) {
            System.out.println(user.toString());
        }

    }

}
