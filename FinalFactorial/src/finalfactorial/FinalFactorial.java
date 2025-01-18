/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalfactorial;

/**
 *
 * @author le
 */
public class FinalFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial f = new Factorial();
        
        f.setValue(5);
        System.out.println(f.getFactorial());
         System.out.println(f.getSolution());
    }
    
}
