public class Outer {
    //匿名内部类是不能加访问修饰符的

    public Inner getInner(final String name, String city) {
        /*所在的方法的形参需要在内部类里面使用时，该形参必须为 final。这里可以看到形参 name 已经定义为 final 了
        而形参 city 没有被使用则不用定义为 final
         */
        return new Inner() {
            private String nameStr = name;
            public String getName() {
                return nameStr;
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "NewYork");
        System.out.println(inner.getName());
    }
}
interface Inner {
    String getName();
}