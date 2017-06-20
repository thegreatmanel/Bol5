/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin51 {
    
    

  

private static void comprobador(){
        int a= Integer.parseInt(JOptionPane.showInputDialog("que numero deseas?"));
   
    if(a%2==0){System.out.println("e par");}
    else{System.out.println("e impar");}
}

    public static void main(String[] args) {
        Boletin51.comprobador();
        
    }
    
}
