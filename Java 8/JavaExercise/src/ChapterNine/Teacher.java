package ChapterNine;
//Setter and Getter baseed
//value set and get korbo

public class Teacher {
    //Sep-1: Instance Variable declare

    int id;
    String name;
    String educationQualification;

    //Sep-1: default constractor Neya (Optional)
   
    
    //Step 5: set value
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }
    
    //Step 4: Take a Main Method or any method (Optional)
    public static void main(String[] args) {
        //Step 5: Create object using default constractor 
        Teacher teacher = new Teacher();
        //Set value within object teacher
        teacher.setId(1243288);
        teacher.setName("Masud ullah");
        teacher.setEducationQualification("EMBA");
        System.out.println("ID: "+teacher.getId()+"\n"+"Name: "+teacher.getName()+"\n"+"Edu: "+teacher.getEducationQualification());
        
    }
    //Step 7: Generates Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
    
    
}
