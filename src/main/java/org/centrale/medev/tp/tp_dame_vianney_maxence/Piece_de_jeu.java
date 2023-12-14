/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp.tp_dame_vianney_maxence;


/**
 *
 * @author User
 */
public abstract class Piece_de_jeu implements Deplacable {
    
    private int couleur;
    private Point2D position;

    public Piece_de_jeu(int clr, int x, int y){
        couleur=clr;
        position=new Point2D(x,y);
    }
    
    public Point2D getPosition() {
        return position;
    }
}
