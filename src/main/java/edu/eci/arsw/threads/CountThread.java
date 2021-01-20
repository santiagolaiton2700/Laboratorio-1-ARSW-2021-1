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
public class CountThread implements Runnable{
    private int numeroInicio;
    private int numeroFin;

    CountThread(int numeroInicio,int numeroFin){
        this.numeroInicio=numeroInicio;
        this.numeroFin=numeroFin;
    }
    public void run(){
        for(int i=0;i<=numeroFin;i++) {
            System.out.println(i);
        }
    }


    
}
