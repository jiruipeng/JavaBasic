package JRP.demo.demo02;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();

        Student stu1 = new Student("胡一菲", 25);
        Student stu2 = new Student("曾小贤", 25);
        Student stu3 = new Student("关谷神奇", 26);
        Student stu4 = new Student("悠悠", 26);

        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);

        for (int i = 0; i < stuList.size(); i++) {
            System.out.println("第" + (i+1) + "个同学的姓名是：" + stuList.get(i).getName() + "；年龄是：" + stuList.get(i).getAge());
        }

    }
}
