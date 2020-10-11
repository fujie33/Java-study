package com.ny.java.week1;

/**
 * @ClassName Example5_3
 * @Description TODO
 * @Author ny
 * @Date 2020/10/11
 **/
public class Example5_3 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.x = 98;
        System.out.println("对象stu的x的值是："+stu.getX());
        stu.setX(98.98);
        double m= stu.getDoubleX();
        System.out.println("对象stu隐藏的x的值是："+m);
    }
}

class Student extends People{
    int x;
    public int getX(){
        return x;
    }
}

class People{
    public double x;
    public void setX(double x){
        this.x = x;
    }
    public double getDoubleX(){
        return x;
    }
}
