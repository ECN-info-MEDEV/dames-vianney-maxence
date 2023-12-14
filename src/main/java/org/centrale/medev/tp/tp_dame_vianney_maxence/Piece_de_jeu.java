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
    
    /**
     * Constructeur sans attribut de la classe
     */
    public Pieces_de_jeu(){
        this.position = new Point2D();
    }
    
    /**
     * Constructeur de recopie de la classe
     * @param position
     */
    public Pieces_de_jeu(Point2D position) {
        this.position = new Point2D(position);
    }

    /**
     * Getter de la position de la pièce
     * @return Point2D
     */
    public Point2D getPosition() {
        return position;
    }

    /**
     * Setter de la position de la piece à partir d'un Point2D déja créé
     * @param position
     */
    public void setPosition(Point2D position) {
        this.setPosition(position.getX(), position.getY());
    }
    
    /**
     * Setter de la position de la piece à partir d'un jeu de valeur x et y
     * @param x
     * @param y
     */
    public void setPosition(int x, int y){
        this.position.setX(x);
        this.position.setY(y);
    }
}
