/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Conexion;
import Modelos.PersonaModel;
import Vistas.frmLogin;
import Vistas.frmPersonas;
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
    frmPersonas VistaPersona;
    PersonaModel ModeloPersona;
    
    //Levantar la vista principal 

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal,
            Conexion ModeloConexion, frmPersonas VistaPersona, PersonaModel ModeloPer) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        this.VistaPersona = VistaPersona;
        this.ModeloPersona = ModeloPer;
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
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(),
                    this.VistaLogin.txtContra.getText());
            
            if(ModeloConexion!=null)
            {
                this.VistaLogin.dispose();
                this.VistaPersona.jButton1.addActionListener(this);
                this.VistaPersona.setLocationRelativeTo(null);
                this.VistaPersona.setVisible(true);
                
            }
            if(e.getSource()==this.VistaPersona.jButton1)
            {
                //mandar a guardar el registro 
                this.ModeloPersona.GuardarPersona(this.VistaPersona.txtApe.getText(),
                        this.VistaPersona.txtNom.getText(),
                        this.VistaPersona.txtTele.getText());
            }
        }

    }  
    
}
