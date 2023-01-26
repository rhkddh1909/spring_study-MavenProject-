package kr.co.softcampus.main;

import kr.co.softcampus.beans.TestBeanPostProcessor1;
import kr.co.softcampus.beans.TestBeanPostProcessor2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassBeanPostProcessor {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beansPostProcessor.xml");

        TestBeanPostProcessor1 t1 = ctx.getBean("t1",TestBeanPostProcessor1.class);
        System.out.printf("%s\n",t1);

        System.out.println("-----------------------------------------------------------------------");

        TestBeanPostProcessor2 t2 = ctx.getBean("t2",TestBeanPostProcessor2.class);
        System.out.printf("%s\n",t2);
    }
}
