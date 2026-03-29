# 每日作业 - JavaSE第2天

## 题目1：（选择）

下列关于java变量声明那个是错误的：

A . int x = 5;

B. double d = 3.14;

C. char grade = ‘C’;

D. String name = ‘黑马程序员’;

**讲解：D**

**字符串需要用双引号引起来**



## 题目2：（看代码说结果）

看代码说结果，不要去运行。

```java
double money = 10.0;
money = money + 5;
money -= 2.5;
money = money + 10;
money = money -3;
System.out.println(money)
```

**讲解：**

**程序从上往下依次执行，不断的修改money****这个变量中的值**

**最终变化为：19.5**





## 题目3：（代码题）

请用代码描述下列银行流水变化过程：

1. 小明账户bankBalance初始值有500.00元
2. 存入250元
3. 支出100元
4. 打印剩余存款

**讲解：**

**double bankBalance = 500.0;**
 **bankBalance = bankBalance + 250;**
 **bankBalance = bankBalance - 250;**
 **System.out.println(bankBalance);**





## 题目4：（选择题）

变量名是一个单词或者是一组单词，用来描述一个数据的含义，方便人理解，变量名不能有空格。下面的名字哪些可以是变量名?  

A. mybirthday

B. myname  

C. my name 

D. my birthday

E. 1987.  

F. ”传智播客” 

**讲解：**

**AB正确，其他错误**

**C：不能有空格**

**D：不能有空格**

**E：不能以数字开头**

**F：变量名不能有双引号**





## 题目5：（选择题）

关于变量的说法哪些是对的?  

A. 一个变量一次就可以存储很多种不同的数据

B. 变量是值的容器,定义变量可以存放值 

C. 变量可以随时修改存储数据的类型

D. 定义变量可以帮我们存储信息方便后面使用 

**讲解：**

**A：错误，一个变量只能存一个值**

**B：正确**

**C：错误，只有存储的值可以修改，数据类型一旦确定无法修改**

**D：正确**





## 题目6：（选择题）

下面代码哪些是创建一个变量?  

A. int myAge = 18;  

B. myName='传智播客”;

C. myAge = 16;  

D. String myName ; 

**讲解：**

A：正确

B：错误，缺少数据类型，而且数据值也错误

C：错误，缺少数据类型

D：错误，没有赋值



## 题目7：（选择题）

int和float的区别是什么?  

A. 区别是没有区别  

B. int是变量, float是方法  

C. int是用来存放整数数据的变量类型，float是存放小数的

D. int类型的数据要用”， 引号引起来 

**讲解：**

A：错误，有区别

B：错误，int和float都是数据类型

C：正确

D：错误，整数不用双引号引起来



## 题目8：（代码题）

变量应该是先声哪后使用,请完成下面代码  

A.声明字符串型变量name  

B.声明字符串型变量birthday

C.声明整数类型变量age  

D.声明float类型变量money 

**讲解：**

```java
A:String name = "尼古拉斯阿玮";
B:String birthday = "9月10日";
C:int age = 18;
D:float money = 999999999.99F;
```





## 题目9（代码题）

请编写程序，分别定义8种基本数据类型的变量，并打印变量的值。

### 训练目标

java中的八种基本基本数据类型和变量的定义

### 训练提示

1、java中的8种基本数据类型都有什么？

2、定义变量的格式是什么？

3、变量名该怎样定义？

4、该怎样使用变量？

### 参考方案

定义变量，并输出变量的值。

### 训练步骤

1、创建java文件，定义类Test03，编写主方法。

2、在java语言中，定义变量必须明确变量的数据类型。八种基本数据类型包括byte、short、int、long、float、double、char、boolean。

3、定义变量的格式是：

~~~java
数据类型 变量名 = 初始化值; // 声明变量并赋值
// 或
数据类型 变量名; // 先声明
变量名 = 初始化值; // 再赋值
~~~

4、可以包含英文字母、数字字符、英文下划线（_）和英文美元符（$），并且不能以数字开头。在开发中，java变量的命名又最好符合“小驼峰”式的惯例规范，并且最好做到见名知意。

5、在输出语句中，直接调用变量名即可。

6、编译并运行代码，查看输出结果。

### 参考答案

