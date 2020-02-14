package JRP.demo.demo02;

public class Demo01PhoneOne {

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


    }
}
