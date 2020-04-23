package animal;

public class test {
    public<T, S extends T> T testDemo(T t, S s){
        System.out.println("我是 T 类型，我的类型是" + t.getClass().getName());
        System.out.println("我是 S 类型，我的类型是" + s.getClass().getName());
        return t;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        test test1 = new test();
        dog d = new dog();
        dongwu a0 = new dongwu();
        dongwu a1  = test1.testDemo(a0, d);
        System.out.println("我是对象 a1，我的类型是" + a1.getClass().getName());
    }
}
