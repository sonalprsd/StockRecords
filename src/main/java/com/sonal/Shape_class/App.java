package com.sonal.Shape_class;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle tr=(Triangle)factory.getBean("triangle");
     //   tr.setType("isosceles");
        tr.draw();
        Circle cr=(Circle)factory.getBean("circle");
        cr.draw();
        
    }
}
