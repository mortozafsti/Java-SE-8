/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTen;

/**
 *
 * @author User
 */
public class Stack {

    private String name;
   

    public Stack() {
    }

    public Stack(String name) {
        this.name = name;
    }

    public void push(String value) {
        name = value;
    }

    public String pop() {
        return name;
       
    }

}
