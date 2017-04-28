/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriscarp;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mustafa
 */
public class MatrisCarp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Integer> v1 = new ArrayList<Integer>();
       List<Integer> v2 = new ArrayList<Integer>();
       v1.add(1);
       v1.add(2);
       v1.add(3);
        v2.add(2);
       v2.add(4);
       v2.add(6);
       int carpim=0;
        for (int i = 0; i < v1.size(); i++) {
            carpim+=(v1.get(i)*v2.get(i));
        }
        System.out.println(carpim);
    }
    
}
