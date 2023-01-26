package kr.co.softcampus.main;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBeanConstructorDI;
import kr.co.softcampus.beans.TestBeanConstructorDI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassConstructorDI {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beansConstructorDI.xml");

        TestBeanConstructorDI t1 = new TestBeanConstructorDI();
        t1.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI t2 = new TestBeanConstructorDI(100);
        t2.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI t3 = new TestBeanConstructorDI(11.11);
        t3.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI t4 = new TestBeanConstructorDI("String");
        t4.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI t5 = new TestBeanConstructorDI(100, 11.11,"String");
        t5.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj1 = ctx.getBean("obj1",TestBeanConstructorDI.class);
        obj1.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj2 = ctx.getBean("obj2",TestBeanConstructorDI.class);
        obj2.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj3 = ctx.getBean("obj3",TestBeanConstructorDI.class);
        obj3.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj4 = ctx.getBean("obj4",TestBeanConstructorDI.class);
        obj4.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj5 = ctx.getBean("obj5",TestBeanConstructorDI.class);
        obj5.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj6 = ctx.getBean("obj6",TestBeanConstructorDI.class);
        obj6.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI obj7 = ctx.getBean("obj7",TestBeanConstructorDI.class);
        obj7.printData();

        System.out.println("----------------------------------------------------------------------");

        DataBean d1 = new DataBean();
        DataBean d2 = new DataBean();

        TestBeanConstructorDI2 t200 = new TestBeanConstructorDI2(d1,d2);
        t200.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI2 obj8 = ctx.getBean("obj8",TestBeanConstructorDI2.class);
        obj8.printData();

        System.out.println("----------------------------------------------------------------------");

        TestBeanConstructorDI2 obj9 = ctx.getBean("obj9",TestBeanConstructorDI2.class);
        obj9.printData();

        ctx.close();
    }
}
