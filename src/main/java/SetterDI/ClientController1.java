package SetterDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee emp= context.getBean("empbean",Employee.class);
		
		System.out.println(emp.toString());
		
		System.out.println(emp.getName());
		
		context.close();
		
	}

}
