/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp.tp_dame_vianney_maxence;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Plateau {
    
    public static final int TAILLE = 10;
    public ArrayList<PieceDeJeu> listePlateau;

    public Plateau(ArrayList<PieceDeJeu> listePlateau) {
        this.listePlateau = new ArrayList<>(listePlateau);
    }

    public Plateau() {
        this.listePlateau = new ArrayList<>();
    }

    public ArrayList<PieceDeJeu> getListePlateau() {
        return listePlateau;
    }

    public static int getTAILLE() {
        return TAILLE;
    }

    public void setListePlateau(ArrayList<PieceDeJeu> listePlateau) {
        this.listePlateau = listePlateau;
    }
    
    
    
    public void creaPlateau(){
        
        for (int i=0; i<2;i++){
            for (int j=(i*35)*2;j<(i+1)*40+i*30;j+=2){
                listePlateau.add(j*2, new Pion(i,j/TAILLE,j%TAILLE),this);
            }
        }
    }
    
    public boolean estLibre(int x,int y){
        for (PieceDeJeu p:listePlateau){
            if (p.getPosition().getX()==x && p.getPosition().getY()==y){
                return false;
            }
        }
        return true;
    }
    
    public void tourDeJeu(int clr){   // Indique la couleur qui joue
        if (clr==0 || clr==1){
            if (clr==0){
                System.out.println("Aux BLANCS de jouer !");
            } else{
                System.out.println("Aux NOIRS de jouer !");
            }  
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Choisissez la position de la pièce que vous souhaitez déplacer");
        boolean flag=false;
        while (flag==false){
            System.out.println("  Valeur de x = ?");
            try{
                int x=sc.nextInt();
                int y=sc.nextInt();
                flag=true;
            } catch (InputMismatchException ex){
                System.out.println("Vous n'avez pas rentré un entier ! Réessayez...");
            }
        }
        PieceDeJeu p=null;
        for (PieceDeJeu pj:listePlateau){
            
        }
    }
}
