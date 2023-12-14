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
public class Pion extends PieceDeJeu{

    public Pion(int clr,int x,int y, Plateau plat) {
        super(clr,x,y,plat);
    }
    
    @Override
    public void deplacer(){
        Point2D obj = new Point2D (this.getPosition().getX(),this.getPosition().getY());
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
                case 1: obj.setX(obj.getX()-1);obj.setY(obj.getY()+1); break;
                case 2: obj.setX(obj.getX()+1);obj.setY(obj.getY()+1); break;
                case 3: obj.setX(obj.getX()-1);obj.setY(obj.getY()-1); break;
                case 4: obj.setX(obj.getX()+1);obj.setY(obj.getY()-1); break;
            }
            if (peutBouger(obj)==1){
                this.setPosition(obj);
            } if (peutBouger(obj)==2){
                manger(obj);
                int x=obj.getX();
                int y=obj.getY();
                this.setPosition(getPosition().getX() + (x-getPosition().getX())*2,getPosition().getY() + (y-getPosition().getY())*2);
            }
        }
    }
    
    public int peutBouger(Point2D pt){ // 0=pas bouger ; 1=case libre ; // 2=case  occupée mais peut manger
        int x=pt.getX();
        int y=pt.getY();
        if (x>=0 && x<10 && y>=0 && y<10){
            if (plateau.estLibre(x,y)){
                return 1;
            }else{
                x=getPosition().getX() + (x-getPosition().getX())*2;
                y=getPosition().getY() + (y-getPosition().getY())*2;
                if (x>=0 && x<10 && y>=0 && y<10){
                    if (plateau.estLibre(x,y)){
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
}
