
package ChapterNine;

public class TestStudent {
    public static void main(String[] args) {
        
        Students stude = new Students("G M Mortoza Ahmed", 30, true, "Male");
        
        System.out.println("Name: "+stude.getName());
        System.out.println("Name: "+stude.getAge());
        System.out.println("Name: "+stude.isIsScienceMajor());
        System.out.println("Name: "+stude.getGender());
    }
}
