# 知识点

面向对象

## 题目1（完成）

定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

请定义出手机类，类中要有空参、有参构造方法，set/get方法。 

定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

调用对象的两个功能，打印效果如下：

```
正在使用价格为3998元黑色的小米手机打电话....
正在使用价格为3998元黑色的小米手机发短信....
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。

### 解题方案

### 操作步骤

1. 定义手机类，手机类中定义String类型的品牌，int类型的价格，String类型的颜色，三个成员变量都用privice修饰。
2. 提供空参构造方法和有参构造方法。
3. 提供set/get方法。
4. 编写打电话的成员方法，方法中对成员变量进行使用。
5. 编写发短信的成员方法，方法中对成员变量进行使用。
6. 在测试类中创建手机对象，使用set方法赋值，分别调用各个方法。

### 参考答案

```java
public class Phone {
    private String brand;
    private double price;
    private String color;


    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机打电话....");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机发短信....");
    }

}


public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor("黑");
        p.setPrice(3998);

        p.call();
        p.sendMessage();
    }
}
```

## 题目2（完成）

定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：

```
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
女朋友帮我洗衣服
女朋友给我做饭
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。
3. 展示方法的作用就是打印姓名、身高、体重三个成员变量的值。

### 解题方案

### 操作步骤

1. 定义女朋友类，定义String类型姓名，double类型身高和double类型体重三个成员变量，三个成员变量都用privice修饰。
2. 提供空参构造方法和有参构造方法。
3. 提供set/get方法。
4. 编写展示方法show()，方法打印三个成员变量的值。
5. 编写洗衣服wash()方法，输出洗衣服的语句。
6. 编写做饭cook()方法，输出做饭的语句。
7. 在测试类中使用有参构造创建女友对象，分别调用各个方法。

### 参考答案

```java
public class GirlFriend {
    private String name;
    private double height;
    private double weight;


    public GirlFriend() {
    }

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }


    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,体重" + weight + "斤");
    }
}


public class Test {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend("凤姐",155.0,130);
        gf.show();
        gf.wash();
        gf.cook();

    }
}
```

## 题目3（完成）

定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()

要求：

​	1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
​	3.调用成员方法,打印格式如下:		

```
工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
工号为135基本工资为10000的程序员李四正在努力的写着代码......
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。
3. 在工作work()方法中调用成员变量，输出成员变量的值。

### 解题方案

### 操作步骤

1. 定义项目经理类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id,salary,bonus的值。
2. 定义程序猿类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id和salary的值。
3. 在测试类中使用有参构造创建项目经理对象并赋值，调用工作方法打印结果。
4. 在测试类中使用有参构造创建程序员对象并赋值，调用工作方法打印结果。

### 参考答案

```java

public class Manager {
    //姓名name，工号id，工资salary，奖金bonus。行为：工作work()
    private String id;
    private String name;
    private double salary;
    private double bonus;


    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     *
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}



public class Coder {
    private String id;
    private String name;
    private double salary;


    public Coder() {
    }

    public Coder(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员"+name+"正在努力的写着代码......");
    }
}



public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("123","张三",15000,6000);
        m.work();


        Coder c = new Coder("135","李四",10000);
        c.work();

    }
}
```

## 题目4（完成）

定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
要求:
​	1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
​	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
​	3.调用成员方法,打印格式如下:

```
花色的波斯猫正在吃鱼.....
花色的波斯猫正在逮老鼠....
黑色的藏獒正在啃骨头.....
黑色的藏獒正在看家.....
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。

### 解题方案

### 操作步骤

1. 定义猫类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，抓老鼠方法catchMouse()，方法中根据题目给出的格式输出成员变量的值。
2. 定义狗类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，看家方法lookHome()，方法中根据题目给出的格式输出成员变量的值。
3. 在测试类中使用有参构造创建猫类对象，调用eat()方法和catchMouse()方法。
4. 在测试类中使用有参构造创建狗类对象，调用eat()方法和lookHome()方法。

### 参考答案

```java
public class Cat {
    private String color;
    private String breed;


    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "色的" + breed + "正在吃鱼.....");
    }

    public void catchMouse() {
        System.out.println(color + "色的" + breed + "正在逮老鼠....");
    }
}




public class Dog {
    private String color;
    private String breed;


    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "色的" + breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(color + "色的" + breed + "正在看家.....");
    }
}


public class Test {
    public static void main(String[] args) {
       Cat c = new Cat("花","波斯猫");
       c.eat();
       c.catchMouse();


       Dog d = new Dog("花","藏獒");
       d.eat();
       d.lookHome();

    }
}
```













