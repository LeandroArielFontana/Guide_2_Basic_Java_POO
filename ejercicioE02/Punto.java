/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE02;

/**
 *
 * @author Roxana
 */
public class Punto {
    
    private Integer x;
    
    private Integer y;

    public Punto(Integer x, Integer y) {
      
        this.x = x;
       
        this.y = y;
    
    }

    public Punto() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
}
