package cn.itcast.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanFactory {
    // 声明要代理的对象
    UserService userService;

    public  ProxyBeanFactory(UserService userService) {
        this.userService = userService;
    }

    public Object getProxyBean() {
        Object objOut = Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before=======");
//                        System.out.println(method);
                        Object objIn = method.invoke(userService);
                        System.out.println("objIn:" + objIn);
                        System.out.println("after========");
                        return objIn;
                    }
                }
        );
        System.out.println("objOut:" + objOut);
        return objOut;
    }
}
