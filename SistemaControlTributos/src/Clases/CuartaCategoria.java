package Clases;

public class CuartaCategoria {

	private double MontoDeHonorarios;

	private double Impuesto;

    public CuartaCategoria(double MontoDeHonorarios) {
        this.MontoDeHonorarios = MontoDeHonorarios;
    }

    public void setMontoDeHonorarios(double MontoDeHonorarios) {
        this.MontoDeHonorarios = MontoDeHonorarios;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public double getMontoDeHonorarios() {
        return MontoDeHonorarios;
    }

    public double getImpuesto() {
        return Impuesto;
    }
    
    public double CalculoImpuesto(){
        this.Impuesto=0.08*MontoDeHonorarios;
        return Impuesto;
    }

    

}
