/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagnorist;

/**
 *
 * @author 39334
 */
public class BagnoRist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread b=new BagnoUomo(true,"uomo");
        Thread b2=new BagnoDonna(false,"donna");
        b.start();
        b2.start();
        
    }
    
}
