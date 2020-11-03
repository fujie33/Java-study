package com.fujie.day15;

/**
 * @ClassName AnonymityTest
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/3
 **/
interface AnonymityOuter {
    void hi();
}
public class AnonymityTest {
    public static void main(String[] args) {
        AnonymityOuter anonymityOuter = new AnonymityOuter() {
            @Override
            public void hi() {
                System.out.println("Hi, AnonymityOuter.");
            }
        };
        anonymityOuter.hi();
    }
}
