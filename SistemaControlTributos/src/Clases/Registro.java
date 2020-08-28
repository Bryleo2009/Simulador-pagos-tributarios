package Clases;


public class Registro {

	private Usuario DatosUsuario;

	private int categoria;

	private Fecha fechaRegistro;

	private boolean estadoContribucion;

	private String RUC;

	private String ClaveSOL;

	private DatosLaborales Loborales;
        
        public static Registro unregistro; //esto se usará para guardar datos temporales y mostrar en diversos formularios como variable global

    public Registro( Usuario DatosUsuario, int categoria, Fecha fechaRegistro, DatosLaborales Loborales) {
   
        this.DatosUsuario = DatosUsuario;
        this.categoria = categoria;
        this.fechaRegistro = fechaRegistro;
        this.Loborales = Loborales;
        RUC=GenerarRUC();
        ClaveSOL=GenerarSOL();
        estadoContribucion = true;
    }
 
    public Usuario getUsuario() {
        return DatosUsuario;
    }

    public void setUsuario(Usuario DatosUsuario) {
        this.DatosUsuario = DatosUsuario;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Fecha getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Fecha fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getEstadoContribucion() {
        return estadoContribucion;
    }

    public void setEstadoContribucion(boolean estadoContribucion) {
        this.estadoContribucion = estadoContribucion;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getClaveSOL() {
        return ClaveSOL;
    }

    public void setClaveSOL(String ClaveSOL) {
        this.ClaveSOL = ClaveSOL;
    }

    public DatosLaborales getLoborales() {
        return Loborales;
    }

    public void setLoborales(DatosLaborales Loborales) {
        this.Loborales = Loborales;
    }

	private int aleatorio(int min, int max) {
		return (int)((max - min + 1) * Math.random()) + min;
	}

	public String GenerarRUC() {
		return aleatorio(10, 99)+DatosUsuario.getDNI()+aleatorio(0, 9);
	}

	public String GenerarSOL() {
		return aleatorio(1,10)+DatosUsuario.getNombre().substring(0, 1)+aleatorio(11,19)+"B"+aleatorio(100, 999);
	}   
        
        
        

}
