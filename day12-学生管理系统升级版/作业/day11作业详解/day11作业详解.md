## 题目1

现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。

### 训练目标

ArrayList集合存储字符串元素，并遍历。

### 训练提示

1、创建ArrayList集合，泛型如何定义？

2、怎样将数据添加到集合中？

3、怎样遍历集合？



### 训练步骤

1、创建ArrayList集合对象，泛型声明为String类型

2、调用集合的add方法，将元素依次存入集合

3、遍历集合

​	3.1、定义循环，索引从0到集合的size-1

​	3.2、通过ArrayList集合的get方法，依次获取索引上的元素

### 参考答案

~~~java
public class Test01 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) { // 索引从0到size-1
            String element = list.get(i); // 根据索引获取元素
            System.out.println(element);
        }
    }
}
~~~

## 题目2

请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：

~~~java
姓名：赵老师, 专业：javase
姓名：钱老师, 专业：javaee
姓名：孙老师, 专业：php
姓名：李老师, 专业：python
~~~

### 训练目标

ArrayList集合存储自定义对象，并遍历。

### 训练提示

1、怎样定义一个描述教师信息的类？

2、需要将教师对象存入集合，创建集合对象，泛型该怎样定义？

3、怎样将数据添加到集合中？

4、怎样遍历ArrayList集合？输出信息时，直接打印对象名称可以吗？怎样才能按照题目要求格式输出信息？

### 参考方案



### 训练步骤

1、新建Teacher类，成员变量为String类型的name和course，私有修饰，提供构造方法，提供get和set方法。

2、创建ArrayList集合对象，泛型声明为Teacher类型

3、创建若干Teacher对象，可以使用构造方法为成员变量赋值，调用集合的add方法，将元素依次存入集合。

4、遍历集合

​	3.1、定义循环，索引从0到集合的size-1。

​	3.2、通过ArrayList集合的get方法，依次获取索引上的元素。

​	3.3、通过Teacher对象的get方法，获取属性值，拼接成要求的格式输出。

### 参考答案

~~~java
public class Teacher {
    private String name; // 姓名
    private String course; // 课程

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Teacher> list = new ArrayList<>();
        // 创建教师对象
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        // 添加元素
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        // 遍历
        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            System.out.println("姓名：" + t.getName() + ", 专业：" + t.getCourse());
        }
    }
}
~~~



## 题目3

有如下员工信息：

~~~java
姓名：张三，工资：3000
姓名：李四，工资：3500
姓名：王五，工资：4000
姓名：赵六，工资：4500
姓名：田七，工资：5000
~~~

先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：

1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”

2、判断是否有姓名为“赵六”的员工，如果有，将其删除

3、给姓名为“田七”的员工，涨500工资

### 训练目标

ArrayList集合的修改元素和删除元素API

### 训练提示

1、需要定义员工类，将员工信息进行封装

2、创建ArrayList集合，创建员工对象，将所有员工对象存入集合

3、需要判断集合中元素的信息，那么肯定需要遍历集合获取到所有元素

4、ArrayList集合中，修改元素和删除元素的方法是什么？在遍历集合时，删除了集合中的元素，会不会对遍历产生影响呢？如果会，该怎么解决？

### 参考方案



### 训练步骤

1、定义员工类Worker，私有属性name和salary，分别为String和int类型，表示姓名和工资，提供构造、get、set方法

2、创建ArrayList集合，泛型为Worker类型，创建员工对象，将所有员工对象存入集合

3、使用for循环遍历集合，获取到每一个元素。

​	3.1、判断元素的name属性，如果符合条件，作出相应的修改或者删除。

​	3.2、遍历时如果删除元素，后面的元素会往前走，索引再加1就会有元素遗漏，所以删除后遍历索引要相应的减1，防止有元素遍历不到。

### 参考答案

