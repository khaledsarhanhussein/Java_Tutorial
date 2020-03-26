/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**SS
 *
 * @author k sarhan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //widinig casting
        //small to larg 
       int myInt = 9;
       double myDouble = myInt; // Automatic casting: int to double
       System.out.println(myInt);      // Outputs 9
       System.out.println(myDouble);   // Outputs 9.0
       //narrowing casting from larg to small 
       double myDouble_2 = 9.78;
        int myInt_2 = (int) myDouble_2; // Manual casting: double to int
        System.out.println(myDouble_2);   // Outputs 9.7
        System.out.println(myInt_2);      // Outputs 9
       
       
      
       
       
       
       

       
        
    }
    
}
