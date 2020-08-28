/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.CuartaCategoria;
import Clases.Fecha;
import Clases.Tributo;
import Clases.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author bryleo
 */
public class Arreglo4Tributo {
    private ArrayList <Tributo> aTributo;
    
    public Arreglo4Tributo(){
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
            File archivo = new File("Tributo4.dat");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Tributo4.dat"));

                String linea;

                while((linea=br.readLine())!=null){
                     StringTokenizer st=new StringTokenizer(linea,",");
                                       
                    String nombreContri = st.nextToken().trim();
                    String dniContri = st.nextToken().trim();
                    double impuesto4=Double.parseDouble(st.nextToken().trim());                   
                    
                    double monto4=Double.parseDouble(st.nextToken().trim());
                    
                    int diaEmi = Integer.parseInt(st.nextToken().trim());
                    int mesEmi = Integer.parseInt(st.nextToken().trim());
                    int anioEmi = Integer.parseInt(st.nextToken().trim());
                   
                    CuartaCategoria categoria4= new CuartaCategoria(monto4);

                    
                    Usuario unUsuario = new Usuario(nombreContri, dniContri);
                    Fecha unaFechaEmi = new Fecha(diaEmi, mesEmi, anioEmi);
                    Tributo x = new Tributo(unUsuario, unaFechaEmi);  
                    x.setContribuyente(unUsuario);
                    x.setFechaEmision(unaFechaEmi);

                    x.setCategoria4(categoria4);

 
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
          PrintWriter pw=new PrintWriter(new FileWriter("Tributo4.dat"));
          for(int i=0;i<getTamaño();i++){
            pw.println(

                    obtener(i).getContribuyente().getNombre()+","+
                    obtener(i).getContribuyente().getDNI()+","+
                    obtener(i).getCategoria4().getImpuesto()+","+            
                    obtener(i).getCategoria4().getMontoDeHonorarios()+","+

                    obtener(i).getFechaEmision().getDia()+","+
                    obtener(i).getFechaEmision().getMes()+","+
                    obtener(i).getFechaEmision().getAnio()
            );
            
          }
          pw.close();
          JOptionPane.showMessageDialog(null,"Operacion Exitosa");
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Error al leer el archivo","Aviso",JOptionPane.ERROR_MESSAGE);
           }
        }
}
