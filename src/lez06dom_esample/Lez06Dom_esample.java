/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez06dom_esample;

/**
 *
 * @author tss
 */
public class Lez06Dom_esample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*String s= new String("ciao");
       String s1= new String("ciao");
       
       System.out.println(s==s1);*/
       
       /*String msg = "ciao";
       String msg1 = "ciao";
        System.out.println(msg == msg1);
        
        
        System.out.println(msg.equals(msg1));
        
        String s = "ciao";
        String s1 = s;
        
        s = s.toUpperCase();
        
        System.out.println(s);
        System.out.println(s1);*/
        
        
        StringBuffer sb= new StringBuffer("ciao");
        System.out.println(sb);
        sb.append(" a tutti ");
        System.out.println(sb);
        
        
        StringBuffer sb1 = sb;
        sb1.append("tra un po' si magia... ");
        System.out.println("sb ->" + sb);
        System.out.println("sb1 ->" + sb1);
        
        
        
        
    }
    
}
