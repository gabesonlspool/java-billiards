/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net;

import java.io.Serializable;

/**
 *
 * @author andrey
 */
public class BallInfo implements Serializable {
    public double x;
    public double y;
    public boolean is_scored;
    
    public BallInfo(double coord1, double coord2, boolean s) {
        x = coord1;
        y = coord2;
        is_scored = s;
    }
    
}
