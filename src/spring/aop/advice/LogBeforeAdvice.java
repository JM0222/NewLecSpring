package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{
		
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
//		앞에부분에 들어갈부분만 포커싱
		System.out.println("This is beforeadvice");
	}
	

}
