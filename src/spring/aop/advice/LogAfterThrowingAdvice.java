package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;
//어떠한 예외가 발생하느냐에 따라 함수인자가 달라지기 때문에
public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("삐용삐용 예외발생 " +e.getMessage());
	}
}
