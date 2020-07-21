package cn.itcast.cglib_proxy;

import org.junit.Test;

public class PersonServiceTest {

    @Test
    public void test() {
        PersonService service = new PersonService();
        ProxyBeanFactory beanFactory = new ProxyBeanFactory(service);
        PersonService proxyBean = (PersonService) beanFactory.getProxyBean();
        proxyBean.work();
    }

}
