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
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApPaterno;
	private JTextField textField;
	private JTextField textFieldCurp;
	private JTextField textFieldDomicilio;
	private JTextField textField_2;
	private JTextField textFieldCorreo;
	private JTextField textFieldTelefono;
	private JTextField textFieldCP;
	private JTextField textFieldMatricula;
	private JTextField textFieldNacimiento;

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
	    setSize(1080, 760);
	    
	    probarComponentes();

	}
	
	public void probarComponentes() {
		this.crearDoce();
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
	
	public void descargarAlu() {
		menu();
		JPanel consultarAlu = new JPanel();
		consultarAlu.setBackground(Color.GREEN);
		getContentPane().add(consultarAlu);
		
		JLabel lblNewLabel = new JLabel("Descargar");
		consultarAlu.add(lblNewLabel);
		
		
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
		crearAlu.setBackground(Color.RED);
		getContentPane().add(crearAlu);
		
		
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
	    crearDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearDoce);
	    crearDoce.setLayout(null);
	    
	    JLabel lbl_altaDocente = new JLabel("Alta de docentes");
	    lbl_altaDocente.setForeground(new Color(65, 105, 225));
	    lbl_altaDocente.setBounds(33, 34, 182, 25);
	    lbl_altaDocente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    crearDoce.add(lbl_altaDocente);
	    
	    JLabel lblNewLabel_1 = new JLabel("1.- Registrar información básica de docente");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel_1.setBounds(286, 51, 459, 25);
	    crearDoce.add(lblNewLabel_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearDoce.add(panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 250, 240));
	    panel_2.setBounds(732, 179, 274, 314);
	    crearDoce.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(39, 51, 205, 204);
	    panel_2.add(panel);
	    
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
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(48, 7, 154, 14);
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
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    textField.setBounds(243, 240, 399, 19);
	    crearDoce.add(textField);
	    
	    JLabel lblGenero = new JLabel("Género");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    crearDoce.add(lblGenero);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    JComboBox comboBoxGeneros = new JComboBox(genero);
	    comboBoxGeneros.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    comboBoxGeneros.setBounds(243, 269, 103, 21);
	    crearDoce.add(comboBoxGeneros);
	    
	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento");
	    lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 139, 19);
	    crearDoce.add(lblLugarNacimiento);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha/Nacimiento");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(356, 269, 124, 21);
	    crearDoce.add(lblFechaNacimiento);
	    
	    String dias[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	    
	    JComboBox comboBoxDias = new JComboBox(dias);
	    comboBoxDias.setBounds(484, 269, 46, 21);
	    crearDoce.add(comboBoxDias);
	    
	    String meses[] = {"MM","Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
	    
	    JComboBox comboBoxMes = new JComboBox(meses);
	    comboBoxMes.setBounds(540, 269, 46, 21);
	    crearDoce.add(comboBoxMes);
	    
	    String año[] = {"YY","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961",
	    		"1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974",
	    		"1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
	    		"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
	    		"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
	    		"2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	    
	    JComboBox comboBoxAnio = new JComboBox(año);
	    comboBoxAnio.setBounds(596, 269, 46, 21);
	    crearDoce.add(comboBoxAnio);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 329, 139, 19);
	    crearDoce.add(lblNacionalidad);
	    
	    String nacionalidad[] = {};	    
	    JComboBox comboBoxNacionalidad = new JComboBox();
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
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 17));
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
	    
	    JComboBox comboBox_1 = new JComboBox(telefono);
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
	    lblEscolaridad.setFont(new Font("Tahoma", Font.PLAIN, 17));
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
	    
	    String escolaridad[] = {"Licenciatura","Ingenieria","Maestria","Doctorado"};
	    
	    JComboBox comboBoxEscolaridad = new JComboBox(escolaridad);
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
	    
	    JComboBox comboBoxStatus = new JComboBox(status);
	    comboBoxStatus.setBounds(496, 628, 146, 21);
	    crearDoce.add(comboBoxStatus);
	    
	    JButton btnCrearDocente = new JButton("Crear Perfil");
	    btnCrearDocente.setBounds(882, 628, 124, 51);
	    crearDoce.add(btnCrearDocente);
	    
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(732, 629, 124, 51);
	    crearDoce.add(btnRegresar);
	    
	    textFieldNacimiento = new JTextField();
	    textFieldNacimiento.setColumns(10);
	    textFieldNacimiento.setBounds(243, 300, 399, 19);
	    crearDoce.add(textFieldNacimiento);
	    
	  
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
}

	