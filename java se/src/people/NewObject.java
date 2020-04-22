package people;

public class NewObject {
    public static void main(String[] args) {
        People LiLei = new People(); //创建一个People对象LiLei

        LiLei.setHeight(170.0);
        System.out.println("LiLei的身高是"+LiLei.getHeight());

        LiLei.setAge(20);
        LiLei.sex = 1;

        LiLei.printBaseMes();
        LiLei.cry();
        LiLei.laugh();

        People XiaoMing = new People(168, 21, 1);
        XiaoMing.printBaseMes();
        Object XiaoMing_bro = XiaoMing;
        System.out.println(XiaoMing_bro == XiaoMing);
        System.out.println(XiaoMing_bro.equals(XiaoMing));
    }
}
