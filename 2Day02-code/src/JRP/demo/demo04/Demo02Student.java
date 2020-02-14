package JRP.demo.demo04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo02Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("===============");

        Student stu2 = new Student("鲁班七号", 8);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    }
}
