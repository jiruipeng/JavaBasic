package JRP.demo.demo02;


import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。

分析：
1. 需要创建一个大集合，用来存储int数字：<Integer>
2. 随机数字就用Random nextInt
3. 循环20次，把随机数字放入大集合：for循环、add方法
4. 定义一个方法，用来进行筛选。
筛选：根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型：ArrayList小集合（里面元素个数不确定）
方法名称：getSmallList
参数列表：ArrayList大集合（装着20个随机数字）
5. 判断（if）是偶数：num % 2 == 0
6. 如果是偶数，就放到小集合当中，否则不放。
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        int temp;//存放随机产生的数字

        for (int i = 0; i < 20; i++) {
            temp = random.nextInt(100);
            randomList.add(temp);
        }
        System.out.println(randomList);
        randomList = getSmallList(randomList);
        System.out.println("偶数总共有多少个：" + randomList.size());
        System.out.println(randomList);

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                smallList.add(list.get(i));
        }

        return smallList;
    }
}
