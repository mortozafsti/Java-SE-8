
package EvidenceSwingFinal;

public class Student {
    private String id;
    private String name;
    private String email;
    private String age;
    private String gender;
    private String hobby;
    private String round;
    private String note;

    public Student() {
    }

    public Student(String id, String name, String email, String age, String gender, String hobby, String round, String note) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
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
