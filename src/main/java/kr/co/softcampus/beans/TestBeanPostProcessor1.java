package kr.co.softcampus.beans;

public class TestBeanPostProcessor1 {
    public TestBeanPostProcessor1(){
        System.out.println("TestBeanPostProcessor1의 생성자");
    }

    public void bean1_init(){
        System.out.println("TestBeanPostProcessor1의 init메서드");
    }
}
