package cn.itcast.jdk_proxy;

import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testMethod() {
        UserService userService = new UserServiceImpl();
        userService.login();
    }

    @Test
    public void testProxyMethod() throws ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        ProxyBeanFactory beanFactory = new ProxyBeanFactory(userService);

        UserService proxyBean = (UserService) beanFactory.getProxyBean();

//        System.out.println("proxyBean: " + proxyBean);

        proxyBean.login();

    }

}
