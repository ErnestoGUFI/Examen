package Clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final JOptionPane JOpctionPaneJOptionPane = null;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApPaterno;
	private JTextField textFieldApMaterno;
	private JTextField textFieldCurp;
	private JTextField textFieldDomicilio;
	private JTextField textField_2;
	private JTextField textFieldCorreo;
	private JTextField textFieldTelefono;
	private JTextField textFieldCP;
	private JTextField textFieldMatricula;
	private JTextField textFieldNacimiento;
	private JTextField textFieldCodigo;
	private JComboBox comboBoxNacionalidad , comboBoxGeneros,comboBoxDias,comboBox_1,comboBoxMes,comboBoxAnio,comboBoxEscolaridad,comboBoxStatus;
	private JProgressBar progressBar;

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
		
		try {
           
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Test");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

		UIManager.put("Button.mouseHoverColor", new Color(255, 0, 0));
	}
	
	
	public Ventana() {
		
		
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(1080, 760);
	    setLocationRelativeTo(null);
	    
	    
	    probarComponentes();

	}
	
	public void probarComponentes() {
		this.login();
	}
	
	public void login() {
 
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setBackground(new Color(64, 0, 128));
    
    JLabel loginDentro = new JLabel();
    loginDentro.setLocation(173, 131);
    loginDentro.setLayout(null);
    loginDentro.setBackground(new Color(128, 0, 255));
    loginDentro.setSize(700,500);
    loginDentro.setOpaque(rootPaneCheckingEnabled);
    login.add(loginDentro);

    JLabel loginTag = new JLabel("Inicio De Sesion",0);
    loginTag.setSize(500, 80);
    loginTag.setLocation(271, 40);
    loginTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
    loginTag.setForeground(Color.white);
    login.add(loginTag);
    

    JLabel loginTag2 = new JLabel("Mi Cuenta",0);
    loginTag2.setSize(300, 80);
    loginTag2.setLocation(200, 10);
    loginTag2.setFont(new Font("Arial Black", Font.ITALIC, 48));
    loginTag2.setForeground(Color.decode("#FFCC00"));
    loginDentro.add(loginTag2);
    
    //texto de usuario
    JLabel usuario = new JLabel("INGRESA TU USUARIO");
    usuario.setSize(400, 20);
    usuario.setLocation(250, 150);
    usuario.setFont(new Font("Arial Black", Font.ITALIC, 16));
    usuario.setForeground(Color.WHITE);
    loginDentro.add(usuario);

    //ingresar usuario
    JTextField usuarioTexto = new JTextField();
    usuarioTexto.setSize(400, 50);
    usuarioTexto.setLocation(150, 180);
    loginDentro.add(usuarioTexto);

    //texto de contraseña
    JLabel contrasena = new JLabel("INGRESA TU CONTRASEÑA");
    contrasena.setSize(400, 20);
    contrasena.setLocation(220, 250);
    contrasena.setFont(new Font("Arial Black", Font.ITALIC, 16));
    contrasena.setForeground(Color.WHITE);
    loginDentro.add(contrasena);

    //ingresar contraseña
    JPasswordField contrasenaTexto = new JPasswordField();
    contrasenaTexto.setSize(400, 50);
    contrasenaTexto.setLocation(150, 280);
    loginDentro.add(contrasenaTexto);

    // Checkbox para recordar usuario
    JCheckBox recordarme = new JCheckBox("Recordarme");
    recordarme.setOpaque(false);
    recordarme.setSize(150, 20);
    recordarme.setLocation(150, 340);
    recordarme.setForeground(Color.WHITE);
    recordarme.setFont(new Font("Arial Black", Font.ITALIC, 16));
    loginDentro.add(recordarme);
   

    // Botón de Acceder
    JButton botonAcceder = new JButton("Acceder");
    botonAcceder.setSize(150, 40);
    botonAcceder.setLocation(270, 400);
    botonAcceder.setBackground(Color.decode("#FFCC00"));
    botonAcceder.setFont(new Font("Arial Black", Font.ITALIC, 24));
    botonAcceder.addActionListener(new ActionListener(){
    	
    	
    	public void actionPerformed(ActionEvent e) {
    		String usr = usuarioTexto.getText();
    		String pwd = new String(contrasenaTexto.getPassword());
    		
	    		if (usr.length()<=0) {
	        		usuarioTexto.setBorder(new LineBorder(Color.red,2,true));
	        		System.out.println("no jala");
	        	
	    		}else {
	    			usuarioTexto.setBorder(new LineBorder(Color.green,2,true));
	    		}
    			if(pwd.length()<=0) {
    				contrasenaTexto.setBorder(new LineBorder(Color.red,2,true));
    				System.out.println("Bienvenido");
    			}else {
    				contrasenaTexto.setBorder(new LineBorder(Color.green,2,true));
    			}
    			if(usr.length()>0 && pwd.length()>0) {
    				getContentPane().removeAll();
    	    		inicio();
    	    		getContentPane().revalidate();
    	    		getContentPane().repaint();
    			}	
    	}
    });

    loginDentro.add(botonAcceder);

    getContentPane().add(login);
    //prueba de gifs,obvio no usaremos estos
    JLabel lblNewLabel = new JLabel("");
    lblNewLabel.setIcon(new ImageIcon(Ventana.class.getResource("/Clases/pepe.gif")));
    lblNewLabel.setBounds(932, 612, 122, 119);
    login.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setIcon(new ImageIcon(Ventana.class.getResource("/Clases/pepe.gif")));
    lblNewLabel_1.setBounds(21, 612, 122, 119);
    login.add(lblNewLabel_1);
    }

	public void inicio() {

		menuInicio();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(128, 0, 255));
      
        JLabel holaTag = new JLabel("Bienvenido!",0);
        holaTag.setSize(560, 80);
        holaTag.setLocation(243, 25);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton docentes = new JButton("Docente");
        docentes.setBounds(281, 251, 171, 171);
        docentes.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        ingresoConsultarDoce();
		        getContentPane().revalidate();
		        getContentPane().repaint(); 
		    }
		});
        inicio.add(docentes);
        
        JButton alumnos = new JButton("Alumno");
        alumnos.setBounds(602, 251, 171, 171);
        alumnos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        panelAlumnos();
		        getContentPane().revalidate();
		        getContentPane().repaint(); 
		    }
		});
        inicio.add(alumnos);
        
    }
	
	public void panelDocentes() {
	
		menuDocentes();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(255, 255, 255));
      
        JLabel holaTag = new JLabel("Seleccione que desea hacer!",0);
        holaTag.setSize(810, 80);
        holaTag.setLocation(124, 26);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton descargarDoce = new JButton("Descargar Informacion");
        descargarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        descargarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        descargarDoce.setBounds(100, 150, 200, 200);
        inicio.add(descargarDoce);
        
        JButton consultarDoce = new JButton("Consultar");
        consultarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        consultarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        consultarDoce.setBounds(400, 150, 200, 200);
        inicio.add(consultarDoce);
        
        JButton crearDoce = new JButton("Crear");
        crearDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        crearDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        crearDoce.setBounds(700, 150, 200, 200);
        inicio.add(crearDoce);
        
        JButton editarDoce = new JButton("Editar");
        editarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        editarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        editarDoce.setBounds(250, 400, 200, 200);
        inicio.add(editarDoce);
        
        JButton eliminarDoce = new JButton("Eliminar");
        eliminarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        eliminarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        eliminarDoce.setBounds(550, 400, 200, 200);
        inicio.add(eliminarDoce);
        
        
		
	}
	
	public void panelAlumnos() {
	
		menuInicio();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(255, 255, 255));
      
        JLabel holaTag = new JLabel("Seleccione que desea hacer!",0);
        holaTag.setSize(810, 80);
        holaTag.setLocation(124, 26);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        ImageIcon iconoDescargar = new ImageIcon("ruta_de_la_imagen_para_descargar.png");
        JButton descargarAlu = new JButton(iconoDescargar);
        descargarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                consultarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
        descargarAlu.setBounds(0, 117, 533, 582);
        inicio.add(descargarAlu);

        // Crear ImageIcon con la imagen para el botón "Crear Alumno"
        ImageIcon iconoCrear = new ImageIcon("ruta_de_la_imagen_para_crear.png");
        JButton crearAlu = new JButton(iconoCrear);
        crearAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                crearAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
        crearAlu.setBounds(531, 117, 533, 582);
        inicio.add(crearAlu);
        
        
        
        
		
	}

	public void panelAlumnosConsultar() {
		
		menuAlumnos();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(255, 255, 255));
      
        JLabel holaTag = new JLabel("Alumno Encontrado!",0);
        holaTag.setSize(810, 80);
        holaTag.setLocation(124, 26);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(128, 255, 0));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton descargarAlu = new JButton("Descargar Informacion");
        descargarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        descargarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        descargarAlu.setBounds(264, 150, 200, 200);
        inicio.add(descargarAlu);
        
        JButton consultarAlu = new JButton("Consultar");
        consultarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        alumnoEncontrado();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        consultarAlu.setBounds(582, 150, 200, 200);
        inicio.add(consultarAlu);
   
        JButton editarAlu = new JButton("Editar");
        editarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        editarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        editarAlu.setBounds(264, 400, 200, 200);
        inicio.add(editarAlu);
        
        JButton eliminarAlu = new JButton("Eliminar");
        eliminarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        eliminarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        eliminarAlu.setBounds(582, 400, 200, 200);
        inicio.add(eliminarAlu);
        
        
		
	}
	
	public void descargarAlu() {
		menuAlumnos();
	    JPanel descargarAlu = new JPanel();
	    descargarAlu.setBackground(new Color(255, 255, 255));
	    getContentPane().add(descargarAlu);
	    descargarAlu.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    descargarAlu.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel alumnoIcono = new JLabel();
	    alumnoIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(alumnoIcono);
	    alumnoIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	   
	    JLabel descargarInformacion = new JLabel();
		descargarInformacion.setIcon(new ImageIcon(getClass().getResource("register.png")));
		descargarInformacion.setBounds(918, 0, 128, 128);
		panel_1.add(descargarInformacion);
		
		 JButton btnPanelDocente = new JButton();
		    btnPanelDocente.setBorderPainted(false);
		    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnPanelDocente.setText("Panel Alumno");
		    btnPanelDocente.setOpaque(false);
		    btnPanelDocente.setBackground(new Color(250, 128, 114));
		    btnPanelDocente.setBounds(114, 35, 293, 58);
		    panel_1.add(btnPanelDocente);
		    
		    btnPanelDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().removeAll();
					panelAlumnosConsultar();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
		    
		    JButton btnDescargarDocente = new JButton();
		    btnDescargarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
		    btnDescargarDocente.setText("Descargar Información");
		    btnDescargarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnDescargarDocente.setOpaque(false);
		    btnDescargarDocente.setBorderPainted(false);
		    btnDescargarDocente.setBackground(new Color(250, 128, 114));
		    btnDescargarDocente.setBounds(459, 35, 449, 58);
		    panel_1.add(btnDescargarDocente);
		    
		    btnDescargarDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Información descargada correctamente");
					
					getContentPane().removeAll();
					panelAlumnosConsultar();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
	  
	    JPanel panel_2 = new JPanel();
	    panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	    panel_2.setBackground(new Color(255, 255, 255));
	    panel_2.setBounds(42, 148, 980, 472);
	    descargarAlu.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(255, 255, 255));
	    panel_3.setBounds(27, 29, 203, 190);
	    panel_2.add(panel_3);
	    panel_3.setLayout(null);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(10, 10, 183, 170);
	    panel_3.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setForeground(Color.BLACK);
	    lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNombre.setBounds(288, 65, 75, 28);
	    panel_2.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel("Jose Alberto");
	    lblNombre_1.setForeground(Color.DARK_GRAY);
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(379, 65, 124, 28);
	    panel_2.add(lblNombre_1);
	    
	    JLabel lblApellidos = new JLabel("Apellidos:");
	    lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblApellidos.setBounds(288, 103, 81, 28);
	    panel_2.add(lblApellidos);
	    
	    JLabel lblApellidos1 = new JLabel("Martinez Pereira");
	    lblApellidos1.setForeground(Color.DARK_GRAY);
	    lblApellidos1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos1.setBounds(379, 103, 124, 28);
	    panel_2.add(lblApellidos1);
	    
	    JLabel lblEdad = new JLabel("Edad:");
	    lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblEdad.setBounds(288, 141, 75, 28);
	    panel_2.add(lblEdad);
	    
	    JLabel lblEdad_1 = new JLabel("20");
	    lblEdad_1.setForeground(Color.DARK_GRAY);
	    lblEdad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEdad_1.setBounds(379, 141, 87, 28);
	    panel_2.add(lblEdad_1);
	    
	    JLabel lblSexo = new JLabel("Sexo:");
	    lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblSexo.setBounds(524, 141, 63, 28);
	    panel_2.add(lblSexo);
	    
	    JLabel lblSexo1 = new JLabel("Masculino");
	    lblSexo1.setForeground(Color.DARK_GRAY);
	    lblSexo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblSexo1.setBounds(608, 141, 75, 28);
	    panel_2.add(lblSexo1);
	    
	    JLabel lblCurp_2 = new JLabel("C.U.R.P:");
	    lblCurp_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCurp_2.setBounds(734, 141, 63, 28);
	    panel_2.add(lblCurp_2);
	    
	    JLabel lblCurpText = new JLabel("JOSB850715HDFNZB02");
	    lblCurpText.setForeground(Color.DARK_GRAY);
	    lblCurpText.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurpText.setBounds(807, 141, 173, 28);
	    panel_2.add(lblCurpText);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblFechaNacimiento.setBounds(288, 179, 163, 28);
	    panel_2.add(lblFechaNacimiento);
	    
	    JLabel lblNacimiento = new JLabel("12/07/2004");
	    lblNacimiento.setForeground(Color.DARK_GRAY);
	    lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento.setBounds(472, 179, 87, 28);
	    panel_2.add(lblNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad:");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNacionalidad.setBounds(608, 179, 112, 28);
	    panel_2.add(lblNacionalidad);
	    
	    JLabel lblNacimiento_1 = new JLabel("Mexicano");
	    lblNacimiento_1.setForeground(Color.DARK_GRAY);
	    lblNacimiento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento_1.setBounds(730, 179, 87, 28);
	    panel_2.add(lblNacimiento_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electrónico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCorreo.setBounds(41, 303, 150, 28);
	    panel_2.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel("elprimo1985@gmail.com");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(242, 303, 200, 28);
	    panel_2.add(lblCorreo_1);
	    
	    JLabel lblTelfono = new JLabel("Teléfono:");
	    lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblTelfono.setBounds(41, 341, 151, 28);
	    panel_2.add(lblTelfono);
	    
	    JLabel lblTelefono_1 = new JLabel("+52 612 114 8477");
	    lblTelefono_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono_1.setBounds(242, 341, 124, 28);
	    panel_2.add(lblTelefono_1);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio:");
	    lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblDomicilio.setBounds(41, 379, 151, 28);
	    panel_2.add(lblDomicilio);
	    
	    JLabel lblDomicilio_1 = new JLabel("Avenida BuenaVista, 123 ");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(242, 379, 180, 28);
	    panel_2.add(lblDomicilio_1);
	    
	    JLabel lblCdigoPostal = new JLabel("Código postal:");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCdigoPostal.setBounds(41, 417, 151, 28);
	    panel_2.add(lblCdigoPostal);
	    
	    JLabel lblCodigoPostal_1 = new JLabel("12345");
	    lblCodigoPostal_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal_1.setBounds(242, 417, 124, 28);
	    panel_2.add(lblCodigoPostal_1);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo:");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNivelEducativo.setBounds(511, 303, 151, 28);
	    panel_2.add(lblNivelEducativo);
	    
	    JLabel lblNvlEducativo = new JLabel("Preparatoria");
	    lblNvlEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNvlEducativo.setBounds(689, 303, 87, 28);
	    panel_2.add(lblNvlEducativo);
	    
	    JLabel lblStatusActual = new JLabel("Status actual:");
	    lblStatusActual.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblStatusActual.setBounds(511, 341, 151, 28);
	    panel_2.add(lblStatusActual);
	    
	    JLabel lblCodigoDeControl = new JLabel("Codigo de control:");
	    lblCodigoDeControl.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCodigoDeControl.setBounds(511, 379, 151, 28);
	    panel_2.add(lblCodigoDeControl);
	    
	    JLabel lblStatus = new JLabel("Activo");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(689, 341, 87, 28);
	    panel_2.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel(textFieldCodigo.getText());
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(689, 379, 128, 28);
	    panel_2.add(lblMatricula_1);
	    
	    JLabel lblNewLabel_6 = new JLabel("Información General");
	    lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6.setBounds(302, 35, 200, 20);
	    panel_2.add(lblNewLabel_6);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(273, 30, 30, 30);
	    panel_2.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(273, 65, 697, 164);
	    panel_2.add(panel);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBounds(10, 298, 457, 164);
	    panel_2.add(panel_4);
	    
	    JPanel panel_4_1 = new JPanel();
	    panel_4_1.setBounds(481, 298, 489, 164);
	    panel_2.add(panel_4_1);
	    
	    JLabel lblNewLabel_6_1 = new JLabel("Datos Adicionales");
	    lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6_1.setBounds(54, 266, 200, 20);
	    panel_2.add(lblNewLabel_6_1);
	    
	    JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(14, 263, 30, 30);
	    panel_2.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));
	    
	    JLabel lblNewLabel_6_1_1 = new JLabel("Escolaridad");
	    lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6_1_1.setBounds(515, 268, 200, 20);
	    panel_2.add(lblNewLabel_6_1_1);
	    
	    JLabel infoEscolar = new JLabel();
	    infoEscolar.setBounds(481, 266, 30, 30);
	    panel_2.add(infoEscolar);
		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	
	    
	}

	public void consultarAlu() {
		
	
		
		menuInicio();
	    JPanel crearAlumno = new JPanel();
	    crearAlumno.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearAlumno);
	    crearAlumno.setLayout(null);
 
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearAlumno.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	    
	    JButton btnPanelAlumno = new JButton();
	    btnPanelAlumno.setBorderPainted(false);
	    btnPanelAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelAlumno.setOpaque(false);
	    btnPanelAlumno.setText("Panel Alumno");
	    btnPanelAlumno.setBackground(new Color(250, 128, 114));
	    btnPanelAlumno.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelAlumno);
	    
	    btnPanelAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });

	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(0, 312, 1064, 28);
	    crearAlumno.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Ingresa tu codigo de control");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(409, 0, 227, 25);
	    pnlDatosBasicos.add(lblDatosBasicos);

	    textFieldCodigo = new JTextField();
	    textFieldCodigo.setBounds(312, 351, 409, 19);
	    crearAlumno.add(textFieldCodigo);
	    textFieldCodigo.setColumns(10);
	    
	    
	    
	    JButton btnNewButton = new JButton("Consultar");
        btnNewButton.setBounds(470, 381, 89, 23);
        crearAlumno.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textFieldCodigo.getText().length() != 0) {
                    btnNewButton.setEnabled(false);
                    
                   //de aqui pa abajo puedes copiarlo en donde quieras una barra, el Thread controla el tiempo que tarda en cargar
                    progressBar = new JProgressBar();
                    progressBar.setIndeterminate(true);
                    progressBar.setBounds(360, 420, 310, 30);
                    crearAlumno.add(progressBar);
                    
                    
                    new Thread(() -> {
                        
                        try {
                            Thread.sleep(2000); 
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }

                       
                        SwingUtilities.invokeLater(() -> {
                            crearAlumno.remove(progressBar);
                            btnNewButton.setEnabled(true);
                            getContentPane().revalidate();
                            getContentPane().repaint();

                           
                            getContentPane().removeAll();
                            panelAlumnosConsultar();
                            getContentPane().revalidate();
                            getContentPane().repaint();
                        });
                    }).start();
                } else {
                    textFieldCodigo.setBorder(new LineBorder(Color.red, 2, true));
                }
            }
        });
  
	}
	
	public void crearAlu() {
		menuInicio();
		
	    JPanel crearAlu = new JPanel();
	    crearAlu.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearAlu);
	    crearAlu.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearAlu.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	   
	    JLabel registro = new JLabel();
		registro.setIcon(new ImageIcon(getClass().getResource("register.png")));
		registro.setBounds(918, 0, 128, 128);
		panel_1.add(registro);
		
		JButton btnPanelAlumno = new JButton();
	    btnPanelAlumno.setBorderPainted(false);
	    btnPanelAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelAlumno.setOpaque(false);
	    btnPanelAlumno.setText("Panel Alumno");
	    btnPanelAlumno.setBackground(new Color(250, 128, 114));
	    btnPanelAlumno.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelAlumno);
	    
	    btnPanelAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnCrearDocente = new JButton();
	    btnCrearDocente.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnCrearDocente.setText("Crear Alumno");
	    btnCrearDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnCrearDocente.setOpaque(false);
	    btnCrearDocente.setBorderPainted(false);
	    btnCrearDocente.setBackground(new Color(250, 128, 114));
	    btnCrearDocente.setBounds(543, 35, 365, 58);
	    panel_1.add(btnCrearDocente);
	    
	    btnCrearDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nombre = textFieldNombre.getText();
        		String apellidoP =textFieldApPaterno.getText();
        		String apellidoM = textFieldApMaterno.getText();      	
		    	
		    	if(nombre.length()>0) {
		    		textFieldNombre.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoP.length()>0) {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoM.length()>0) {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	
		    	if(nombre.length()>0 && apellidoP.length()>0 && apellidoM.length()>0)
		    	{
		    		JOptionPane.showMessageDialog(null, "Alumno creado correctamente");
		    		getContentPane().removeAll();
			        alumnoCreado();
			        getContentPane().revalidate();
			        getContentPane().repaint();
		    	}
		    
			}
	    	
	    });
		
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 250, 240));
	    panel_2.setBounds(732, 179, 274, 314);
	    crearAlu.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(39, 51, 205, 204);
	    panel_2.add(panelFoto);
	    panelFoto.setLayout(null);
	    
	    JLabel cargarFoto = new JLabel();
	    cargarFoto.setBounds(37, 40, 128, 128);
	    panelFoto.add(cargarFoto);
		cargarFoto.setIcon(new ImageIcon(getClass().getResource("upload.png")));
	    
	    JLabel lbl_ImagenAlumno = new JLabel("Imagen Alumno");
	    lbl_ImagenAlumno.setBounds(76, 18, 144, 23);
	    panel_2.add(lbl_ImagenAlumno);
	    lbl_ImagenAlumno.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    
	    JButton btnEliminar = new JButton("Eliminar");
	    btnEliminar.setBounds(159, 265, 85, 40);
	    panel_2.add(btnEliminar);
	    
	    JButton btnAgregar = new JButton("Agregar");
	    btnAgregar.setBounds(39, 265, 85, 40);
	    panel_2.add(btnAgregar);
	    
	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(10, 137, 632, 28);
	    crearAlu.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Información General");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblDatosBasicos.setBounds(48, 7, 201, 14);
	    pnlDatosBasicos.add(lblDatosBasicos);
	    
	    JLabel lblNombre = new JLabel("Nombre");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(63, 175, 124, 28);
	    crearAlu.add(lblNombre);
	    
	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(243, 182, 399, 19);
	    crearAlu.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JLabel lblApPaterno = new JLabel("Apellido Paterno");
	    lblApPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApPaterno.setBounds(63, 213, 124, 19);
	    crearAlu.add(lblApPaterno);
	    
	    textFieldApPaterno = new JTextField();
	    textFieldApPaterno.setColumns(10);
	    textFieldApPaterno.setBounds(243, 211, 399, 19);
	    crearAlu.add(textFieldApPaterno);
	    
	    JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
	    lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoMaterno.setBounds(63, 242, 124, 19);
	    crearAlu.add(lblApellidoMaterno);
	    
	    textFieldApMaterno = new JTextField();
	    textFieldApMaterno.setColumns(10);
	    textFieldApMaterno.setBounds(243, 240, 399, 19);
	    crearAlu.add(textFieldApMaterno);
	    
	    JLabel lblGenero = new JLabel("Género");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    crearAlu.add(lblGenero);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    comboBoxGeneros = new JComboBox(genero);
	    comboBoxGeneros.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    comboBoxGeneros.setBounds(243, 269, 103, 21);
	    crearAlu.add(comboBoxGeneros);
	    
	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento");
	    lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 152, 19);
	    crearAlu.add(lblLugarNacimiento);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha/Nacimiento");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(356, 269, 124, 21);
	    crearAlu.add(lblFechaNacimiento);
	    
	    String dias[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	    
	    comboBoxDias = new JComboBox(dias);
	    comboBoxDias.setBounds(484, 269, 46, 21);
	    crearAlu.add(comboBoxDias);
	    
	    String meses[] = {"MM","Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
	    
	    comboBoxMes = new JComboBox(meses);
	    comboBoxMes.setBounds(540, 269, 46, 21);
	    crearAlu.add(comboBoxMes);
	    
	    String año[] = {"YY","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961",
	    		"1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974",
	    		"1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
	    		"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
	    		"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
	    		"2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	    
	    comboBoxAnio = new JComboBox(año);
	    comboBoxAnio.setBounds(596, 269, 46, 21);
	    crearAlu.add(comboBoxAnio);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 329, 139, 19);
	    crearAlu.add(lblNacionalidad);
	    
	    String nacionalidad[] = {"Mexicana","Peruana","Venezolana","Colombiana"};	     
	    comboBoxNacionalidad = new JComboBox(nacionalidad);
	    comboBoxNacionalidad.setBounds(243, 327, 399, 21);
	    crearAlu.add(comboBoxNacionalidad);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(63, 358, 139, 19);
	    crearAlu.add(lblCurp);
	    
	    textFieldCurp = new JTextField();
	    textFieldCurp.setColumns(10);
	    textFieldCurp.setBounds(243, 360, 399, 19);
	    crearAlu.add(textFieldCurp);
	    
	    JPanel pnlDatosAdicionales = new JPanel();
	    pnlDatosAdicionales.setLayout(null);
	    pnlDatosAdicionales.setBounds(10, 454, 632, 28);
	    crearAlu.add(pnlDatosAdicionales);
	    
	    JLabel lblDatosAdicionales = new JLabel("Datos Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblDatosAdicionales.setBounds(48, 7, 154, 13);
	    pnlDatosAdicionales.add(lblDatosAdicionales);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(63, 503, 139, 19);
	    crearAlu.add(lblDomicilio);
	    
	    textFieldDomicilio = new JTextField();
	    textFieldDomicilio.setColumns(10);
	    textFieldDomicilio.setBounds(243, 505, 399, 19);
	    crearAlu.add(textFieldDomicilio);
	    
	    JLabel lblEntreCalles = new JLabel("Entre Calles");
	    lblEntreCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles.setBounds(63, 532, 90, 19);
	    crearAlu.add(lblEntreCalles);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(243, 534, 399, 19);
	    crearAlu.add(textField_2);
	    
	    JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
	    lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreoElectronico.setBounds(63, 387, 139, 19);
	    crearAlu.add(lblCorreoElectronico);
	    
	    textFieldCorreo = new JTextField();
	    textFieldCorreo.setColumns(10);
	    textFieldCorreo.setBounds(243, 389, 399, 19);
	    crearAlu.add(textFieldCorreo);
	    
	    JLabel lblTelefono = new JLabel("Teléfono");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(63, 416, 109, 28);
	    crearAlu.add(lblTelefono);
	    
	    String telefono[] = {"Particular","Teléfono Celular"};
	    
	    comboBox_1 = new JComboBox(telefono);
	    comboBox_1.setBounds(243, 418, 144, 21);
	    crearAlu.add(comboBox_1);
	    
	    textFieldTelefono = new JTextField();
	    textFieldTelefono.setColumns(10);
	    textFieldTelefono.setBounds(397, 418, 245, 19);
	    crearAlu.add(textFieldTelefono);
	    
	    JPanel pnlEscolaridad = new JPanel();
	    pnlEscolaridad.setLayout(null);
	    pnlEscolaridad.setBounds(10, 590, 632, 28);
	    crearAlu.add(pnlEscolaridad);
	    
	    JLabel lblEscolaridad = new JLabel("Escolaridad");
	    lblEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblEscolaridad.setBounds(48, 7, 154, 13);
	    pnlEscolaridad.add(lblEscolaridad);
	    
	    JLabel lblCodigoPostal = new JLabel("Codigo Postal");
	    lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal.setBounds(63, 561, 90, 19);
	    crearAlu.add(lblCodigoPostal);
	    
	    textFieldCP = new JTextField();
	    textFieldCP.setColumns(10);
	    textFieldCP.setBounds(243, 563, 399, 19);
	    crearAlu.add(textFieldCP);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(63, 628, 139, 19);
	    crearAlu.add(lblNivelEducativo);
	    
	    String escolaridad[] = {"Primaria","Secundaria","Preparatoria"};
	    
	    comboBoxEscolaridad = new JComboBox(escolaridad);
	    comboBoxEscolaridad.setBounds(243, 628, 144, 21);
	    crearAlu.add(comboBoxEscolaridad);
	    
	    JLabel lblCodigoControl = new JLabel("Codigo de control");
	    lblCodigoControl.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoControl.setBounds(63, 657, 139, 19);
	    crearAlu.add(lblCodigoControl);
	    
	    textFieldCodigo = new JTextField();
	    textFieldCodigo.setColumns(10);
	    textFieldCodigo.setBounds(243, 659, 399, 19);
	    crearAlu.add(textFieldCodigo);
	    
	    JLabel lblStatusActual = new JLabel("Status actual");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(397, 628, 139, 19);
	    crearAlu.add(lblStatusActual);
	    
	    String status[] = {"Activo","Innactivo"};
	    
	    comboBoxStatus = new JComboBox(status);
	    comboBoxStatus.setBounds(496, 628, 146, 21);
	    crearAlu.add(comboBoxStatus);

	    textFieldNacimiento = new JTextField();
	    textFieldNacimiento.setColumns(10);
	    textFieldNacimiento.setBounds(243, 300, 399, 19);
	    crearAlu.add(textFieldNacimiento);
	  
	}
	
	public void alumnoCreado() {
		menuInicio();
	    JPanel alumnoCreado = new JPanel();
	    alumnoCreado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(alumnoCreado);
	    alumnoCreado.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    alumnoCreado.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel alumnoIcono = new JLabel();
	    alumnoIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(alumnoIcono);
	    alumnoIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	   
		JButton btnPanelAlumno = new JButton();
		btnPanelAlumno.setBorderPainted(false);
		btnPanelAlumno.setOpaque(false);
		btnPanelAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		btnPanelAlumno.setText("Panel Alumno");
		btnPanelAlumno.setBackground(new Color(250, 128, 114));
		btnPanelAlumno.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelAlumno);
	    
	    btnPanelAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	   
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    alumnoCreado.add(panelFoto);
	    panelFoto.setLayout(null);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(0, 4, 180, 175);
	    panelFoto.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    alumnoCreado.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel(textFieldNombre.getText());
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    alumnoCreado.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    alumnoCreado.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel(textFieldApPaterno.getText());
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    alumnoCreado.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    alumnoCreado.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel((String) comboBoxGeneros.getSelectedItem());
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel((String)comboBoxDias.getSelectedItem()+"/"+(String)comboBoxMes.getSelectedItem()+"/"+(String)comboBoxAnio.getSelectedItem());
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel((String) comboBoxNacionalidad.getSelectedItem());
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel(textFieldTelefono.getText());
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelInfo = new JPanel();
	    PanelInfo.setBounds(625, 215, 379, 397);
	    alumnoCreado.add(PanelInfo);
	    PanelInfo.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelInfo.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelInfo.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelInfo.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelInfo.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelInfo.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelInfo.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelInfo.add(lblStatus);
	    
	    JLabel lblCodigo = new JLabel("Codigo De Control");
	    lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigo.setBounds(38, 309, 124, 28);
	    PanelInfo.add(lblCodigo);
	    
	    JLabel lblDomicilio = new JLabel(textFieldDomicilio.getText());
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    PanelInfo.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel(textField_2.getText());
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelInfo.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel(textFieldCP.getText());
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelInfo.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel((String) comboBoxEscolaridad.getSelectedItem());
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelInfo.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel((String) comboBoxStatus.getSelectedItem());
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelInfo.add(lblStatusActual);
	    
	    JLabel lblCodigoControl = new JLabel(textFieldCodigo.getText());
	    lblCodigoControl.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoControl.setBounds(172, 309, 124, 28);
	    PanelInfo.add(lblCodigoControl);
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    alumnoCreado.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel(textFieldApMaterno.getText());
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    alumnoCreado.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    alumnoCreado.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel(textFieldCorreo.getText());
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    alumnoCreado.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(100, 398, 262, 28);
	    alumnoCreado.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(668, 181, 262, 28);
	    alumnoCreado.add(lblDatosAdicionales);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    alumnoCreado.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel(textFieldCurp.getText());
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    alumnoCreado.add(lblCurp_1);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(58, 398, 30, 30);
	    alumnoCreado.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));

		JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(628, 180, 30, 30);
	    alumnoCreado.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));

		JLabel infoEscolar1 = new JLabel();
	    infoEscolar1.setBounds(197, 23, 30, 30);
	    PanelInfo.add(infoEscolar1);
	    infoEscolar1.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    		JLabel infoEscolar = new JLabel();
	    		infoEscolar.setBounds(208, 192, 30, 30);
	    		PanelInfo.add(infoEscolar);
	    		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));

	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    alumnoCreado.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    alumnoCreado.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	}
	
	public void alumnoEncontrado() {
		menuAlumnos();
	    JPanel consultarAlumno = new JPanel();
	    consultarAlumno.setBackground(new Color(255, 255, 255));
	    getContentPane().add(consultarAlumno);
	    consultarAlumno.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    consultarAlumno.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	   
	    JLabel finConsulta = new JLabel();
		finConsulta.setIcon(new ImageIcon(getClass().getResource("register.png")));
		finConsulta.setBounds(918, 0, 128, 128);
		panel_1.add(finConsulta);
		
		 JButton btnPanelDocente = new JButton();
		    btnPanelDocente.setBorderPainted(false);
		    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnPanelDocente.setOpaque(false);
		    btnPanelDocente.setText("Panel Alumno");
		    btnPanelDocente.setBackground(new Color(250, 128, 114));
		    btnPanelDocente.setBounds(114, 35, 293, 58);
		    panel_1.add(btnPanelDocente);
		    
		    btnPanelDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().removeAll();
					panelAlumnosConsultar();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
		    
		    JButton btnFinalizarDocente = new JButton();
		    btnFinalizarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
		    btnFinalizarDocente.setText("Finalizar Consulta");
		    btnFinalizarDocente.setOpaque(false);
		    btnFinalizarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnFinalizarDocente.setBorderPainted(false);
		    btnFinalizarDocente.setBackground(new Color(250, 128, 114));
		    btnFinalizarDocente.setBounds(459, 35, 449, 58);
		    panel_1.add(btnFinalizarDocente);
		    
		    btnFinalizarDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Consulta finalizada correctamente");
					
					getContentPane().removeAll();
					panelAlumnosConsultar();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    consultarAlumno.add(panelFoto);
	    
	    JLabel foto = new JLabel();
	    panelFoto.add(foto);
	    foto.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
		
		JLabel infoGral = new JLabel();
	    infoGral.setBounds(59, 398, 30, 30);
	    consultarAlumno.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));

		JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(625, 182, 30, 30);
	    consultarAlumno.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));

	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    consultarAlumno.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    consultarAlumno.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    consultarAlumno.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel("Omar Mario");
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    consultarAlumno.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    consultarAlumno.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel("Martinez");
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    consultarAlumno.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    consultarAlumno.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel("Masculino");
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblFechaNacimiento = new JLabel("22/10/2004");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblFechaNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel("Mexicana");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel("612 149 1671");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    consultarAlumno.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel iconoEscolar = new JLabel();
	    iconoEscolar.setBounds(197, 23, 30, 30);
	    PanelXD.add(iconoEscolar);
	    iconoEscolar.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Codigo de control");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel("Avenida Culebra, 230");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 147, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel("La Carreta");
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel("23089");
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel("Preparatoria");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel("Activo");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblCodigoControl = new JLabel(textFieldCodigo.getText());
	    lblCodigoControl.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoControl.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblCodigoControl);
	    
	    		JLabel infoEscolar = new JLabel();
	    		infoEscolar.setBounds(210, 190, 30, 30);
	    		PanelXD.add(infoEscolar);
	    		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    consultarAlumno.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel("Maromas");
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    consultarAlumno.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    consultarAlumno.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel("julo24@gmail.com");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    consultarAlumno.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(90, 398, 262, 28);
	    consultarAlumno.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(665, 182, 262, 28);
	    consultarAlumno.add(lblDatosAdicionales);

	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    consultarAlumno.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel("GUFO2019ALF1231");
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 148, 28);
	    consultarAlumno.add(lblCurp_1);
	}

	public void editarAlu() {
		menuAlumnos();
	    JPanel editarAlu = new JPanel();
	    editarAlu.setBackground(Color.WHITE);
	    getContentPane().add(editarAlu);
	    editarAlu.setLayout(null);
	   
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    editarAlu.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnPanelAlumno = new JButton();
	    btnPanelAlumno.setBorderPainted(false);
	    btnPanelAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelAlumno.setOpaque(false);
	    btnPanelAlumno.setText("Panel Alumno");
	    btnPanelAlumno.setBackground(new Color(250, 128, 114));
	    btnPanelAlumno.setBounds(114, 35, 293, 58);
	    panel_1.add(btnPanelAlumno);
	    
	    btnPanelAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelAlumnosConsultar();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnEditarAlumno = new JButton();
	    btnEditarAlumno.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnEditarAlumno.setText("Editar Alumno");
	    btnEditarAlumno.setOpaque(false);
	    btnEditarAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnEditarAlumno.setBorderPainted(false);
	    btnEditarAlumno.setBackground(new Color(250, 128, 114));
	    btnEditarAlumno.setBounds(543, 35, 365, 58);
	    panel_1.add(btnEditarAlumno);
	    
	    btnEditarAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Información actualizada correctamente");
				
				getContentPane().removeAll();
				panelAlumnosConsultar();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(0, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("iconoAlumno.png")));
	    
	    JLabel eliminarUsuario = new JLabel();
	    eliminarUsuario.setBounds(918, 0, 128, 128);
	    panel_1.add(eliminarUsuario);
	    eliminarUsuario.setIcon(new ImageIcon(getClass().getResource("editarUsuario.png")));
	   
	    JPanel panel = new JPanel();
	    panel.setBounds(30, 145, 1003, 540);
	    editarAlu.add(panel);
	    panel.setLayout(null);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(Color.DARK_GRAY);
	    panel_2.setBounds(0, 0, 1003, 51);
	    panel.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JLabel lblNewLabel_3 = new JLabel("Actualización de datos de alumno");
	    lblNewLabel_3.setForeground(Color.WHITE);
	    lblNewLabel_3.setBounds(24, 10, 289, 38);
	    panel_2.add(lblNewLabel_3);
	    lblNewLabel_3.setBackground(new Color(102, 0, 153));
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    
	    JLabel lblNewLabel_4 = new JLabel("Nombre:");
	    lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNewLabel_4.setBounds(90, 83, 68, 19);
	    panel.add(lblNewLabel_4);
	    
	    JTextField textField = new JTextField();
	    textField.setBounds(156, 85, 282, 19);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblApellidos = new JLabel("Apellidos:");
	    lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos.setBounds(90, 124, 68, 19);
	    panel.add(lblApellidos);
	    
	    JTextField textFieldApellidos = new JTextField();
	    textFieldApellidos.setColumns(10);
	    textFieldApellidos.setBounds(156, 126, 282, 19);
	    panel.add(textFieldApellidos);
	    
	    JLabel lblCorreo1 = new JLabel("Correo:");
	    lblCorreo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo1.setBounds(90, 163, 68, 19);
	    panel.add(lblCorreo1);
	    
	    JTextField textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(156, 165, 282, 19);
	    panel.add(textField_1);
	    
	    JLabel lblVisible = new JLabel("Género:");
	    lblVisible.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblVisible.setBounds(96, 204, 62, 19);
	    panel.add(lblVisible);
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setLayout(null);
	    panel_2_1.setBackground(Color.GRAY);
	    panel_2_1.setBounds(0, 489, 1003, 51);
	    panel.add(panel_2_1);
	    
	    JLabel lblImgen = new JLabel("Imágen");
	    lblImgen.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblImgen.setBounds(96, 244, 62, 19);
	    panel.add(lblImgen);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(255, 255, 255));
	    panel_3.setBounds(156, 244, 160, 130);
	    panel.add(panel_3);
	    
	    JLabel uploadIcon = new JLabel();
	    panel_3.add(uploadIcon);
	    uploadIcon.setIcon(new ImageIcon(getClass().getResource("upload.png")));
	    
	    JPanel lineaNegra = new JPanel();
	    lineaNegra.setBackground(Color.BLACK);
	    lineaNegra.setBounds(30, 422, 953, 2);
	    panel.add(lineaNegra);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio:");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(550, 83, 68, 19);
	    panel.add(lblDomicilio);
	    
	    JTextField textFieldDomi = new JTextField();
	    textFieldDomi.setColumns(10);
	    textFieldDomi.setBounds(628, 83, 282, 19);
	    panel.add(textFieldDomi);
	    
	    JLabel lblEntreCalles_1 = new JLabel("Entre Calles:");
	    lblEntreCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles_1.setBounds(531, 124, 84, 19);
	    panel.add(lblEntreCalles_1);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    JComboBox comboBoxGenero = new JComboBox(genero);
	    comboBoxGenero.setBounds(156, 205, 282, 21);
	    panel.add(comboBoxGenero);
	    
	    JTextField textFieldCalles = new JTextField();
	    textFieldCalles.setColumns(10);
	    textFieldCalles.setBounds(628, 126, 282, 19);
	    panel.add(textFieldCalles);
	    
	    JLabel lblCP = new JLabel("Código Postal:");
	    lblCP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP.setBounds(521, 163, 94, 19);
	    panel.add(lblCP);
	    
	    JTextField textFieldCp = new JTextField();
	    textFieldCp.setColumns(10);
	    textFieldCp.setBounds(628, 163, 282, 19);
	    panel.add(textFieldCp);
	    
	    JLabel lblTelefono = new JLabel("Teléfono:");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(549, 204, 68, 19);
	    panel.add(lblTelefono);
	    
	    JTextField textFieldTel = new JTextField();
	    textFieldTel.setColumns(10);
	    textFieldTel.setBounds(628, 204, 282, 19);
	    panel.add(textFieldTel);
	    
	    JLabel lblNivelEducativo_2 = new JLabel("Nivel educativo:");
	    lblNivelEducativo_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_2.setBounds(509, 244, 109, 19);
	    panel.add(lblNivelEducativo_2);
	    
	    String escolaridad[] = {"Primaria","Secundaria","Preparatoria"};
	    
	    JComboBox comboBoxNvlEdu = new JComboBox(escolaridad);
	    comboBoxNvlEdu.setBounds(628, 244, 282, 21);
	    panel.add(comboBoxNvlEdu);
	   
	    JLabel lblStatusActual = new JLabel("Status Actual:");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(509, 284, 109, 19);
	    panel.add(lblStatusActual);
	    
	    String status[] = {"Activo","Innactivo"};
	    
	    JComboBox comboBoxNvlStatus = new JComboBox(status);
	    comboBoxNvlStatus.setBounds(628, 285, 282, 21);
	    panel.add(comboBoxNvlStatus);
	    
	    JLabel lblNewLabel_5 = new JLabel("Solo campos requeridos");
	    lblNewLabel_5.setForeground(Color.GRAY);
	    lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblNewLabel_5.setBounds(30, 434, 198, 24);
	    panel.add(lblNewLabel_5);
	    
	    JLabel lblCargarFoto = new JLabel("Cargar fotografía");
	    lblCargarFoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCargarFoto.setBounds(178, 384, 114, 28);
	    panel.add(lblCargarFoto);
	    
	    
	}
	
	public void eliminarAlu() {
		menuAlumnos();
		JPanel eliminarAlumno = new JPanel();
	    eliminarAlumno.setBackground(new Color(255, 255, 255));
	    getContentPane().add(eliminarAlumno);
	    eliminarAlumno.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    eliminarAlumno.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnPanelAlumno = new JButton();
	    btnPanelAlumno.setBorderPainted(false);
	    btnPanelAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelAlumno.setOpaque(false);
	    btnPanelAlumno.setText("Panel Alumno");
	    btnPanelAlumno.setBackground(new Color(250, 128, 114));
	    btnPanelAlumno.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelAlumno);
	    
	    btnPanelAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelAlumnosConsultar();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnEliminarAlumno = new JButton();
	    btnEliminarAlumno.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnEliminarAlumno.setText("Eliminar Alumno");
	    btnEliminarAlumno.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnEliminarAlumno.setOpaque(false);
	    btnEliminarAlumno.setBorderPainted(false);
	    btnEliminarAlumno.setBackground(new Color(250, 128, 114));
	    btnEliminarAlumno.setBounds(543, 35, 365, 58);
	    panel_1.add(btnEliminarAlumno);
	    
	    btnEliminarAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
				
				getContentPane().removeAll();
				panelAlumnosConsultar();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(0, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	    
	    JLabel eliminarUsuario = new JLabel();
	    eliminarUsuario.setBounds(918, 0, 128, 128);
	    panel_1.add(eliminarUsuario);
	    eliminarUsuario.setIcon(new ImageIcon(getClass().getResource("eliminarPerfil.png")));
	    
	    //
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    eliminarAlumno.add(panelFoto);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(0, 4, 180, 175);
	    panelFoto.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    eliminarAlumno.add(lblNombre);
	   
	    JLabel lblNombre_1 = new JLabel();
	    lblNombre_1.setText("Juan Alberto");
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    eliminarAlumno.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    eliminarAlumno.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel();
	    lblApellidoP_1.setText("Martinez");
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    eliminarAlumno.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    eliminarAlumno.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 68, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 136, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 110, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel();
	    lblGenero_1.setText("Masculino");
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(214, 20, 79, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel();
	    lblLugarNacimiento.setText("10/03/1998");
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(211, 60, 146, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel();
	    lblNacionalidad.setText("Mexicano");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(211, 100, 146, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel();
	    lblTelefono.setText("612 346 4585");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(214, 140, 143, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    eliminarAlumno.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel infoEscolar = new JLabel();
	    infoEscolar.setBounds(197, 23, 30, 30);
	    PanelXD.add(infoEscolar);
	    infoEscolar.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 177, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblCodigoControl = new JLabel("Matricula");
	    lblCodigoControl.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoControl.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblCodigoControl);
	    
	    JLabel lblDomicilio = new JLabel();
	    lblDomicilio.setText("Avenida America, 123");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 190, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel();
	    lblCalles_1.setText("Tormenta y Venidon");
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 156, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel();
	    lblCP_1.setText("12345");
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel();
	    lblNivelEducativo.setText("Licenciatura");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel();
	    lblStatusActual.setText("Activo");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblCodigoControl_1 = new JLabel();
	    lblCodigoControl_1.setText("21324565");
	    lblCodigoControl_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoControl_1.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblCodigoControl_1);
	    
	    JLabel infoEscolar2 = new JLabel();
	    infoEscolar2.setBounds(215, 192, 30, 30);
	    PanelXD.add(infoEscolar2);
	    infoEscolar2.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    eliminarAlumno.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel();
	    lblApellidoM_1.setText("Gonzalez");
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    eliminarAlumno.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    eliminarAlumno.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel();
	    lblCorreo_1.setText("juan10@gmail.com");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 153, 28);
	    eliminarAlumno.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblInfoGeneral.setBounds(96, 395, 219, 28);
	    eliminarAlumno.add(lblInfoGeneral);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(56, 395, 30, 30);
	    eliminarAlumno.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosAdicionales.setBounds(670, 181, 262, 28);
	    eliminarAlumno.add(lblDatosAdicionales);
	    
	    JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(630, 180, 30, 30);
	    eliminarAlumno.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 124, 28);
	    eliminarAlumno.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel();
	    lblCurp_1.setText("GOMJ850715HDFNZB02");
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 153, 28);
	    eliminarAlumno.add(lblCurp_1);
	    
	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    eliminarAlumno.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    eliminarAlumno.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 204, 102));
	    panel.setBounds(10, 137, 1046, 554);
	    eliminarAlumno.add(panel);
	}
	
	public void descargarDoce() {
		menuDocentes();
	    JPanel descargarDoce = new JPanel();
	    descargarDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(descargarDoce);
	    descargarDoce.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    descargarDoce.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	   
	    JLabel descargarInformacion = new JLabel();
		descargarInformacion.setIcon(new ImageIcon(getClass().getResource("register.png")));
		descargarInformacion.setBounds(918, 0, 128, 128);
		panel_1.add(descargarInformacion);
		
		 JButton btnPanelDocente = new JButton();
		    btnPanelDocente.setBorderPainted(false);
		    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnPanelDocente.setText("Panel Docente");
		    btnPanelDocente.setBackground(new Color(250, 128, 114));
		    btnPanelDocente.setBounds(114, 35, 293, 58);
		    panel_1.add(btnPanelDocente);
		    
		    btnPanelDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().removeAll();
					panelDocentes();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
		    
		    JButton btnDescargarDocente = new JButton();
		    btnDescargarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
		    btnDescargarDocente.setText("Descargar Información");
		    btnDescargarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnDescargarDocente.setBorderPainted(false);
		    btnDescargarDocente.setBackground(new Color(250, 128, 114));
		    btnDescargarDocente.setBounds(459, 35, 449, 58);
		    panel_1.add(btnDescargarDocente);
		    
		    btnDescargarDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Información descargada correctamente");
					
					getContentPane().removeAll();
					panelDocentes();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
	  
	    JPanel panel_2 = new JPanel();
	    panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	    panel_2.setBackground(new Color(255, 255, 255));
	    panel_2.setBounds(42, 148, 980, 472);
	    descargarDoce.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(255, 255, 255));
	    panel_3.setBounds(27, 29, 203, 190);
	    panel_2.add(panel_3);
	    panel_3.setLayout(null);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(10, 10, 183, 170);
	    panel_3.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setForeground(Color.BLACK);
	    lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNombre.setBounds(288, 65, 75, 28);
	    panel_2.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel("Juan Alberto");
	    lblNombre_1.setForeground(Color.DARK_GRAY);
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(379, 65, 124, 28);
	    panel_2.add(lblNombre_1);
	    
	    JLabel lblApellidos = new JLabel("Apellidos:");
	    lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblApellidos.setBounds(288, 103, 81, 28);
	    panel_2.add(lblApellidos);
	    
	    JLabel lblApellidos1 = new JLabel("Gonzalez Martinez");
	    lblApellidos1.setForeground(Color.DARK_GRAY);
	    lblApellidos1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos1.setBounds(379, 103, 124, 28);
	    panel_2.add(lblApellidos1);
	    
	    JLabel lblEdad = new JLabel("Edad:");
	    lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblEdad.setBounds(288, 141, 75, 28);
	    panel_2.add(lblEdad);
	    
	    JLabel lblEdad_1 = new JLabel("38");
	    lblEdad_1.setForeground(Color.DARK_GRAY);
	    lblEdad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEdad_1.setBounds(379, 141, 87, 28);
	    panel_2.add(lblEdad_1);
	    
	    JLabel lblSexo = new JLabel("Sexo:");
	    lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblSexo.setBounds(524, 141, 63, 28);
	    panel_2.add(lblSexo);
	    
	    JLabel lblSexo1 = new JLabel("Masculino");
	    lblSexo1.setForeground(Color.DARK_GRAY);
	    lblSexo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblSexo1.setBounds(608, 141, 75, 28);
	    panel_2.add(lblSexo1);
	    
	    JLabel lblCurp_2 = new JLabel("C.U.R.P:");
	    lblCurp_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCurp_2.setBounds(734, 141, 63, 28);
	    panel_2.add(lblCurp_2);
	    
	    JLabel lblCurpText = new JLabel("GOMJ850715HDFNZB02");
	    lblCurpText.setForeground(Color.DARK_GRAY);
	    lblCurpText.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurpText.setBounds(807, 141, 173, 28);
	    panel_2.add(lblCurpText);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblFechaNacimiento.setBounds(288, 179, 163, 28);
	    panel_2.add(lblFechaNacimiento);
	    
	    JLabel lblNacimiento = new JLabel("15/07/1985");
	    lblNacimiento.setForeground(Color.DARK_GRAY);
	    lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento.setBounds(472, 179, 87, 28);
	    panel_2.add(lblNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad:");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNacionalidad.setBounds(608, 179, 112, 28);
	    panel_2.add(lblNacionalidad);
	    
	    JLabel lblNacimiento_1 = new JLabel("Mexicano");
	    lblNacimiento_1.setForeground(Color.DARK_GRAY);
	    lblNacimiento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento_1.setBounds(730, 179, 87, 28);
	    panel_2.add(lblNacimiento_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electrónico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCorreo.setBounds(41, 303, 150, 28);
	    panel_2.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel("juanalberto1985@gmail.com");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(242, 303, 200, 28);
	    panel_2.add(lblCorreo_1);
	    
	    JLabel lblTelfono = new JLabel("Teléfono:");
	    lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblTelfono.setBounds(41, 341, 151, 28);
	    panel_2.add(lblTelfono);
	    
	    JLabel lblTelefono_1 = new JLabel("+52 612 345 6789");
	    lblTelefono_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono_1.setBounds(242, 341, 124, 28);
	    panel_2.add(lblTelefono_1);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio:");
	    lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblDomicilio.setBounds(41, 379, 151, 28);
	    panel_2.add(lblDomicilio);
	    
	    JLabel lblDomicilio_1 = new JLabel("Avenida Primavera, 123 ");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(242, 379, 180, 28);
	    panel_2.add(lblDomicilio_1);
	    
	    JLabel lblCdigoPostal = new JLabel("Código postal:");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblCdigoPostal.setBounds(41, 417, 151, 28);
	    panel_2.add(lblCdigoPostal);
	    
	    JLabel lblCodigoPostal_1 = new JLabel("04550");
	    lblCodigoPostal_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal_1.setBounds(242, 417, 124, 28);
	    panel_2.add(lblCodigoPostal_1);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo:");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNivelEducativo.setBounds(511, 303, 151, 28);
	    panel_2.add(lblNivelEducativo);
	    
	    JLabel lblNvlEducativo = new JLabel("Licenciatura");
	    lblNvlEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNvlEducativo.setBounds(689, 303, 87, 28);
	    panel_2.add(lblNvlEducativo);
	    
	    JLabel lblStatusActual = new JLabel("Status actual:");
	    lblStatusActual.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblStatusActual.setBounds(511, 341, 151, 28);
	    panel_2.add(lblStatusActual);
	    
	    JLabel lblMatrcula = new JLabel("Matrícula:");
	    lblMatrcula.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblMatrcula.setBounds(511, 379, 151, 28);
	    panel_2.add(lblMatrcula);
	    
	    JLabel lblStatus = new JLabel("Activo");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(689, 341, 87, 28);
	    panel_2.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel(textFieldNombre.getText());
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(689, 379, 128, 28);
	    panel_2.add(lblMatricula_1);
	    
	    JLabel lblNewLabel_6 = new JLabel("Información General");
	    lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6.setBounds(302, 35, 200, 20);
	    panel_2.add(lblNewLabel_6);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(273, 30, 30, 30);
	    panel_2.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(273, 65, 697, 164);
	    panel_2.add(panel);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBounds(10, 298, 457, 164);
	    panel_2.add(panel_4);
	    
	    JPanel panel_4_1 = new JPanel();
	    panel_4_1.setBounds(481, 298, 489, 164);
	    panel_2.add(panel_4_1);
	    
	    JLabel lblNewLabel_6_1 = new JLabel("Datos Adicionales");
	    lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6_1.setBounds(54, 266, 200, 20);
	    panel_2.add(lblNewLabel_6_1);
	    
	    JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(14, 263, 30, 30);
	    panel_2.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));
	    
	    JLabel lblNewLabel_6_1_1 = new JLabel("Escolaridad");
	    lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblNewLabel_6_1_1.setBounds(515, 268, 200, 20);
	    panel_2.add(lblNewLabel_6_1_1);
	    
	    JLabel infoEscolar = new JLabel();
	    infoEscolar.setBounds(481, 266, 30, 30);
	    panel_2.add(infoEscolar);
		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	    JButton btnDescargar = new JButton("Descargar");
	    btnDescargar.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    btnDescargar.setBounds(854, 635, 168, 50);
	    descargarDoce.add(btnDescargar);
	    
	    btnDescargar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Información descargada con exito");
				getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint();
			}
	    	
	    });
	    
	}
	
	public void ingresoConsultarDoce() {
		menuDocentes();
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 255, 255));
	    getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    JLabel logoUabcs = new JLabel();
	    logoUabcs.setBackground(new Color(204, 153, 204));
		logoUabcs.setIcon(new ImageIcon(getClass().getResource("")));
		logoUabcs.setBounds(0, 0, 1080, 661);
		panel.add(logoUabcs);
	    
	    JLabel lblConsultoria = new JLabel("Consultoria");
	    lblConsultoria.setBounds(452, 181, 182, 25);
	    lblConsultoria.setForeground(new Color(0, 0, 128));
	    lblConsultoria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    panel.add(lblConsultoria);

	    JPanel pnl2 = new JPanel();
	    pnl2.setBounds(0, 312, 1064, 28);
	    panel.add(pnl2);
	    pnl2.setLayout(null);
	    
	    JLabel lblCodigoDeControl = new JLabel("Ingresa el codigo de control del docente");
	    lblCodigoDeControl.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblCodigoDeControl.setBounds(373, 0, 321, 25);
	    pnl2.add(lblCodigoDeControl);

	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(312, 351, 409, 19);
	    panel.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JButton btnNewButton = new JButton("Consultar");
	    btnNewButton.setBounds(470, 381, 89, 23);
	    panel.add(btnNewButton);
	    btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(textFieldNombre.getText().length()!=0) {
		        getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    }
		});
  
	}
	
	public void consultarDoce() {
		menuDocentes();
	    JPanel docenteCreado = new JPanel();
	    docenteCreado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(docenteCreado);
	    docenteCreado.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    docenteCreado.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	   
	    JLabel finConsulta = new JLabel();
		finConsulta.setIcon(new ImageIcon(getClass().getResource("register.png")));
		finConsulta.setBounds(918, 0, 128, 128);
		panel_1.add(finConsulta);
		
		 JButton btnPanelDocente = new JButton();
		    btnPanelDocente.setBorderPainted(false);
		    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnPanelDocente.setText("Panel Docente");
		    btnPanelDocente.setBackground(new Color(250, 128, 114));
		    btnPanelDocente.setBounds(114, 35, 293, 58);
		    panel_1.add(btnPanelDocente);
		    
		    btnPanelDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().removeAll();
					panelDocentes();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
		    
		    JButton btnFinalizarDocente = new JButton();
		    btnFinalizarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
		    btnFinalizarDocente.setText("Finalizar Consulta");
		    btnFinalizarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
		    btnFinalizarDocente.setBorderPainted(false);
		    btnFinalizarDocente.setBackground(new Color(250, 128, 114));
		    btnFinalizarDocente.setBounds(459, 35, 449, 58);
		    panel_1.add(btnFinalizarDocente);
		    
		    btnFinalizarDocente.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Consulta finalizada correctamente");
					
					getContentPane().removeAll();
					panelDocentes();
	                getContentPane().revalidate();
	                getContentPane().repaint();
				}
		    	
		    });
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    docenteCreado.add(panelFoto);
	    
	    JLabel Omar = new JLabel();
	    panelFoto.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
		
		JLabel infoGral = new JLabel();
	    infoGral.setBounds(59, 398, 30, 30);
	    docenteCreado.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));

		JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(625, 182, 30, 30);
	    docenteCreado.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));

	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    docenteCreado.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    docenteCreado.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    docenteCreado.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel(textFieldNombre.getText());
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    docenteCreado.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    docenteCreado.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel(textFieldApPaterno.getText());
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    docenteCreado.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    docenteCreado.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel((String) comboBoxGeneros.getSelectedItem());
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblFechaNacimiento = new JLabel((String)comboBoxDias.getSelectedItem()+"/"+(String)comboBoxMes.getSelectedItem()+"/"+(String)comboBoxAnio.getSelectedItem());
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblFechaNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel((String) comboBoxNacionalidad.getSelectedItem());
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel(textFieldTelefono.getText());
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    docenteCreado.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel iconoEscolar = new JLabel();
	    iconoEscolar.setBounds(197, 23, 30, 30);
	    PanelXD.add(iconoEscolar);
	    iconoEscolar.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Matricula");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel(textFieldDomicilio.getText());
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel(textField_2.getText());
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel(textFieldCP.getText());
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel((String) comboBoxEscolaridad.getSelectedItem());
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel((String) comboBoxStatus.getSelectedItem());
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblMatricula = new JLabel(textFieldMatricula.getText());
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblMatricula);
	    
	    		JLabel infoEscolar = new JLabel();
	    		infoEscolar.setBounds(210, 190, 30, 30);
	    		PanelXD.add(infoEscolar);
	    		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    docenteCreado.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel(textFieldApMaterno.getText());
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    docenteCreado.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    docenteCreado.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel(textFieldCorreo.getText());
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    docenteCreado.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(90, 398, 262, 28);
	    docenteCreado.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(665, 182, 262, 28);
	    docenteCreado.add(lblDatosAdicionales);
	    
	    JButton btnTerminar = new JButton("Finalizar");
	    btnTerminar.setBounds(785, 642, 219, 35);
	    docenteCreado.add(btnTerminar);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    docenteCreado.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel(textFieldCurp.getText());
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    docenteCreado.add(lblCurp_1);
	}

	public void crearDoce() {
		menuDocentes();
		
	    JPanel crearDoce = new JPanel();
	    crearDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearDoce);
	    crearDoce.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearDoce.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	   
	    JLabel registro = new JLabel();
		registro.setIcon(new ImageIcon(getClass().getResource("register.png")));
		registro.setBounds(918, 0, 128, 128);
		panel_1.add(registro);
		
		JButton btnPanelDocente = new JButton();
	    btnPanelDocente.setBorderPainted(false);
	    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelDocente.setText("Panel Docente");
	    btnPanelDocente.setBackground(new Color(250, 128, 114));
	    btnPanelDocente.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelDocente);
	    
	    btnPanelDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnCrearDocente = new JButton();
	    btnCrearDocente.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnCrearDocente.setText("Crear Docente");
	    btnCrearDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnCrearDocente.setBorderPainted(false);
	    btnCrearDocente.setBackground(new Color(250, 128, 114));
	    btnCrearDocente.setBounds(543, 35, 365, 58);
	    panel_1.add(btnCrearDocente);
	    
	    btnCrearDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nombre = textFieldNombre.getText();
        		String apellidoP =textFieldApPaterno.getText();
        		String apellidoM = textFieldApMaterno.getText();      	
		    	
		    	if(nombre.length()>0) {
		    		textFieldNombre.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoP.length()>0) {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoM.length()>0) {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	
		    	if(nombre.length()>0 && apellidoP.length()>0 && apellidoM.length()>0)
		    	{
		    		JOptionPane.showMessageDialog(null, "Docente creado correctamente");
		    		getContentPane().removeAll();
			        docenteCreado();
			        getContentPane().revalidate();
			        getContentPane().repaint();
		    	}
		    
			}
	    	
	    });
		
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 250, 240));
	    panel_2.setBounds(732, 179, 274, 314);
	    crearDoce.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(39, 51, 205, 204);
	    panel_2.add(panelFoto);
	    panelFoto.setLayout(null);
	    
	    JLabel cargarFoto = new JLabel();
	    cargarFoto.setBounds(37, 40, 128, 128);
	    panelFoto.add(cargarFoto);
		cargarFoto.setIcon(new ImageIcon(getClass().getResource("upload.png")));
	    
	    JLabel lbl_ImagenDocente = new JLabel("Imagen Docente");
	    lbl_ImagenDocente.setBounds(76, 18, 144, 23);
	    panel_2.add(lbl_ImagenDocente);
	    lbl_ImagenDocente.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    
	    JButton btnEliminar = new JButton("Eliminar");
	    btnEliminar.setBounds(159, 265, 85, 40);
	    panel_2.add(btnEliminar);
	    
	    JButton btnAgregar = new JButton("Agregar");
	    btnAgregar.setBounds(39, 265, 85, 40);
	    panel_2.add(btnAgregar);
	    
	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(10, 137, 632, 28);
	    crearDoce.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Información General");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblDatosBasicos.setBounds(48, 7, 201, 14);
	    pnlDatosBasicos.add(lblDatosBasicos);
	    
	    JLabel lblNombre = new JLabel("Nombre");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(63, 175, 124, 28);
	    crearDoce.add(lblNombre);
	    
	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(243, 182, 399, 19);
	    crearDoce.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JLabel lblApPaterno = new JLabel("Apellido Paterno");
	    lblApPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApPaterno.setBounds(63, 213, 124, 19);
	    crearDoce.add(lblApPaterno);
	    
	    textFieldApPaterno = new JTextField();
	    textFieldApPaterno.setColumns(10);
	    textFieldApPaterno.setBounds(243, 211, 399, 19);
	    crearDoce.add(textFieldApPaterno);
	    
	    JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
	    lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoMaterno.setBounds(63, 242, 124, 19);
	    crearDoce.add(lblApellidoMaterno);
	    
	    textFieldApMaterno = new JTextField();
	    textFieldApMaterno.setColumns(10);
	    textFieldApMaterno.setBounds(243, 240, 399, 19);
	    crearDoce.add(textFieldApMaterno);
	    
	    JLabel lblGenero = new JLabel("Género");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    crearDoce.add(lblGenero);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    comboBoxGeneros = new JComboBox(genero);
	    comboBoxGeneros.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    comboBoxGeneros.setBounds(243, 269, 103, 21);
	    crearDoce.add(comboBoxGeneros);
	    
	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento");
	    lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 152, 19);
	    crearDoce.add(lblLugarNacimiento);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha/Nacimiento");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(356, 269, 124, 21);
	    crearDoce.add(lblFechaNacimiento);
	    
	    String dias[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	    
	    comboBoxDias = new JComboBox(dias);
	    comboBoxDias.setBounds(484, 269, 46, 21);
	    crearDoce.add(comboBoxDias);
	    
	    String meses[] = {"MM","Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
	    
	    comboBoxMes = new JComboBox(meses);
	    comboBoxMes.setBounds(540, 269, 46, 21);
	    crearDoce.add(comboBoxMes);
	    
	    String año[] = {"YY","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961",
	    		"1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974",
	    		"1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
	    		"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
	    		"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
	    		"2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	    
	    comboBoxAnio = new JComboBox(año);
	    comboBoxAnio.setBounds(596, 269, 46, 21);
	    crearDoce.add(comboBoxAnio);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 329, 139, 19);
	    crearDoce.add(lblNacionalidad);
	    
	    String nacionalidad[] = {"Mexicana","Peruana","Venezolana","Colombiana"};	     
	    comboBoxNacionalidad = new JComboBox(nacionalidad);
	    comboBoxNacionalidad.setBounds(243, 327, 399, 21);
	    crearDoce.add(comboBoxNacionalidad);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(63, 358, 139, 19);
	    crearDoce.add(lblCurp);
	    
	    textFieldCurp = new JTextField();
	    textFieldCurp.setColumns(10);
	    textFieldCurp.setBounds(243, 360, 399, 19);
	    crearDoce.add(textFieldCurp);
	    
	    JPanel pnlDatosAdicionales = new JPanel();
	    pnlDatosAdicionales.setLayout(null);
	    pnlDatosAdicionales.setBounds(10, 454, 632, 28);
	    crearDoce.add(pnlDatosAdicionales);
	    
	    JLabel lblDatosAdicionales = new JLabel("Datos Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblDatosAdicionales.setBounds(48, 7, 154, 13);
	    pnlDatosAdicionales.add(lblDatosAdicionales);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(63, 503, 139, 19);
	    crearDoce.add(lblDomicilio);
	    
	    textFieldDomicilio = new JTextField();
	    textFieldDomicilio.setColumns(10);
	    textFieldDomicilio.setBounds(243, 505, 399, 19);
	    crearDoce.add(textFieldDomicilio);
	    
	    JLabel lblEntreCalles = new JLabel("Entre Calles");
	    lblEntreCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles.setBounds(63, 532, 90, 19);
	    crearDoce.add(lblEntreCalles);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(243, 534, 399, 19);
	    crearDoce.add(textField_2);
	    
	    JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
	    lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreoElectronico.setBounds(63, 387, 139, 19);
	    crearDoce.add(lblCorreoElectronico);
	    
	    textFieldCorreo = new JTextField();
	    textFieldCorreo.setColumns(10);
	    textFieldCorreo.setBounds(243, 389, 399, 19);
	    crearDoce.add(textFieldCorreo);
	    
	    JLabel lblTelefono = new JLabel("Teléfono");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(63, 416, 109, 28);
	    crearDoce.add(lblTelefono);
	    
	    String telefono[] = {"Particular","Teléfono Celular"};
	    
	    comboBox_1 = new JComboBox(telefono);
	    comboBox_1.setBounds(243, 418, 144, 21);
	    crearDoce.add(comboBox_1);
	    
	    textFieldTelefono = new JTextField();
	    textFieldTelefono.setColumns(10);
	    textFieldTelefono.setBounds(397, 418, 245, 19);
	    crearDoce.add(textFieldTelefono);
	    
	    JPanel pnlEscolaridad = new JPanel();
	    pnlEscolaridad.setLayout(null);
	    pnlEscolaridad.setBounds(10, 590, 632, 28);
	    crearDoce.add(pnlEscolaridad);
	    
	    JLabel lblEscolaridad = new JLabel("Escolaridad");
	    lblEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblEscolaridad.setBounds(48, 7, 154, 13);
	    pnlEscolaridad.add(lblEscolaridad);
	    
	    JLabel lblCodigoPostal = new JLabel("Codigo Postal");
	    lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal.setBounds(63, 561, 90, 19);
	    crearDoce.add(lblCodigoPostal);
	    
	    textFieldCP = new JTextField();
	    textFieldCP.setColumns(10);
	    textFieldCP.setBounds(243, 563, 399, 19);
	    crearDoce.add(textFieldCP);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(63, 628, 139, 19);
	    crearDoce.add(lblNivelEducativo);
	    
	    String escolaridad[] = {"Primaria","Secundaria","Preparatoria"};
	    
	    comboBoxEscolaridad = new JComboBox(escolaridad);
	    comboBoxEscolaridad.setBounds(243, 628, 144, 21);
	    crearDoce.add(comboBoxEscolaridad);
	    
	    JLabel lblMatricula = new JLabel("Matricula");
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(63, 657, 139, 19);
	    crearDoce.add(lblMatricula);
	    
	    textFieldMatricula = new JTextField();
	    textFieldMatricula.setColumns(10);
	    textFieldMatricula.setBounds(243, 659, 399, 19);
	    crearDoce.add(textFieldMatricula);
	    
	    JLabel lblStatusActual = new JLabel("Status actual");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(397, 628, 139, 19);
	    crearDoce.add(lblStatusActual);
	    
	    String status[] = {"Activo","Innactivo"};
	    
	    comboBoxStatus = new JComboBox(status);
	    comboBoxStatus.setBounds(496, 628, 146, 21);
	    crearDoce.add(comboBoxStatus);
	    
	    JButton btnCrearPerfil = new JButton("Crear Perfil");
	    btnCrearPerfil.setBounds(882, 628, 124, 51);
	    crearDoce.add(btnCrearPerfil);
	    
	    btnCrearPerfil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nombre = textFieldNombre.getText();
        		String apellidoP =textFieldApPaterno.getText();
        		String apellidoM = textFieldApMaterno.getText();      	
		    	
		    	if(nombre.length()>0) {
		    		textFieldNombre.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoP.length()>0) {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoM.length()>0) {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	
		    	if(nombre.length()>0 && apellidoP.length()>0 && apellidoM.length()>0)
		    	{
		    		getContentPane().removeAll();
			        docenteCreado();
			        getContentPane().revalidate();
			        getContentPane().repaint();
		    	}
		    
			}
	    	
	    });
	    
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(732, 629, 124, 51);
	    crearDoce.add(btnRegresar);
	    
	    btnRegresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint();
			}
	    	
	    });
	    
	    textFieldNacimiento = new JTextField();
	    textFieldNacimiento.setColumns(10);
	    textFieldNacimiento.setBounds(243, 300, 399, 19);
	    crearDoce.add(textFieldNacimiento);
	  
	}
	
	public void docenteCreado() {
		menuDocentes();
	    JPanel docenteCreado = new JPanel();
	    docenteCreado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(docenteCreado);
	    docenteCreado.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    docenteCreado.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(10, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	   
		JButton btnPanelDocente = new JButton();
	    btnPanelDocente.setBorderPainted(false);
	    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelDocente.setText("Panel Docente");
	    btnPanelDocente.setBackground(new Color(250, 128, 114));
	    btnPanelDocente.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelDocente);
	    
	    btnPanelDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	   
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    docenteCreado.add(panelFoto);
	    panelFoto.setLayout(null);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(0, 4, 180, 175);
	    panelFoto.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    docenteCreado.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel(textFieldNombre.getText());
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    docenteCreado.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    docenteCreado.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel(textFieldApPaterno.getText());
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    docenteCreado.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    docenteCreado.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel((String) comboBoxGeneros.getSelectedItem());
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel((String)comboBoxDias.getSelectedItem()+"/"+(String)comboBoxMes.getSelectedItem()+"/"+(String)comboBoxAnio.getSelectedItem());
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel((String) comboBoxNacionalidad.getSelectedItem());
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel(textFieldTelefono.getText());
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    docenteCreado.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Matricula");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel(textFieldDomicilio.getText());
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel(textField_2.getText());
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel(textFieldCP.getText());
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel((String) comboBoxEscolaridad.getSelectedItem());
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel((String) comboBoxStatus.getSelectedItem());
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblMatricula = new JLabel(textFieldMatricula.getText());
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblMatricula);
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    docenteCreado.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel(textFieldApMaterno.getText());
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    docenteCreado.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    docenteCreado.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel(textFieldCorreo.getText());
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    docenteCreado.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(100, 398, 262, 28);
	    docenteCreado.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(668, 181, 262, 28);
	    docenteCreado.add(lblDatosAdicionales);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    docenteCreado.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel(textFieldCurp.getText());
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    docenteCreado.add(lblCurp_1);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(58, 398, 30, 30);
	    docenteCreado.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));

		JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(628, 180, 30, 30);
	    docenteCreado.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));

		JLabel infoEscolar1 = new JLabel();
	    infoEscolar1.setBounds(197, 23, 30, 30);
	    PanelXD.add(infoEscolar1);
	    infoEscolar1.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    		JLabel infoEscolar = new JLabel();
	    		infoEscolar.setBounds(208, 192, 30, 30);
	    		PanelXD.add(infoEscolar);
	    		infoEscolar.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));

	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    docenteCreado.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    docenteCreado.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	}
	
	public void editarDoce() {
		menuDocentes();
	    JPanel editarDoce = new JPanel();
	    editarDoce.setBackground(Color.WHITE);
	    getContentPane().add(editarDoce);
	    editarDoce.setLayout(null);
	   
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    editarDoce.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnPanelDocente = new JButton();
	    btnPanelDocente.setBorderPainted(false);
	    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelDocente.setText("Panel Docente");
	    btnPanelDocente.setBackground(new Color(250, 128, 114));
	    btnPanelDocente.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelDocente);
	    
	    btnPanelDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnEditarDocente = new JButton();
	    btnEditarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnEditarDocente.setText("Editar Docente");
	    btnEditarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnEditarDocente.setBorderPainted(false);
	    btnEditarDocente.setBackground(new Color(250, 128, 114));
	    btnEditarDocente.setBounds(543, 35, 365, 58);
	    panel_1.add(btnEditarDocente);
	    
	    btnEditarDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Información actualizada correctamente");
				
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(0, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	    
	    JLabel eliminarUsuario = new JLabel();
	    eliminarUsuario.setBounds(918, 0, 128, 128);
	    panel_1.add(eliminarUsuario);
	    eliminarUsuario.setIcon(new ImageIcon(getClass().getResource("editarUsuario.png")));
	   
	    JPanel panel = new JPanel();
	    panel.setBounds(30, 145, 1003, 540);
	    editarDoce.add(panel);
	    panel.setLayout(null);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(Color.DARK_GRAY);
	    panel_2.setBounds(0, 0, 1003, 51);
	    panel.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JLabel lblNewLabel_3 = new JLabel("Actualización de datos de docente");
	    lblNewLabel_3.setForeground(Color.WHITE);
	    lblNewLabel_3.setBounds(24, 10, 289, 38);
	    panel_2.add(lblNewLabel_3);
	    lblNewLabel_3.setBackground(new Color(102, 0, 153));
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    
	    JLabel lblNewLabel_4 = new JLabel("Nombre:");
	    lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNewLabel_4.setBounds(90, 83, 68, 19);
	    panel.add(lblNewLabel_4);
	    
	    JTextField textField = new JTextField();
	    textField.setBounds(156, 85, 282, 19);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblApellidos = new JLabel("Apellidos:");
	    lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos.setBounds(90, 124, 68, 19);
	    panel.add(lblApellidos);
	    
	    JTextField textFieldApellidos = new JTextField();
	    textFieldApellidos.setColumns(10);
	    textFieldApellidos.setBounds(156, 126, 282, 19);
	    panel.add(textFieldApellidos);
	    
	    JLabel lblCorreo1 = new JLabel("Correo:");
	    lblCorreo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo1.setBounds(90, 163, 68, 19);
	    panel.add(lblCorreo1);
	    
	    JTextField textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(156, 165, 282, 19);
	    panel.add(textField_1);
	    
	    JLabel lblVisible = new JLabel("Género:");
	    lblVisible.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblVisible.setBounds(96, 204, 62, 19);
	    panel.add(lblVisible);
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setLayout(null);
	    panel_2_1.setBackground(Color.GRAY);
	    panel_2_1.setBounds(0, 489, 1003, 51);
	    panel.add(panel_2_1);
	    
	    JButton btnFinalizar = new JButton("Finalizar");
	    btnFinalizar.setBounds(877, 16, 100, 25);
	    panel_2_1.add(btnFinalizar);
	    
	    btnFinalizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Información actualizada correctamente");
				getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint();
			}
	    	
	    });
	    
	    JLabel lblImgen = new JLabel("Imágen");
	    lblImgen.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblImgen.setBounds(96, 244, 62, 19);
	    panel.add(lblImgen);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(255, 255, 255));
	    panel_3.setBounds(156, 244, 160, 130);
	    panel.add(panel_3);
	    
	    JLabel uploadIcon = new JLabel();
	    panel_3.add(uploadIcon);
	    uploadIcon.setIcon(new ImageIcon(getClass().getResource("upload.png")));
	    
	    JPanel lineaNegra = new JPanel();
	    lineaNegra.setBackground(Color.BLACK);
	    lineaNegra.setBounds(30, 422, 953, 2);
	    panel.add(lineaNegra);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio:");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(550, 83, 68, 19);
	    panel.add(lblDomicilio);
	    
	    JTextField textFieldDomi = new JTextField();
	    textFieldDomi.setColumns(10);
	    textFieldDomi.setBounds(628, 83, 282, 19);
	    panel.add(textFieldDomi);
	    
	    JLabel lblEntreCalles_1 = new JLabel("Entre Calles:");
	    lblEntreCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles_1.setBounds(531, 124, 84, 19);
	    panel.add(lblEntreCalles_1);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    JComboBox comboBoxGenero = new JComboBox(genero);
	    comboBoxGenero.setBounds(156, 205, 282, 21);
	    panel.add(comboBoxGenero);
	    
	    JTextField textFieldCalles = new JTextField();
	    textFieldCalles.setColumns(10);
	    textFieldCalles.setBounds(628, 126, 282, 19);
	    panel.add(textFieldCalles);
	    
	    JLabel lblCP = new JLabel("Código Postal:");
	    lblCP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP.setBounds(521, 163, 94, 19);
	    panel.add(lblCP);
	    
	    JTextField textFieldCp = new JTextField();
	    textFieldCp.setColumns(10);
	    textFieldCp.setBounds(628, 163, 282, 19);
	    panel.add(textFieldCp);
	    
	    JLabel lblTelefono = new JLabel("Teléfono:");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(549, 204, 68, 19);
	    panel.add(lblTelefono);
	    
	    JTextField textFieldTel = new JTextField();
	    textFieldTel.setColumns(10);
	    textFieldTel.setBounds(628, 204, 282, 19);
	    panel.add(textFieldTel);
	    
	    JLabel lblNivelEducativo_2 = new JLabel("Nivel educativo:");
	    lblNivelEducativo_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_2.setBounds(509, 244, 109, 19);
	    panel.add(lblNivelEducativo_2);
	    
	    String escolaridad[] = {"Licenciatura","Ingenieria","Maestria","Doctorado"};
	    
	    JComboBox comboBoxNvlEdu = new JComboBox(escolaridad);
	    comboBoxNvlEdu.setBounds(628, 244, 282, 21);
	    panel.add(comboBoxNvlEdu);
	   
	    JLabel lblStatusActual = new JLabel("Status Actual:");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(509, 284, 109, 19);
	    panel.add(lblStatusActual);
	    
	    String status[] = {"Activo","Innactivo"};
	    
	    JComboBox comboBoxNvlStatus = new JComboBox(status);
	    comboBoxNvlStatus.setBounds(628, 285, 282, 21);
	    panel.add(comboBoxNvlStatus);
	    
	    JLabel lblNewLabel_5 = new JLabel("Solo campos requeridos");
	    lblNewLabel_5.setForeground(Color.GRAY);
	    lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblNewLabel_5.setBounds(30, 434, 198, 24);
	    panel.add(lblNewLabel_5);
	    
	    JLabel lblCargarFoto = new JLabel("Cargar fotografía");
	    lblCargarFoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCargarFoto.setBounds(178, 384, 114, 28);
	    panel.add(lblCargarFoto);
	    
	    
	}

	public void eliminarDoce() {
		menuDocentes();
		JPanel eliminarDocente = new JPanel();
	    eliminarDocente.setBackground(new Color(255, 255, 255));
	    getContentPane().add(eliminarDocente);
	    eliminarDocente.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    eliminarDocente.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnPanelDocente = new JButton();
	    btnPanelDocente.setBorderPainted(false);
	    btnPanelDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnPanelDocente.setText("Panel Docente");
	    btnPanelDocente.setBackground(new Color(250, 128, 114));
	    btnPanelDocente.setBounds(138, 35, 293, 58);
	    panel_1.add(btnPanelDocente);
	    
	    btnPanelDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JButton btnEliminarDocente = new JButton();
	    btnEliminarDocente.setHorizontalAlignment(SwingConstants.RIGHT);
	    btnEliminarDocente.setText("Eliminar Docente");
	    btnEliminarDocente.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 40));
	    btnEliminarDocente.setBorderPainted(false);
	    btnEliminarDocente.setBackground(new Color(250, 128, 114));
	    btnEliminarDocente.setBounds(543, 35, 365, 58);
	    panel_1.add(btnEliminarDocente);
	    
	    btnEliminarDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
				
				getContentPane().removeAll();
				panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
			}
	    	
	    });
	    
	    JLabel docenteIcono = new JLabel();
	    docenteIcono.setBounds(0, 0, 128, 128);
	    panel_1.add(docenteIcono);
	    docenteIcono.setIcon(new ImageIcon(getClass().getResource("docenteIcono.png")));
	    
	    JLabel eliminarUsuario = new JLabel();
	    eliminarUsuario.setBounds(918, 0, 128, 128);
	    panel_1.add(eliminarUsuario);
	    eliminarUsuario.setIcon(new ImageIcon(getClass().getResource("eliminarPerfil.png")));
	    
	    //
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    eliminarDocente.add(panelFoto);
	    
	    JLabel Omar = new JLabel();
	    Omar.setBounds(0, 4, 180, 175);
	    panelFoto.add(Omar);
		Omar.setIcon(new ImageIcon(getClass().getResource("Omar (1).png")));
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    eliminarDocente.add(lblNombre);
	   
	    JLabel lblNombre_1 = new JLabel();
	    lblNombre_1.setText("Juan Alberto");
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    eliminarDocente.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    eliminarDocente.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel();
	    lblApellidoP_1.setText("Martinez");
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    eliminarDocente.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    eliminarDocente.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 68, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Fecha de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 136, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 110, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel();
	    lblGenero_1.setText("Masculino");
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(214, 20, 79, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel();
	    lblLugarNacimiento.setText("10/03/1998");
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(211, 60, 146, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel();
	    lblNacionalidad.setText("Mexicano");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(211, 100, 146, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel();
	    lblTelefono.setText("612 346 4585");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(214, 140, 143, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    eliminarDocente.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel infoEscolar = new JLabel();
	    infoEscolar.setBounds(197, 23, 30, 30);
	    PanelXD.add(infoEscolar);
	    infoEscolar.setIcon(new ImageIcon(getClass().getResource("ubication.png")));
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 177, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Matricula");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel();
	    lblDomicilio.setText("Avenida America, 123");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 190, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel();
	    lblCalles_1.setText("Tormenta y Venidon");
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 156, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel();
	    lblCP_1.setText("12345");
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel();
	    lblNivelEducativo.setText("Licenciatura");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel();
	    lblStatusActual.setText("Activo");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblMatricula = new JLabel();
	    lblMatricula.setText("21324565");
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblMatricula);
	    
	    JLabel infoEscolar2 = new JLabel();
	    infoEscolar2.setBounds(215, 192, 30, 30);
	    PanelXD.add(infoEscolar2);
	    infoEscolar2.setIcon(new ImageIcon(getClass().getResource("escolaridad (1).png")));
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    eliminarDocente.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel();
	    lblApellidoM_1.setText("Gonzalez");
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    eliminarDocente.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    eliminarDocente.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel();
	    lblCorreo_1.setText("juan10@gmail.com");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 153, 28);
	    eliminarDocente.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblInfoGeneral.setBounds(96, 395, 219, 28);
	    eliminarDocente.add(lblInfoGeneral);
	    
	    JLabel infoGral = new JLabel();
	    infoGral.setBounds(56, 395, 30, 30);
	    eliminarDocente.add(infoGral);
		infoGral.setIcon(new ImageIcon(getClass().getResource("infoGral.png")));
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosAdicionales.setBounds(670, 181, 262, 28);
	    eliminarDocente.add(lblDatosAdicionales);
	    
	    JLabel infoAdicional = new JLabel();
	    infoAdicional.setBounds(630, 180, 30, 30);
	    eliminarDocente.add(infoAdicional);
		infoAdicional.setIcon(new ImageIcon(getClass().getResource("infoAdicional.png")));
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 124, 28);
	    eliminarDocente.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel();
	    lblCurp_1.setText("GOMJ850715HDFNZB02");
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 153, 28);
	    eliminarDocente.add(lblCurp_1);
	    
	    JLabel lblDatosPersonales = new JLabel("Datos Personales");
	    lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblDatosPersonales.setBounds(332, 144, 262, 28);
	    eliminarDocente.add(lblDatosPersonales);
	    
	    JLabel datosIcono = new JLabel();
	    datosIcono.setBounds(292, 144, 30, 30);
	    eliminarDocente.add(datosIcono);
	    datosIcono.setIcon(new ImageIcon(getClass().getResource("personalData.png")));
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 204, 102));
	    panel.setBounds(10, 137, 1046, 554);
	    eliminarDocente.add(panel);
	}
	
	public void menuInicio() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);
		
		JMenuItem volverInicio = new JMenuItem("Volver a inicio");
		mnNewMenu.add(volverInicio);
		volverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });

		
		JMenuItem volverPanel = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		
		

        
}
	
	public void menuAlumnos() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Acceso");
		menuBar.add(mnNewMenu);
		
		JMenuItem volverInicio = new JMenuItem("Volver a inicio");
		mnNewMenu.add(volverInicio);
		volverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem volverPanel = new JMenuItem("Volver al panel de alumnos");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                getContentPane().removeAll();
                panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem cerrarSesion = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(cerrarSesion);
		cerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		JMenu alumnos = new JMenu("Alumnos");
		menuBar.add(alumnos);
		
		JMenuItem descargarAlu = new JMenuItem("Descargar informacion\r\n");
		alumnos.add(descargarAlu);
		descargarAlu.addActionListener(new ActionListener() {
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
                alumnoEncontrado();
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
		
}
	
	public void menuDocentes() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem volverInicio = new JMenuItem("Volver a inicio");
		mnNewMenu.add(volverInicio);
		volverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem volverPanel = new JMenuItem("Volver al panel de docentes");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem cerrarSesion = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(cerrarSesion);
		cerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenu alumnos = new JMenu("Docentes");
		menuBar.add(alumnos);
		
		JMenuItem descargaDoce = new JMenuItem("Descargar informacion\r\n");
		alumnos.add(descargaDoce);
		descargaDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                descargarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem consultarDoce = new JMenuItem("Consultar");
		alumnos.add(consultarDoce);
		consultarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                consultarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem crearDoce = new JMenuItem("Crear");
		alumnos.add(crearDoce);
		crearDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                crearDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem editarDoce = new JMenuItem("Editar");
		alumnos.add(editarDoce);
		editarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                editarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		JMenuItem eliminarDoce = new JMenuItem("Eliminar");
		alumnos.add(eliminarDoce);
		eliminarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                eliminarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
	}
}