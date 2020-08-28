package Clases;

public class DatosLaborales {

	private String NombreComercial;

	private String ActividadEconomica;

	private String Oficio;

	private String Telefono;

	private String Celular;

	private String Correo;

    public DatosLaborales(String NombreComercial, String ActividadEconomica, String Oficio, String Telefono, String Celular, String Correo) {
        this.NombreComercial = NombreComercial;
        this.ActividadEconomica = ActividadEconomica;
        this.Oficio = Oficio;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Correo = Correo;
    }

    public String getNombreComercial() {
        return NombreComercial;
    }

    public void setNombreComercial(String NombreComercial) {
        this.NombreComercial = NombreComercial;
    }

    public String getActividadEconomica() {
        return ActividadEconomica;
    }

    public void setActividadEconomica(String ActividadEconomica) {
        this.ActividadEconomica = ActividadEconomica;
    }

    public String getOficio() {
        return Oficio;
    }

    public void setOficio(String Oficio) {
        this.Oficio = Oficio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
