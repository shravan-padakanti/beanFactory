package beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import staticbeanfactory.Car;



public class StaticBeanFactoryMain {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Car c=(Car)ap.getBean("cf");
		c.drive();
		((ClassPathXmlApplicationContext)ap).close();

	}

}
