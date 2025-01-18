/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author le
 */
public class Factorial {
    private int num = 0;
    private int factorial = 1;
    private String solution = "";
    
    public void setValue (int n){
        num = n;
        
        int f = 1;
        String s = "";
        for (int i = n; i > 1; i--){
            f *=i;
            s += i + " x ";
        }
        s += "1 =";
        factorial = f;
        solution = s;
        
    }
    public int getFactorial(){
        return factorial;
    }
    public String getSolution(){
    return solution;
    }
}
