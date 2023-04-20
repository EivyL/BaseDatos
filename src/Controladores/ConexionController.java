/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Conexion;
import Vistas.frmLogin;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eivyr
 */
public class ConexionController implements ActionListener {
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    Conexion ModeloConexion;
    
    //Levantar la vista principal 

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal, Conexion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        //poner a la escucha el boton aceptar 
        this.VistaLogin.btnAceptar.addActionListener(this);
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource () == this.VistaLogin.btnAceptar){
            this.ModeloConexion.Conectar(this.VistaLogin.btnAceptar.getText(),
                    this.VistaLogin.txtUser.getText());
        }

    }  
    
}
