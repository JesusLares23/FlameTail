
package vista;

import javax.swing.JFrame;
import java.util.logging.*;

/**
 *
 * @author darkm
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Juego");
        Juego juego = new Juego();
        ventana.add(juego);
        ventana.setSize(600, 400);
        ventana.setLocation(70, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (true) {
            juego.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, 
                        null, ie);
            }
        }
    }
    
}
