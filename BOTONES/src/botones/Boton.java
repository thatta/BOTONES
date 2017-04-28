/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class Boton extends JButton implements ActionListener {     
    
    public Boton( int posx, int posy, int ancho, int alto ){ //Constructor con parametros para posicionar a los botones
        
        setBounds(posx, posy, ancho, alto);//Se coloca el boton en un lugar y se le da un tamanio
        setBackground(java.awt.Color.WHITE);
        
        addActionListener( this );//Se agrega el action listener en este caso la misma clase
    }
  
    // Cambio de color de los botones creados
    public void actionPerformed( ActionEvent e ){
        
        setBackground(Color.GRAY);//Se asigna el color de fondo 
      
    }
}
