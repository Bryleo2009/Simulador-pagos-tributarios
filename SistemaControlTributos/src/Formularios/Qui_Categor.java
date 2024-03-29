/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import Archivos.Arreglo5Tributo;
import Atxy2k.CustomTextField.RestrictedTextField;
import Clases.Fecha;
import Clases.QuintaCategoria;
import Clases.Registro;
import Clases.Tributo;
import Clases.Usuario;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author bryleo
 */
public class Qui_Categor extends javax.swing.JInternalFrame {
Arreglo5Tributo a=new Arreglo5Tributo();
String []Arreglomeses=new String[12];
DecimalFormat df = new DecimalFormat("#.00"); //Delimitamos el mostreo de datos de tipo double a dos decimales 
    /**
     * Creates new form Qui_Categor
     */
    public Qui_Categor() {
        initComponents();
        ValoresIniciales();
        MostrarValores();
        Limitadores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelReseccion5 = new javax.swing.JScrollPane();
        PanelR = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbReten = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtIngreso = new javax.swing.JTextField();
        SpintMeses = new com.toedter.components.JSpinField();
        txtGratificacion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbDni = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dataEmision = new com.toedter.calendar.JDateChooser();
        PanelMostrar5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        dataEmision1 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        lbDni1 = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbEdad1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbImpuesto = new javax.swing.JLabel();
        lbMeses = new javax.swing.JLabel();
        lbIngreso = new javax.swing.JLabel();
        lbGratificaciones = new javax.swing.JLabel();
        lbRemuneracion = new javax.swing.JLabel();
        lbNeta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRetencion = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUINTA CATEGORÍA");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PanelR.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS TRIBUTARIOS"));
        jPanel2.setLayout(null);

        lbReten.setBorder(javax.swing.BorderFactory.createTitledBorder("Impuesto"));
        jPanel2.add(lbReten);
        lbReten.setBounds(10, 180, 270, 60);

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(50, 270, 71, 23);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(170, 270, 77, 23);

        txtIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO MENSUAL"));
        jPanel2.add(txtIngreso);
        txtIngreso.setBounds(140, 20, 140, 60);

        SpintMeses.setBorder(javax.swing.BorderFactory.createTitledBorder("Meses Faltantes"));
        SpintMeses.setMaximum(12);
        SpintMeses.setMinimum(1);
        jPanel2.add(SpintMeses);
        SpintMeses.setBounds(10, 20, 120, 60);

        txtGratificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("GRATIFICACION"));
        jPanel2.add(txtGratificacion);
        txtGratificacion.setBounds(10, 100, 270, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 289;
        gridBagConstraints.ipady = 339;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 92, 0);
        PanelR.add(jPanel2, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));
        jPanel5.setLayout(null);

        lbDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));
        jPanel5.add(lbDni);
        lbDni.setBounds(10, 170, 200, 60);

        lbNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel5.add(lbNombre);
        lbNombre.setBounds(10, 30, 200, 60);

        lbEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel5.add(lbEdad);
        lbEdad.setBounds(10, 100, 200, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 249;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        PanelR.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL REGISTRO"));
        jPanel6.setLayout(null);

        dataEmision.setEnabled(false);
        jPanel6.add(dataEmision);
        dataEmision.setBounds(20, 30, 190, 20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 92, 0);
        PanelR.add(jPanel6, gridBagConstraints);

        PanelReseccion5.setViewportView(PanelR);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 364;
        gridBagConstraints.ipady = 425;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(PanelReseccion5, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));

        dataEmision1.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(dataEmision1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(dataEmision1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));

        lbDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));

        lbNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        lbEdad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS TRIBUTARIOS"));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        lbImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Impuesto anual:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 10);
        jPanel4.add(lbImpuesto, gridBagConstraints);

        lbMeses.setBorder(javax.swing.BorderFactory.createTitledBorder("Meses faltantes:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        jPanel4.add(lbMeses, gridBagConstraints);

        lbIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso mensual:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 10);
        jPanel4.add(lbIngreso, gridBagConstraints);

        lbGratificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Gratificaciones:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(lbGratificaciones, gridBagConstraints);

        lbRemuneracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Remuneración Bruta Anual:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 10);
        jPanel4.add(lbRemuneracion, gridBagConstraints);

        lbNeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Remuneración Neta Anual:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(lbNeta, gridBagConstraints);

        txaRetencion.setEditable(false);
        txaRetencion.setBackground(new java.awt.Color(240, 240, 240));
        txaRetencion.setColumns(20);
        txaRetencion.setRows(5);
        txaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Retención Aproximada x Mes:"));
        jScrollPane1.setViewportView(txaRetencion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 327;
        gridBagConstraints.ipady = 127;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jScrollPane1, gridBagConstraints);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMostrar5Layout = new javax.swing.GroupLayout(PanelMostrar5);
        PanelMostrar5.setLayout(PanelMostrar5Layout);
        PanelMostrar5Layout.setHorizontalGroup(
            PanelMostrar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelMostrar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelMostrar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMostrar5Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnAceptar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelMostrar5Layout.setVerticalGroup(
            PanelMostrar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar5Layout.createSequentialGroup()
                .addGroup(PanelMostrar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(PanelMostrar5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(PanelMostrar5, gridBagConstraints);

        setBounds(0, 0, 1053, 473);
    }// </editor-fold>//GEN-END:initComponents
    void LimitadorDouble(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite);
         obj.setAcceptCharacters(".0123456789");//limita los caracteres a numeros y el punto para el ingreso de datos decimales
        obj.setOnlyCustomCharacters(true);
    }
    void Limitadores(){
        LimitadorDouble(txtIngreso,20);
        LimitadorDouble(txtGratificacion,20);
    }
    Date calendario=new Date();
    void ValoresIniciales()
    {
        SpintMeses.setValue(1);
        PanelMostrar5.setVisible(false);
        PanelReseccion5.setVisible(true);
        btnGuardar.setVisible(false);
        lbNombre.setText(Registro.unregistro.getUsuario().getNombre());
        lbEdad.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
        lbDni.setText(Registro.unregistro.getUsuario().getDNI());
        //calendario;
        dataEmision.setDate(calendario);
        Arreglomeses[0]="Enero";Arreglomeses[1]="Febrero";Arreglomeses[2]="Marzo";
        Arreglomeses[3]="Abril";Arreglomeses[4]="Mayo";Arreglomeses[5]="Junio";
        Arreglomeses[6]="Julio";Arreglomeses[7]="Agosto";Arreglomeses[8]="Septiembre";
        Arreglomeses[9]="Octubre";Arreglomeses[10]="Noviembre";Arreglomeses[11]="Diciembre";
        
        
    }
     void MostrarValores() //del panel mostrar datos
    {
        lbNombre1.setText(Registro.unregistro.getUsuario().getNombre());
        lbEdad1.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
        lbDni1.setText(Registro.unregistro.getUsuario().getDNI());
        dataEmision1.setDate(calendario);
    }
    int obtenermeses()
    {
        return SpintMeses.getValue();
    }
    double obteneringreso()
    {
        return Double.parseDouble(txtIngreso.getText());
    }
    double obtenergratificacion()
    {
        return Double.parseDouble(txtGratificacion.getText());
    }
    int ObtenerDia()
    {
        return dataEmision.getCalendar().get(Calendar.DAY_OF_MONTH);
    }
    int ObtenerMes()
    {
        return dataEmision.getCalendar().get(Calendar.MONTH)+1;
    }
    int ObtenerAnio()
    {
        return dataEmision.getCalendar().get(Calendar.YEAR);
    }
    String Validar(){
        if(txtIngreso.getText().equals("")){
            return "Ingreso Mensual (Vacio)";
        }else if(txtGratificacion.getText().equals("")){
            return "Gratificacion (Vacio)";
        }else{
            return "";
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Validar().equals("")){
        QuintaCategoria unacategoria = new QuintaCategoria(obteneringreso(),obtenermeses(),obtenergratificacion());
        lbReten.setText(String.valueOf(unacategoria.getImpuesto()));
        if(unacategoria.getImpuesto()==0){
            JOptionPane.showMessageDialog(null,"No hay impuesto porque la remuneracion bruta es menor a 7UIT");
        }
        btnGuardar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(Validar().equals("")){
            QuintaCategoria categoria5 = new QuintaCategoria(obteneringreso(),obtenermeses(),obtenergratificacion());
            if(categoria5.getImpuesto()==Double.parseDouble(lbReten.getText())){
                MostrarValores();
                Usuario unUsuario = new Usuario(Registro.unregistro.getUsuario().getNombre(), Registro.unregistro.getUsuario().getDNI());
                Fecha unaFechaEmi = new Fecha(ObtenerDia(), ObtenerMes(), ObtenerAnio());
                Tributo x = new Tributo(unUsuario, unaFechaEmi);
                x.setContribuyente(unUsuario);
                x.setFechaEmision(unaFechaEmi);
                x.setCategoria5(categoria5);
                a.adicionar(x);
                a.grabar();

                lbMeses.setText(String.valueOf(obtenermeses()));
                lbIngreso.setText(String.valueOf(obteneringreso()));
                lbGratificaciones.setText(String.valueOf(obtenergratificacion()));
                lbRemuneracion.setText(String.valueOf(x.getCategoria5().getRemuneracionBruta()));
                lbNeta.setText(String.valueOf(x.getCategoria5().getRemuneracionNeta()));
                for(int i=0;i<12;i++){
                    txaRetencion.append(Arreglomeses[i]+":"+df.format(x.getCategoria5().MostrarRetencion(i))+"\n");
                } //El for nos muestra cada mes con su respectiva retención
                lbImpuesto.setText(String.valueOf(x.getCategoria5().getImpuesto()));
                PanelMostrar5.setVisible(true);
                PanelReseccion5.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Ha modificado los valores ingresados");
            }
        }else{
            JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrar5;
    private javax.swing.JPanel PanelR;
    private javax.swing.JScrollPane PanelReseccion5;
    private com.toedter.components.JSpinField SpintMeses;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dataEmision;
    private com.toedter.calendar.JDateChooser dataEmision1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbDni1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbEdad1;
    private javax.swing.JLabel lbGratificaciones;
    private javax.swing.JLabel lbImpuesto;
    private javax.swing.JLabel lbIngreso;
    private javax.swing.JLabel lbMeses;
    private javax.swing.JLabel lbNeta;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbRemuneracion;
    private javax.swing.JLabel lbReten;
    private javax.swing.JTextArea txaRetencion;
    private javax.swing.JTextField txtGratificacion;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables
}
