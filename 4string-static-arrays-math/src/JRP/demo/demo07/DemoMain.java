package JRP.demo.demo07;

public class DemoMain {

    public static void main(String[] args) {
        //创建笔记本实体对象
        Computer computer = new Computer();
        computer.run();

        //创建鼠标实体对象
        USB mouse = new Mouse();

        //笔记本使用鼠标
        computer.useUSB(mouse);

        //创建键盘实体对象
        USB kb = new Keyboard();

        //笔记本使用键盘
        computer.useUSB(kb);

        //笔记本关闭
        computer.shutdown();
    }
}
