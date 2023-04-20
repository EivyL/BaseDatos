
import Controladores.ConexionController;
import Modelos.Conexion;
import Vistas.frmLogin;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eivyr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal, true);
        Conexion nuevaConexion = new Conexion();
        ConexionController ControladorConexion = new ConexionController(VistaLogin, VistaPrincipal,
        nuevaConexion);
    }
    
}
