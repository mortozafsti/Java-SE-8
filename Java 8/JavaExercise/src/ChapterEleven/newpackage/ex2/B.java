
package ChapterEleven.newpackage.ex2;


/*

B class is inherit A class, So 
A is Super class and B is Sub class or
A is Parent class and B is child class

*/
public  class B extends A{
    
    double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }
    
    
}