~~~java
public class Worker {
    private String name;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Worker> list = new ArrayList<>();
        // 创建员工对象并添加到集合中
        list.add(new Worker("张三", 2000));
        list.add(new Worker("李四", 2500));
        list.add(new Worker("王五", 3000));
        list.add(new Worker("赵六", 3500));
        list.add(new Worker("田七", 4000));
        // 判断是否有王五，如果有，改名为王小五
        // 判断是否有赵六，如果有，删除赵六
        // 给田七加500块工资
        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            if ("王五".equals(w.getName())) {
                w.setName("王小五");
                list.set(i, w);
            }
            if ("赵六".equals(w.getName())) {
                // 注意，一旦删除元素，后面的元素会往前走，索引再加1就会有元素遗漏，所以删除后要--
                list.remove(i--);
            }
            if ("田七".equals(w.getName())) {
                w.setSalary(w.getSalary() + 500);
                list.set(i, w);
            }
        }
        // 再次遍历查看结果
        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            System.out.println(w.getName() + "---" + w.getSalary());
        }
    }
}
~~~



## 题目4（综合）

利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：

1、提供操作菜单，可以选择要进行的操作。

2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。

3、可以查询图书，显示所有图书信息，然后返回到菜单。

4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。

5、可以删除图书，通过编号删除，删除成功后，返回到菜单。

6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。

7、可以退出系统，结束程序运行。

提示：

1、所有图书信息由键盘录入

2、图书的价格可以定义为字符串类型，因为在键盘录入时，不可以先使用nextInt()方法获取整数然后再使用next()方法获取字符串，这样会导致next()方法获取不到数据。



### 训练目标

ArrayList集合API的综合运用、编程逻辑的锻炼

### 训练提示

1、首先需要创建一个图书类，封装图书信息。

2、提供操作菜单，可以通过键盘录入不同的数字来表示不同的操作，选择结构语句可以实现该需求。

3、管理图书，需要将图书存放起来，首先需要创建集合容器。

4、添加图书，即将图书存入集合中，但存入之前需要判定编号的唯一性，如果编号存在，需要重新录入。

5、查询所有图书，即为遍历集合显示信息。

6、查询单本图书，需要录入图书名称，遍历集合进行查询。

7、修改图书信息，需要根据编号先找到该图书，修改其除了编号之外的信息，存入集合覆盖原来的信息。

8、删除图书信息，需要根据编号先找到该图书，根据索引直接删除即可。

9、退出系统功能，借助结束程序的API实现即可。

### 参考方案



### 训练步骤

1、创建Book类，属性String类型的id，name，author，price。提供构造方法、get和set方法。

2、创建测试类Test04，在main方法中，创建键盘录入对象，创建ArrayList集合对象用于存储图书。

3、使用输出语句定义一个操作菜单，包含添加、查看全部、查看单个、修改、查询、退出功能，使用switch语句对键盘录入的菜单项进行判断。

4、定义方法实现判断id是否已经存在。方法返回值boolean类型，参数列表为集合ArrayList和要查找的id字符串。遍历集合，判断id是否与集合中的Book对象的id相同，如果有相同，返回true，否则返回false

5、定义方法实现添加功能。方法返回值void，参数列表为集合ArrayList。在方法中，先使用键盘录入获取用户录入的id信息，调用方法判断id是否存在，如果存在，重新录入，如果不存在，再依次获取图书的其他信息，创建图书对象，并将图书对象存入集合中，输出添加成功的提示。

6、定义方法实现查看所有图书。方法返回值void，参数列表为集合ArrayList。如果集合长度为0，给出提示，结束方法，否则遍历集合，获取每个图书对象，再调用对象的get方法，获取所有信息展示即可。

7、定义方式实现根据名称查看一本图书。方法返回值void，参数列表为集合ArrayList。键盘录入图书的名称，遍历集合，获取每个图书的名称信息进行比较，如果相同，输出该图书信息，结束方法。否则输出不存在该图书。

8、定义方法实现根据编号修改图书信息。方法返回值void，参数列表为集合ArrayList。键盘录入图书编号，查询该编号是否存在，如果存在，再依次录入图书的修改后信息，创建新的图书对象，存入集合，将原对象覆盖，给出成功的提示，否则提示该编号图书不存在。

