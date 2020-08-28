package Clases;


public class PrimeraCategoria {

private double ImpuestoMensual;
private double Renta;

    public PrimeraCategoria(double Renta) {
        this.Renta = Renta;
        ImpuestoMensual=CalculoImpuesto();
    }
    
    
    public void setImpuestoMensual(double ImpuestoMensual) {
        this.ImpuestoMensual = ImpuestoMensual;
    }

    public void setRenta(double Renta) {
        this.Renta = Renta;
    }

    public double getImpuestoMensual() {
        return ImpuestoMensual;
    }

    public double getRenta() {
        return Renta;
    }
    //Metodos Propios
	public double CalculoImpuesto() {
            this.ImpuestoMensual=0.05*Renta;
		return 0.05*Renta;
	}
}
