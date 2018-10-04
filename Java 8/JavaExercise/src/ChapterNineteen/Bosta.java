
package ChapterNineteen;

public class Bosta {
    
    private  int serial;
    private  String weight;

    public Bosta() {
    }

    public Bosta(int serial, String weight) {
        this.serial = serial;
        this.weight = weight;
    }

    public int getSerial() {
        return serial;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Bosta{" + "serial=" + serial + ", weight=" + weight + '}';
    }
    
    public static void main(String[] args) {
        
        GenericsStack<Bosta> bosta = new GenericsStack<>();
        bosta.push(new Bosta(100, "50 kg"));
        bosta.push(new Bosta(101, "500 kg"));
        bosta.push(new Bosta(102, "5000 kg"));
        bosta.push(new Bosta(103, "50000 kg"));
        
        System.out.println("Size: "+bosta.getSize());
        System.out.println("peek: "+bosta.peek());
        
    }
}
