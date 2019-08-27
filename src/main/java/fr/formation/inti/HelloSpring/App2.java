package fr.formation.inti.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.beans.ScopeBean;

public class App2 {
	public static void main(String[] args) {
		 
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
 
        ScopeBean message1 = ac.getBean("messageServ", ScopeBean.class);
 
        // Setting the object properties.
        message1.setId(1001);
        message1.setMessage("Hello world!");
 
        System.out.println(message1.toString());
        System.out.println();
        
        System.out.println("lel");
        // Retrieve it again.
        ScopeBean message2 = ac.getBean("messageServ", ScopeBean.class);
        System.out.println(message2.toString());
        
 
        // Closing the context object.
        ((AbstractApplicationContext)ac).close();
    }
}
