package Clases;

public class QuintaCategoria {
private double RemuneracionBruta;

	private double IngresoMensual;

	private int MesesFaltantes;

	private double Gratificaciones;

	private double RemuneracionNeta;

	private double Impuesto;

	private double UIT;
        
        private double []RetencionxMes;


    public QuintaCategoria(double IngresoMensual, int MesesFaltantes, double Gratificaciones) {
        this.IngresoMensual = IngresoMensual;
        this.MesesFaltantes = MesesFaltantes;
        this.Gratificaciones = Gratificaciones;
        UIT = 4300;
        RetencionxMes= new double[12];
        CalculoRetencion();
    }

    public void setRemuneracionBruta(double RemuneracionBruta) {
        this.RemuneracionBruta = RemuneracionBruta;
    }

    public void setIngresoMensual(double IngresoMensual) {
        this.IngresoMensual = IngresoMensual;
    }

    public void setMesesFaltantes(int MesesFaltantes) {
        this.MesesFaltantes = MesesFaltantes;
    }

    public void setGratificaciones(double Gratificaciones) {
        this.Gratificaciones = Gratificaciones;
    }

    public void setRemuneracionNeta(double RemuneracionNeta) {
        this.RemuneracionNeta = RemuneracionNeta;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public double getRemuneracionBruta() {
        return RemuneracionBruta;
    }

    public double getIngresoMensual() {
        return IngresoMensual;
    }

    public int getMesesFaltantes() {
        return MesesFaltantes;
    }

    public double getGratificaciones() {
        return Gratificaciones;
    }

    public double getRemuneracionNeta() {
        return RemuneracionNeta;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public double getUIT() {
        return UIT;
    }
    

    //Metodos propios
	public double CalcularRemBruta() {
            this.RemuneracionBruta=(IngresoMensual*MesesFaltantes)+Gratificaciones;
		return RemuneracionBruta;
	}

	public double CalcularRemNeta() {
            this.RemuneracionNeta=CalcularRemBruta()-7*UIT;
            if(RemuneracionNeta<0) RemuneracionNeta=0;
		return RemuneracionNeta;
	}

	public double CalcularImpuesto() {
                CalcularRemNeta();
                if(RemuneracionNeta!=0){
                if(RemuneracionNeta<=(5*UIT)) this.Impuesto=0.08*RemuneracionNeta;
                else if(RemuneracionNeta>(5*UIT)&&RemuneracionNeta<=(20*UIT)) this.Impuesto=0.14*RemuneracionNeta;
                else if(RemuneracionNeta>(20*UIT)&&RemuneracionNeta<=(35*UIT)) this.Impuesto=0.17*RemuneracionNeta;
                else if(RemuneracionNeta>(35*UIT)&&RemuneracionNeta<=(45*UIT)) this.Impuesto=0.20*RemuneracionNeta;
                else if(RemuneracionNeta>(45*UIT))this.Impuesto=0.30*RemuneracionNeta;
                }else{
                    Impuesto=0;
                }
		return Impuesto;
	}
        public double MostrarRetencion(int n){
            return RetencionxMes[n];
        }
	public void CalculoRetencion() {
            double suma=0;
            CalcularImpuesto();
            if (Impuesto!=0){
            for(int i=0;i<12;i++){
                if(i<3)RetencionxMes[i]=Impuesto/12; //En los meses de Enero a marzo, La retencion es el impuesto entre 12
                if(i==3)RetencionxMes[i]=(Impuesto-suma)/9; //En el mes de Abril, es el impuesto - la suma de enero a marzo y todo entre 9
                if(i>3&&i<7)RetencionxMes[i]=(Impuesto-suma)/8;//En los meses de Mayo a Julio, es el impuesto - la suma de enero a abril y todo entre 8
                if(i==7)RetencionxMes[i]=(Impuesto-suma)/5; //En agosto, es el impuesto - la suma de enero a Julio y todo entre 5
                if(i>7&&i<11)RetencionxMes[i]=(Impuesto-suma)/4; //En los meses de Septiembre a Noviembre, es el impuesto - la suma de enero a Agosto y todo entre 4
                if(i==11)RetencionxMes[i]=Impuesto-suma; //En el mes de diciembre es el impuesto - la suma de todos los meses hasta noviembre
                if(i<=3||i==7){ //Se sumara los valores de retencion entre enero a abril y posteriormente el de agosto
                    suma+=RetencionxMes[i];
                }else if(i==6||i==10){ 
                    suma+=RetencionxMes[i]+RetencionxMes[i-1]+RetencionxMes[i-2];
                    /*
                      Debido a que en los meses de Mayo a Julio, y Septiembre a Noviembre, solo se toma en cuenta la suma de los meses anteriores al primero de cada una de estas series,
                     Se sumara recien los valores de estos 3 meses,luego de haber definido el valor del 3ro.
                    */
                }     
                
            }
            }else{
                for(int i=0;i<12;i++) RetencionxMes[i]=0;
            }
	}
}
