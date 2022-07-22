package bancoiuds.Proyecto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JFPrincipal extends javax.swing.JFrame {

    static Cliente[] clientesArray = {
        new Cliente(1, "Diego", "Ardila", 111111, 1234, 10000, 0),
        new Cliente(2, "Julio", "Martinez", 12222, 1344, 20000, 0),
        new Cliente(3, "Isabel", "Gomez", 33333, 1264, 60000, 0),};
    static List<Cliente> clientes = Arrays.asList(clientesArray);// se crea la lista para manejar mejor la lista 

    Cliente cliente; // se crea la variable global

    int operacion = 0;

    public JFPrincipal() {
        initComponents();
        cliente = new Cliente();
        this.inicializar();// se llama el metodo en el constructor principal
    }

    public void inicializar() {
        jLNombres.setText("");
        jTFValor.setVisible(false);
        this.habilitarTeclado(false);
        this.habilitarOpciones(false);
    }

    private void habilitarTeclado(boolean flag) {
        jBUno.setVisible(flag);
        jBDos.setVisible(flag);
        jBTres.setVisible(flag);
        jBCuatro.setVisible(flag);
        jBCinco.setVisible(flag);
        jBSeis.setVisible(flag);
        jBSiete.setVisible(flag);
        jBOcho.setVisible(flag);
        jBNueve.setVisible(flag);
        jBCero.setVisible(flag);
        jBBorrar.setVisible(flag);
        jBAceptar.setVisible(flag);

        jPassword.setVisible(flag);
        jLMensajes.setVisible(flag);
    }

    private void habilitarOpciones(boolean flag) {
        jBSaldo.setVisible(flag);
        jBRetirar.setVisible(flag);
        jBPin.setVisible(flag);
    }

    private void habilitarPrint(boolean flag) {
        jLImprimir.setVisible(flag);
        jBSi.setVisible(flag);
        jBNo.setVisible(flag);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNoTarjeta = new javax.swing.JTextField();
        jBIngresarTarjeta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBUno = new javax.swing.JButton();
        jBDos = new javax.swing.JButton();
        jBTres = new javax.swing.JButton();
        jBCuatro = new javax.swing.JButton();
        jBCinco = new javax.swing.JButton();
        jBSeis = new javax.swing.JButton();
        jBSiete = new javax.swing.JButton();
        jBOcho = new javax.swing.JButton();
        jBNueve = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBCero = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTFValor = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLMensajes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBSaldo = new javax.swing.JButton();
        jBRetirar = new javax.swing.JButton();
        jBPin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLImprimir = new javax.swing.JLabel();
        jBSi = new javax.swing.JButton();
        jBNo = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO AL BANCO TUNBANK");

        jLabel2.setText("Te Tumban");

        jBIngresarTarjeta.setText("Ingrese Tarjeta");
        jBIngresarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarTarjetaActionPerformed(evt);
            }
        });

        jBUno.setText("1");
        jBUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUnoActionPerformed(evt);
            }
        });

        jBDos.setText("2");
        jBDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDosActionPerformed(evt);
            }
        });

        jBTres.setText("3");
        jBTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTresActionPerformed(evt);
            }
        });

        jBCuatro.setText("4");
        jBCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCuatroActionPerformed(evt);
            }
        });

        jBCinco.setText("5");
        jBCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCincoActionPerformed(evt);
            }
        });

        jBSeis.setText("6");
        jBSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeisActionPerformed(evt);
            }
        });

        jBSiete.setText("7");
        jBSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSieteActionPerformed(evt);
            }
        });

        jBOcho.setText("8");
        jBOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOchoActionPerformed(evt);
            }
        });

        jBNueve.setText("9");
        jBNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNueveActionPerformed(evt);
            }
        });

        jBBorrar.setText("<----");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBCero.setText("0");

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBUno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                                    .addComponent(jBDos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBUno)
                    .addComponent(jBDos)
                    .addComponent(jBTres))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCuatro)
                    .addComponent(jBCinco)
                    .addComponent(jBSeis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSiete)
                    .addComponent(jBOcho)
                    .addComponent(jBNueve))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBorrar)
                    .addComponent(jBCero)
                    .addComponent(jBAceptar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLMensajes.setText("Digita tu Pin ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLMensajes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFValor, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMensajes)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jBSaldo.setText("Consulta Saldo");
        jBSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaldoActionPerformed(evt);
            }
        });

        jBRetirar.setText("Retirar");
        jBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarActionPerformed(evt);
            }
        });

        jBPin.setText("Cambiar PIN");
        jBPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSaldo)
                    .addComponent(jBPin))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRetirar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLImprimir.setText("Imprimir Recibo");

        jBSi.setText("si");

        jBNo.setText("no");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSi)
                    .addComponent(jBNo)
                    .addComponent(jLImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNo))
        );

        jLNombres.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLNombre)
                                .addGap(0, 46, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFNoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBIngresarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIngresarTarjeta)
                    .addComponent(jLNombres))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarTarjetaActionPerformed
        // TODO add your handling code here:
        this.inicializar();
        this.buscar();
    }//GEN-LAST:event_jBIngresarTarjetaActionPerformed

    private void jBUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUnoActionPerformed
        // TODO add your handling code here:
        setTeclado(1);
    }//GEN-LAST:event_jBUnoActionPerformed

    private void jBDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDosActionPerformed
        // TODO add your handling code here:
        setTeclado(2);
    }//GEN-LAST:event_jBDosActionPerformed

    private void jBTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTresActionPerformed
        // TODO add your handling code here:
        setTeclado(3);
    }//GEN-LAST:event_jBTresActionPerformed

    private void jBCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCuatroActionPerformed
        // TODO add your handling code here:
        setTeclado(4);
    }//GEN-LAST:event_jBCuatroActionPerformed

    private void jBCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCincoActionPerformed
        // TODO add your handling code here:
        setTeclado(5);
    }//GEN-LAST:event_jBCincoActionPerformed

    private void jBSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeisActionPerformed
        // TODO add your handling code here:
        setTeclado(6);
    }//GEN-LAST:event_jBSeisActionPerformed

    private void jBSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSieteActionPerformed
        // TODO add your handling code here:
        setTeclado(7);
    }//GEN-LAST:event_jBSieteActionPerformed

    private void jBOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOchoActionPerformed
        // TODO add your handling code here:
        setTeclado(8);
    }//GEN-LAST:event_jBOchoActionPerformed

    private void jBNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNueveActionPerformed
        // TODO add your handling code here:
        setTeclado(9);
    }//GEN-LAST:event_jBNueveActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        retroceso();
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed

        // TODO add your handling code here:
        switch (operacion) {
            case 0:// 
                aceptar();
                break;
            case 1:// consulta
                break;
            case 2:// retiro
                jLMensajes.setText("Digita valor $");
                retirar();
                break;
            case 3:
                cambiarPin();
                break;
            case 4:
                confirmarPin();
                break;
            default:
                aceptar();
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaldoActionPerformed
        // TODO add your handling code here:
        operacion = 1;
        consultarSaldo();
    }//GEN-LAST:event_jBSaldoActionPerformed

    private void jBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarActionPerformed

        operacion = 2;
        inicializar();
        habilitarTeclado(true);
        jPassword.setVisible(false);
        jTFValor.setVisible(true);

    }//GEN-LAST:event_jBRetirarActionPerformed

    private void jBPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPinActionPerformed
        // TODO add your handling code here:
        inicializar();
        habilitarTeclado(true);
        jPassword.setVisible(false);
        jLMensajes.setText("Digite pin anterior");
        operacion = 3;

    }//GEN-LAST:event_jBPinActionPerformed

     private void confirmarPin(){
        String pass = String.valueOf(jPassword.getPassword());
        int pin = Integer.parseInt(pass.trim());
        inicializar();
        jLMensajes.setVisible(true);
        jLMensajes.setText("Cambio exitoso");
        cliente.setPin(pin);
        clientes.set(cliente.getId() - 1, cliente);
        habilitarPrint(true);
    }

    
    
    
    private void cambiarPin() {
        String pass = String.valueOf(jPassword.getPassword());
        int pin = Integer.parseInt(pass.trim());
        if (pin < 4) {
            jLMensajes.setText("Pin debe tener 4");
            return;
        }
        if (cliente.getPin() != pin) {
            inicializar();
            jLMensajes.setText("Pin errado");
            return;
        }
        operacion = 4;
        jLMensajes.setVisible(true);
        jLMensajes.setText("Digite nuevo pin");
        jPassword.setText("");
    }

    private void retirar() {
        jLMensajes.setText("Digite valor $");
        String valor = jTFValor.getText();
        if (valor.length() == 0) {
            return;
        }
        jTFValor.setVisible(false);
        double retiro = Double.parseDouble(valor);
        if (retiro > cliente.getSaldo()) {
            inicializar();
            jLMensajes.setVisible(true);
            jLMensajes.setText("Valor mayor al saldo");
            jTFValor.setText("");
            return;
        }
        cliente.setSaldo(cliente.getSaldo() - retiro);
        clientes.set(cliente.getId() - 1, cliente);
        jTFValor.setText("");
        inicializar();
        habilitarPrint(true);

        clientes.stream().forEach(c -> {
            System.out.println(c);
        });
    }

    private void consultarSaldo() {
        inicializar();
        jLMensajes.setText("");
        jLMensajes.setVisible(true);
        jLMensajes.setText("Saldo: $" + cliente.getSaldo());
        habilitarPrint(true);
    }

