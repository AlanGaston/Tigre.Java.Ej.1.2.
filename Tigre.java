
package javaapplication2;

/**
 *
 * @author aland
 */
public class Tigre {

   private String color; 
   private int edad; 
   
   public String getcolor() {
   return color; 
   }
   
   public int getedad() {
   return edad;
   }
   
   public void setcolor(String  newcolor){
   this.color = newcolor; 
   }
   
   public void setedad(int newedad){
   this.edad = newedad; 
   }
   
   
   public static void main(String[] args) {
        
        Tigre objeto = new Tigre();
        objeto.setcolor("naranja");
        objeto.setedad(10);
        System.out.println("El color es "+objeto.getcolor() +" y su edad es " +objeto.getedad() + " años."); 
        
    }
    
}
