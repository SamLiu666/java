package people;

class Animal {
    //父类方法
    public void bark() {
        System.out.println("动物叫！");
    }
}

class Dog extends Animal {

    //子类重写父类的bark方法
    public void bark() {
        System.out.println("汪、汪、汪！");
    }
    //子类自己的方法
    public void dogType() {
        System.out.println("这是什么品种的狗？");
    }
}

public class Test {
    void f(int i) {
        System.out.println("i=" + i);
    }

    void f(float f) {
        System.out.println("f=" + f);
    }

    void f(String s) {
        System.out.println("s=" + s);
    }

    void f(String s1, String s2){
        System.out.println("s1+s2="+(s1+s2));
    }

    void f(String s, int i){
        System.out.println("s="+s+",i="+i);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.f(3456);
        test.f(34.56f);
        test.f("abc");
        test.f("abc","def");
        test.f("abc",3456);

        Animal a = new Animal();
        Animal b = new Dog();
        Dog d = new Dog();

        a.bark();
        b.bark();
        //b.dogType();
        //b.dogType()编译不通过
        d.bark();
        d.dogType();
    }
}
