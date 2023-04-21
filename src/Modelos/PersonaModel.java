/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author eivyr
 */
public class PersonaModel {
    String apellidos;
    String nombre;
    int telefono;
    Connection miConexion;

    public PersonaModel(String apellidos, String nombre, int telefono) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PersonaModel() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
     public void GuardarPersona() throws SQLException{
        try{
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values('"+this.getApellidos()+"',"
            + ""+this.getNombre()+"','"+this.getTelefono()+"')" );
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al inseratar Registro"
                    + e.getMessage());
        }
    }
    
}
