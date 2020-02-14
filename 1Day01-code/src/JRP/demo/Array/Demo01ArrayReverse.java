package JRP.demo.Array;

/*
在同一个数组中，使得数组原来的顺序逆转过来。
 */

public class Demo01ArrayReverse {

    public static void main(String[] args) {
        myWay();
        otherWay();
    }

    public static void myWay() {
        System.out.println("myWay");
        int[] array1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "    ");
        }
        System.out.println();
        int temp, end;
        end = array1.length - 1;
        for (int i = 0; i < array1.length / 2; i++) {
            temp = array1[i];
            array1[i] = array1[end];
            array1[end] = temp;
            end--;
        }
        System.out.println("===========");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "    ");
        }
        System.out.println();
    }

    public static void otherWay() {
        System.out.println("otherWay");
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "    ");
        }
        System.out.println();
        System.out.println("===========");
        /*
        初始化语句：int min = 0, max = array.length - 1,min < max; min++,max++
        条件判断:min < max;
        步进表达式： min++, max--
        循环体：用第三个变量倒手
         */
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "    ");
        }
        System.out.println();
    }

    /*
    数组可以作为方法的参数
    当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
     */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
