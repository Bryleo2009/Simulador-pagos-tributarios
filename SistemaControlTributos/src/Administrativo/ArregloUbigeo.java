/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Administrativo.Ubigeo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author bryleo
 */
public class ArregloUbigeo {
    private ArrayList <Ubigeo> aDepar;
    
     public ArregloUbigeo(){
        aDepar=new ArrayList<Ubigeo>();
        cargar();
    }
    
 
     
    public void adicionar(Ubigeo e){
        aDepar.add(e);
        
    }

    public Ubigeo obtener(int pos){
        return aDepar.get(pos);
    }

    public int getTamaño(){
        return aDepar.size();
    }

    public void cargar(){
        try{
            File archivo = new File("Ubigeo.dat");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Ubigeo.dat"));

                String linea;

                while((linea=br.readLine())!=null){
                     StringTokenizer st=new StringTokenizer(linea,"-");
                     
                     int CodigoDepar_Depar = Integer.parseInt(st.nextToken().trim());
                     String Depar = st.nextToken().trim();
                     int CodigoDepar_Provi = Integer.parseInt(st.nextToken().trim());
                     int CodigoProvi_Provi = Integer.parseInt(st.nextToken().trim());
                     String Provi = st.nextToken().trim();
                     int CodigoDepar_Distri = Integer.parseInt(st.nextToken().trim());
                     int CodigoProvi_Distri = Integer.parseInt(st.nextToken().trim());
                     int CodigoDistri_Distri = Integer.parseInt(st.nextToken().trim());
                     String Distri = st.nextToken().trim();
             
                     Ubigeo undato = new Ubigeo(Depar,CodigoDepar_Depar,Provi,CodigoProvi_Provi,Distri,CodigoDistri_Distri);
                     adicionar(undato);
                }
                br.close();
           } else
             JOptionPane.showMessageDialog(null, "Buscando archivo de Texto");
        } catch(Exception x){
                JOptionPane.showMessageDialog(null, "Se produjo un Error "+x);
          }
    }


}
