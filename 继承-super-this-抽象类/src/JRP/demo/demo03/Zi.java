package JRP.demo.demo03;

public class Zi extends Fu {
    int num = 456;

    public void method() {
        int num = 789;
        System.out.println("局部变量 num = " + num);
        System.out.println("本类的成员变量 num = " + this.num);
        System.out.println("父类的成员变量 num = " + super.num);
    }
}
