package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //beans.xml파일을 로딩한다.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
        callMethod(hello1);

        HelloWorld hello2 = ctx.getBean("hello2",HelloWorld.class);
        callMethod(hello2);

        ctx.close();
    }

    public static void callMethod(HelloWorld hello){
        hello.sayHello();
    }
}
