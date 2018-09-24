
package ChapterThirteen;

public class Chicken extends Animal implements Ediable{

    @Override
    public String sound() {
        return "RRRRRRRRRRRRR";
    }

    @Override
    public String howToEat() {
        return "Fry Checken";
    }
    
    
}
