package kr.co.softcampus.beans;

public class TestBeanPostProcessor2 {
    public TestBeanPostProcessor2(){
        System.out.println("TestBeanPostProcessor2의 생성자");
    }

    public void bean2_init(){
        System.out.println("TestBeanPostProcessor2의 init메서드");
    }
}
