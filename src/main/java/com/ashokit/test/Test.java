package com.ashokit.test;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws Exception {
		Class<?> clz = Class.forName("com.ashokit.test");
		
		Object obj = clz.newInstance();
		
		Field ageField= clz.getDeclaredField("age");
		
		ageField.setAccessible(true);
		
		ageField.set(obj, 30);
		
		
		System.out.println("--------get value of object through reflection--------"+ageField.get(obj));
		
	}
}
