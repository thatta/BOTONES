/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    private JPanel panelImagen;
    private JTextField Filas;
    private JTextField  Columnas;
    private JButton Crear;
    private JLabel leeFilas;
    private JLabel leeColumnas;
    private JPanel panel;
    
    
    public VentanaPrincipal() {
      
        
        //JToolBar permite que lo arrastremos 
        //con el ratón para colocarlo en otra parte 
        //de la ventana de nuestra aplicación o incluso 
        //que quede flotando en una ventana propia.
        
        JToolBar barra = new JToolBar();
                
	leeFilas = new JLabel();//  Crea el especaio para escribir la cadena de caracteres
	leeColumnas= new JLabel();
	Filas = new JTextField(); // texto de la cadena la cadea
	Columnas = new JTextField(); // texto de la cadena de caracteres
		
	panel = new JPanel( null );
        setSize(400, 280);
        setTitle("Cambio De Color Botones");
        setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        getContentPane().setLayout(new BorderLayout());
                
                
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        leeFilas.setText("Filas");
	barra.add(leeFilas);
	Filas.setPreferredSize(new Dimension(50, 5));// tamaño del espacio para poder escribir
	barra.add(Filas);

        leeColumnas.setText("Columnas");
	barra.add(leeColumnas);

	Columnas.setPreferredSize(new Dimension(50, 5));// tamaño del espacio para poder escribir
	barra.add(Columnas);
	Crear = new JButton("CREAR");
	Crear.addActionListener(this);
        barra.add(Crear);
	this.add(barra, BorderLayout.PAGE_END);//Colocamos el JToolBar en la parte de abajo del JFrame
        this.add(panel, BorderLayout.CENTER);// agrega el panel a boton
        this.setSize(700, 700); //tamaño de la pantalla
	this.setLocationRelativeTo(null);//Permite que la ventana se coloque al centro de la pantalla
        setVisible(true);

    }
    
    public void actionPerformed( ActionEvent evt ) {
        String f = Filas.getText();// obtiene la cantidad de filas a crear como una cadena de caracter
        String c = Columnas.getText(); // obtiene la cantidad de columnas a crear como una cadena de caracter
        int filas = Integer.parseInt(f);// cambia de cadena de caracteres a numeros
        int columnas = Integer.parseInt(c);
        panel.removeAll();//Elimina los anteriores botones
        Boton [][] botones = new Boton[ filas ][ columnas ];//crea una matriz de botones segun las filas y columnas entrantes
        //Se recorren las filas
        for( int fila = 0 ; fila < filas; fila++ ){//Estando en la fila se recorre las columnas
            for( int columna = 0 ; columna < columnas; columna++ ){ //crea el boton y se agrega a las celda de la matriz
                botones[fila][columna] = new Boton( 90 * columna, 20 * fila, 90, 20 );
                panel.add( botones[fila][columna] );
            }
        }
	panel.updateUI();//actualiza el panel para que se vean los botones
            
    }      
}
