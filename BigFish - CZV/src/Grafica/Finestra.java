
package Grafica;

import javax.swing.JFrame;
import Animale.*;
import Coordinate.*;

public class Finestra extends JFrame {
    public Finestra (String title, int width, int height) {
        this.setSize(width, height);
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
    }
}
