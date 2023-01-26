package kr.co.softcampus.beans;

public class TestBeanConstructorDI2 {
    private DataBean data1;
    private DataBean data2;
    public TestBeanConstructorDI2(DataBean data1, DataBean data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public void printData(){
        System.out.printf("data1 : %s\n",data1);
        System.out.printf("data1 : %s\n",data2);
    }
}
