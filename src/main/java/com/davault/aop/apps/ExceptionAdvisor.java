package com.davault.aop.apps;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionAdvisor implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        System.out.println("Addtional concern if exception occurs");
    }
}