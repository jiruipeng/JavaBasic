package JRP.demo.demo01;

import java.util.Arrays;

public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        //要求打印格式为：[10,20,30,40,50]
        //使用面向过程，每一个步骤细节都要考虑
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {//如果是最后一个元素
                System.out.println(array[i] + "]");
            } else {//如果不是最后一个元素
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("=================");

        //使用面向对象
        //找一个JDK为我们提供的Arrays类
        //其中有一个toString方法
        System.out.println(Arrays.toString(array));
    }
}
