/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Archivos.Arreglo1Tributo;
import Clases.Tributo;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author bryleo
 */
public class EstaPri extends javax.swing.JInternalFrame {
    Arreglo1Tributo t=new Arreglo1Tributo();
    /**
     * Creates new form EstaPri
     */
    public EstaPri() {
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
        setTitle("PRIMERA CATEGORÍA");

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "INGRESO", "IMPUESTO", "FECHA EMISIÓN"
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
        columna.setPreferredWidth(50); //ancho de columna
        columna=tbResult.getColumnModel().getColumn(1);
        columna.setPreferredWidth(150);
        columna=tbResult.getColumnModel().getColumn(2);
        columna.setPreferredWidth(30);
        columna=tbResult.getColumnModel().getColumn(3);
        columna.setPreferredWidth(30);
        columna=tbResult.getColumnModel().getColumn(4);
        columna.setPreferredWidth(30);
        tbResult.getTableHeader().setReorderingAllowed(true); //permite no mover las columnas de su posición actual
        tbResult.getTableHeader().setResizingAllowed(false); //permite no modificar el ancho de las columnas
        
    }
    void Lista()
    {
        if (t.getTamaño()>0){
            for(int i=0;i<t.getTamaño();i++){
                Tributo cate=t.obtener(i);
                tbResult.setValueAt(cate.getContribuyente().getDNI(),i,0);
                tbResult.setValueAt(cate.getContribuyente().getNombre(), i, 1);
                tbResult.setValueAt(cate.getCategoria1().getRenta(), i, 2);
                tbResult.setValueAt(cate.getCategoria1().getImpuestoMensual(), i, 3);
                tbResult.setValueAt(cate.getFechaEmision().getDia()+" / "+cate.getFechaEmision().getMes()+" / "+cate.getFechaEmision().getAnio(), i, 4);
            }
        } else {
            JOptionPane.showMessageDialog(this,"No se han registrados pagos de impuestos de primera categoría","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables
}
