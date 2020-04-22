package people;

public class static_method {
    public static String string="shiyanlou";
    public static void main(String[] args){

        //静态成员不需要实例化 直接就可以访问
        System.out.println(static_method.string);

        //如果不加static关键字 需要这样访问
        static_method staticTest=new static_method();
        System.out.println(static_method.string);
        //如果加上static关键字，上面的两种方法都可以使用
    }
}
