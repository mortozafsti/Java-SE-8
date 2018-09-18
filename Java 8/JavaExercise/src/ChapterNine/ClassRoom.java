package ChapterNine;
//Constractor and Getter Based
public class ClassRoom {

    int id;
    String location;

    public ClassRoom() {
    }

    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom(1243288, "Sankar 4th Floor");
        System.out.println("ID: "+cr.getId());
        System.out.println("Location: "+cr.getLocation());
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

}
