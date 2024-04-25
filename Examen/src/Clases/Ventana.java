package Clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	


	public Ventana() {
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(1080, 720);
	    
	    probarComponentes();

	}
	
	public void probarComponentes() {
		this.crearAlu();
	}
	
	public void inicio() {

    	menu();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(128, 0, 255));
      
        JLabel holaTag = new JLabel("Bienvenido!",0);
        holaTag.setSize(560, 80);
        holaTag.setLocation(240, 266);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
    }

	public void menu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Acceso");
		menuBar.add(mnNewMenu);
		
		JMenuItem iniciar = new JMenuItem("Iniciar sesion");
		mnNewMenu.add(iniciar);
		iniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenu alumnos = new JMenu("Alumnos");
		menuBar.add(alumnos);
		
		JMenuItem descargaAlu = new JMenuItem("Descargar informacion\r\n");
		alumnos.add(descargaAlu);
		descargaAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                descargarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem consultarAlu = new JMenuItem("Consultar");
		alumnos.add(consultarAlu);
		consultarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                consultarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem crearAlu = new JMenuItem("Crear");
		alumnos.add(crearAlu);
		crearAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                crearAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem editarAlu = new JMenuItem("Editar");
		alumnos.add(editarAlu);
		editarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                editarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		JMenuItem eliminarAlu = new JMenuItem("Eliminar");
		alumnos.add(eliminarAlu);
		eliminarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                eliminarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		
		JMenu docentes = new JMenu("Docentes");
		menuBar.add(docentes);

		JMenuItem descargarDoce = new JMenuItem("Descargar información");
		docentes.add(descargarDoce);
		descargarDoce.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        descargarDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    }
		});

		JMenuItem consultarDoce = new JMenuItem("Consultar");
		docentes.add(consultarDoce);
		consultarDoce.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        consultarDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    }
		});

		JMenuItem crearDoce = new JMenuItem("Crear");
		docentes.add(crearDoce);
		crearDoce.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        crearDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    }
		});

		JMenuItem editarDoce = new JMenuItem("Editar");
		docentes.add(editarDoce);
		editarDoce.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        editarDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    }
		});

		JMenuItem eliminarDoce = new JMenuItem("Eliminar");
		docentes.add(eliminarDoce);
		eliminarDoce.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        eliminarDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    }
		});
	}
	
	//METODOS DE ALUMNOS
	public void descargarAlu() {
		menu();
		JPanel consultarAlu = new JPanel();
		consultarAlu.setBackground(new Color(255, 255, 255));
		getContentPane().add(consultarAlu);
		consultarAlu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descargar datos de alumno");
		lblNewLabel.setBounds(10, 11, 486, 56);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 48));
		consultarAlu.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 95, 400, 50);
		consultarAlu.add(textField);
		textField.setColumns(10);
		
		
	}
	
	public void consultarAlu() {
		menu();
		JPanel consultarAlu = new JPanel();
		consultarAlu.setBackground(Color.BLUE);
		getContentPane().add(consultarAlu);
		
		
	}
	
	public void crearAlu() {
		menu();
		JPanel crearAlu = new JPanel();
		crearAlu.setBackground(new Color(255, 255, 255));
		getContentPane().add(crearAlu);
		crearAlu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Consultar Alumno");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.PLAIN, 48));
		lblNewLabel_1.setBounds(10, 11, 320, 56);
		crearAlu.add(lblNewLabel_1);
		
		
	}
	
	public void editarAlu() {
		menu();
		JPanel editarAlu = new JPanel();
		editarAlu.setBackground(Color.YELLOW);
		getContentPane().add(editarAlu);
		
		
	}
	
	public void eliminarAlu() {
		menu();
		JPanel eliminarAlu = new JPanel();
		eliminarAlu.setBackground(Color.CYAN);
		getContentPane().add(eliminarAlu);
		
		
	}
	
	//METODOS DE DOCENTES
	public void descargarDoce() {
	    menu();
	    JPanel descargarDoce = new JPanel();
	    descargarDoce.setBackground(Color.ORANGE);
	    getContentPane().add(descargarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Descargar información de docentes");
	    descargarDoce.add(lblNewLabel);
	}

	public void consultarDoce() {
	    menu();
	    JPanel consultarDoce = new JPanel();
	    consultarDoce.setBackground(Color.PINK);
	    getContentPane().add(consultarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Consultar información de docentes");
	    consultarDoce.add(lblNewLabel);
	}

	public void crearDoce() {
	    menu();
	    JPanel crearDoce = new JPanel();
	    crearDoce.setBackground(Color.MAGENTA);
	    getContentPane().add(crearDoce);
	    
	    JLabel lblNewLabel = new JLabel("Crear nuevo docente");
	    crearDoce.add(lblNewLabel);
	}

	public void editarDoce() {
	    menu();
	    JPanel editarDoce = new JPanel();
	    editarDoce.setBackground(Color.LIGHT_GRAY);
	    getContentPane().add(editarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Editar información de docentes");
	    editarDoce.add(lblNewLabel);
	}

	public void eliminarDoce() {
	    menu();
	    JPanel eliminarDoce = new JPanel();
	    eliminarDoce.setBackground(Color.DARK_GRAY);
	    getContentPane().add(eliminarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Eliminar docente");
	    eliminarDoce.add(lblNewLabel);
	}
}

	