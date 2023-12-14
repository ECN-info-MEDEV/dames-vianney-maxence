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
    
    public Plateau plateau;
    private int couleur;
    private Point2D position;

	/**
     * Constructeur avec les valeurs pour chaque paramètre
     * @param clr
     * @param x
     * @param y
	 * @param plat 
     */
    public Piece_de_jeu(int clr, int x, int y, Plateau plat){
        couleur=clr;
        position=new Point2D(x,y);
        plateau=plat;
    }
    
    /**
     * Constructeur sans attribut de la classe
     */
    public Piece_de_jeu(){
		couleur=0;        this.position = new Point2D();
    }
    
    /**
     * Constructeur de recopie de la classe
     * @param piece
     */
    public Piece_de_jeu(Point2D position) {
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

    public int getCouleur() {
        return couleur;
    }
}
