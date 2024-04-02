import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;

public class Test {

	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 Student stu= (Student) context.getBean("s");
		 
		 System.out.println(stu);

	}

}
