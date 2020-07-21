package cn.itcast.aop_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean5.xml")
public class PersonTest {
//    @Autowired
    @Resource(name = "p1")
    private Person person;

    @Test
    public void test(){
        person.addPerson();   // 前置
        person.deletePerson(); // 后置
        person.updatePerson();  // 异常
        person.queryPerson();  // 环绕
        person.batchDeletePerson();  // 最终
    }
}
