package JRP.demo.demo02;

public class Demo02PhoneTwo {

    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象。
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("===========");

        one.brand = "华为";
        one.color = "黑色";
        one.price = 250;

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("任志强");
        one.sendMessage();
        System.out.println("===========");

        //根据Phone类，创建一个名为one的对象。
        Phone two = new Phone();

        two.brand = "Apple";
        two.color = "白色";
        two.price = 333;

        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        one.call("乔布斯");
        one.sendMessage();
    }
}
