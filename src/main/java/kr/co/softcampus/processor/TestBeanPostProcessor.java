package kr.co.softcampus.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
    //init-method 호출 전
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before");
        switch (beanName){
            case "t1" : System.out.println("t1");
            break;
            case "t2" : System.out.println("t2");
            break;
        }
        return bean;
    }

    //init-method 호출 후
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after");

        switch (beanName){
            case "t1" : System.out.println("t1");
                break;
            case "t2" : System.out.println("t2");
                break;
        }

        return bean;
    }
}
