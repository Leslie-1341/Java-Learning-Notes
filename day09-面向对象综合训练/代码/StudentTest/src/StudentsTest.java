import java.util.Scanner;
public class StudentsTest {
    public static final int MAX_SIZE = 100;

    public static int search(Students[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getId().equals(id)) {
                System.out.println("学号：" + arr[i].getId() + ", 姓名：" + arr[i].getName() + ", 年龄：" + arr[i].getAge());
                return i;
            }
        }
        System.out.println("学号不存在");
        return -1;
    }

    public static void printArr(Students[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            Students students = arr[i];
            System.out.println(students.getId() + ", " + students.getName() + ", " + students.getAge());
        }
    }

    public static void add(Students[] arr, Students s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = s;
                System.out.println("添加成功");
                return;
            }
        }
        System.out.println("数组已满，添加失败");
    }

    public static void delete(Students[] arr, String id) {
        int index = search(arr, id);
        if (index != -1) {
            arr[index] = null;
            System.out.println("删除成功");
        } else {
            System.out.println("学号不存在，删除失败");
        }
    }
    public static void main(String[] args) {
        // 1.创建学生数组
        Students[] arr = new Students[MAX_SIZE];

        // 2.创建学生对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Students s = new Students();
            if (i > 0) {
                System.out.println("是否继续添加学生？（y/n）");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
            //录入学号
            System.out.println("请输入学生的学号");
            String id = sc.next();
            s.setId(id);
            //录入姓名
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            s.setName(name);
            //录入年龄
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            s.setAge(age);
            //把学生对象添加到数组当中
            arr[i] = s;
        }  

        // 3.再添加一个学生，并判断学号是否存在
        System.out.println("请输入待添加学生的学号");     
        int index = search(arr, null);//判断学号是否存在
        if (index != -1) {
            System.out.println("学号已存在，请重新输入学生信息");
        }
        Students newStudent = new Students(); // 创建一个新的学生对象
        // 录入新学生的属性
        System.out.println("请输入新学生的学号");
        String newId = sc.next();
        newStudent.setId(newId);
        System.out.println("请输入新学生的姓名");
        String newName = sc.next();
        newStudent.setName(newName);
        System.out.println("请输入新学生的年龄");
        int newAge = sc.nextInt();
        newStudent.setAge(newAge);
        add(arr, newStudent); // 调用add方法添加新学生

        // 4.遍历数组，打印学生属性
        printArr(arr);

        // 5.根据学号删除学生
        System.out.println("请输入要删除学生的学号");
        String id = sc.next();
        delete(arr, id);
        System.out.println("删除成功，删除后的学生信息如下：");
        printArr(arr);

        // 6.修改某个学生信息
        System.out.println("请输入要修改学生的学号");
        String modifyId = sc.next();
        int modifyIndex = search(arr, modifyId);
        if (modifyIndex != -1) {
            Students modifyStudent = arr[modifyIndex];
            System.out.println("请输入新的姓名");
            String modifyName = sc.next();
            modifyStudent.setName(modifyName);
            System.out.println("请输入新的年龄");
            int modifyAge = sc.nextInt();
            modifyStudent.setAge(modifyAge);
            System.out.println("修改成功，修改后的学生信息如下：");
            printArr(arr);
    } else {
            System.out.println("学号不存在，修改失败");
        }
        sc.close();
    }
}