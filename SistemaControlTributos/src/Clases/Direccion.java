package Clases;

public class Direccion {

	private String Departamento;

	private String Provincia;

	private String Distrito;

	private String Tipo_NombreZona;

	private String Tipo_NombreVia;

	private String Manzana;

	private String Lote;
        
        private int Numero;

    public Direccion(String Departamento, String Provincia, String Distrito, String Tipo_NombreZona, String Tipo_NombreVia, String Manzana, String Lote, int Numero) {
        this.Departamento = Departamento;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.Tipo_NombreZona = Tipo_NombreZona;
        this.Tipo_NombreVia = Tipo_NombreVia;
        this.Manzana = Manzana;
        this.Lote = Lote;
        this.Numero = Numero;
    }
    

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getTipo_NombreZona() {
        return Tipo_NombreZona;
    }

    public void setTipo_NombreZona(String Tipo_NombreZona) {
        this.Tipo_NombreZona = Tipo_NombreZona;
    }

    public String getTipo_NombreVia() {
        return Tipo_NombreVia;
    }

    public void setTipo_NombreVia(String Tipo_NombreVia) {
        this.Tipo_NombreVia = Tipo_NombreVia;
    }

    public String getManzana() {
        return Manzana;
    }

    public void setManzana(String Manzana) {
        this.Manzana = Manzana;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
        
        

}
