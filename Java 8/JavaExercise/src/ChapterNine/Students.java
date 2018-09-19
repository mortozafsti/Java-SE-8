
package ChapterNine;

public class Students {
    
    String name;
    int age;
    boolean isScienceMajor;
    String gender;

    public Students() {
    } 

    public Students(String name, int age, boolean isScienceMajor, String gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsScienceMajor() {
        return isScienceMajor;
    }

    public String getGender() {
        return gender;
    }
    
}
