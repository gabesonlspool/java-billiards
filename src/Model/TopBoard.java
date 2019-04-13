/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author andrey
 */
class TopBoard extends GameObject {
    
    TopBoard() {
        super(max_width/2, 0);
    }

    @Override
    boolean interactionCheck(CueBall b) {
        if (b.y <= CueBall.r) {
            return true;
        }
        return false;
    }

    @Override
    void interact(CueBall b) {
        b.setVelocity(b.V[0], -b.V[1]);
    }

}
