/* --------------------------------------------------------------------------------
 * WoE
 * 
 * Ecole Centrale Nantes - Septembre 2022
 * Equipe pédagogique Informatique et Mathématiques
 * JY Martin
 * -------------------------------------------------------------------------------- */
package org.centrale.medev.tp.tp_dame_vianney_maxence;

/**
 *
 * @author ECN
 */
public class Point2D {
    private int x;
    private int y;
    
    /**
     * Constructeur sans attribut avec attribution de valeurs par défauts
     */
    public Point2D() {
        this(0,0);
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     *
     * @param point
     */
    public Point2D(Point2D point) {
        this(point.x, point.y);
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public boolean equals(Point2D pt){
        if (this.x==pt.x && this.y==pt.y){
            return true;
        }
        return false;
    }
    
}