9、定义方法实现根据编号删除图书信息。方法返回值void，参数列表为集合ArrayList。键盘录入图书编号，查询该编号是否存在，如果存在，根据索引删除该对象，返回成功的提示，否则提示该编号的图书不存在。

10、退出系统的功能直接调用System的exit方法实现即可。

### 参考答案

~~~java
public class Book {
    private String bookId;
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String bookId, String name, String author, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建集合用于存储图书信息
        ArrayList<Book> list = new ArrayList<>();
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择你要进行的操作");
            System.out.println("1:添加图书");
            System.out.println("2:查看图书");
            System.out.println("3:查询图书");
            System.out.println("4:修改图书");
            System.out.println("5:删除图书");
            System.out.println("6:退出系统");

            String type = sc.next();

            switch (type) {
                case "1":
                    // 添加
                    addBook(list);
                    break;
                case "2":
                    // 查看所有图书
                    findAllBooks(list);
                    break;
                case "3":
                    // 查询某本图书
                    findBookByName(list);
                    break;
                case "4":
                    // 修改图书
                    updateBook(list);
                    break;
                case "5":
                    // 删除图书
                    deleteBook(list);
                    break;
                case "6":
                    System.out.println("感谢使用，再见");
                    System.exit(0); // 退出系统
                default:
                    System.out.println("选择有误，请重新输入");
                    break;
            }

        }
    }

    // 删除图书
    private static void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的图书编号：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (id.equals(b.getBookId())) { // 编号存在
                // 删除图书并结束方法
                list.remove(i);
                System.out.println("~~~删除成功~~~");
                return;
            }
        }
        System.out.println("没有该编号的图书信息");
    }

    // 修改图书
    private static void updateBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的图书编号：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (id.equals(b.getBookId())) { // 编号存在
                System.out.println("请输入修改后图书的名称：");
                String name = sc.next();
                System.out.println("请输入修改后图书的作者：");
                String author = sc.next();
                System.out.println("请输入修改后图书的价格：");
                double price = sc.nextDouble();
                Book newBook = new Book(id, name, author, price);
                // 更新数据
                list.set(i, newBook);
                System.out.println("~~~修改成功~~~");
                return;
            }
        }
        // 如果编号不存在
        System.out.println("没有该编号的图书信息");
    }

    // 根据图书的名称查询图书信息
    private static void findBookByName(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的图书名称：");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (name.equals(b.getName())) {
                System.out.println("编号\t" + "书名\t" + "作者\t" + "价格");
                System.out.println(b.getBookId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
                return;
            }
        }
        System.out.println("没有该名称图书信息");
    }

    // 查看所有图书信息
    private static void findAllBooks(ArrayList<Book> list) {
        if (list == null || list.size() == 0) {
            System.out.println("尚无图书信息");
            return;
        }
        System.out.println("编号\t" + "书名\t" + "作者\t" + "价格");
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            System.out.println(b.getBookId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
        }
    }

    // 查询编号是否存在
    public static boolean isExist(ArrayList<Book> list, String bookId) {
        // 遍历，如果发现相同id，返回true，
        for (int i = 0; i < list.size(); i++) {
            if (bookId.equals(list.get(i).getBookId())) {
                return true;
            }
        }
        // 如果没有，返回false
        return false;
    }

    // 添加图书
    public static void addBook(ArrayList<Book> list) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书信息：");
        System.out.println("编号：");
        String bookId;
        while (true) {
            bookId = sc.next();
            // 查询编号是否存在
            if (isExist(list, bookId)) {
                System.out.println("该编号已经存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("名称：");
        String name = sc.next();
        System.out.println("作者：");
        String author = sc.next();
        System.out.println("价格：");
        double price = sc.nextDouble();
        // 将信息封装到图书对象
        Book b = new Book(bookId, name, author, price);
        // 添加到集合
        list.add(b);
        System.out.println("~~~添加成功~~~");
    }
}
~~~



### 