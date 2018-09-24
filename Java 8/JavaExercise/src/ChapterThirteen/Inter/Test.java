package ChapterThirteen.Inter;

public class Test {

    public static void main(String[] args) {
        
        Object[] objs = {new Dog(), new Cat()};
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Animal) {
                System.out.println(((Animal)objs[i]).eat());
            }
            
        }
        /*
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
         */
    }
}
