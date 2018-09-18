package ChapterNine;

public class Dog {

    String name;
    String color;
    double age;
    String race;

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Shefard");
        dog.setColor("Black");
        dog.setAge(25.0);
        dog.setRace("Asian");

        System.out.println("Name: " + dog.getName() + "\n" + "Color: " + dog.getColor() + "\n" + "Age: " + dog.getAge() + "\n" + "Race: " + dog.getRace());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

}
