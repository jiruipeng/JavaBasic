package JRP.demo.demo02;

/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接

间接
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println("fu.numFu="+fu.numFu);//只能使用父类的东西，没有任何子类的内容
        System.out.println("============");

        Zi zi = new Zi();

        System.out.println("zi.numFu=" + zi.numFu);//100
        System.out.println("zi.numZi=" + zi.numZi);//250
        System.out.println("============");

        //等号左边是谁，就优先用谁,找不到再向上找
        System.out.println("zi.num=" + zi.num);//优先子类,123
        //都没有，编译报错！
        System.out.println("============");

        zi.methodZi();
        zi.methodFu();

    }
}
