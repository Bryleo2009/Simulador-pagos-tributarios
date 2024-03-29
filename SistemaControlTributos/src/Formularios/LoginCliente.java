
package Formularios;

import Archivos.ArregloRegistros;
import Atxy2k.CustomTextField.RestrictedTextField;
import Clases.Registro;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class LoginCliente extends javax.swing.JInternalFrame {
    /**
     * Creates new form LoginCliente
     */
    
    
    
    
    ArregloRegistros a=new ArregloRegistros();
    //Registro temporal; //para almacenar los valores temporales para posteriormente mostrarlos
    public LoginCliente() {
        initComponents();
        Panel1.setVisible(false);
        PanelCambio.setVisible(false);
        lbContrasena.setVisible(false);
        Limitadores();
    }

    void Limitadores(){
        LimitadorContra(txtContrasena,12);
        LimitadorContra(txtNuevaCambio,12);
        LimitadorContra(txtConfirmarNueva,12);
        LimitadorRUC(txtRucCambio,12);
        LimitadorRUC(txtRUC,12);
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
        jLabel2 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar1 = new javax.swing.JButton();
        btnOlvide = new javax.swing.JButton();
        lbContrasena = new javax.swing.JLabel();
        PanelCambio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarNueva = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnAceptarCambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtRucCambio = new javax.swing.JTextField();
        txtNuevaCambio = new javax.swing.JTextField();

        setBackground(java.awt.SystemColor.controlDkShadow);
        setClosable(true);
        setMaximizable(true);
        setTitle("PÁGINA DEL CLIENTE");
        setToolTipText("");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Manual");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Información de categorías");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cliente");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pago de Impuesto");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Actualización de Datos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cambio de Contraseña");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Movimientos");
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
        gridBagConstraints.insets = new java.awt.Insets(50, 70, 0, 0);
        panelFondo.add(lbPersona, gridBagConstraints);

        PanelLogin.setBackground(new java.awt.Color(102, 102, 255));
        PanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanelLogin.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel2.setText("RUC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        PanelLogin.add(jLabel2, gridBagConstraints);

        txtRUC.setBackground(new java.awt.Color(102, 102, 255));
        txtRUC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtRUC.setName("txtRuc"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 0, 9);
        PanelLogin.add(txtRUC, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 7, 0, 9);
        PanelLogin.add(jSeparator1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel1.setText("CLAVE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 0, 0);
        PanelLogin.add(jLabel1, gridBagConstraints);

        txtContrasena.setBackground(new java.awt.Color(102, 102, 255));
        txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContrasena.setName("txtContrasena"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 9);
        PanelLogin.add(txtContrasena, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 7, 0, 9);
        PanelLogin.add(jSeparator2, gridBagConstraints);

        btnIngresar1.setBackground(new java.awt.Color(102, 102, 255));
        btnIngresar1.setText("INGRESAR");
        btnIngresar1.setName("btnIngresar"); // NOI18N
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 0, 0);
        PanelLogin.add(btnIngresar1, gridBagConstraints);

        btnOlvide.setBackground(new java.awt.Color(102, 102, 255));
        btnOlvide.setText("Olvidé Contraseña");
        btnOlvide.setName("btnOlvide"); // NOI18N
        btnOlvide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvideActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 7, 11, 0);
        PanelLogin.add(btnOlvide, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        panelFondo.add(PanelLogin, gridBagConstraints);

        lbContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = -80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelFondo.add(lbContrasena, gridBagConstraints);

        PanelCambio.setBackground(new java.awt.Color(102, 102, 255));
        PanelCambio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanelCambio.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel3.setText("RUC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        PanelCambio.add(jLabel3, gridBagConstraints);

        txtConfirmarNueva.setBackground(new java.awt.Color(102, 102, 255));
        txtConfirmarNueva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtConfirmarNueva.setName("txtRuc"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 9);
        PanelCambio.add(txtConfirmarNueva, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        PanelCambio.add(jSeparator3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel4.setText("NUEVA CONTRASEÑA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 0, 0);
        PanelCambio.add(jLabel4, gridBagConstraints);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        PanelCambio.add(jSeparator4, gridBagConstraints);

        btnAceptarCambio.setBackground(new java.awt.Color(102, 102, 255));
        btnAceptarCambio.setText("ACEPTAR");
        btnAceptarCambio.setName("btnOlvide"); // NOI18N
        btnAceptarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCambioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 12, 0);
        PanelCambio.add(btnAceptarCambio, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel5.setText("CONFIRME CONTRASEÑA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 0);
        PanelCambio.add(jLabel5, gridBagConstraints);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 9);
        PanelCambio.add(jSeparator5, gridBagConstraints);

        txtRucCambio.setBackground(new java.awt.Color(102, 102, 255));
        txtRucCambio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtRucCambio.setName("txtRuc"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 9);
        PanelCambio.add(txtRucCambio, gridBagConstraints);

        txtNuevaCambio.setBackground(new java.awt.Color(102, 102, 255));
        txtNuevaCambio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNuevaCambio.setName("txtRuc"); // NOI18N
        txtNuevaCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaCambioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 9);
        PanelCambio.add(txtNuevaCambio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = -5;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 33, 0);
        panelFondo.add(PanelCambio, gridBagConstraints);

        Ventana1.setLayer(panelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Ventana1Layout = new javax.swing.GroupLayout(Ventana1);
        Ventana1.setLayout(Ventana1Layout);
        Ventana1Layout.setHorizontalGroup(
            Ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana1Layout.setVerticalGroup(
            Ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        getContentPane().add(Ventana1);

        setBounds(0, 0, 607, 525);
    }// </editor-fold>//GEN-END:initComponents
   void LimitadorContra(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite);
    }
    void LimitadorRUC(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite);
        obj.setOnlyNums(true);//para que solo acepte numeros
    }
    String obtener()
    {
        return Arbol.SELECTION_MODEL_PROPERTY;
    }
    String ObtenerRucLogin()
    {
        return txtRUC.getText();
    }
    String ObtenerContraLogin()
    {
        return txtContrasena.getText();
    }
    String ObtenerRucCambio()
    {
        return txtRucCambio.getText();
    }
    String ObtenerContraNueva()
    {
        return txtNuevaCambio.getText();
    }
    String ObtenerNuevaConfir()
    {
        return txtConfirmarNueva.getText();
    }
    
    private void btnOlvideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvideActionPerformed

        PanelLogin.setVisible(false);
        lbPersona.setVisible(false);
        PanelCambio.setVisible(true);
        lbContrasena.setVisible(true);
        txtConfirmarNueva.setText("");
        txtNuevaCambio.setText("");
        txtRucCambio.setText("");
    }//GEN-LAST:event_btnOlvideActionPerformed

    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
        // evento cuando hago clic con el mause
       try{
            String seleccion = Arbol.getLastSelectedPathComponent().toString(); //accedo al componente seleccionado
           this.Ventana1.removeAll(); //limpia el espacio de ventana interna
           this.Ventana1.repaint(); //solo me permite el llamado 1 vez
            switch (seleccion)
            {
                case "Pago de Impuesto":
                    switch (Registro.unregistro.getCategoria())
                    {
                        case 0:
                            Pri_Categor obj1= new Pri_Categor(); //creación del obj de la ventana interna
                            Ventana1.add(obj1); //lo agrego a mi control "Panel de escritorio"
                            obj1.setVisible(true); //el objeto lo hago visible
                            break;
                        case 1:
                            Seg_Categor obj2= new Seg_Categor(); //creación del obj de la ventana interna
                            Ventana1.add(obj2); //lo agrego a mi control "Panel de escritorio"
                            obj2.setVisible(true); //el objeto lo hago visible
                            break;
                        case 2:
                            Ter_Categor obj3= new Ter_Categor(); //creación del obj de la ventana interna
                            Ventana1.add(obj3); //lo agrego a mi control "Panel de escritorio"
                            obj3.setVisible(true); //el objeto lo hago visible
                            break;
                        case 3:
                            Cua_Categor obj4= new Cua_Categor(); //creación del obj de la ventana interna
                            Ventana1.add(obj4); //lo agrego a mi control "Panel de escritorio"
                            obj4.setVisible(true); //el objeto lo hago visible
                            break;
                        case 4:
                            Qui_Categor obj5= new Qui_Categor(); //creación del obj de la ventana interna
                            Ventana1.add(obj5); //lo agrego a mi control "Panel de escritorio"
                            obj5.setVisible(true); //el objeto lo hago visible
                            break;
                        default:
                                break;
                    }

                    break;
                case "Actualización de Datos":
                    ActualizacionDatos obj3= new ActualizacionDatos(); //creación del obj de la ventana interna
                    Ventana1.add(obj3); //lo agrego a mi control "Panel de escritorio"
                    obj3.setVisible(true); //el objeto lo hago visible
                    break;
                case "Cambio de Contraseña":
                    String x= String.valueOf(JOptionPane.showInputDialog(this,"Ingrese el número de contraseña: ","AVISO",HEIGHT));
                    if (x.length()>12) 
                        JOptionPane.showMessageDialog(null,"El número de caracteres máximo es 12");
                    else 
                        if(x!="null") //si no se escribe nada en el Joption
                        {
                            Registro.unregistro.setClaveSOL(x);    
                            a.grabar();
                        }
                    break;
                case "Información de categorías":
                    Info obj5= new Info(); //creación del obj de la ventana interna
                    Ventana1.add(obj5); //lo agrego a mi control "Panel de escritorio"
                    obj5.setVisible(true); //el objeto lo hago visible
                    break;
                case "Movimientos":
                    switch (Registro.unregistro.getCategoria())
                    {
                        case 0:
                            MoviPri obj1= new MoviPri(); //creación del obj de la ventana interna
                            Ventana1.add(obj1); //lo agrego a mi control "Panel de escritorio"
                            obj1.setVisible(true); //el objeto lo hago visible
                            break;
                        case 1:
                            MoviSeg obj2= new MoviSeg(); //creación del obj de la ventana interna
                            Ventana1.add(obj2); //lo agrego a mi control "Panel de escritorio"
                            obj2.setVisible(true); //el objeto lo hago visible
                            break;
                        case 2:
                            MoviTer obj7= new MoviTer(); //creación del obj de la ventana interna
                            Ventana1.add(obj7); //lo agrego a mi control "Panel de escritorio"
                            obj7.setVisible(true); //el objeto lo hago visible
                            break;
                        case 3:
                            MoviCua obj4= new MoviCua(); //creación del obj de la ventana interna
                            Ventana1.add(obj4); //lo agrego a mi control "Panel de escritorio"
                            obj4.setVisible(true); //el objeto lo hago visible
                            break;
                        case 4:
                            MoviQui obj8= new MoviQui(); //creación del obj de la ventana interna
                            Ventana1.add(obj8); //lo agrego a mi control "Panel de escritorio"
                            obj8.setVisible(true); //el objeto lo hago visible
                            break;
                        default:
                                break;
                    }
                    
                    break;
                default:
                    break;
            }
       }catch(Exception ex){} //para que no me muestre nada al hacer clic en el panel arbol
        
    }//GEN-LAST:event_ArbolMouseClicked

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        String ruc=ObtenerRucLogin();
        String contra=ObtenerContraLogin();
        //Registro busqueda=a.buscarRuc(ruc);
       
        Registro e=a.buscarRucyContra(ruc,contra);
        if (e!=null){
            Registro.unregistro=e; //asignación de datos a variable temporal para los procesos posteriormente
            
            //Oculta componentes
            PanelLogin.setVisible(false);
            lbPersona.setVisible(false);
            //muestra el menú
            Panel1.setVisible(true);
        } else
        JOptionPane.showMessageDialog(this,"Número RUC o contraseña Incorrecta");
  
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnAceptarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCambioActionPerformed
        
        String ruc=ObtenerRucCambio();
        Registro e=a.buscarRuc(ruc);
        if(ObtenerContraNueva().equals(ObtenerNuevaConfir()))
        {
            if (e!=null){
                    //modificación
                    e.setClaveSOL(ObtenerContraNueva());
                    a.grabar();
                    //mostreo de paneles
                    PanelLogin.setVisible(true);
                    txtRUC.setText("");
                    txtContrasena.setText("");
                    lbPersona.setVisible(true);
                    PanelCambio.setVisible(false);
                    lbContrasena.setVisible(false);
            } else
              JOptionPane.showMessageDialog(this,"RUC no existente");
        }else JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
        


        
    }//GEN-LAST:event_btnAceptarCambioActionPerformed

    private void txtNuevaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaCambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelCambio;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JDesktopPane Ventana1;
    private javax.swing.JButton btnAceptarCambio;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnOlvide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbContrasena;
    private javax.swing.JLabel lbPersona;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtConfirmarNueva;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNuevaCambio;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRucCambio;
    // End of variables declaration//GEN-END:variables
}
