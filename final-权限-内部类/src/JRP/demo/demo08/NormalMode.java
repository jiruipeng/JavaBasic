package JRP.demo.demo08;

import red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    int balance;


    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> red = new ArrayList<>();

        int Money = totalMoney;
        int avg = Money / totalCount;
        int mod = Money % totalCount;
        //平均红包
        for (int i = 0; i < totalCount - 1; i++) {
            red.add(avg);
        }
        //手气红包
        red.add(avg+mod);

        return red;
    }
}
