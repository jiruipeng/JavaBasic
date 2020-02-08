package JRP.demo.demo01;

import java.util.Random;
import java.util.Scanner;

public class guessNumGame {
    private int num;
    private int guess;
    private int rage;

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        Random random = new Random();
        int num = random.nextInt(this.rage);
        this.num = num;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    //    注意事项：
//            1.成员变量是直接定义在类当中的，在方法外边。
//            2.成员方法不要写static关键字。
    public void guessNum() {
        System.out.println("这是猜数字游戏\n请输入这次游戏的范围：");
        setRage(new Scanner(System.in).nextInt());

        //1、随机生成一个数字
        setNum();
        int num = getNum();

        do {
            //2、输入猜想的数字
            System.out.println("请输入你猜想的数字是：");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            setGuess(guess);

            //3、判断数字是否相等
            if (guess < num)
                System.out.println("太小了");
            else if (guess > num)
                System.out.println("太大了");
            ;
        } while (num != guess);

        System.out.println("你猜对了，游戏结束！这个数字就是：" + num);


    }

}
