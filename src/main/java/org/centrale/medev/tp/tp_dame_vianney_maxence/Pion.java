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

    public Pion(int clr,int x,int y, Plateau plat) {
        super(clr,x,y,plat);
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
        int lecture=0;
        while (flag==false){
           try{
               lecture=sc.nextInt();
               if (lecture>0 && lecture <5){
                   flag=true;
               }else{
                   System.out.println("Mauvaise valeur (entier non reconnu) réessayez");
               }
           }catch (InputMismatchException ex){
               System.out.println("Mauvaise valeur (pas un entier) réessayez");
           }
        }
        if (this.getCouleur()==0){
            switch (lecture){
                case 1:
                    if (peutBouger(getPosition().getX()-1,getPosition().getY()+1)){
                        setPosition(getPosition().getX()-1,getPosition().getY()+1);
                    }
                case 2:
                    if (peutBouger(getPosition().getX()-1,getPosition().getY()+1)){
                        setPosition(getPosition().getX()+1,getPosition().getY()+1);
                    }
                case 3:
                    if (peutBouger(getPosition().getX()-1,getPosition().getY()-1));
                case 4:
                    if 
            }
        }
    }
    
    public boolean peutBouger(int x,int y){
        boolean flag=false;
        if ()
        return flag;
    }
}
