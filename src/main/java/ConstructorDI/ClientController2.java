package ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		context.refresh();
		Student s=(Student) context.getBean("studentbean");
		
		System.out.println(s.toString());
		
		context.close();

	}

}
