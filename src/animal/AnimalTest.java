package animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 50);
        Dog dog = new Dog("YorkiE", 8, 20, 2, 3, 1, 20, "long silky");
        dog.eat();
        System.out.println("~~~~~~~~~~~~");
        dog.walk();
        System.out.println("~~~~~~~~~~~~");
        dog.run();
        System.out.println("~~~~~~~~~~~~");
        dog.move(5);
    }


}

