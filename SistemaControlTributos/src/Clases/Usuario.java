/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author bryleo
 */
public class Usuario extends Persona{
    private Direccion Domicilio;

    public Usuario(Direccion Domicilio, String Nombre, String DNI, String Sexo, Fecha FechaNacimiento) {
        super(Nombre, DNI, Sexo, FechaNacimiento);
        this.Domicilio = Domicilio;
    }

    public Usuario (String Nombre, String DNI)
    {
        super(Nombre, DNI);
    }
    
    public Direccion getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(Direccion Domicilio) {
        this.Domicilio = Domicilio;
    }
    
}
