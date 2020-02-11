package JRP.demo.demo01;

/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class Demo04MathPractise {

    public static void main(String[] args) {
        int count = 0;
        for (double i = -10.8; i <= 5.9; i++) {
            double temp = Math.abs(i);
            Math.round(temp);
            if (temp > 6 || temp < 2)
                count++;
        }
        System.out.println("在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有:  " + count + "  个");

//        System.out.println("==========其他方法===========");
//        int count = 0; // 符合要求的数量
//
//        double min = -10.8;
//        double max = 5.9;
//        // 这样处理，变量i就是区间之内所有的整数
//        for (int i = Math.ceil(min); i < max; i++) {
//            int abs = Math.abs(i); // 绝对值
//            if (abs > 6 || abs < 2.1) {
//                System.out.println(i);
//                count++;
//            }
//        }
//
//        System.out.println("总共有：" + count); // 9


    }
}
