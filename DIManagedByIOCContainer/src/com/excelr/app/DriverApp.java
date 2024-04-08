package com.excelr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelr.config.MyConfiguration;
import com.excelr.entity.Engine;

public class DriverApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
//		System.out.println("hi");
//		
//		Engine myEng1=(Engine)beanFactory.getBean("e1");
//		System.out.println(myEng1);
//		
//		Engine myEng2=(Engine)beanFactory.getBean("e1");
//		System.out.println(myEng2);
//		
//		Engine myEng3=(Engine)beanFactory.getBean("e1");
//		System.out.println(myEng3);
//		
//		System.out.println(myEng1==myEng2);
//		System.out.println(myEng1==myEng3);
//		System.out.println(myEng2==myEng3);
		
//		Car myCar=beanFactory.getBean("c1", Car.class);
//		System.out.println(myCar);	
		
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Engine eng1=beanFactory.getBean(Engine.class);
		
	}

}
