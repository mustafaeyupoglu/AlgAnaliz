/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeıslemleri;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Collections;

/**
 *
 * @author mustafa
 */
public class ListeIslemleri {

    /**
     * @param args the command line arguments
     */
    public static double avg(ArrayList<Integer> list)
    {
        double ort=0;
        for (int i = 0; i < list.size(); i++) {
            ort+=list.get(i);
        }
        ort/=list.size();
                
        return ort;
    }
    public static double varyans(ArrayList<Integer> list)
    {
        double varyans=0;
        double ort=avg(list);
        for (int i = 0; i < list.size(); i++) {
            varyans+=(list.get(i)-ort)*(list.get(i)-ort);
        }
        varyans/=list.size()-1;
        return varyans;
    }
    public static double ss(ArrayList<Integer> list)
    {
        double varyans=0;
        double ort=avg(list);
        for (int i = 0; i < list.size(); i++) {
            varyans+=(list.get(i)-ort)*(list.get(i)-ort);
        }
        varyans/=list.size()-1;
       
        return  Math.sqrt(varyans);
    }
     public static double normalDag(ArrayList<Integer> list,int x)
    {
         double d = 1/ Math.sqrt(2*3.14*Math.pow(ss(list),2));
        return d*Math.exp(-1*(Math.pow(x-avg(list),2)/(2*Math.pow(ss(list),2))));
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(-3);
        list.add(16);
        list.add(11);
        
        System.out.println(Collections.min(list)); //O(n)
        System.out.println(Collections.max(list)); //O(n)
        System.out.println(avg(list)); //O(n)
        System.out.println(varyans(list)); //O(n)
        System.out.println(ss(list)); //O(n)
         System.out.println(normalDag(list,5)); //O(n)
        
    }
    
}
