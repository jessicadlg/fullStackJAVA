package IGU;

public class Formulario extends javax.swing.JFrame {

    //declaro los vectores
    String dnis[] = new String[10];
    String nombres[] = new String[10];
    String apellidos[] = new String[10];
    String direcciones[] = new String[10];
    String telefonos[] = new String[10];
    String nacimientos[] = new String[10];
    int posicion = 0;

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dniLABEL = new javax.swing.JLabel();
        direccionLABEL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnAvanzar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        IndiceLABEL = new javax.swing.JLabel();
        dniText = new javax.swing.JTextField();
        direccionText = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        nombreLABEL = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        nacimientoLABEL = new javax.swing.JLabel();
        telefonoLABEL = new javax.swing.JLabel();
        telefonoText = new javax.swing.JTextField();
        nacimientoText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        apellidoLABEL = new javax.swing.JLabel();
        campoPosicion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenica Electrónica");

        dniLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dniLABEL.setForeground(new java.awt.Color(0, 0, 102));
        dniLABEL.setText("DNI               :");

        direccionLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        direccionLABEL.setForeground(new java.awt.Color(0, 0, 102));
        direccionLABEL.setText("Dirección :");

        btnAvanzar.setText(">>");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnRetroceder.setText("<<");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        IndiceLABEL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IndiceLABEL.setForeground(new java.awt.Color(0, 0, 102));
        IndiceLABEL.setText("Indice:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        nombreLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombreLABEL.setForeground(new java.awt.Color(0, 0, 102));
        nombreLABEL.setText("Nombre       :");

        nacimientoLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nacimientoLABEL.setForeground(new java.awt.Color(0, 0, 102));
        nacimientoLABEL.setText("Fecha Nac. :");

        telefonoLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        telefonoLABEL.setForeground(new java.awt.Color(0, 0, 102));
        telefonoLABEL.setText("Telefono :");

        apellidoLABEL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        apellidoLABEL.setForeground(new java.awt.Color(0, 0, 102));
        apellidoLABEL.setText("Apellidos       :");

        campoPosicion.setEditable(false);
        campoPosicion.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(dniLABEL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(nombreLABEL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(apellidoLABEL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(59, 59, 59)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(direccionLABEL)
                                            .addComponent(telefonoLABEL))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(nacimientoLABEL)
                                            .addGap(4, 4, 4)))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nacimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(IndiceLABEL)
                                            .addGap(8, 8, 8)))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                        .addComponent(campoPosicion))
                                    .addGap(38, 38, 38)
                                    .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(jLabel1))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLABEL)
                    .addComponent(direccionLABEL)
                    .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLABEL)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoLABEL)
                    .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoLABEL)
                    .addComponent(nacimientoLABEL)
                    .addComponent(nacimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnGuardar)
                    .addComponent(btnAvanzar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IndiceLABEL)
                    .addComponent(campoPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        //guardo indice de String a int
        posicion = Integer.parseInt(campoPosicion.getText());

        //limito indice:
        if (posicion >0) {
            posicion = posicion - 1;
        }
        //modifico indice de int a String para mostrar
        campoPosicion.setText(Integer.toString(posicion));

        //actualizo todos los campos de esa posicion
        dniText.setText(dnis[posicion]);
        nombreText.setText(nombres[posicion]);
        apellidoText.setText(apellidos[posicion]);
        direccionText.setText(direcciones[posicion]);
        telefonoText.setText(telefonos[posicion]);
        nacimientoText.setText(nacimientos[posicion]);
        
       
    }//GEN-LAST:event_btnRetrocederActionPerformed
   
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //casteo 
        posicion = Integer.parseInt(campoPosicion.getText());

        //guardo el ingreso
        dnis[posicion] = dniText.getText();
        nombres[posicion] = nombreText.getText();
        apellidos[posicion] = apellidoText.getText();
        direcciones[posicion] = direccionText.getText();
        telefonos[posicion] = telefonoText.getText();
        nacimientos[posicion] = nacimientoText.getText();
        
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        //guardo indice
        posicion = Integer.parseInt(campoPosicion.getText());
        //limito indice:
        if (posicion <9) {
            posicion = posicion + 1;
        }
        //modifico indice
        campoPosicion.setText(Integer.toString(posicion));
        //actualizo todos los campos de esa posicion
        dniText.setText(dnis[posicion]);
        nombreText.setText(nombres[posicion]);
        apellidoText.setText(apellidos[posicion]);
        direccionText.setText(direcciones[posicion]);
        telefonoText.setText(telefonos[posicion]);
        nacimientoText.setText(nacimientos[posicion]);

    }//GEN-LAST:event_btnAvanzarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IndiceLABEL;
    private javax.swing.JLabel apellidoLABEL;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JTextField campoPosicion;
    private javax.swing.JLabel direccionLABEL;
    private javax.swing.JTextField direccionText;
    private javax.swing.JLabel dniLABEL;
    private javax.swing.JTextField dniText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nacimientoLABEL;
    private javax.swing.JTextField nacimientoText;
    private javax.swing.JLabel nombreLABEL;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel telefonoLABEL;
    private javax.swing.JTextField telefonoText;
    // End of variables declaration//GEN-END:variables
}
