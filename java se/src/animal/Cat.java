package animal;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void travel() {
        System.out.println("Cat travels");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.travel();
        System.out.println(cat.y + cat.name);
    }
}
