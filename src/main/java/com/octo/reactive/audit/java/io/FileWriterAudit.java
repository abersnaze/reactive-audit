package com.octo.reactive.audit.java.io;

import com.octo.reactive.audit.lib.AuditReactiveException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import static com.octo.reactive.audit.lib.Latency.LOW;

// Nb methods : 5
@Aspect
public class FileWriterAudit extends AbstractWriterAudit
{
	@Before("call(java.io.FileWriter+.new(..))")
	public void new_(JoinPoint thisJoinPoint) throws AuditReactiveException
	{
		latency(LOW, thisJoinPoint);
	}

}
