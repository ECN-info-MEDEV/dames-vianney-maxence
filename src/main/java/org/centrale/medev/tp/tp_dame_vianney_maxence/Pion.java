/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp.tp_dame_vianney_maxence;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pion extends Piece_de_jeu{

    public Pion() {
        super(0,0,0);
    }
    
    public Pion(int clr,int x,int y) {
        super(clr,x,y);
    }
    
    @Override
    public void deplacer(){
        int x=this.getPosition().getX();
        int y=this.getPosition().getY();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choisissez la direction de déplacement :");
        System.out.println("  1 = devant à gauche");
        System.out.println("  2 = devant à droite");
        System.out.println("  3 = derrière à gauche (seulement pour manger qqun)");
        System.out.println("  4 = derrière à droite (seulement pour manger qqun)");
        boolean flag=false;
        while (flag==false){
           try{
               int lecture=sc.nextInt();
               if (lecture>0 && lecture <5){
                   flag=true;
               }
           }catch (InputMismatchException ex){
               System.out.println("Mauvaise valeur... réessayez");
           }
        }
    }    
}
