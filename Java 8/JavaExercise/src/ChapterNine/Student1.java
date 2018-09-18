package ChapterNine;

public class Student1 {

    String name;
    int id;

    public Student1() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "My id= " + id + "\n" + "My name= " + name;
    }

    public static void main(String[] args) {
        Student1 st = new Student1();
        st.setId(1243288);
        st.setName("Hasan Gazi");
        System.out.println(st);
    }

}
