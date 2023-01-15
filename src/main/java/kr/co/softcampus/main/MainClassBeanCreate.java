package kr.co.softcampus.main;

import kr.co.softcampus.beans.TestCreateBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassBeanCreate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        //id가 test1인 bean객체의 주소값을 받아온다.
        TestCreateBean t1 = ctx.getBean("test1", TestCreateBean.class);
        System.out.printf("t1 : %s\n",t1);

        TestCreateBean t2 = ctx.getBean("test1", TestCreateBean.class);
        System.out.printf("t2 : %s\n",t2);

        TestCreateBean t3 = ctx.getBean("test2", TestCreateBean.class);
        System.out.printf("t3 : %s\n",t3);

        TestCreateBean t4 = ctx.getBean("test2", TestCreateBean.class);
        System.out.printf("t4 : %s\n",t4);

        TestCreateBean t5 = ctx.getBean("test3", TestCreateBean.class);
        System.out.printf("t5 : %s\n",t5);

        TestCreateBean t6 = ctx.getBean("test3", TestCreateBean.class);
        System.out.printf("t6 : %s\n",t6);

        ctx.close();
    }
}
