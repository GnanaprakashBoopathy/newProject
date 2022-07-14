package com.practicetestng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Sample2 implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation text, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer analyzer = text.getRetryAnalyzer();
		if (analyzer==null) {
			text.setRetryAnalyzer(RetryClass.class);
		}
		
	}
	











}
