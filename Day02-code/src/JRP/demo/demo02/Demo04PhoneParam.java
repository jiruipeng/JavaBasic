package JRP.demo.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.price = 2333;
        one.color = "嘿嘿嘿";
        one.brand = "荣耀";
        method(one);

    }

    public static void method(Phone param){
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }
}
