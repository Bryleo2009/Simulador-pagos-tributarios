package Clases;

import java.util.Date;

public class Persona {

	private String Nombre;

	private int Edad;

	private String DNI;

	private String Sexo;

	private Fecha FechaNacimiento;


    public Persona(String Nombre, String DNI, String Sexo, Fecha FechaNacimiento) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.FechaNacimiento = FechaNacimiento;
        Edad=CalculoEdad(FechaNacimiento);
    }
    public Persona (String Nombre, String DNI)
    {
        this.Nombre = Nombre;
        this.DNI = DNI;
    }

        
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Fecha getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Fecha FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    public int CalculoEdad(Fecha FechaNacimiento){
	if (FechaNacimiento.getMes() <7 || FechaNacimiento.getMes() == 7 && FechaNacimiento.getDia() <= 7) return 2020 - FechaNacimiento.getAnio();
	else return 2019 - FechaNacimiento.getAnio();
    }
	

}
