package JRP.demo.demo03;

/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。
一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是！超出了本类范围之外就不能再直接访问了。

间接访问private成员变量，就是定义一对儿Getter/Setter方法

必须叫setXxx或者是getXxx名规则。
对于Getter来说，不能有参数，返回植类型和成员变量对应；
对于Setter来说，不能有返回值，参数类型和成员变量对应。

对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class Person {

    String name;//姓名
    private int age;//年龄
    private boolean male;//是不是爷们儿

    public void show() {
        System.out.println("我叫" + name + ",年龄：" + age);
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    //这个成员方法用于向age设置数据
    public void setAge(int num) {
        if (num < 120 && num >= 0) {//如果是合理情况
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    //这个成员方法专门用于获取age的数据
    public int getAge() {
        return age;
    }


}
