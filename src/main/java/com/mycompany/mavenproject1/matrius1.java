
package com.mycompany.mavenproject1;


public class matrius1 {

    
    public static void main(String args[]) {
        final int qxiquets=f.lligInt("Quants xiquets nian? ");
        final int qregals=f.lligInt("i quants regals per xiquet? ");
        
        
        String regals[][]=new String[qxiquets][qregals];
        
        
        
        for (int i = 0; i < regals.length; i++) {
            for (int j = 0; j < regals[i].length; j++) {
                regals[i][j]=f.lligString("Quin regal numero "+(j+1)+" que vol el xiquet "+(i+1) );
                
                
                
            }
            
        }
        
        
        for (int i = 0; i < regals.length; i++) {
            for (int j = 0; j < regals[i].length; j++) {
                System.out.println("El regal numero "+(j+1)+" que vol el xiquet "+(i+1)+" es "+regals[i][j]);
            }
            
        }
        
        for (int i = 0; i < regals[qregals].length; i++) {
            for (int j = 0; j < regals.length-1; j++) {
                System.out.println("El regal numero "+(j+1)+" que vol el xiquet "+(i+1)+" es "+regals[i][j]);
                
            }
            
        }
        
    }
     
}
