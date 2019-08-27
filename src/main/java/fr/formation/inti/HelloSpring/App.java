package fr.formation.inti.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.beans.HelloBean;
import fr.formation.inti.beans.MessageBean;

/**
 * IL Y A 3 DEPENDENCIES DANS LE POM
 * POUR FAIRE UTILISER SPRING.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//managed contexts for create instancies of classes (beans)
    	System.out.println("======= Import all beans =======");
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	System.out.println("===============================================");
    	
    	//connect HelloBean.class to App.java via bean (xml)
    	HelloBean hb = context.getBean("hello", HelloBean.class);
    	
    	//use from method automatically
    	hb.hello();
    	
    	//same exemple
    	MessageBean mb = context.getBean("message", MessageBean.class);
    	mb.createInstance();
    }
}
