/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

/**
 *
 * @author bryleo
 */
public class Ubigeo {
    private String Depar; //Almacena el nombre de departamento
    private int CodigoDepar_Depar; //Almacena el codigo departamental
    private String Provi;//Almacena el nombre de provincia
    
    private int CodigoProvi_Provi; //Almacena el codigo provincial
    private String Distri;
    
    private int CodigoDistri_Distri;

    public Ubigeo(String Depar, int CodigoDepar_Depar, String Provi, int CodigoProvi_Provi, String Distri, int CodigoDistri_Distri) {
        this.Depar = Depar;
        this.CodigoDepar_Depar = CodigoDepar_Depar;
        this.Provi = Provi;
        
        this.CodigoProvi_Provi = CodigoProvi_Provi;
        this.Distri = Distri;
        
        this.CodigoDistri_Distri = CodigoDistri_Distri;
    }

    public String getDepar() {
        return Depar;
    }

    public void setDepar(String Depar) {
        this.Depar = Depar;
    }

    public int getCodigoDepar_Depar() {
        return CodigoDepar_Depar;
    }

    public void setCodigoDepar_Depar(int CodigoDepar_Depar) {
        this.CodigoDepar_Depar = CodigoDepar_Depar;
    }

    public String getProvi() {
        return Provi;
    }

    public void setProvi(String Provi) {
        this.Provi = Provi;
    }


    public int getCodigoProvi_Provi() {
        return CodigoProvi_Provi;
    }

    public void setCodigoProvi_Provi(int CodigoProvi_Provi) {
        this.CodigoProvi_Provi = CodigoProvi_Provi;
    }

    public String getDistri() {
        return Distri;
    }

    public void setDistri(String Distri) {
        this.Distri = Distri;
    }


    public int getCodigoDistri_Distri() {
        return CodigoDistri_Distri;
    }

    public void setCodigoDistri_Distri(int CodigoDistri_Distri) {
        this.CodigoDistri_Distri = CodigoDistri_Distri;
    }


    
}
