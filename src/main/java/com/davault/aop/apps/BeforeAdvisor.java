package com.davault.aop.apps;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvisor implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2) throws  Throwable {
        System.out.println(" logging before call of method " + arg0.getName());
    }
}
