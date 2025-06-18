package com.bean_life_cycle_using_cutom_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//******Spring bean life cycle phases
//1.container startup/loading xml or java based configuration file
//2.bean creation/bean instantiation
//3.depedency injection/bean initialization
//4. accessing bean
//5.bean destroyation


public class Life_Cylce_main {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com//bean_life_cycle_using_cutom_method//life_cycle_config1.xml");
         Laptop p =(Laptop)context.getBean("lp");
         System.out.println(p);
         
         context.registerShutdownHook();
         
         
         /*
     	 * When you call context.registerShutdownHook() on a Spring ApplicationContext 
     	 * (like ClassPathXmlApplicationContext or AnnotationConfigApplicationContext), you are:

      Registering a shutdown hook with the JVM so that
     When the JVM shuts down
     Spring's destroy() methods or @PreDestroy methods are called automatically.

     If you don’t call registerShutdownHook(), your Spring-managed beans may not be cleaned up properly (e.g., connections not closed, files not flushed, threads not stopped).
         */
         
    }

}
