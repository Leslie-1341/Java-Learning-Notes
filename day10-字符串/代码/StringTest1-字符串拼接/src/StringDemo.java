/*	定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3] */

public class StringDemo {
    //方法一
    //作用：把一个数组变成字符串
    public static String arrToString(int[] arr) {
        String s = "";
        s = s + "["; //拿着长度为0的字符串，跟[进行拼接，产生一个新的字符串。
        //把新的字符串再赋值给s，此时变量s记录的就是新的字符串"["的地址值

        //遍历数组得到数组里的每一个元素并进行拼接
        for (int i = 0; i < arr.length; i++) {
            //第一次循环:i = 0 获取的就是0索引上的元素
            //"[" + 1 + ", " 拼接完毕之后产生一个新的字符串 "[1, "
            //第二次循环：i = 1 获取的就是1索引上的元素
            // 此时s就是第一次循环结束后拼接完毕的结果："[1, "
            //"[1, " + 2 + ", " 拼接完毕之后产生一个新的字符串 "[1, 2, "
           if(i == arr.length - 1){
               //是最后一个元素，不需要拼接逗号空格
               s = s + arr[i];
           }else{
               //不是最后一个元素，需要拼接元素和逗号空格
               s = s + arr[i] + ", ";
           }
        }

        //循环结束之后，再拼接最后一个右括号
        s = s + "]";
        return s;
    }

    //方法二
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
        //从到右依次打印得到[1, 2, 3, 4, 5]
    }

    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    String str = arrToString(arr);
    System.out.println(str);
    printArr(arr);
    }
}