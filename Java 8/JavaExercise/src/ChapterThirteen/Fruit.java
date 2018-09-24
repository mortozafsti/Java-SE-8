/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterThirteen;

/**
 *
 * @author User
 */
public class Fruit implements Ediable{

    String nameofFruit;

    public Fruit() {
    }

    public Fruit(String nameofFruit) {
        this.nameofFruit = nameofFruit;
    }
    
    @Override
    public String howToEat() {
        return "Apple Kamriye khete hoi";
    }
    
}
