/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;

/**
 *
 * @author mustafa
 */
public class Power {

    /**
     * @param args the command line arguments
     */
  
   static long power62( long a)
    {
        long x1=a*a*a;
        long x2=x1*x1;
        long x3=x2*x2*x1;
        long x4=x3*x3*a;
        long x5=x4*x4;
        return x5;
    }
    public static void main(String[] args) {
        long sonuc=power62(2);
        System.out.println("sonuc:"+sonuc); 
    }
    
}
