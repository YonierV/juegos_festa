import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;


public class principal extends JFrame {

	private JPanel contentPane;

	 int turnoxo,contadorX,contadorO;
	 public JButton n1,n2,n3,n4,n5,n6,n7,n8,n9;
	 boolean gano=false;
	 public JButton[][] cuadros;
	 public Color cx=Color.cyan.darker();
	 public Color co=Color.pink.darker();
	 private JButton reiniciarjuego;
	    
	    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 public principal() 
	    {
	 	setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
	 	setForeground(new Color(0, 0, 0));
	    	setBackground(new Color(0, 0, 0));
	        components();
	        this.setLocationRelativeTo(null);
	        turnoxo=contadorX=contadorO=1;
	        cuadros=new JButton[][]{{n1,n2,n3},{n4,n5,n6},{n7,n8,n9}};

	    }

	/**
	 * Create the frame.
	 */
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
	    n1 = new JButton("");
	    n1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		 n1mouseClicked(arg0);
	    	}
	    });
		n1.setForeground(new Color(135, 206, 250));
		n1.setForeground(new Color(176, 224, 230));
		n1.setBackground(new Color(0, 0, 0));
		n1.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n1);
		
		n2 = new JButton("");
		n2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 n2mouseClicked(arg0);
			}
		});
		n2.setForeground(new Color(135, 206, 250));
		n2.setBackground(new Color(0, 0, 0));
		n2.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n2);
		
		n3 = new JButton("");
		n3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				  n3mouseClicked(arg0);
			}
		});
		n3.setForeground(new Color(135, 206, 250));
		n3.setBackground(new Color(0, 0, 0));
		n3.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n3);
		
		 n4 = new JButton("");
		 n4.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n4mouseClicked(arg0);
		 	}
		 });
		n4.setForeground(new Color(135, 206, 250));
		n4.setBackground(new Color(0, 0, 0));
		n4.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n4);
		
		 n5 = new JButton("");
		 n5.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n5mouseClicked(arg0);
		 	}
		 });
		n5.setForeground(new Color(135, 206, 250));
		n5.setBackground(new Color(0, 0, 0));
		n5.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n5);
		
		 n6 = new JButton("");
		 n6.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n6mouseClicked(arg0);
		 	}
		 });
		n6.setForeground(new Color(135, 206, 250));
		n6.setBackground(new Color(0, 0, 0));
		n6.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n6);
		
		 n7 = new JButton("");
		 n7.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n7mouseClicked(arg0);
		 	}
		 });
		n7.setForeground(new Color(135, 206, 250));
		n7.setBackground(new Color(0, 0, 0));
		n7.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n7);
		
		 n8 = new JButton("");
		 n8.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n8mouseClicked(arg0);
		 	}
		 });
		n8.setForeground(new Color(135, 206, 250));
		n8.setBackground(new Color(0, 0, 0));
		n8.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n8);
		
		 n9 = new JButton("");
		 n9.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 n9.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		 n9mouseClicked(arg0);
		 	}
		 });
		n9.setForeground(new Color(135, 206, 250));
		n9.setBackground(new Color(0, 0, 0));
		n9.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		panel.add(n9);
		
		reiniciarjuego = new JButton("Nuevo juego");
		reiniciarjuego.setForeground(new Color(30, 144, 255));
		reiniciarjuego.setBackground(new Color(0, 0, 0));
		reiniciarjuego.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		reiniciarjuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reiniciarmouseClicked(arg0);
			}
		});
		contentPane.add(reiniciarjuego, BorderLayout.SOUTH);
	}

	//Metodos
	protected void n1mouseClicked(MouseEvent arg0) {
		trik(n1);	
	}
	protected void n2mouseClicked(MouseEvent arg0) {
		trik(n2);
	}
	protected void n3mouseClicked(MouseEvent arg0) {
		trik(n3);
	}
	protected void n4mouseClicked(MouseEvent arg0) {
		trik(n4);
	}
	protected void n5mouseClicked(MouseEvent arg0) {
		trik(n5);
	}
	protected void n6mouseClicked(MouseEvent arg0) {
		trik(n6);
	}
	protected void n7mouseClicked(MouseEvent arg0) {
		trik(n7);
	}
	protected void n8mouseClicked(MouseEvent arg0) {
		trik(n8);
	}
	protected void n9mouseClicked(MouseEvent arg0) {
		trik(n9);
	}
	protected void reiniciarmouseClicked(ActionEvent arg0) {
	reiniciar();
	}
	
	 public void trik(JButton cuadro) 
	    {
	        if (!gano)//verifica si no se gano el juego 
	        {
	            if(cuadro.getText().equals(""))//comprueba que el label no tenga letras
	            {
	            	if(turnoxo==9){
	            	tableroLleno();
	            	}
	                if (turnoxo%2==1)//verifica el valor del turno para saber que letra asigna 
	                {
	                    cuadro.setText("X");
	                    cuadro.setForeground(cx);//asigna el color a la letra x
	                    if (contadorX>=3)//comprueba que ya esten almenos 3 x en el tablero 
	                    {
	                        verificar("X");//verifica si la x ya esta en triky
	                    }
	                    contadorX++;//cuenta las x
	                } 
	                else
	                {
	                    cuadro.setText("O");
	                    cuadro.setForeground(co);//asigna el color a la letra x
	                    if (contadorO>=3) //comprueba que ya esten almenos 3 0 en el tablero 
	                    {
	                        verificar("O");//verifica si la o ya esta en triky
	                    }
	                    contadorO++;
	                }
	                turnoxo++;//cuenta las o
	            }
	            
	        }        
	    }
	 
	    public void verificar(String parametro) 
	    {
	        int contador=0;
	        int a,b;  
	        boolean reinicio=false;
	        for (int x = 0; x < 2; x++) 
	        {
	            for (int i = 0; i < cuadros.length; i++) 
	            {  
	                for (int j = 0; j < cuadros.length; j++) 
	                {
	                    if (x==0) {
	                      a=i;//posicion de la fila
	                      b=j;//posicion de la columna 
	                    }else
	                    {
	                        a=j;//fila
	                        b=i;//columna 
	                    }
	                    if (cuadros[a][b].getText().equals(parametro)) {
	                        contador++;
	                    }
	                }
	                if (!gano&&contador==3) 
	                {
	                    JOptionPane.showMessageDialog(null, "Triki ,vuelve a jugar");
	                    
	                }
	                
	                
	                
	                contador=0;
	            } 
	        }
	        if (!reinicio) {
	            int pos;
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < cuadros.length; j++) {
	                   if (i==0) {
	                        pos=j;
	                    } else {
	                        pos=2-j;
	                    }
	                    if (cuadros[j][pos].getText().equals(parametro)) {
	                        contador++;
	                    }
	                }
	                if (contador==3) {
	                	
	                    JOptionPane.showMessageDialog(null, "Triki ,vuelve a jugar");
	                }
	                
	                contador=0;
	            }
	        }
	        
	    }
	    
	    public void tableroLleno(){

	        int aux = 0;

	        for(int f=0; f<3; f++){
	            for(int c=0; c<3; c++){
	                if(cuadros[f][c].getText() != null){

	                    aux++;
	                    if(aux==9){
	                        JOptionPane.showMessageDialog(this,"Empate tablero lleno");
	                    }
	                }
	            }
	        }
	    }
	
	    
	    public void reiniciar() {
	        gano=false;
	        turnoxo=contadorX=contadorO=1;
	        for (int i = 0; i < cuadros.length; i++) {
	            for (int j = 0; j < cuadros.length; j++) {
	                cuadros[i][j].setText("");
	            }
	        }
	    }
	 
}
