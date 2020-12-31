package com.bankapp.model.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger =LoggerFactory.getLogger(LoggingAspect.class);
	
	@Around("@annotation(Loggable)")
	public Object aroundAdice(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		String methodName=pjp.getSignature().getName();
		Object val=pjp.proceed();
		
		long end = System.currentTimeMillis();
		logger.info("method "+methodName +" take "+ (end-start)+" ms");
		return val;
	}
}








