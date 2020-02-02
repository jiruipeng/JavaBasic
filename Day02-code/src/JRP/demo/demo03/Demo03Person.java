package JRP.demo.demo03;

/*
用了private的好处是，我不能在其他类随意更改重要的数据，
要按照使用的类的方法的规则来。

不能直接访问，间接访问就意味着要遵循一些约束，提高代码的安全性。
 */
public class Demo03Person {

    public static void main(String[] args) {
        Person per = new Person();
        per.name = "猪一飞";
//        per.age = 20;//错误写法
        per.setAge(20);
        per.show();

        per.setMale(true);
        System.out.println("是不是爷们儿：" + per.isMale());
    }
}
