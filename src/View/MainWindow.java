/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author andrey
 */
import Controller.WindowCloseHandler;
import Model.CueBall;
import Model.GameEngine;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class MainWindow {
    public static void main(String[] args){
        
        Frame window = new Frame("Billiard");
        window.setVisible(true);
        window.setLayout(null);
        window.setIgnoreRepaint(true);
        
        Dimension scrsz = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize(scrsz);
        
        WindowCloseHandler w = new WindowCloseHandler();
        window.addWindowListener(w);
              
        GameMenu m = new GameMenu(
            scrsz.width * 3/4,
            0,
            scrsz.width * 1/4,
            scrsz.height
        );
        window.add(m);
        
        GameEngine e = new GameEngine();
        e.AddBall(new CueBall(1, 1));
        e.AddBall(new CueBall(2, 1));
        ScreenEngine s = new ScreenEngine(
            e, scrsz.width * 3/4,
            scrsz.height * 3/4,
            window.getGraphics().create(
                0, 0,
                scrsz.width * 3/4,
                scrsz.height * 3/4)
        );
        e.AddScreenEngine(s);
        s.setLocation(0, 40);
        window.add(s);
        window.paint(window.getGraphics());
        s.repaint();
        
        /*e.run();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }*/
        
        
        
    }
}

