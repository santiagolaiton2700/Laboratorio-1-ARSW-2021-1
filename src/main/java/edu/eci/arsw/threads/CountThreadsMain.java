/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){

        Thread hilo1 =new Thread(new CountThread(0,99));
        Thread hilo2 =new Thread(new CountThread(99,199));
        Thread hilo3 =new Thread(new CountThread(200,299));

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
    
}
