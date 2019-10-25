/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Mirania Villafañe
 * @author José Guerrero
 */
public class Convertidor {
   
    public String decimal_Binario (String numero){
  
            int num = Integer.parseInt(numero);
       
            return Integer.toBinaryString(num);
                   
    }
    
    
        public String binario_Decimal (String numero){
 
            int num = Integer.parseInt(numero, 2);
            
            numero = num+"";
            
            return numero;
              
    }

}
