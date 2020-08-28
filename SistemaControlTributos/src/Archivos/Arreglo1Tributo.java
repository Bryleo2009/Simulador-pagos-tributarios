/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Fecha; //las 4 importanciones para nuestros atributos
import Clases.PrimeraCategoria;
import Clases.Tributo;
import Clases.Usuario;
import java.io.BufferedReader;//las importanciones para la lectura/escritura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;//Imporatacion para el arraylist
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author bryleo
 */
public class Arreglo1Tributo {
    private ArrayList <Tributo> aTributo;
    
    public Arreglo1Tributo(){
        aTributo=new ArrayList<Tributo>();
        cargar();
    }

    public void adicionar(Tributo e){
        aTributo.add(e);
    }

    public Tributo obtener(int pos){
        return aTributo.get(pos);
    }

   
//    public Tributo buscar(String dni){ //para no repetir datos
//        for(int i=0;i<aTributoTotal.size();i++){
//            if (dni.equals(aTributoTotal.get(i).getContribuyente().getDNI())
//                return aTributoTotal.get(i);
//        }
//        return null;
//    }

    public int getTamaño(){
        return aTributo.size();
    }

    public void eliminar(Tributo e){
        aTributo.remove(e);
    }

    public void cargar(){
        try{
            File archivo = new File("Tributo1.dat");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Tributo1.dat")); //Accedemos al archivo para su lectura

                String linea; //Almacenara de manera temporal cada parte de nuestro codigo

                while((linea=br.readLine())!=null){//Recorre hasta llegar al final del archivo
                    StringTokenizer st=new StringTokenizer(linea,",");//Define linea como todo lo que encuentra hasta llegar a una coma
                                       
                    String nombreContri = st.nextToken().trim(); //Define nuestra variable con lo almacenado en linea hasta la primera coma
                    String dniContri = st.nextToken().trim();//Define nuestra variable con lo que sigue de la primera coma hasta la siguiente
                    double impuesto1=Double.parseDouble(st.nextToken().trim()); //Repite lo de arriba pero en esta caso se convierte a double
                    double renta1=Double.parseDouble(st.nextToken().trim());

                    int diaEmi = Integer.parseInt(st.nextToken().trim());
                    int mesEmi = Integer.parseInt(st.nextToken().trim());
                    int anioEmi = Integer.parseInt(st.nextToken().trim());
                    
                    PrimeraCategoria categoria1 = new PrimeraCategoria(renta1);
                    
                    Usuario unUsuario = new Usuario(nombreContri, dniContri);
                    Fecha unaFechaEmi = new Fecha(diaEmi, mesEmi, anioEmi);
                    Tributo x = new Tributo(unUsuario, unaFechaEmi);
                    
                    
                    
                    x.setContribuyente(unUsuario);
                    x.setFechaEmision(unaFechaEmi);
                    x.setCategoria1(categoria1);
 
                     adicionar(x);
                }
                br.close();
           } else
             JOptionPane.showMessageDialog(null, "Buscando archivo de Texto");
        } catch(Exception x){
                JOptionPane.showMessageDialog(null, "Se produjo un Error "+x);
          }
    }

    public void grabar(){
       try{
          PrintWriter pw=new PrintWriter(new FileWriter("Tributo1.dat"));//Accede al archivo de texto para escribir en el
          for(int i=0;i<getTamaño();i++){//un for que repetira la cantidad de veces igual al tamaño del arraylist
            pw.println( //Escribe en nuestro archivo 

                    obtener(i).getContribuyente().getNombre()+","+
                    obtener(i).getContribuyente().getDNI()+","+
                    obtener(i).getCategoria1().getImpuestoMensual()+","+
                    obtener(i).getCategoria1().getRenta()+","+

                    obtener(i).getFechaEmision().getDia()+","+
                    obtener(i).getFechaEmision().getMes()+","+
                    obtener(i).getFechaEmision().getAnio()
            );
            
          }
          pw.close(); //Cerramos el archivo
          JOptionPane.showMessageDialog(null,"Operacion Exitosa");
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Error al leer el archivo","Aviso",JOptionPane.ERROR_MESSAGE);
           }
        }
}
