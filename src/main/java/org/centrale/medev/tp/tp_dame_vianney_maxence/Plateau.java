/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp.tp_dame_vianney_maxence;

import java.util.ArrayList;

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
        boolean flag=false;
        for (PieceDeJeu)
        return flag;
    }
}
