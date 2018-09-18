package ChapterNine;
//Class is a blu print of Object
//Animal is a class name

public class Animal {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        //First Animal is Class Name
        //a1 is Object NAme
        //== is Operator
        //new is keyword for creating Object
        //Last animal is Constractor
        Animal panther = new Animal("Mr Panther", "White", 33.5, "Urope");
        System.out.println(panther);
        Animal kk = new Animal("Mr Hasan");
        System.out.println(kk);
    }

    //Animal Onjects State
    //It is Instance Varivale or class label variable also can imagine Global variable
    String name;
    String color;
    double age;
    String race;

    //It is Default Constractor
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //Argumentive Constractor
    //Parameters are Also called Local Variable
    public Animal(String name, String color, double age, String race) {
        //This means current instance
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    @Override
    public String toString() {
        return "name= " + name +"\n"+ "color= " +color + "\n"+"age=" +age + "\nrace=" +race;
    }

    //Animal Onjects Behaviour
    void bite() {
    }

    void eat() {
    }

    void sleep() {
    }

    void run() {
    }

}
