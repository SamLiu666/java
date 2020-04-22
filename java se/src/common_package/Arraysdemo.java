package common_package;

import java.util.Arrays;
import java.util.Random;

public class Arraysdemo {
    void common_method(){
        // 初始化数组长度
        int[] arr = new int[10];
        Arrays.fill(arr, 5);  // 填充为5
        System.out.println("fill array: " + Arrays.toString(arr));

        Random random = new Random();
        for (int i = 0; i<arr.length; i++){
            // 100以内的随机数赋值
            arr[i] = random.nextInt(101);
        }
        System.out.println("After: " + Arrays.toString(arr));

        arr[5] = 50;
        Arrays.sort(arr);   // 数组排序
        System.out.println("sort排序: " + Arrays.toString(arr));

        // 对数组二分查找，元素=50 的索引
        int i = Arrays.binarySearch(arr, 50);
        System.out.println("索引: " + i);

        //赋值一组数组
        int[] newArray = Arrays.copyOf(arr, arr.length);
        System.out.println("equals: "+ Arrays.equals(arr, newArray));
    }

    int find(int[] arr, int target){
        Arrays.sort(arr);
        int l = arr.length; 
        int ans = 0;
        for (int i=0; i<l; i++){
            if (arr[i] == target){
                ans = i;
                break;
            }
        }
        return ans;
    }

    void find_2(){
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 33));
    }

    public static void main(String[] args){
        Arraysdemo a = new Arraysdemo();
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        int target = 33;
        int ans;
        ans = a.find(arr, target);
        System.out.println(ans);

    }
}
