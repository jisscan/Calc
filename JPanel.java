/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Maby
 */
public class JPanel extends javax.swing.JPanel {
       private javax.swing.JTextField display1;
    /**
     * Creates new form JPanel
     */
    public JPanel() {
        initComponents();
    }
        private double num1 = 0;
        private double num2 = 0;
        private String operator;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JPanel();
        display1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBdtwo = new javax.swing.JButton();
        jBtree = new javax.swing.JButton();
        jBfour = new javax.swing.JButton();
        jBone = new javax.swing.JButton();
        jBfive = new javax.swing.JButton();
        jBsix = new javax.swing.JButton();
        jBnine = new javax.swing.JButton();
        jBeight = new javax.swing.JButton();
        jBseven = new javax.swing.JButton();
        jBpoint = new javax.swing.JButton();
        jBcero = new javax.swing.JButton();
        jBequal = new javax.swing.JButton();
        JBMinus = new javax.swing.JButton();
        JBSum1 = new javax.swing.JButton();
        JBTimes = new javax.swing.JButton();
        JBDiv = new javax.swing.JButton();

        display1.setText("display");
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jBdtwo.setText("2");
        jBdtwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBdtwoMouseClicked(evt);
            }
        });

        jBtree.setText("3");
        jBtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtreeMouseClicked(evt);
            }
        });

        jBfour.setText("4");
        jBfour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBfourMouseClicked(evt);
            }
        });

        jBone.setText("1");
        jBone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBoneMouseClicked(evt);
            }
        });

        jBfive.setText("5");
        jBfive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBfiveMouseClicked(evt);
            }
        });

        jBsix.setText("6");
        jBsix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBsixMouseClicked(evt);
            }
        });

        jBnine.setText("9");
        jBnine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBnineMouseClicked(evt);
            }
        });

        jBeight.setText("8");
        jBeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBeightMouseClicked(evt);
            }
        });

        jBseven.setText("7");
        jBseven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBsevenMouseClicked(evt);
            }
        });

        jBpoint.setText(".");
        jBpoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBpointMouseClicked(evt);
            }
        });

        jBcero.setText("0");
        jBcero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBceroMouseClicked1(evt);
            }
        });

        jBequal.setText("=");
        jBequal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBequalMouseClicked(evt);
            }
        });

        JBMinus.setText("-");
        JBMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBMinusMouseClicked(evt);
            }
        });

        JBSum1.setText("+");
        JBSum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBSum1MouseClicked(evt);
            }
        });

        JBTimes.setText("*");
        JBTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBTimesMouseClicked(evt);
            }
        });

        JBDiv.setText("/");
        JBDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBDivMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBcero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBequal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBseven, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBeight, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBnine, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBfour, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBfive, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBsix, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBone, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBdtwo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtree, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtree, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBdtwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfive, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsix, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBseven, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBequal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

        

    private void JBSum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSum1MouseClicked
        // Almacenamos el número actual del display1 en num1
    num1 = Double.parseDouble(display1.getText());
    // Establecemos el operador como "+"
    operator = "+";
    // Limpiamos el display para el siguiente número
    display1.setText("+");
    }//GEN-LAST:event_JBSum1MouseClicked

    private void JBTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBTimesMouseClicked
        num1 = Double.parseDouble(display1.getText());
    // Establecemos el operador como "+"
    operator = "*";
    // Limpiamos el display para el siguiente número
    display1.setText("*");
    }//GEN-LAST:event_JBTimesMouseClicked

    private void JBMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMinusMouseClicked
        num1 = Double.parseDouble(display1.getText());
    // Establecemos el operador como "+"
    operator = "+";
    // Limpiamos el display para el siguiente número
    display1.setText("+");
    }//GEN-LAST:event_JBMinusMouseClicked

    private void JBDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBDivMouseClicked
        num1 = Double.parseDouble(display1.getText());
    // Establecemos el operador como "+"
    operator = "/";
    // Limpiamos el display para el siguiente número
    display1.setText("/");
    }//GEN-LAST:event_JBDivMouseClicked

    private void jBequalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBequalMouseClicked
            num2 = Double.parseDouble(display1.getText());

         // Realizamos la operación dependiendo del operador
         double result = 0; // Inicializamos la variable result
         switch (operator) {
             case "+":
                 result = num1 + num2;
                 break;
             case "-":
                 result = num1 - num2;
                 break;
             case "*":
                 result = num1 * num2;
                 break;
             case "/":
                 if (num2 != 0) { // Comprobamos que no se divida por cero
                     result = num1 / num2;
                 } else {
                     display1.setText("Error"); // Mensaje de error en caso de división por cero
                     return; // Salimos del método
                 }
                 break;
             default:
                 display1.setText("Error"); // Mensaje de error si el operador no es válido
                 return; // Salimos del método
         }

    // Mostramos el resultado en el display
    display1.setText(String.valueOf(result));
}
    }//GEN-LAST:event_jBequalMouseClicked

    private void jBnineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBnineMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("9");
            num1 = 9; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "9");
            num2 = 9;
        }
    }//GEN-LAST:event_jBnineMouseClicked

    private void jBsixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsixMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("6");
            num1 = 6; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "6");
            num2 = 6;
        }
    }//GEN-LAST:event_jBsixMouseClicked

    private void jBtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtreeMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("3");
            num1 = 3; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "3");
            num2 = 3;
        }
    }//GEN-LAST:event_jBtreeMouseClicked

    private void jBdtwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBdtwoMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("2");
            num1 = 2; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "2");
            num2 = 2;
        }
    }//GEN-LAST:event_jBdtwoMouseClicked

    private void jBoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoneMouseClicked
       if (display1.getText().isEmpty()) {
            display1.setText("1");
            num1 = 1; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "1");
            num2 = 11;
        }
    }//GEN-LAST:event_jBoneMouseClicked

    private void jBfiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBfiveMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("5");
            num1 = 5; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "5");
            num2 = 5;
        }
    }//GEN-LAST:event_jBfiveMouseClicked

    private void jBeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeightMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("8");
            num1 = 8; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "8");
            num2 = 8;
        }
    }//GEN-LAST:event_jBeightMouseClicked

    private void jBceroMouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBceroMouseClicked1
        if (display1.getText().isEmpty()) {
            display1.setText("0");
            num1 = 0; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "0");
            num2 = 0;
        }
    }//GEN-LAST:event_jBceroMouseClicked1

    private void jBpointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBpointMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBpointMouseClicked

    private void jBsevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsevenMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("0");
            num1 = 0; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "0");
            num2 = 0;
        }
    }//GEN-LAST:event_jBsevenMouseClicked

    private void jBfourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBfourMouseClicked
        if (display1.getText().isEmpty()) {
            display1.setText("4");
            num1 = 4; 
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "4");
            num2 = 4;
        }
    }//GEN-LAST:event_jBfourMouseClicked

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        if (display1.getText().isEmpty()) {
            display1.setText("7");
            num1 = 7;
        } else {
            String valorAnt = display1.getText();
            display1.setText(valorAnt + "7");
            num2 = 7;
        }
    }//GEN-LAST:event_display1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDiv;
    private javax.swing.JButton JBMinus;
    private javax.swing.JButton JBSum1;
    private javax.swing.JButton JBTimes;
    private javax.swing.JPanel display;
    private javax.swing.JTextField display1;
    private javax.swing.JButton jBcero;
    private javax.swing.JButton jBdtwo;
    private javax.swing.JButton jBeight;
    private javax.swing.JButton jBequal;
    private javax.swing.JButton jBfive;
    private javax.swing.JButton jBfour;
    private javax.swing.JButton jBnine;
    private javax.swing.JButton jBone;
    private javax.swing.JButton jBpoint;
    private javax.swing.JButton jBseven;
    private javax.swing.JButton jBsix;
    private javax.swing.JButton jBtree;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

   public static void main(String[] args) {
        // Inicializamos la interfaz gráfica en el Event Dispatch Thread (EDT)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crear una nueva ventana JFrame y hacerla visible
                JFrame frame = new JFrame();
                frame.setVisible(true); // Hacer el JFrame visible
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura la operación de cierre
                frame.setSize(300, 400); // Establecer el tamaño del JFrame (puedes ajustar el tamaño)
                frame.setTitle("Calculadora"); // Título del JFrame
            }
        });
    }
