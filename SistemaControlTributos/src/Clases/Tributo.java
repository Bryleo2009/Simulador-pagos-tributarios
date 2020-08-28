package Clases;

public class Tributo {

	private Usuario Contribuyente;

	private Fecha FechaEmision;

	private PrimeraCategoria categoria1;

	private SegundaCategoria categoria2;

	private TerceraCategoria categoria3;

	private CuartaCategoria categoria4;

	private QuintaCategoria categoria5;

        public Tributo(Usuario Contribuyente, Fecha FechaEmision) {
            this.Contribuyente = Contribuyente;
            this.FechaEmision = FechaEmision;
        }

        public Persona getContribuyente() {
            return Contribuyente;
        }

        public Fecha getFechaEmision() {
            return FechaEmision;
        }

        public PrimeraCategoria getCategoria1() {
            return categoria1;
        }

        public SegundaCategoria getCategoria2() {
            return categoria2;
        }

        public TerceraCategoria getCategoria3() {
            return categoria3;
        }

        public CuartaCategoria getCategoria4() {
            return categoria4;
        }

        public QuintaCategoria getCategoria5() {
            return categoria5;
        }

    public void setContribuyente(Usuario Contribuyente) {
        this.Contribuyente = Contribuyente;
    }

    public void setFechaEmision(Fecha FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public void setCategoria1(PrimeraCategoria categoria1) {
        this.categoria1 = categoria1;
    }

    public void setCategoria2(SegundaCategoria categoria2) {
        this.categoria2 = categoria2;
    }

    public void setCategoria3(TerceraCategoria categoria3) {
        this.categoria3 = categoria3;
    }

    public void setCategoria4(CuartaCategoria categoria4) {
        this.categoria4 = categoria4;
    }

    public void setCategoria5(QuintaCategoria categoria5) {
        this.categoria5 = categoria5;
    }
        
        

}
