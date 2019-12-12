package animal;

public class Animal {


    protected String AnimalName;
    protected int brain;
    protected int body;
    protected int size;
    protected int weight;

    public Animal(String animalName,
                  int brain,
                  int body,
                  int size,
                  int weight)
    {
        AnimalName = animalName;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    //methods for animals, type of eating, type of moving
    public void eat(){

        System.out.println("Animal.eat() was called successfully");
    }
    public void move(int speed){
        System.out.println("Animal.move() was called successfully");
        System.out.println(speed + " steps are being taken.");

    }

    public String getAnimalName() {
        return AnimalName;
    }


    public int getBrain() {
        return brain;
    }


    public int getBody() {
        return body;
    }


    public int getSize() {
        return size;
    }


    public int getWeight() {
        return weight;
    }


}
