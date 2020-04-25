package functional_programming;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 4, 22, 34, 45, 11, 33};
        System.out.println("最小数："+Arrays.stream(arr).min());
        System.out.println("数组去重乘2求和：" + Arrays.stream(arr).distinct().map((i) -> i * 2).sum());
    }
}
