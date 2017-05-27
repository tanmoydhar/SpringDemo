package org.tanmoy.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		// Triangle t=new Triangle();
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle t=(Triangle)bf.getBean("b1");
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");//we need to move spring.xml to class path for this step
		Triangle t=(Triangle)ctx.getBean("b1");
		 t.draw();

		
		
	}

}
