/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Archivos.ArregloRegistros;
import Clases.Registro;

import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author bryleo
 */
public class EstaRes extends javax.swing.JInternalFrame {
    ArregloRegistros t=new ArregloRegistros();
    /**
     * Creates new form EstaPri
     */
    public EstaRes() {
        initComponents();
        DefinirAnchos();
        Lista();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTROS");

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUC", "NOMBRE", "EDAD", "CATEGORÍA", "FECHA REGISTRO", "DEPARTAMENTO", "PROVINCIA", "DISTRITO"
            }
        ));
        jScrollPane1.setViewportView(tbResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void DefinirAnchos(){
        TableColumn columna; //de tipo TableColum
        columna=tbResult.getColumnModel().getColumn(0);//columna 0
        columna.setPreferredWidth(70); //ancho de columna
        columna=tbResult.getColumnModel().getColumn(1);
        columna.setPreferredWidth(200);
        columna=tbResult.getColumnModel().getColumn(2);
        columna.setPreferredWidth(20);
        columna=tbResult.getColumnModel().getColumn(3);
        columna.setPreferredWidth(50);
        columna=tbResult.getColumnModel().getColumn(4);
        columna.setPreferredWidth(50);
        columna=tbResult.getColumnModel().getColumn(5);
        columna.setPreferredWidth(70);
        columna=tbResult.getColumnModel().getColumn(6);
        columna.setPreferredWidth(70);
        columna=tbResult.getColumnModel().getColumn(7);
        columna.setPreferredWidth(70);
        
        tbResult.getTableHeader().setReorderingAllowed(true); //permite mover las columnas de su posición actual
        tbResult.getTableHeader().setResizingAllowed(false); //permite no modificar el ancho de las columnas
        
    }
    void Lista()
    {
        if (t.getTamaño()>0){
            for(int i=0;i<t.getTamaño();i++){
                Registro cate=t.obtener(i);
                tbResult.setValueAt(cate.getRUC(),i,0);                
                tbResult.setValueAt(cate.getUsuario().getNombre(), i, 1);
                tbResult.setValueAt(cate.getUsuario().getEdad(), i, 2);
                switch (cate.getCategoria())
                {
                    case 0: tbResult.setValueAt("PRIMERA", i, 3); break;
                    case 1: tbResult.setValueAt("SEGUNDA", i, 3); break;
                    case 2: tbResult.setValueAt("TERCERA", i, 3); break;
                    case 3: tbResult.setValueAt("CUARTA", i, 3); break;
                    case 4: tbResult.setValueAt("QUINTA", i, 3); break;
                }
                tbResult.setValueAt(cate.getFechaRegistro().getDia()+" / "+cate.getFechaRegistro().getMes()+" / "+cate.getFechaRegistro().getAnio(), i, 4);
                tbResult.setValueAt(cate.getUsuario().getDomicilio().getDepartamento(), i, 5);
                tbResult.setValueAt(cate.getUsuario().getDomicilio().getProvincia(), i, 6);
                tbResult.setValueAt(cate.getUsuario().getDomicilio().getDistrito(), i, 7);
            }   
        } else {
            JOptionPane.showMessageDialog(this,"No se han registrados clientes","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables
}