// ACEPTAR METODO
    private void aceptar() {
        String pass = String.valueOf(jPassword.getPassword());
        if (pass.length() == 0) {
            jLMensajes.setText("");
            return;
        }
        validar();
        jPassword.setText("");
    }

    private void validar() {
        jLMensajes.setVisible(false);
        if (cliente.getIntentos() >= 3) {
            jLMensajes.setText("Tarjeta bloqueada");
            jLMensajes.setVisible(true);
            return;
        }
        String pass = String.valueOf(jPassword.getPassword());
        int pin = Integer.parseInt(pass.trim());
        if (cliente.getPin() == pin) {
            habilitarOpciones(true);
            jLMensajes.setVisible(false);
        } else {
            jLMensajes.setVisible(true);
            jLMensajes.setText("PIN Inválido!");
            jPassword.setVisible(true);
            cliente.setIntentos(cliente.getIntentos() + 1);
            clientes.set(cliente.getId() - 1, cliente);
        }
    }
    
    
    private void retroceso(){
        switch(operacion){
            case 0:
            case 3:
            case 4:
                String pass = String.valueOf(jPassword.getPassword());
                if(pass.length() > 0){
                    pass = pass.substring(0, pass.length() - 1);
                    jPassword.setText(pass);
                }else{
                    jPassword.setText("");
                }
                break;
            case 1:// saldo
                break;
           
            case 2:// retiro
            
                String retiro = jPassword.getText();
                if(retiro.length() > 0){
                    retiro = retiro.substring(0, retiro.length() - 1);
                    jTFValor.setText(retiro);
                }else{
                    jTFValor.setText("");
                }
                break;
                
             default:
                 
        }
    }

    private void setTeclado(int val) {
        switch (operacion) {
            case 0:// validar
                concatenarPin(val);
                break;
            case 1:// saldo
                break;
            case 2:// retiro
                concatenarValor(val);
                break;
            case 3: // concatenar el pin 
                concatenarPin(val);
                break;
            default:
                concatenarPin(val);
        }

    }

    public void concatenarValor(int val) {
        jTFValor.setText(jTFValor.getText() + val);
    }

    private void concatenarPin(int val) {
        String pass = String.valueOf(jPassword.getPassword());
        if (pass.length() < 4) {
            jPassword.setText(pass + val);
        }
    }

    private void buscar() {
        operacion = 0;
        jLMensajes.setText("");
        String cardStr = jTFNoTarjeta.getText();
        int card = Integer.parseInt(cardStr.trim());

        Optional<Cliente> clienteOpt = clientes.stream()
                .filter(c -> c.getNumCard() == card)
                .findFirst();
        jLMensajes.setVisible(true);
        if (clienteOpt.isPresent()) {
            jLMensajes.setText("DIGITA PIN");
            this.habilitarTeclado(true);
            jPassword.setVisible(true);
            cliente = clienteOpt.get();
            jLNombres.setText(cliente.getNombre() + " " + cliente.getApellido());
        } else {
            jLMensajes.setText("Tarjeta Erronea!");
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBCero;
    private javax.swing.JButton jBCinco;
    private javax.swing.JButton jBCuatro;
    private javax.swing.JButton jBDos;
    private javax.swing.JButton jBIngresarTarjeta;
    private javax.swing.JButton jBNo;
    private javax.swing.JButton jBNueve;
    private javax.swing.JButton jBOcho;
    private javax.swing.JButton jBPin;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSaldo;
    private javax.swing.JButton jBSeis;
    private javax.swing.JButton jBSi;
    private javax.swing.JButton jBSiete;
    private javax.swing.JButton jBTres;
    private javax.swing.JButton jBUno;
    private javax.swing.JLabel jLImprimir;
    private javax.swing.JLabel jLMensajes;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTFNoTarjeta;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
