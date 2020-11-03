package com.fujie.day15;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/3
 **/
enum ColorEnum {
    RED,
    BLUE,
    YELLOW,
    GREEN
}
public class EnumTest {
    public static void main(String[] args) {
        ColorEnum color = ColorEnum.GREEN;
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            default:
                break;
        }
    }
}
