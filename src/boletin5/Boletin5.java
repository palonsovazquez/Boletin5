/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta cuentaPrueba1 = new Conta();
        cuentaPrueba1.setName("Pepito Perez");
        cuentaPrueba1.setIban("59883895499655996659");
        cuentaPrueba1.setAccountBalance(500d);
        
        Conta cuentaPrueba2 = new Conta("Pablo Rod","5985698668666555545666",200d);
        
        cuentaPrueba1.show();
        
        cuentaPrueba2.show();
        
        cuentaPrueba1.transfer(cuentaPrueba2, 600d);
        
        cuentaPrueba1.show();
        
        cuentaPrueba2.show();
        
    }
    
}
