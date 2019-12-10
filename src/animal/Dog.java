package animal;


public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //inheritance constructor
    public Dog(String animalName, int size,
               int weight, int eyes,
               int legs, int tail,
               int teeth, String coat)
    {
        super(animalName, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //eating method specifically unique for the dog

    private void chew(){
        System.out.println("Dog.chew() was called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        //we put super here just in case we need to make unique methods for dog
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }
}

