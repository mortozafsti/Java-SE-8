
package EvidenceSwingNine;

public class Student {
    
    private String id;
    private String pass;
    private String name;
    private String email;
    private int age;
    private String gender;
    private String hobby;
    private String round;
    private String note;

    public Student() {
    }

    public Student(String email) {
        this.email = email;
    }
    

    public Student(String id, String pass, String name, String email, int age, String gender, String hobby, String round, String note) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }
    
    
}
