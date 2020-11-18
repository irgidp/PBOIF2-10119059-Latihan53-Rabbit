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
public class Rabbit extends Animal {
    private String color;
    private String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}
