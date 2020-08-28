package Clases;

public class TerceraCategoria {

	private double RentaBruta;

	private double IngresosBrutos;

	private double CostoComputable;

	private double RentaNeta;

	private double Gastos;

	private double OtrosIngresos;

	private double RentaNetaImponible;

	private double Adiciones;

	private double Deducciones;

	private double PerdidasTributarias;

	private double Impuesto;
        
        private int TipoPersona;

    public TerceraCategoria(double IngresosBrutos, double CostoComputable, double Gastos, double OtrosIngresos, double Adiciones, double Deducciones, double PerdidasTributarias,int TipoPersona) {
        this.IngresosBrutos = IngresosBrutos;
        this.CostoComputable = CostoComputable;
        this.Gastos = Gastos;
        this.OtrosIngresos = OtrosIngresos;
        this.Adiciones = Adiciones;
        this.Deducciones = Deducciones;
        this.PerdidasTributarias = PerdidasTributarias;
        this.TipoPersona=TipoPersona;
        Impuesto=CalculoImpuesto();
    }

    public void setRentaBruta(double RentaBruta) {
        this.RentaBruta = RentaBruta;
    }

    public void setIngresosBrutos(double IngresosBrutos) {
        this.IngresosBrutos = IngresosBrutos;
    }

    public void setCostoComputable(double CostoComputable) {
        this.CostoComputable = CostoComputable;
    }

    public void setRentaNeta(double RentaNeta) {
        this.RentaNeta = RentaNeta;
    }

    public void setGastos(double Gastos) {
        this.Gastos = Gastos;
    }

    public void setOtrosIngresos(double OtrosIngresos) {
        this.OtrosIngresos = OtrosIngresos;
    }

    public void setRentaNetaImponible(double RentaNetaImponible) {
        this.RentaNetaImponible = RentaNetaImponible;
    }

    public void setAdiciones(double Adiciones) {
        this.Adiciones = Adiciones;
    }

    public void setDeducciones(double Deducciones) {
        this.Deducciones = Deducciones;
    }

    public void setPerdidasTributarias(double PerdidasTributarias) {
        this.PerdidasTributarias = PerdidasTributarias;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public void setTipoPersona(int TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
    
    public double getRentaBruta() {
        return RentaBruta;
    }

    public double getIngresosBrutos() {
        return IngresosBrutos;
    }

    public double getCostoComputable() {
        return CostoComputable;
    }

    public double getRentaNeta() {
        return RentaNeta;
    }

    public double getGastos() {
        return Gastos;
    }

    public double getOtrosIngresos() {
        return OtrosIngresos;
    }

    public double getRentaNetaImponible() {
        return RentaNetaImponible;
    }

    public double getAdiciones() {
        return Adiciones;
    }

    public double getDeducciones() {
        return Deducciones;
    }

    public double getPerdidasTributarias() {
        return PerdidasTributarias;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public int getTipoPersona() {
        return TipoPersona;
    }
        
        
	public double CalculoRentaBruta() {
                this.RentaBruta=IngresosBrutos-CostoComputable;
                if(RentaBruta<0)RentaBruta=0;
		return RentaBruta;
	}

	public double CalculoRentaNeta() {
                this.RentaNeta=CalculoRentaBruta()-Gastos+OtrosIngresos;
                if(RentaNeta<0)RentaNeta=0;
		return RentaNeta;
	}

	public double CalculoRentaNetaImponible() {
                this.RentaNetaImponible=CalculoRentaNeta()+Adiciones-Deducciones-PerdidasTributarias;
                if(RentaNetaImponible<0)RentaNetaImponible=0;
		return RentaNetaImponible;
	}
	public double CalculoImpuesto() {
		if(TipoPersona==0) return 0.295*CalculoRentaNeta();
                else return 0.345*CalculoRentaNeta();
	}
        public String NombreTipo(){
            if(TipoPersona==0) return "No Juridica";
            else return "Juridica";
        }

}
