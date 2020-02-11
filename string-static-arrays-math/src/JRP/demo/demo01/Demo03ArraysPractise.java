package JRP.demo.demo01;

import java.util.Arrays;
import java.util.Scanner;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo03ArraysPractise {

    public static void main(String[] args) {
        String str = new String();
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
