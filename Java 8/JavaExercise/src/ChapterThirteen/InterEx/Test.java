
package ChapterThirteen.InterEx;

public class Test {
    
    public static void main(String[] args) {
        
        Object[] objs = {new Male(), new Female(), new Apple(), new Orange()};
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Man) {
                System.out.println(((Man) objs[i]).gateUp());
            }
            if (objs[i] instanceof Fruit) {
                System.out.println(((Fruit) objs[i]).eat());
            }
        }
    }
}
