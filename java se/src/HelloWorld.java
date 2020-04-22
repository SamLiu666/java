import java.util.Scanner;

public class HelloWorld{
    // 1、变量，常量
    public static void values(){
        System.out.println("常量 变量");
        int a = 1;      // 变量
        final double pi = 3.1415926;    // 常量
        System.out.println(a + "\n" + pi);
    }

    // 2、字符串类型
    public void string_method(){
        System.out.println("字符串类型");
        String s0 = "hello world!";     // 字符串类型
        int ls0 = s0.length();
        System.out.println(s0 +'\n' +ls0);

        System.out.println("1、字符串比较");
        String h1 = "hello"; String h2 = "Hello";
        System.out.println("用equals()比较，java和Java结果为"+h1.equals(h2));    //不忽略大小写
        System.out.println("用equalsIgnoreCase()比较，java和Java结果为"+h1.equalsIgnoreCase(h2));  //忽略大小写
        System.out.println(h1==h2); // == 比较对象在内存中存储地址是否一样

        System.out.println("2、字符串连接 + s.concat");
        String h = h1 + h2;
        System.out.println(h);
        h = h.concat(h1);
        System.out.println(h);

        System.out.println("3、索引 charAt");
        char c = h.charAt(0);
        System.out.println(c);

        System.out.println("4、字符串常用的方法");
        String s = "abcdefabc";
        System.out.println("字符a第一次出现的位置为"+s.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为"+s.indexOf("bc"));
        System.out.println("字符a最后一次出现的位置为"+s.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串"+s.substring(3));
        System.out.println("从位置3开始到6之间的字符串"+s.substring(3,6));
    }

    // 3、 算数运算符
    public void operation(){
        System.out.println("算数运算符");
        int a = 5;
        int b = 3;
        int c = 3;
        int d = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("b-- = " + (b--));
        System.out.println("--b = " + (--b));
        System.out.println("c++ = " + (c++));
        System.out.println("++d = " + (++d));
    }

    //4、位+逻辑 运算符
    public void logic_operation(){
        System.out.println("位 运算符");
        int a = 60;
        int b = 13;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));

        System.out.println("逻辑 运算符");
        boolean c = true;
        boolean d = false;
        System.out.println("c && d = " + (c && d));
        System.out.println("c || d = " + (c || d));
        System.out.println("!c = " + (!c));
        System.out.println("c ^ d = " + (c ^ d));
    }

    // 5、关系运算符
    public void relation(){
        System.out.println("关系运算符");
        int a = 3;
        int b = 5;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a > b ? a : b = " + (a > b ? a : b));
    }

    // 6、控制台输入
    public void keyboard(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b);
    }
    public static void  main(String[] args){

        HelloWorld hh = new HelloWorld();
        //hh.values();
        //hh.string_method();
//        hh.operation();
//        hh.logic_operation();
//        hh.relation();
//        hh.keyboard();
        hh.values();
        values();


    }
}