package com.davault.aop.apps;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BothAdvisor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation arg0) throws  Throwable {
        System.out.println("Before method");
        arg0.proceed();
        System.out.println("Before method");
        return null;
    }
}
