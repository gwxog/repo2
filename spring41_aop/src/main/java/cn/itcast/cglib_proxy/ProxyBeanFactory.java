package cn.itcast.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyBeanFactory {
    // 声明要代理的对象
    private PersonService service = new PersonService();

    //
    public ProxyBeanFactory(PersonService service) {
        this.service = service;
    }

    public Object getProxyBean() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(service.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before---");
                method.invoke(service);
                System.out.println("after---");
                return null;
            }
        });
        return enhancer.create();
    }
}
