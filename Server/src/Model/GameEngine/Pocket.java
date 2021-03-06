/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GameEngine;

/**
 *
 * @author andrey
 */

public class Pocket extends GameObject {
    
    public static final double r = 0.063;
    
    Pocket(double coord1, double coord2){
        super(coord1, coord2);
    }

    void update() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean interactionCheck(CueBall b) {
        if (
            (Math.hypot(this.x - b.x, this.y - b.y) <= Pocket.r) &&
            (!b.is_scored)
        ) return true;
        return false;
    }

    @Override
    void interact(CueBall b) {
        b.setScored();
    }   
}
