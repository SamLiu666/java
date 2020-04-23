package generic_type;

class Test<T>{
    private T ob;/*
    定义泛型成员变量，定义完类型参数后，可以在定义位置之后的方法的
    任意地方使用类型参数，就像使用普通的类型一样。
    注意，父类定义的类型参数不能被子类继承。
    */
    //构造函数
    public Test(T ob){
        this.ob = ob;
    }

    //getter 方法
    public T getOb(){
        return ob;
    }

    //setter method
    public void setOb(T ob){
        this.ob = ob;
    }
    public void showType(){
        System.out.println("T的实际类型是： " + ob.getClass().getName());
    }
}

public class testdemo {

    public static void main(String[] args){
        Test<Integer> intOb = new Test<>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println(i);

        Test<String> strOb = new Test<String>("heloo world");
        strOb.showType();
        System.out.println(strOb.getOb());
    }
}
