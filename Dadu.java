/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Dadu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int t, i, j;
       int urutan = 0;
       boolean k;
       t=in.nextInt();
       int [] inp = new int [t];
       int maks=inp[0];
       for (i=0;i<t;i++) {
           inp[i]=in.nextInt();
       }
       for(i=0;i<t;i++) {
           k=false;
           for(j=i+1;j<t;j++) {
               if(inp[i]== inp[j]) {
                   inp[j]=0;
                   k=true;
               }
           }
           if (k) {
               inp[i]=0;
               
           }
       }
       for (i=0;i<t;i++) {
           if(maks<inp[i]) {
               maks=inp[i];
               urutan=i+1;
           }
       }
       if(urutan>0) {
           System.out.println(urutan);
       }
       else {
           System.out.println("Tidak Ada Pemenang");
       }
    }
    
}
