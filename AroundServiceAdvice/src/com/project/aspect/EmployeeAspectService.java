package com.project.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class EmployeeAspectService {

	@Around(value = "execution( public String getEmpName())")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint){
		System.out.println("Before invoking getName() method");
		Object value = null;
		try {
			value = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value="+value);
		return value;
	}
}
