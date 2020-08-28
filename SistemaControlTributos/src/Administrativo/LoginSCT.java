
package Administrativo;


import Administrativo.Admin;
import Administrativo.EstaCua;
import Administrativo.EstaPri;
import Administrativo.EstaSeg;
import Administrativo.EstaTer;
import Administrativo.EstaQui;
import Administrativo.EstaRes;
import Administrativo.ArregloAdmin;
import Administrativo.EstaUbi;
import javax.swing.JOptionPane;



public class LoginSCT extends javax.swing.JInternalFrame {
    /**
     * Creates new form LoginCliente
     */
    ArregloAdmin a = new ArregloAdmin();

    //Registro temporal; //para almacenar los valores temporales para posteriormente mostrarlos
    public LoginSCT() {
        initComponents();
        Panel1.setVisible(false);
        
        
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

        Panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        Ventana1 = new javax.swing.JDesktopPane();
        panelFondo = new javax.swing.JPanel();
        lbPersona = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar1 = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.controlDkShadow);
        setClosable(true);
        setMaximizable(true);
        setTitle("PÁGINA ESTADÍSTICA");
        setToolTipText("");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Categorías");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Primera");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Segunda");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tercera");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cuarta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Quinta");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Registro");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ubigeo");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Arbol.setRootVisible(false);
        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Arbol);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        getContentPane().add(Panel1);

        panelFondo.setBackground(new java.awt.Color(102, 102, 255));
        panelFondo.setLayout(new java.awt.GridBagLayout());

        lbPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -8;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(152, 220, 0, 0);
        panelFondo.add(lbPersona, gridBagConstraints);

        PanelLogin.setBackground(new java.awt.Color(102, 102, 255));
        PanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel1.setText("CLAVE");

        txtContrasena.setBackground(new java.awt.Color(102, 102, 255));
        txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContrasena.setName("txtContrasena"); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnIngresar1.setBackground(new java.awt.Color(102, 102, 255));
        btnIngresar1.setText("INGRESAR");
        btnIngresar1.setName("btnIngresar"); // NOI18N
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnIngresar1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 190, 75, 139);
        panelFondo.add(PanelLogin, gridBagConstraints);

        Ventana1.setLayer(panelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Ventana1Layout = new javax.swing.GroupLayout(Ventana1);
        Ventana1.setLayout(Ventana1Layout);
        Ventana1Layout.setHorizontalGroup(
            Ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        Ventana1Layout.setVerticalGroup(
            Ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        getContentPane().add(Ventana1);

        setBounds(0, 0, 607, 525);
    }// </editor-fold>//GEN-END:initComponents
    String obtener()
    {
        return Arbol.SELECTION_MODEL_PROPERTY;
    }
    
    String ObtenerContraLogin()
    {
        return txtContrasena.getText();
    }
    
    
    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
        // evento cuando hago clic con el mause
       try{
            String seleccion = Arbol.getLastSelectedPathComponent().toString(); //accedo al componente seleccionado
           this.Ventana1.removeAll(); //limpia el espacio de ventana interna
           this.Ventana1.repaint(); //solo me permite el llamado 1 vez
            switch (seleccion)
            {
                case "Primera":                   
                     EstaPri obj1= new EstaPri(); //creación del obj de la ventana interna
                     Ventana1.add(obj1); //lo agrego a mi control "Panel de escritorio"
                     obj1.setVisible(true); //el objeto lo hago visible
                    break;
                case "Segunda":                    
                     EstaSeg obj2= new EstaSeg(); //creación del obj de la ventana interna
                     Ventana1.add(obj2); //lo agrego a mi control "Panel de escritorio"
                     obj2.setVisible(true); //el objeto lo hago visible
                    break;
                case "Tercera":
                    EstaTer obj3= new EstaTer(); //creación del obj de la ventana interna
                     Ventana1.add(obj3); //lo agrego a mi control "Panel de escritorio"
                     obj3.setVisible(true); //el objeto lo hago visible
                    break;
                case "Cuarta":
                    EstaCua obj4= new EstaCua(); //creación del obj de la ventana interna
                     Ventana1.add(obj4); //lo agrego a mi control "Panel de escritorio"
                     obj4.setVisible(true); //el objeto lo hago visible
                    break;
                case "Quinta":
                    EstaQui obj5= new EstaQui(); //creación del obj de la ventana interna
                     Ventana1.add(obj5); //lo agrego a mi control "Panel de escritorio"
                     obj5.setVisible(true); //el objeto lo hago visible
                    break;
                case "Clientes":
                    EstaRes obj6= new EstaRes(); //creación del obj de la ventana interna
                     Ventana1.add(obj6); //lo agrego a mi control "Panel de escritorio"
                     obj6.setVisible(true); //el objeto lo hago visible
                    break;
                case "Ubigeo":
                    EstaUbi obj7= new EstaUbi(); //creación del obj de la ventana interna
                     Ventana1.add(obj7); //lo agrego a mi control "Panel de escritorio"
                     obj7.setVisible(true); //el objeto lo hago visible
                    break;
                default:
                    break;
            }
       }catch(Exception ex){} //para que no me muestre nada al hacer clic en el panel arbol
        
    }//GEN-LAST:event_ArbolMouseClicked

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
           
        Admin r = a.buscarcontra(ObtenerContraLogin());
        if (r!=null){
            //Oculta componentes
            PanelLogin.setVisible(false);
            panelFondo.setVisible(false);
            lbPersona.setVisible(false);
            //muestra el menú
            Panel1.setVisible(true);
        } else
        JOptionPane.showMessageDialog(this,"Contraseña Incorrecta");
  
    }//GEN-LAST:event_btnIngresar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JDesktopPane Ventana1;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbPersona;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField txtContrasena;
    // End of variables declaration//GEN-END:variables
}