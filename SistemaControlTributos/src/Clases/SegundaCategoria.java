package Clases;


public class SegundaCategoria {

	private double IngresoNeto;

	private double CostoComputable;

	private double RentaBruta;

	private double RentaNeta;

	private double RentaNetaImponible;

	private double Perdida;

	private double RentaNetaExtranjera;

	private double ImpuestoAnual;

    public SegundaCategoria(double IngresoNeto, double CostoComputable, double Perdida, double RentaNetaExtranjera) {
        this.IngresoNeto = IngresoNeto;
        this.CostoComputable = CostoComputable;
        this.Perdida = Perdida;
        this.RentaNetaExtranjera = RentaNetaExtranjera;
        ImpuestoAnual=CalculoImpuesto();
    }

    public void setIngresoNeto(double IngresoNeto) {
        this.IngresoNeto = IngresoNeto;
    }

    public void setCostoComputable(double CostoComputable) {
        this.CostoComputable = CostoComputable;
    }

    public void setRentaBruta(double RentaBruta) {
        this.RentaBruta = RentaBruta;
    }

    public void setRentaNeta(double RentaNeta) {
        this.RentaNeta = RentaNeta;
    }

    public void setRentaNetaImponible(double RentaNetaImponible) {
        this.RentaNetaImponible = RentaNetaImponible;
    }

    public void setPerdida(double Perdida) {
        this.Perdida = Perdida;
    }

    public void setRentaNetaExtranjera(double RentaNetaExtranjera) {
        this.RentaNetaExtranjera = RentaNetaExtranjera;
    }

    public void setImpuestoAnual(double ImpuestoAnual) {
        this.ImpuestoAnual = ImpuestoAnual;
    }

    public double getIngresoNeto() {
        return IngresoNeto;
    }

    public double getCostoComputable() {
        return CostoComputable;
    }

    public double getRentaBruta() {
        return RentaBruta;
    }

    public double getRentaNeta() {
        return RentaNeta;
    }

    public double getRentaNetaImponible() {
        return RentaNetaImponible;
    }

    public double getPerdida() {
        return Perdida;
    }

    public double getRentaNetaExtranjera() {
        return RentaNetaExtranjera;
    }

    public double getImpuestoAnual() {
        return ImpuestoAnual;
    }


	public double CalculoRentaBruta() {
            this.RentaBruta=IngresoNeto-CostoComputable;
            if(RentaBruta<0) RentaBruta=0;
		return RentaBruta;
	}

	public double CalculoRentaNeta() {
            this.RentaNeta=0.8*CalculoRentaBruta();
            if(RentaNeta<0) RentaNeta=0;
		return RentaNeta;
	}

	public double CalculoRentaNetaImponible() {
	    this.RentaNetaImponible=CalculoRentaNeta()-Perdida+RentaNetaExtranjera;
            if(RentaNetaImponible<0) RentaNetaImponible=0;
            return RentaNetaImponible;
	}

	public double CalculoImpuesto() {
            this.ImpuestoAnual=0.0625*CalculoRentaNetaImponible();
		return ImpuestoAnual;
	}
}
