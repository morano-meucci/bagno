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
public class BagnoDonna extends Thread {

    private boolean libero;
    private String bagno;

    public BagnoDonna(boolean libero, String bagno) {
        this.libero = libero;
        this.bagno = bagno;
    }

    public void run() {
   if(libero==true){
   System.out.println("ad utilizzare il bagno ora è"+bagno);
   }
   else{
   System.out.println("il bagno è occupato");
   }
    }
    
}
