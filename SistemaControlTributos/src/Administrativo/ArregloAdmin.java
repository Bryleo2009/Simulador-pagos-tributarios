/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Administrativo.Admin;
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
public class ArregloAdmin {
    public ArrayList <Admin> aEsta;
    
     public ArregloAdmin(){
        aEsta=new ArrayList<Admin>();
        cargar();
    }
    
 
     
    public void adicionar(Admin e){
        aEsta.add(e);
        
    }

    public Admin obtener(int pos){
        return aEsta.get(pos);
    }

    public int getTamaño(){
        return aEsta.size();
    }

    public Admin buscar(String nombre){ //para no repetir datos
        for(int i=0;i<aEsta.size();i++){
            if (nombre.equals(aEsta.get(i).getNombre()))
                return aEsta.get(i);
        }
        return null;
    }
    public Admin buscarcontra(String contra){
        for(int i=0;i<aEsta.size();i++){
            if (contra.equals(aEsta.get(i).getContra()))
                return aEsta.get(i);
        }
        return null;
    }

    public void cargar(){
        try{
            File archivo = new File("Clave$.dat");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Clave$.dat"));

                String linea;

                while((linea=br.readLine())!=null){
                     StringTokenizer st=new StringTokenizer(linea,",");
                     String nombre = st.nextToken().trim();
                     String clave = st.nextToken().trim();
                     
                     Admin unadmin = new Admin(nombre, clave);
                     adicionar(unadmin);
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
          PrintWriter pw=new PrintWriter(new FileWriter("Clave$.dat"));
          for(int i=0;i<getTamaño();i++){
            pw.println(
                    obtener(i).getNombre()+","+
                    obtener(i).getContra());
          }
          pw.close();
          JOptionPane.showMessageDialog(null,"Operacion Exitosa");
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Error al leer el archivo","Aviso",JOptionPane.ERROR_MESSAGE);
           }
        }
}
