package kr.co.softcampus.main;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassBeanLifeCycle {
    public static void main(String[] args){
        //xml파일 로딩
        //IoC
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
        System.out.printf("t1 : %s\n", t1);

        System.out.printf("==================================");

        TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
        System.out.printf("t2 : %s\n", t2);

        System.out.printf("==================================");

        TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
        System.out.printf("t3 : %s\n", t3);

        System.out.printf("==================================");

        TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
        System.out.printf("t4 : %s\n", t4);

        //IoC종료
        //Beans 삭제
        ctx.close();
    }
}
