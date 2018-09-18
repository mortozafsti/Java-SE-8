package ChapterNine;
//Setter and Getter baseed
//value set and get korbo

public class Teacher1 {
    //Sep-1: Instance Variable declare

    int id;
    String name;
    String educationQualification;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public static void main(String[] args) {
        Teacher1 teacher = new Teacher1();
        teacher.setId(1243287);
        teacher.setName("Kamal");
        teacher.setEducationQualification("Degree From Madrash");
        System.out.println("ID: "+teacher.getId()+"\n"+"Name: "+teacher.getName()+"\n"+"Edu: "+teacher.getEducationQualification());
    }
    
}
