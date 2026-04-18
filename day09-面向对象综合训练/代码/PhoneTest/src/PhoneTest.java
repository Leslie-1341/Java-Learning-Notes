import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组用来存3个汽车对象
        Phone[] arr = new Phone[3];

        //2.创建手机对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phone c = new Phone();
            //录入品牌
            System.out.println("请输入手机的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入手机的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入手机的颜色");
            String color = sc.next();
            c.setColor(color);

            //把手机对象添加到数组当中
            arr[i] = c;
        }
        
        // 3.遍历数组，打印手机属性
        double sumPrice = 0;
        for (int i = 0; i < arr.length; i++) {           
            Phone phone = arr[i];
            sumPrice += phone.getPrice();
            System.out.println(phone.getBrand() + ", " + phone.getPrice() + ", " + phone.getColor());
        }
        // 4.计算平均价格，打印低于平均价格的手机品牌
        double averagePrice = sumPrice / arr.length;
        System.out.println("平均价格为: " + averagePrice);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < averagePrice) {
                count++;
                System.out.println("低于平均价格的手机品牌: " + arr[i].getBrand());               
            }
        }
        System.out.println("低于平均价格的手机数量: " + count);
    }
}
