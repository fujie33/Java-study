package week8;

/**
 * @ClassName recursion
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/27
 **/

import java.util.Arrays;
import java.util.Random;
public class recursion {
    public final static int MAX = 10;

    public static int getMinRecursion(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return Math.min(arr[index], getMinRecursion(arr, index - 1));
    }

    public static void main(String[] args) {
        int[] array = new int[MAX];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("============>随机数组为"+ Arrays.toString(array));
        System.out.println("============>最小值为"+getMinRecursion(array, array.length - 1));
    }
}
