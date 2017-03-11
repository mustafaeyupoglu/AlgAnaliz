/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortabulvemaxsub.nlogn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mustafa
 */
public class OrtaBulVeMaxSubNlogn {

    /**
     * @param args the command line arguments
     */
    static int ortaBul(int dizi[])
    {
        int orta=dizi.length/2;
        int sumLeftMax=0;
        int sumLeft=0;
        for (int i = orta-1; i > -1; i--) {
            sumLeft+=dizi[i];
            if (sumLeft>sumLeftMax) {
                sumLeftMax=sumLeft;
            }
        }
        int sumRightMax=0;
        int sumRight=0;
        for (int i = orta; i < dizi.length; i++) {
            sumRight+=dizi[i];
            if (sumRight>sumRightMax) {
                sumRightMax=sumRight;
            }
        }
        return sumLeftMax+sumRightMax;
    }
  static int find_max_triple(int a,int b,int c){
    if (a>b){
        if (b>c){
            return a;
        }
        else if (a>c){
            return a;
        }
        else{
            return c;
        }
    }
    else if( b>c){
        return b;
    }
    else{
        return c;
    }
  }
    static int arraySum(int dizi[])
    {
        int sum=0;
        for (int i : dizi)
            sum += i;
        return sum;
    }
   static int sumLeft=0,sumRight=0,sumMidle=0;
    static int maxSubSum(int dizi[] ){
   
    if(dizi.length<2)
    {
        return arraySum(dizi);
    }
    else
    {
        int middle=(dizi.length)/2;
        
        sumLeft=maxSubSum(Arrays.copyOfRange(dizi, 0, middle));
        sumRight=maxSubSum(Arrays.copyOfRange(dizi, middle,dizi.length));
        sumMidle=ortaBul(dizi);
    }
   return find_max_triple(sumLeft,sumRight,sumMidle);
  }
    public static void main(String[] args) {
        int[] dizi = new int[1000000];
        for (int i=0; i<1000000; i++){
        int n = (int)(Math.random()*9 + 1);
        dizi[i] = n;
       }
        
        final long startTime = System.currentTimeMillis();
        int result=maxSubSum(dizi);
        System.out.println(result);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );
    }
    
}
