/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author BM
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
   static void ortaBul(int dizi[])
    {
         List<Integer> dizi1 = new ArrayList<Integer>();
         List<Integer> dizi2 = new ArrayList<Integer>();
        if (dizi.length%2==0) {
            for (int i = 0; i < dizi.length/2; i++) {
                dizi1.add(dizi[i]);
               
            }
            for (int i = dizi.length/2; i < dizi.length; i++) {
                dizi2.add(dizi[i]);
            }
            for (int i = 0; i < dizi.length/2; i++) {
                System.out.println(dizi1.get(i));
                
            }   
        System.out.println("1. DİZİ MAXSUM:"+maxSubSum(dizi1));
            System.out.println();
            System.out.println("2.dizi");
           for (int i = 0; i < dizi.length/2; i++) {
                System.out.println(dizi2.get(i));
                
            } 
           System.out.println("2. DİZİ MAXSUM:"+maxSubSum(dizi2));
        }
        else{
              for (int i = 0; i < dizi.length/2; i++) {
                dizi1.add(dizi[i]);
               
            }
            for (int i = dizi.length/2; i < dizi.length; i++) {
                dizi2.add(dizi[i]);
            }
            for (int i = 0; i < dizi.length/2; i++) {
                System.out.println(dizi1.get(i));
                
            } 
            System.out.println("1. DİZİ MAXSUM:");
            System.out.println(maxSubSum(dizi1));
            System.out.println("2.dizi");
           for (int i = 0; i < dizi.length/2+1; i++) {
                System.out.println(dizi2.get(i));
                
            }   
                 System.out.println("2. DİZİ MAXSUM:"+maxSubSum(dizi2));
        }
        
    }
  static int maxSubSum(List<Integer> dizi){

    int maxSum=0;

    int i,j,k;
    for(i=0; i< dizi.size();i++){
	
        for ( j=i;j<dizi.size();j++){
            int thisSum=0;
            for( k=i;k<=j;k++){
                thisSum += dizi.get(k);
            }
            if(thisSum > maxSum)
            {
                maxSum = thisSum;
            }
    }
    }
    return maxSum;
  }
    public static void main(String[] args) {
        int dizi[]={4,-3,2,1,6,-1,-2,4};
          ortaBul(dizi); 
    }
    
}
