package cn.itcast.aop_xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean4.xml")
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void testUser(){
        //System.out.println(user.getClass());
        //user.work();
//        user.addUser();
//        user.deleteUser();
//        user.updateUser();
        user.queryUser();
//        user.batchDeleteUser();
    }
}
