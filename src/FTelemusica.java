
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FTelemusica extends javax.swing.JFrame {

    Conexion2 cnx = new Conexion2();
    String canciones = "SELECT * FROM canciones";
    String versiones = "SELECT * FROM versiones WHERE canciones_idcanciones = '%s'";
    String interpretaciones = "SELECT idversiones,nombrea, rol rolas WHERE versiones_idversiones = '%s'";

    public FTelemusica() {
        initComponents();

        ajustesUI();

        if (cnx.conectar("localhost", "telemusica", "root", "") == 1) {
            cnx.entablar(canciones, TCanciones, 30, 35, 35);
            cascada();
            JOptionPane.showMessageDialog(this, "Conectado");
        } else {
            JOptionPane.showMessageDialog(this, "Sin acceso a la BD");
            //           System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PEncabezado = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PAcciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BNuevo = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tTitulo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tGenero = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tArtista = new javax.swing.JTextField();
        PCanciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TID = new javax.swing.JTextField();
        TTitulo = new javax.swing.JTextField();
        TAutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCanciones = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        PVersiones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TGenero = new javax.swing.JTextField();
        SDuracion = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        TVersiones = new javax.swing.JTable();
        BAgregarVersion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        PInterpretes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TInterpretes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBArtista = new javax.swing.JComboBox<>();
        CBRol = new javax.swing.JComboBox<>();
        BAgregarInterprete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Canciones");
        setBackground(new java.awt.Color(244, 246, 249));
        setPreferredSize(new java.awt.Dimension(1001, 740));
        setResizable(false);

        PEncabezado.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guitarra48.png"))); // NOI18N
        PEncabezado.add(jLabel15);
        jLabel15.setBounds(20, 0, 50, 60);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Gestión de Canciones");
        PEncabezado.add(jLabel16);
        jLabel16.setBounds(100, 20, 300, 25);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        PEncabezado.add(jLabel14);
        jLabel14.setBounds(0, 0, 1001, 69);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 70));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 70));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        BNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new2.png"))); // NOI18N
        BNuevo.setToolTipText("Nuevo registro");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(BNuevo);

        BRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add1.png"))); // NOI18N
        BRegistrar.setToolTipText("Registrar");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(BRegistrar);

        BEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit2.png"))); // NOI18N
        BEditar.setToolTipText("Editar");
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BEditar);

        BBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete1.png"))); // NOI18N
        BBorrar.setToolTipText("Remover");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(BBorrar);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 70));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 70));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 70));
        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        jLabel8.setText("Titulo/Autor");
        jPanel6.add(jLabel8);
        jPanel6.add(tTitulo);

        jPanel3.add(jPanel6);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jLabel9.setText("Género");
        jPanel5.add(jLabel9);
        jPanel5.add(tGenero);

        jPanel3.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        jLabel10.setText("Artista");
        jPanel4.add(jLabel10);
        jPanel4.add(tArtista);

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout PAccionesLayout = new javax.swing.GroupLayout(PAcciones);
        PAcciones.setLayout(PAccionesLayout);
        PAccionesLayout.setHorizontalGroup(
            PAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAccionesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PAccionesLayout.setVerticalGroup(
            PAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAccionesLayout.createSequentialGroup()
                .addGroup(PAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PCanciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));

        jLabel1.setForeground(new java.awt.Color(100, 116, 139));
        jLabel1.setText("ID:");

        jLabel2.setForeground(new java.awt.Color(100, 116, 139));
        jLabel2.setText("TITULO:");

        jLabel3.setForeground(new java.awt.Color(100, 116, 139));
        jLabel3.setText("AUTOR:");

        TID.setForeground(new java.awt.Color(30, 41, 59));

        TCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TCancionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TCanciones);

        jLabel13.setBackground(new java.awt.Color(30, 41, 59));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(30, 41, 59));
        jLabel13.setText("Canciones");

        javax.swing.GroupLayout PCancionesLayout = new javax.swing.GroupLayout(PCanciones);
        PCanciones.setLayout(PCancionesLayout);
        PCancionesLayout.setHorizontalGroup(
            PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCancionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(TAutor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(PCancionesLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PCancionesLayout.setVerticalGroup(
            PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCancionesLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCancionesLayout.createSequentialGroup()
                        .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PVersiones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));

        jLabel4.setForeground(new java.awt.Color(100, 116, 139));
        jLabel4.setText("GENERO:");

        jLabel5.setForeground(new java.awt.Color(100, 116, 139));
        jLabel5.setText("DURACION (seg):");

        SDuracion.setModel(new javax.swing.SpinnerNumberModel(60, 60, null, 1));

        TVersiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TVersiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TVersionesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TVersiones);

        BAgregarVersion.setBackground(new java.awt.Color(25, 118, 210));
        BAgregarVersion.setForeground(new java.awt.Color(255, 255, 255));
        BAgregarVersion.setText("Agregar versión");

        jLabel11.setBackground(new java.awt.Color(30, 41, 59));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(30, 41, 59));
        jLabel11.setText("Versiones");

        javax.swing.GroupLayout PVersionesLayout = new javax.swing.GroupLayout(PVersiones);
        PVersiones.setLayout(PVersionesLayout);
        PVersionesLayout.setHorizontalGroup(
            PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PVersionesLayout.createSequentialGroup()
                .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PVersionesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BAgregarVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SDuracion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(TGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        PVersionesLayout.setVerticalGroup(
            PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PVersionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PVersionesLayout.createSequentialGroup()
                        .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PVersionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(SDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAgregarVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PInterpretes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));

        TInterpretes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TInterpretes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TInterpretesMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TInterpretes);

        jLabel6.setForeground(new java.awt.Color(100, 116, 139));
        jLabel6.setText("ARTISTA:");

        jLabel7.setForeground(new java.awt.Color(100, 116, 139));
        jLabel7.setText("ROL:");

        CBArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "Colaborador" }));

        BAgregarInterprete.setBackground(new java.awt.Color(25, 118, 210));
        BAgregarInterprete.setForeground(new java.awt.Color(255, 255, 255));
        BAgregarInterprete.setText("Agregar intérprete");

        jLabel12.setBackground(new java.awt.Color(30, 41, 59));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(30, 41, 59));
        jLabel12.setText("Artistas");

        javax.swing.GroupLayout PInterpretesLayout = new javax.swing.GroupLayout(PInterpretes);
        PInterpretes.setLayout(PInterpretesLayout);
        PInterpretesLayout.setHorizontalGroup(
            PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInterpretesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CBRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAgregarInterprete, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(CBArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3))
            .addGroup(PInterpretesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PInterpretesLayout.setVerticalGroup(
            PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInterpretesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInterpretesLayout.createSequentialGroup()
                        .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CBArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PInterpretesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(BAgregarInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PVersiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PInterpretes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(PEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PVersiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PInterpretes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
                                                
        Object[] res = cnx.ejecutarCRUD(
                "gestionar_cancion",
                new Object[]{
                    "I",
                    TID.getText(),
                    TTitulo.getText(),
                    TAutor.getText()
                }
        );

        if (Integer.parseInt(res[0].toString()) == 1) {
            cnx.entablar(canciones, TCanciones, 20, 40, 40);
            try {
                cascada();
            } catch (IllegalArgumentException e) {
                ((DefaultTableModel) TInterpretes.getModel()).setRowCount(0);
            }

            TID.setText("");
            TTitulo.setText("");
            TAutor.setText("");
            TID.setEditable(true);
            TID.requestFocus();
        }

        JOptionPane.showMessageDialog(this, res[1]);
    

    }//GEN-LAST:event_BRegistrarActionPerformed

    private void TCancionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TCancionesMousePressed
        DefaultTableModel modelo = (DefaultTableModel) TCanciones.getModel();
        int ren = TCanciones.getSelectedRow();
        if (ren > +0) {
            String id = modelo.getValueAt(ren, 0).toString();
            
            TID.setText(id);
            TTitulo.setText(modelo.getValueAt(ren, 1).toString());
            TAutor.setText(modelo.getValueAt(ren, 2).toString());
            TID.setEditable(false);
            String sql = String.format(versiones, id);
            cnx.entablar(sql, TVersiones);
            
            
        }
    }//GEN-LAST:event_TCancionesMousePressed

    private void TVersionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TVersionesMousePressed
        DefaultTableModel modelo = (DefaultTableModel) TVersiones.getModel();
        int ren = TVersiones.getSelectedRow();
        if (ren > +0) {
            String id = modelo.getValueAt(ren, 0).toString();
            String sql = String.format(interpretaciones, id);
            cnx.entablar(sql, TInterpretes);
            
            
            TVersiones.setRowSelectionInterval(0, 0);
        int renv = TVersiones.getSelectedRow();
        if (renv > +0) {
            String idv = modelo.getValueAt(ren, 0).toString();
            String sqlv = String.format(interpretaciones, idv);
            cnx.entablar(sqlv, TInterpretes);
        }
        }
    }//GEN-LAST:event_TVersionesMousePressed

    private void TInterpretesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TInterpretesMousePressed
        DefaultTableModel modelo = (DefaultTableModel) TInterpretes.getModel();
        int ren = TInterpretes.getSelectedRow();
        if (ren > +0) {
            String id = modelo.getValueAt(ren, 0).toString();
            String sql = String.format(versiones, id);
            cnx.entablar(sql, TVersiones);
        }
    }//GEN-LAST:event_TInterpretesMousePressed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        // TODO add your handling code here:
        if(TID.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Primero selecciona una canción de la tabla.");
            return;
        }
        Object[] res = cnx.ejecutarCRUD(
                "gestionar_cancion",
                new Object[]{
                    "U", // 'U' de Update (si tu procedimiento usa 'E' o 'M', cámbialo aquí)
                    TID.getText(),
                    TTitulo.getText(),
                    TAutor.getText()
                }
        );
        if (Integer.parseInt(res[0].toString()) == 1) {
            cnx.entablar(canciones, TCanciones, 20, 40, 40);
            try {
                cascada();
            } catch (IllegalArgumentException e) {
                ((DefaultTableModel) TInterpretes.getModel()).setRowCount(0);
            }
            
            // Limpiar y volver a habilitar el ID para futuros registros
            TID.setText("");
            TTitulo.setText("");
            TAutor.setText("");
            TID.setEditable(true);
        }

        JOptionPane.showMessageDialog(this, res[1]);
        
    
    }//GEN-LAST:event_BEditarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
                                        
        if (TID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Primero selecciona una canción de la tabla.");
            return;
        }

        Object[] res = cnx.ejecutarCRUD(
                "borrar_cancion",
                new Object[]{
            TID.getText()
        
                }
        );

        if (Integer.parseInt(res[0].toString()) == 1) {
            cnx.entablar(canciones, TCanciones, 20, 40, 40);
            try {
                cascada();
            } catch (IllegalArgumentException e) {
                ((DefaultTableModel) TInterpretes.getModel()).setRowCount(0);
            }

            TID.setText("");
            TTitulo.setText("");
            TAutor.setText("");
            TID.setEditable(true);
        }

        JOptionPane.showMessageDialog(this, res[1]);
       
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        // TODO add your handling code here:
        TID.setText("");
        TTitulo.setText("");
        TAutor.setText("");
        TID.setEditable(true);
        TID.requestFocus();
    }//GEN-LAST:event_BNuevoActionPerformed

    public static void main(String args[]) {
        try {
            // Tema Flat para la ventana
            com.formdev.flatlaf.FlatLightLaf.setup();

            // Bordes redondeados
            UIManager.put("Button.arc", 12);
            UIManager.put("Component.arc", 10);
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Component.focusWidth", 2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTelemusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarInterprete;
    private javax.swing.JButton BAgregarVersion;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JComboBox<String> CBArtista;
    private javax.swing.JComboBox<String> CBRol;
    private javax.swing.JPanel PAcciones;
    private javax.swing.JPanel PCanciones;
    private javax.swing.JPanel PEncabezado;
    private javax.swing.JPanel PInterpretes;
    private javax.swing.JPanel PVersiones;
    private javax.swing.JSpinner SDuracion;
    private javax.swing.JTextField TAutor;
    private javax.swing.JTable TCanciones;
    private javax.swing.JTextField TGenero;
    private javax.swing.JTextField TID;
    private javax.swing.JTable TInterpretes;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JTable TVersiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tArtista;
    private javax.swing.JTextField tGenero;
    private javax.swing.JTextField tTitulo;
    // End of variables declaration//GEN-END:variables

    private void estilizarTabla(JTable tabla) {
        tabla.setRowHeight(20); // Filas más altas y legibles
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(false); // Quitar líneas verticales
        tabla.setGridColor(new Color(241, 245, 249));
        tabla.setSelectionBackground(new Color(238, 242, 255)); // Selección azul suave
        tabla.setSelectionForeground(new Color(67, 56, 202));

        // Encabezado limpio
        JTableHeader header = tabla.getTableHeader();
        header.setBackground(new Color(248, 250, 252));
        header.setForeground(new Color(100, 116, 139));
        header.setFont(new Font("Segoe UI", Font.BOLD, 12));
        header.setPreferredSize(new Dimension(header.getWidth(), 34));
    }

    private void ajustesUI() {
        PCanciones.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1, #E2E8F0, 1, 16");
        PVersiones.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1, #E2E8F0, 1, 16");
        PInterpretes.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1, #E2E8F0, 1, 16");

        tTitulo.putClientProperty("JTextField.placeholderText", "Buscar por título o autor...");
        tGenero.putClientProperty("JTextField.placeholderText", "Filtrar género...");
        tArtista.putClientProperty("JTextField.placeholderText", "Filtrar artista...");

        estilizarTabla(TCanciones);
        estilizarTabla(TVersiones);
        estilizarTabla(TInterpretes);

        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane3.setBorder(BorderFactory.createEmptyBorder());

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guitarra.png")).getImage());

        setLocationRelativeTo(this);
    }

    public void cascada() {
        DefaultTableModel modeloC = (DefaultTableModel) TCanciones.getModel();
        DefaultTableModel modeloV = (DefaultTableModel) TVersiones.getModel();

        cnx.entablar(canciones, TCanciones);
        TCanciones.setRowSelectionInterval(0, 0);
        
        int ren = TCanciones.getSelectedRow();
        if (ren > +0) {
            String id = modeloC.getValueAt(ren, 0).toString();
            String sql = String.format(versiones, id);
            cnx.entablar(sql, TVersiones);
            
        
        TVersiones.setRowSelectionInterval(0, 0);
        int renv = TVersiones.getSelectedRow();
        if (renv > +0) {
            String idv = modeloV.getValueAt(ren, 0).toString();
            String sqlv = String.format(interpretaciones, idv);
            cnx.entablar(sqlv, TInterpretes);
        }
    }
    }
}
