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
    boolean colision;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int contBalas;

    public Disparo(int personajeX, int personajeY) {

        this.x = personajeX;
        this.y = personajeY;

    }

    public void movdisparo(JLabel[][] escenario, int[][] escMatriz, JPanel panelEscenario, boolean arriba, boolean abajo, boolean derecha, boolean izquierda) {

        if (arriba == true) {
            escenario[x][y - 1].setIcon(crea.obtenerImagen(6));
            panelEscenario.add(escenario[x][y - 1]);

            //mov
            
            for (int i = 1; i < 15; i++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                escenario[x][y - 1].setIcon(crea.obtenerImagen(6));
                if (i >= 2) {
                    escenario[x][y].setIcon(crea.obtenerImagen(Contenedor.suelo));
                }
                y--;

                if (escMatriz[x][y - 2] == Contenedor.muro) {
                    colision = true;

                }
                if (escMatriz[x][y] == Contenedor.zombieD) {
                    colision = true;

                }
            }

        }
        if (abajo == true) {
            escenario[x][y + 1].setIcon(crea.obtenerImagen(6));
            panelEscenario.add(escenario[x][y + 1]);

            for (int i = 1; i < 15; i++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                escenario[x][y + 1].setIcon(crea.obtenerImagen(6));
                if (i >= 2) {
                    escenario[x][y].setIcon(crea.obtenerImagen(Contenedor.suelo));
                }
                y++;

                if (escMatriz[x][y + 2] == Contenedor.muro) {
                    colision = true;

                }
                if (escMatriz[x][y] == Contenedor.zombieD) {
                    colision = true;

                }
            }

        }
        if (derecha == true) {
            escenario[x + 1][y].setIcon(crea.obtenerImagen(6));
            panelEscenario.add(escenario[x + 1][y]);

            for (int i = 1; i < 15; i++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                escenario[x + 1][y].setIcon(crea.obtenerImagen(6));
                if (i >= 2) {
                    escenario[x][y].setIcon(crea.obtenerImagen(Contenedor.suelo));
                }
                x++;

                if (escMatriz[x + 2][y] == Contenedor.muro) {
                    colision = true;

                }
                if (escMatriz[x][y] == Contenedor.zombieD) {
                    colision = true;

                }
            }

        }
        if (izquierda == true) {
            escenario[x - 1][y].setIcon(crea.obtenerImagen(6));
            panelEscenario.add(escenario[x - 1][y]);

            for (int i = 1; i < 15; i++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                escenario[x - 1][y].setIcon(crea.obtenerImagen(6));
                if (i >= 2) {
                    escenario[x][y].setIcon(crea.obtenerImagen(Contenedor.suelo));
                }
                x--;

                if (escMatriz[x - 2][y] == Contenedor.muro) {
                    colision = true;

                }
                if (escMatriz[x][y] == Contenedor.zombieD) {
                    colision = true;

                }
                if (escMatriz[x][y] == Contenedor.zombieI) {
                    colision = true;

                }
            }
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
