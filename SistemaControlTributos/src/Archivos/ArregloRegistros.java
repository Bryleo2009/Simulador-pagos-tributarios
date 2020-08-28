/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.DatosLaborales;
import Clases.Direccion;
import Clases.Fecha;
import Clases.Registro;
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
public class ArregloRegistros {
    private ArrayList <Registro> aRegistro;
    
    public ArregloRegistros(){
        aRegistro=new ArrayList<Registro>();
        cargar();
    }

    public void adicionar(Registro e){
        aRegistro.add(e);
    }

    public Registro obtener(int pos){
        return aRegistro.get(pos);
    }

   
    public Registro buscar(String dni){ //para no repetir datos
        for(int i=0;i<aRegistro.size();i++){
            if (dni.equals(aRegistro.get(i).getUsuario().getDNI())) //Comparamos el dni ingresado como parametro con el dni de cada elemento de nuestro arreglo
                return aRegistro.get(i); //En caso de coincidencia de los DNI devolvemos el Registro con dicho DNI
        }
        return null; //En caso de no encontrar coincidencia devuelve nulo
    }
   
    
    public Registro buscarRucyContra(String ruc, String contra){ //para el login
        for(int i=0;i<aRegistro.size();i++){
            if (ruc.equals(aRegistro.get(i).getRUC())&&contra.equals(aRegistro.get(i).getClaveSOL()))//Comparamos el RUC y contraseña ingresados para encontrar el usuario registrado
                return aRegistro.get(i);
        }
        return null; //En caso la contraseña y usuario no concuerden o no esten en nuestro archivo, se devuelve nulo
    }

    public Registro buscarRuc(String ruc){ //para cambio de contra
        for(int i=0;i<aRegistro.size();i++){
            if (ruc.equals(aRegistro.get(i).getRUC())) //Comparamos el RUC ingresado con el RUC de cada uno de los elementos del arreglo
                return aRegistro.get(i);//En caso de coincidencia devuelve el registro respectivo para modificar la contraseña
        }
        return null;//En caso de no encontrar el RUC devuelve nulo
    }

    public int getTamaño(){
        return aRegistro.size();
    }

    public void eliminar(Registro e){
        aRegistro.remove(e);
    }

    public void cargar(){
        try{
            File archivo = new File("Registros.dat");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Registros.dat"));

                String linea;

                while((linea=br.readLine())!=null){
                     StringTokenizer st=new StringTokenizer(linea,",");
                     
                     int diaPersona = Integer.parseInt(st.nextToken().trim());
                     int mesPersona = Integer.parseInt(st.nextToken().trim());
                     int anioPersona = Integer.parseInt(st.nextToken().trim());
                     int edadPersona = Integer.parseInt(st.nextToken().trim());
                     String nombrePersona = st.nextToken().trim();
                     String dniPersona = st.nextToken().trim();
                     String sexoPersona = st.nextToken().trim();
                                          
                     String departamentoPersona = st.nextToken().trim();
                     String provinciaPersona = st.nextToken().trim();
                     String distritoPersona = st.nextToken().trim();
                     String tipoZonaPersona = st.nextToken().trim();
                     String tipoViaPersona = st.nextToken().trim();
                     String manzanaPersona = st.nextToken().trim();
                     String lotePersona = st.nextToken().trim();
                     int numeroCasaPersona = Integer.parseInt(st.nextToken().trim());
                     
                     String nombreComercial = st.nextToken().trim();
                     String actividadComercial = st.nextToken().trim();
                     String oficioComercial = st.nextToken().trim();
                     String telefonoComercial = st.nextToken().trim();
                     String celularComercial = st.nextToken().trim();
                     String correoComercial = st.nextToken().trim();
                     
                     String RucComercial = st.nextToken().trim();
                     String ClaveSolComercial = st.nextToken().trim();
                     
                     boolean estadoRegistro = Boolean.parseBoolean(st.nextToken().trim());
                     int categoriaRegistro = Integer.parseInt(st.nextToken().trim());
                     
                     
                     int diaRegistro = Integer.parseInt(st.nextToken().trim());
                     int mesRegistro = Integer.parseInt(st.nextToken().trim());
                     int anioRegistro = Integer.parseInt(st.nextToken().trim());
                     
                     
                     
                     
                     
                     Direccion unDomicilio = new Direccion(departamentoPersona, provinciaPersona, distritoPersona, tipoZonaPersona, tipoViaPersona, manzanaPersona, lotePersona,numeroCasaPersona);
                     Fecha unaFecha = new Fecha(diaPersona, mesPersona, anioPersona);
                     Usuario unUsuario = new Usuario(unDomicilio, nombrePersona, dniPersona, sexoPersona, unaFecha);
                     DatosLaborales unLabor = new DatosLaborales(nombreComercial, actividadComercial, oficioComercial, telefonoComercial, celularComercial, correoComercial);
                     Fecha unaFechaRegistro = new Fecha(diaRegistro, mesRegistro, anioRegistro);
                     Registro x=new Registro(unUsuario,categoriaRegistro,unaFechaRegistro,unLabor);
                     
                    unUsuario.setFechaNacimiento(unaFecha);
                    unUsuario.setDomicilio(unDomicilio);

                    x.setFechaRegistro(unaFechaRegistro);
                    x.setLoborales(unLabor);
                    x.setUsuario(unUsuario);
                    x.setRUC(RucComercial);
                    x.setClaveSOL(ClaveSolComercial);
                     
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
          PrintWriter pw=new PrintWriter(new FileWriter("Registros.dat"));
          for(int i=0;i<getTamaño();i++){
            pw.println(
            obtener(i).getUsuario().getFechaNacimiento().getDia()+","+
            obtener(i).getUsuario().getFechaNacimiento().getMes()+","+
            obtener(i).getUsuario().getFechaNacimiento().getAnio()+","+
            obtener(i).getUsuario().getEdad()+","+       
            obtener(i).getUsuario().getNombre()+","+
            obtener(i).getUsuario().getDNI()+","+
            obtener(i).getUsuario().getSexo()+","+       
            
                        
            obtener(i).getUsuario().getDomicilio().getDepartamento()+","+
            obtener(i).getUsuario().getDomicilio().getProvincia()+","+
            obtener(i).getUsuario().getDomicilio().getDistrito()+","+
            obtener(i).getUsuario().getDomicilio().getTipo_NombreZona()+","+
            obtener(i).getUsuario().getDomicilio().getTipo_NombreVia()+","+
            obtener(i).getUsuario().getDomicilio().getManzana()+","+
            obtener(i).getUsuario().getDomicilio().getLote()+","+
            obtener(i).getUsuario().getDomicilio().getNumero()+","+
                    
            
            obtener(i).getLoborales().getNombreComercial()+","+
            obtener(i).getLoborales().getActividadEconomica()+","+
            obtener(i).getLoborales().getOficio()+","+
            obtener(i).getLoborales().getTelefono()+","+
            obtener(i).getLoborales().getCelular()+","+
            obtener(i).getLoborales().getCorreo()+","+
                    
            obtener(i).getRUC()+","+
            obtener(i).getClaveSOL()+","+
                    
            obtener(i).getEstadoContribucion()+","+
            obtener(i).getCategoria()+","+
                    
            obtener(i).getFechaRegistro().getDia()+","+
            obtener(i).getFechaRegistro().getMes()+","+
            obtener(i).getFechaRegistro().getAnio()
            );
            
          }
          pw.close();
          JOptionPane.showMessageDialog(null,"Operacion Exitosa");
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Error al leer el archivo","Aviso",JOptionPane.ERROR_MESSAGE);
           }
        }
    
}