```java
public class Test01 {
    public static void main(String[] args) {
        // 定义byte类型变量，值为整数，只要在byte范围即可，byte范围：-128 ~ 127
        byte b = 100;
        System.out.println(b);
		// 定义short类型变量，值为整数，只要在short范围即可
        short s = 12345;
        System.out.println(s);

        // 整数的默认类型就是int类型
        int num = 654321;
        System.out.println(num);

        // 定义long类型的整数，需要在数据的后面加字母（L），大小写不限，建议大写。
        long lo = 123456789L;
        System.out.println(lo);

        // 定义float类型的浮点数，需要在数据的后面加字母（F），大小写不限，建议大写。
        float f = 1.5F;
        System.out.println(f);

        // 浮点型默认类型double
        double d = 123.456;
        System.out.println(d);

        // 布尔型只有两个取值：true和false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        // 定义字符型需要一对英文的单引号包裹，并且只能包含一个字符
        char c = 'a';
        System.out.println(c);
    }
}
```



## 题目10（代码题）

请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。

1、班级里有100个学员。

2、某商品价格55.55元。

3、地球已经诞生超过46亿年。

4、“5是偶数”这句话的描述是假的。

输出结果如下：

~~~java
100
55.55
4600000000
false
~~~

### 训练目标

变量的定义

### 训练提示

1、不同的数据信息需要使用不同的数据类型，可以根据不同数据类型的大小以及特点选择合适的类型来定义变量，描述事物的信息。

### 参考方案

定义变量描述信息。

### 训练步骤

1、创建java文件，定义类Test04，编写主方法。

2、在主方法中定义不同的变量描述题目中的信息。

​	2.1、学员数量，可以用默认的整数类型int表示

​	2.2、商品价格，使用默认的浮点数类型double表示

​	2.3、天文数字，可以使用长整型long表示

​	2.4、一个描述真或者假，只有两种状态，可以使用boolean类型

3、使用输出语句，输出变量。

4、编译并运行，查看输出结果。

### 参考答案

~~~java
public class Test02 {
    public static void main(String[] args) {
        int studentNumber = 100; // 学生数量
        System.out.println(studentNumber);

        double price = 55.55; // 商品价格
        System.out.println(price);

        long yearNumber = 4600000000L; // 超出int范围的整数
        System.out.println(yearNumber);

        boolean flag = false; // 真假值
        System.out.println(flag);
    }
}
~~~

## 题目11（代码题）

在今天的课程学习中，我们知道了java的8种基本数据类型，随着后续学习，我们还将学习引用数据类型。此时由于练习需要，我们要了解其中一个最常用的引用数据类型-字符串（String），字符串变量的一种定义方式与基本数据类型一致：

~~~java
// 数据类型 变量名 = 初始化值；
String str = "中国";
System.out.println(str);
// 其中String为数据类型，str为变量名（符合标识符规则即可），"中国"是我们学习的字符串常量值。
// 总体即表示：将字符串"abc"，赋值给字符串类型的变量str。
// 输出结果为：中国
~~~

请根据以上描述，选用合适的数据类型定义变量用于描述一个学员的信息，并将其输出到屏幕上。输出结果如下：

~~~java
************************
我的姓名是：张三
我的性别是：男
我的年龄是：18
我的地址是：xx省xx市
我的饭卡余额是：55.55元
************************
~~~

### 训练目标

数据类型、变量的定义和使用、字符串连接符

### 训练提示

1、根据题目要求，学员的信息包含姓名、性别、年龄、地址、余额，这些信息分别应该使用什么样的数据类型来存储呢？

2、在输出语句中，为了按照题目要求的格式输出，需要将一些已知字符串和变量进行拼接，比如："我的姓名是：" + name

### 参考方案

### 训练步骤

1、创建java文件，定义类Test03，编写主方法。

2、在主方法中定义变量用于存储学员信息。

2.1、姓名、性别、地址都可以使用字符串类型

2.2、年龄为整数数据，使用int类型

2.3、余额为小数类型，使用double类型

3、将已知字符串与变量使用“+”拼接在一起输出。

4、保存文件，编译运行，查看结果。

### 参考答案

 ```java
public class Test03 {
    public static void main(String[] args) {
        // 姓名
        String name = "张三";
        // 性别
        String gender = "男";
        // 年龄
        int age = 20;
        // 地址
        String address = "美国芝加哥";
        // 余额
        double money = 88.88;

        System.out.println("************************");
        System.out.println("我的姓名是：" + name); // 在输出语句中将变量与字符串拼接
        System.out.println("我的性别是：" + gender);
        System.out.println("我的年龄是：" + age);
        System.out.println("我的地址是：" + address);
        System.out.println("我的饭卡余额是：" + money + "元");
        System.out.println("************************");
    }
}
 ```