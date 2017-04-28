/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class PanelImagen extends JPanel{
    
    private JLabel etiquetaImagen;
    private VentanaPrincipal ventana;
    private JLabel nombre;
    private JLabel carrera;
    
    public PanelImagen() {
        this.ventana= ventana;
        FlowLayout layout = new  FlowLayout(FlowLayout.LEFT);
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        setBackground(Color.white);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/escudo.JPG");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        add(etiquetaImagen);
        nombre = new JLabel("Tatiana Almansa   Juan David Ojeda ");
        add(nombre);
        carrera = new JLabel("     Ingeneria De Sistemas");
        add(carrera);  
}
    
}
