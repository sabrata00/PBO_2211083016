/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adit070323;

/**
 *
 * @author LABSIKOMP03
 */
public class ContohIncrement {
    public static void main(String[] args){
        int i = 10;
        int j = 3;
        int k = 0;
        
        k = j++ + i;
        System.out.println(k);
        System.out.println(i);   
        System.out.println(j);
    }
    
    
}
