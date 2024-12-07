package AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController3 {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Faculty faculty=context.getBean("facultybean",Faculty.class);
		
		System.out.println(faculty.toString());
		
		context.close();
	}

}
