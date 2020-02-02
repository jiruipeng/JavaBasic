package JRP.demo.demo01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1，导包：
也就是指出需要使用的类，在什么位置。
import 包名称.类名称；import cn.itcast.daye6.demoe1.Student；
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建，
格式：
类名称对象名= new类名称（）；
Student stu = new Student（）；

3.使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
（也就是，想用谁，就用对象名点儿谁。）

 注意事项：
 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo02Student {


    public static void main(String[] args) {
        //1．导包。
        //我需要使用的Student类，和我自己Demoe25tudent位于同一个包下，所以省略导包语句不写

        //2.创建，格式
        //类名称对象名=new类名称（）；
        //根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        //3.使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("===============");
        stu.age = 18;
        stu.name = "Jack";
        System.out.println(stu.age);
        System.out.println(stu.name);


    }

}