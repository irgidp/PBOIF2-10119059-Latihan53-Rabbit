/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Rabbit
 */
package pboif2.pkg10119059.latihan53.rabbit;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan53Rabbit {

    public static void main(String[] args) {
        Rabbit rab = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, his name is " +rab.getName());
        System.out.println(rab.getName() +" is Vegetarian? " +rab.isVegetarian());
        System.out.println(rab.getName() + " eats " +rab.getEats());
        System.out.println(rab.getName() + " has " +rab.getNoOfLegs() + " legs");
        System.out.println(rab.getName() + " color is " +rab.getColor());
    }
    
}
