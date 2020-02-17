package JRP.demo.demo07;

class Computer {

    public void run(){
        System.out.println("电脑正在运行");
    }

    // 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
    public void useUSB(USB usb){
        //判断是否有USB
        if(usb != null){
            usb.open();
            //类型转换
            if(usb instanceof Mouse){
                Mouse m = (Mouse)usb;
                m.click();
            }else if(usb instanceof Keyboard){
                Keyboard k = (Keyboard)usb;
                k.type();
            }
            usb.close();
        }
    }

    public void shutdown(){
        System.out.println("电脑关机");
    }

}
