package JRP.demo.demo02;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("周星驰");
        list.add("周润发");
        list.add("刘德华");
        System.out.println(list);
        System.out.println("自定义格式：");
        printArrayList(list);

    }

    /*
    定义方法的三要素
    返回值类型：只是进行打印而已，没有运算，没有结果；所以用void
    方法名称：printArrayList
    参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(temp + "}");
            } else {
                System.out.print(temp + "@");
            }
        }
    }
}

