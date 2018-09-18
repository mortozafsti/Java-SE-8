package ChapterNine;

public class Student {

    String name;
    int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "My id= " + id + "\n" + "My name= " + name;
    }

    public static void main(String[] args) {
        Student st = new Student("G M Mortoza Ahmed", 1243288);
        System.out.println(st);
    }

}
