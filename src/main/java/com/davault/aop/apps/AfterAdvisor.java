package com.davault.aop.apps;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvisor implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws  Throwable {
        System.out.println(" some stuff post method call " + arg1.getName());
    }
}
