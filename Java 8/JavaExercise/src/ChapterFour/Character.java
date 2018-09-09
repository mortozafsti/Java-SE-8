
package ChapterFour;

/**
 *
 * @author User
 */
public class Character {
    public static void main(String[] args) {
        
        System.out.println("He says \"Java is Fun\"");
        //char letter = 'A';
        char letters = '\u0041';
        System.out.println("The letters is: "+letters);
        
        char letter1 = (char) 0XAB0041;
        System.out.println("The letter1 is: "+letter1);
        
        char letter2 = (char) 65.25;
        System.out.println("The letter2 is: "+letter2);
        
        int letter3 = (int) 'A';
        System.out.println("The letter3 is: "+letter3);
        
        ///Strimg///
        String name = "welcome to Java";
        System.out.println("Length: "+name.length());
        System.out.println("Length: "+name.charAt(5));
        
        String address = "Dhaka";
        System.out.println("Length: "+name.concat( address).toUpperCase());
        
        String address1 = "Bangladesh";
        for(int j = 0; j < address1.length(); j++){ 
            System.out.print(" "+address1.charAt(j));
        }
        
        char ch = 'a';
        for(int i = 0; i<26; i++){ 
            System.out.println("\n"+ch++);
        }
    }
}
