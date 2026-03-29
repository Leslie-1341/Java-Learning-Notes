## 练习一：

​	自行完成切换美女图片的功能。

### 需求如下：

​	 ![更换图片](.\img\更换图片.png)

### 需求详解：

1，在功能选项中添加更换图片，在更换图片里面再添加美女，动物，运动。

​      代码中功能是JMenu，更换图片也是JMenu，美女，动物，运动是三个JMenuItem

​     代码如下：

```java
//创建菜单并添加到界面当中
//1.创建菜单JMenuBar的对象
JMenuBar jMenuBar = new JMenuBar();
//2.创建菜单上面的两个选项JMenu
JMenu functionJMenu = new JMenu("功能");
JMenu aboutJMenu = new JMenu("关于我们");

//创建更换图片
JMenu changeImage = new JMenu("更换图片");

//3.创建JMenuItem的对象
JMenuItem girl = new JMenuItem("美女");
JMenuItem animal = new JMenuItem("动物");
JMenuItem sport = new JMenuItem("运动");
JMenuItem repalyItem = new JMenuItem("重新游戏");
JMenuItem reLoginItem = new JMenuItem("重新登录");
JMenuItem closeItem = new JMenuItem("关闭游戏");
JMenuItem accountItem = new JMenuItem("公众号");



//4.把美女，动物，运动添加到更换图片当中
changeImage.add(girl);
changeImage.add(animal);
changeImage.add(sport);

//5.把更换图片，重新游戏，重新登录，关闭游戏添加到功能当中
functionJMenu.add(changeImage);
functionJMenu.add(repalyItem);
functionJMenu.add(reLoginItem);
functionJMenu.add(closeItem);
//6.把公众号添加到关于我们当中
aboutJMenu.add(accountItem);

//5.把功能，关于我们添加到JMenuBar当中
jMenuBar.add(functionJMenu);
jMenuBar.add(aboutJMenu);

//6.把整个菜单JMenuBar添加到整个界面当中
this.setJMenuBar(jMenuBar);
```

2，当我们点击了美女之后，就会从13组美女图片中随机选择一组。

3，当我们点击了动物之后，就会从8组动物图片中随机选择一组。

4，当我们点击了运动之后，就会从10组运动图片中随机选择一组。

5，细节1：选择完毕之后，游戏界面中需要加载所有的小图片并且打乱顺序

6，细节2：按A的时候显示的是选择之后的图片

![girl](.\img\girl.png)





## 练习二（扩展题）：

​	独立完成登录界面，此题为附加扩展题。

### 需求如下：

​		 ![登录界面](.\img\登录界面.png)

### 需求详解：

​	

```java
public class LoginJFrame extends JFrame {
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("zhangsan","123"));
        list.add(new User("lisi","1234"));
    }
    
    
    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        JTextField username = new JTextField();
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        JTextField password = new JTextField();
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        JTextField code = new JTextField();
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getCode();
        JLabel rightCode = new JLabel();
        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        JButton login = new JButton();
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        JButton register = new JButton();
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }

    
    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }
}
```

### JTextField用到的方法解释：

```java
//设置位置和宽高
setBounds(x,y,宽,高);
//返回输入框中用户输入的数据
//细节：如果用户没有输入，返回的是一个长度为0的字符串
getText();
//修改数据
setText(要修改的内容);
```

### JButton用到的方法解释：

```java
//给按钮设置背景图片,方法中传递ImageIcon的对象即可
setIcon()；
```

## 作业答案

​	参见day17作业文件夹

















