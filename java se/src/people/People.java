package people;

public class People {
    //属性（成员变量） 有什么

    private double height;  //身高
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }

    private int age;     //年龄
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    int sex;    //性别，0为男性，非0为女性

    // 构造方法
    public People(){}
    //构造函数，初始化了所有属性
    public People(double h, int a, int s){
        height = h;
        age = a;
        sex = s;
    }

    //方法 干什么
    void cry(){
        System.out.println("我在哭！");
    }
    protected void laugh(){
        System.out.println("我在笑！");
    }

    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");
    }

    // 内部类
    private String name = "Sam";
    /*外部类的静态变量。
Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，
即被类的所有对象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。
*/
    static String ID = "510xxx199X0724XXXX";

    public class Student0 {
        String ID = "20151234";               //内部类的成员属性
        //内部类的方法
        public void stuInfo(){
            System.out.println("访问外部类中的name：" + name);
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }
    // static 修饰的内部类，可直接实例化
    public static class Student {
        String ID = "20151234";               //内部类的成员属性
        //内部类的方法
        public void stuInfo(){
            System.out.println("访问外部类中的name：" + (new People().name));
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

    //定义在外部类中的方法内：
    public void peopleInfo() {
        final String sex = "man";  //外部类方法中的常量
        class Student {
            String ID = "20151234"; //内部类中的常量
            public void print() {
                System.out.println("访问外部类的方法中的常量sex：" + sex);
                System.out.println("访问内部类中的变量ID:" + ID);
            }
        }
        Student a = new Student();  //创建方法内部类的对象
        a.print();//调用内部类的方法
    }
    
    //定义在外部类中的作用域内
    public void peopleInfo2(boolean b) {
        if(b){
            final String sex = "man";  //外部类方法中的常量
            class Student {
                String ID = "20151234"; //内部类中的常量
                public void print() {
                    System.out.println("访问外部类的方法中的常量sex：" + sex);
                    System.out.println("访问内部类中的变量ID:" + ID);
                }
            }
            Student a = new Student();  //创建方法内部类的对象
            a.print();//调用内部类的方法
        }
    }

    //测试成员内部类
    public static void main(String[] args) {
        People a = new People();     //创建外部类对象，对象名为a
        Student0 b = a.new Student0(); //使用外部类对象创建内部类对象，对象名为b
        // 或者为 People.Student b = a.new Student();
        b.stuInfo();   //调用内部对象的suInfo方法

        Student d = new Student();   //直接创建内部类对象，对象名为b
        d.stuInfo();                 //调用内部对象的suInfo方法

        People e = new People(); //创建外部类的对象
        System.out.println("定义在方法内：===========");
        e.peopleInfo();  //调用外部类的方法
        System.out.println("定义在作用域内：===========");
        e.peopleInfo2(true);

    }
}
