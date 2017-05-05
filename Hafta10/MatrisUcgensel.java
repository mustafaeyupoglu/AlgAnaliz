/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrisucgensel;

import java.util.Random;

/**
 *
 * @author mustafa
 */
public class MatrisUcgensel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        int [][]m=new int[3][3];
        int []b=new int[3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=1+r.nextInt(9);

            }
            b[i]=1+r.nextInt(9);
        }

        System.out.println("Matris");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");
                
            }
            System.out.println();
            
        }
       
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                m[i][j]=0;
            }
        }
        
        System.out.println("Ust Ucgen Matris");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");

            }
            System.out.println();
        }
        
         System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
        
        int []x=new int[3];
        
       x[2]=b[2]/m[2][2];
       x[1] = (b[1]-(m[1][2]*x[2]))/m[1][1];
       x[0] = (b[1]-(m[0][2]*x[2])-(m[0][1]*x[1]))/m[0][0];
        
         System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(x[i]);
        }
        
    }
    
    
}
