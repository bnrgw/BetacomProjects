package com.betacom.Relection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class MainReflection {

	public static void main(String[] args) {
		try {
			
			String pakageName = "com.betacom.reflection.object";
			String className = "MyClassReflection";
		
		Class cl = Class.forName(pakageName + "." + className);
		System.out.println("Class found....");
		
        Object myClass = null;
		Constructor[] ctors = cl.getConstructors();
		
		Constructor ctorSelected = null;
		
		for (Constructor ctor : ctors) {
			System.out.println("Parameters length:" + ctor.getGenericParameterTypes().length);
			
			if(ctor.getGenericParameterTypes().length > 0) {
				Type[] type =ctor.getGenericParameterTypes();
				for(Type t : type) {
					System.out.println("type:" + t.toString());
				}
			}else {
					ctorSelected = ctor;
				}
				
				
			}
		
			myClass = ctorSelected.newInstance();
		
			System.out.println("After new instance");
			
			
			Method[] methods = myClass.getClass().getMethods();
			Method toString = null;
			for(Method metodo :methods) {
				System.out.println("method found:" + metodo.getName());
				if("setId".equals(metodo.getName())) {
					metodo.invoke(myClass, 10);
					System.out.println("after setId");
				}
				if("setDesc".equals(metodo.getName())) {
					metodo.invoke(myClass, "Questo è un test...");
					System.out.println("after setDesc");
				}
				if("tostring".equals(metodo.getName())) {
					toString = metodo;
				}
			}
			
		      String msg =(String)toString.invoke(myClass);
		      System.out.println(msg);
		
	}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		System.out.println("Class not found:" + e.getMessage());
	
	}
	}

}
