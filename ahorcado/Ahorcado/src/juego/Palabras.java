package juego;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Palabras {

    private JTextField text0;
    private JLabel text1;
    private boolean play = false;
    private char[] palabra_secreta;
    private char[] palabra;
    private int intentos = 0;
    private boolean cambios = false;

    private final String[] DICCIONARIO = {"HOGAR", "ESTRELLA", "PROGRAMACION", "JUEGO", 
        "TRIKI", "COLEGIO", "OCEANO", "SILENCIO","SENA", "EPISODIO", "CODIGO",
        "ANIME", "PANAMERICANA", "JAVA","ANGULAR", "SERIE", "PRIMAVERA", "BOLIVIA",
        "DICIEMBRE","NATURAL", "ATEO", "COMPUTADORA", "WINDOWS", "TRANSFORMACION", 
        "INGENIERIA", "MUSICA", "AFRODITA", "LIBERTAD", "GOOGLE", "ROCK",
        "ASTERISCO", "SUEÑO", "LEYENDA", "DEPREDADORES", "ECLIPSE", "MARIACHILOCO", "SLIPKNOT",
        "COLOMBIA", "ARMENIA", "FESTA"};

    public Palabras(JTextField jTextField, JLabel jLabel1, JLabel jLabel2) {        
        this.text0 = jTextField;
        this.text1 = jLabel2;
        
        //obtiene palabra secreta
        palabra_secreta = DICCIONARIO[(int) (Math.random() * (DICCIONARIO.length))].toCharArray();
        System.out.println(Arrays.toString(palabra_secreta)); //no haga trampa
        String s = "";
        //llena un string con "_" correspondiente a la longitud de la palabra secreta
        for (int i = 0; i <= palabra_secreta.length - 1; i++) {
            s = s + "_";            
        }
        //convierte este en un array
        this.palabra = s.toCharArray();
        
        //inicia valores en la interfaz
        jTextField.setText(s);
       jLabel2.setIcon(new ImageIcon(getClass().getResource("/img/ahorcado_0.jpg")));
        this.play = true;
    }
    
    public void evaluar(char letra) {
        if (play) {
            String p = "";
            //controla cantidad de intentes restantes
            if (intentos == 5) {
                JOptionPane.showMessageDialog(null, "PERDISTES ,vuelve a jugar");
            } else {
                //evalua caracter por caracter                
                for (int j = 0; j <= this.palabra_secreta.length - 1; j++) {
                    //si el caracter se encuentra en la palabra secreta            
                    if (this.palabra_secreta[j] == letra) {
                        this.palabra[j] = letra;//se asigna para que se pueda ver en pantalla
                        cambios = true;
                    }
                    p = p + this.palabra[j];
                }
                
                //si no se produjo ningun cambio, quiere decir que el jugador se equivoco
                if (cambios == false) {
                    intentos += 1; //se incrementa     
                    //actualiza interfaz
                   text1.setIcon(new ImageIcon(getClass().getResource("/img/ahorcado_" + this.intentos + ".jpg")));
                    if (this.intentos < 6) {
                        JOptionPane.showMessageDialog(null, "te quedan " + (6 - intentos) + " intentos");
                    }
                } else {
                    this.cambios = false;
                }
                this.text0.setText(p);
                //comprobamos el estado del juego
                gano();
            }
        }
    }

    private void gano() {
        boolean win = false;
        for (int i = 0; i <= this.palabra_secreta.length - 1; i++) {
            if (this.palabra[i] == this.palabra_secreta[i]) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if (win) {
            JOptionPane.showMessageDialog(null, "GANASTE");
           }
    }

}
