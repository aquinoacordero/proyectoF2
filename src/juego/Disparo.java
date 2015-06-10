package juego;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aquinoacordero
 */
public class Disparo {

    CrearEscenario crea = new CrearEscenario();
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int contBalas;

    public Disparo(int personajeX, int personajeY, JLabel[][] escenario, int[][] escMatriz, JPanel panelEscenario, boolean arriba, boolean abajo, boolean derecha, boolean izquierda) {

        if (arriba == true) {
        escenario[personajeX][personajeY-1].setIcon(crea.obtenerImagen(6));
        panelEscenario.add(escenario[personajeX][personajeY-1]);
        
        
        
        
        }
        if (abajo == true) {
        escenario[personajeX][personajeY+1].setIcon(crea.obtenerImagen(6));
        panelEscenario.add(escenario[personajeX][personajeY+1]);
        
        
        
        
        }
        if (derecha == true) {
        escenario[personajeX+1][personajeY].setIcon(crea.obtenerImagen(6));
        panelEscenario.add(escenario[personajeX+1][personajeY]);
        
        
        
        
        }
        if (izquierda == true) {
        escenario[personajeX-1][personajeY].setIcon(crea.obtenerImagen(6));
        panelEscenario.add(escenario[personajeX-1][personajeY]);
        
        
        
        
        }

    }

    public int cargador(int contBalas) {

        if (contBalas > 0) {
            contBalas--;

        } else {
            /*while(label_bala!=null){
             //label_bala.setBounds(escenario[personajeX][personajeY]+40,escenario[personajeX][personajeY]+20 10, 10);
             }*/
            JOptionPane.showMessageDialog(null, "NO HAY MUNICION");
        }
        System.out.println(contBalas);
        return contBalas;
    }

}
