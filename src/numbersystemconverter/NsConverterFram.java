/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package numbersystemconverter;

import java.awt.Color;
import javax.swing.JColorChooser;

// To convert between different systems (binary, octal, decimal and hexadecimal)

public class NsConverterFram extends javax.swing.JFrame {

   
    public NsConverterFram() {
        initComponents();
    }
    
     // decimal to ->
    private String decimalToBinary (String num)
    {
         String bin = Long.toBinaryString(toint(num));
        return bin;
    }  
        private String decimalToOctal (String num)
    {
         String oct = Long.toOctalString(toint(num));
        return oct;
    } 
       private String decimalToHexdecimal (String num)
    {
          String hex = Long.toHexString(toint(num));
        return hex;
    } 
            
    
            
     // binary to ->
           private String binaryToDecimal (String num)
    {
        long decimal=Long.parseLong(num,2);  
        return tostring (decimal );
    }  
        private String binaryToOctal (String num)
    {
        long decimal=Long.parseLong(num,2);  
        
        return decimalToOctal ( tostring (decimal) ) ;
    } 
            private String binaryToHexdecimal (String num)
    {
        long decimal=Long.parseLong(num,2);  
        return decimalToHexdecimal ( tostring (decimal) ) ;
    }
    
   
    // octal to ->
        private String octalToDecimal (String num)
    {
        long decimal=Long.parseLong(num,8);  
        return tostring (decimal );
    }  
        private String octalToBinary (String num)
    {       
        long decimal=Long.parseLong(num,8);  
        
        return decimalToBinary ( tostring (decimal) ) ;
    } 
            private String octalToHexdecimal (String num)
    {
        long decimal=Long.parseLong(num,8);  
        
        return decimalToHexdecimal ( tostring (decimal) ) ;
    } 
            
            
            
            
    // hexdecimal to ->
         private String hexdecimalToDecimal (String num)
    {
        long decimal=Long.parseLong(num,16);  
        return tostring (decimal );
    }  
        private String hexdecimalToBinary (String num)
    {
        long decimal=Long.parseLong(num,16);  
        
        return decimalToBinary ( tostring (decimal) ) ;
    } 
         private String hexdecimalToOctal (String num)
    {
        long decimal=Long.parseLong(num,16);  
        
        return decimalToOctal ( tostring (decimal) ) ;
    } 
    
            
    
    
            
    private long toint (String num)
    {
        return Long.parseLong(num);
    }
     private String tostring (long num)
    {
        
        return String.valueOf(num); 
    }
            
            
     
    public void setColor (Color color)
    {
       p1.setBackground( color);
        decimal1.setBackground(color);
        binary1.setBackground(color);
        octal1.setBackground(color);
        hexdecimal1.setBackground(color);
                decimal2.setBackground(color);
        binary2.setBackground(color);
        octal2.setBackground(color);
        hexdecimal2.setBackground(color);  
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JPanel();
        decimal2 = new javax.swing.JRadioButton();
        binary2 = new javax.swing.JRadioButton();
        octal2 = new javax.swing.JRadioButton();
        hexdecimal2 = new javax.swing.JRadioButton();
        decimal1 = new javax.swing.JRadioButton();
        binary1 = new javax.swing.JRadioButton();
        octal1 = new javax.swing.JRadioButton();
        hexdecimal1 = new javax.swing.JRadioButton();
        input = new javax.swing.JTextField();
        convertb = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        output = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bluee = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        greenn = new javax.swing.JMenuItem();
        redd = new javax.swing.JMenuItem();
        defult = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NumberSystemConverter");
        setLocation(new java.awt.Point(500, 100));

        p1.setBackground(new java.awt.Color(255, 204, 204));

        decimal2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(decimal2);
        decimal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decimal2.setText("Decimal");

        binary2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(binary2);
        binary2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        binary2.setText("Binary");
        binary2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binary2ActionPerformed(evt);
            }
        });

        octal2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(octal2);
        octal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        octal2.setText("Octal");

        hexdecimal2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(hexdecimal2);
        hexdecimal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hexdecimal2.setText("Hexdecimal");

        decimal1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(decimal1);
        decimal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decimal1.setText("Decimal");

        binary1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(binary1);
        binary1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        binary1.setText("Binary");

        octal1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(octal1);
        octal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        octal1.setText("Octal");

        hexdecimal1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(hexdecimal1);
        hexdecimal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hexdecimal1.setText("Hexdecimal");

        input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        convertb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        convertb.setText("convert");
        convertb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        output.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimal2)
                            .addComponent(decimal1))
                        .addGap(55, 55, 55)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(binary2)
                            .addComponent(binary1))
                        .addGap(36, 36, 36)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(octal2)
                            .addComponent(octal1))
                        .addGap(36, 36, 36)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hexdecimal1)
                            .addComponent(hexdecimal2)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(convertb, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binary1)
                    .addComponent(decimal1)
                    .addComponent(octal1)
                    .addComponent(hexdecimal1))
                .addGap(47, 47, 47)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(convertb, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binary2)
                    .addComponent(decimal2)
                    .addComponent(octal2)
                    .addComponent(hexdecimal2))
                .addGap(117, 117, 117))
        );

        bluee.setText("Edit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("blue");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bluee.add(jMenuItem1);

        greenn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        greenn.setText("green");
        greenn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greennActionPerformed(evt);
            }
        });
        bluee.add(greenn);

        redd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redd.setText("red");
        redd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reddActionPerformed(evt);
            }
        });
        bluee.add(redd);

        defult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        defult.setText("defult");
        defult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defultActionPerformed(evt);
            }
        });
        bluee.add(defult);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("color");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        bluee.add(jMenuItem2);

        jMenuBar1.add(bluee);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void convertbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbActionPerformed
       if (decimal1.isSelected())
       {
           if (decimal2.isSelected())
           {
               output.setText(input.getText());
           }
           else if (binary2.isSelected())
           {
              output.setText( decimalToBinary(input.getText())  );
           }
          else if (octal2.isSelected())
           {
               output.setText( decimalToOctal(input.getText())  );
           }
          else if (hexdecimal2.isSelected())
           {
                output.setText( decimalToHexdecimal(input.getText())  );
           }
           else
          {
             output.setText("Please choose from the options listed below");
          }
       }
       //-----------------------------------------------------//
       else if (binary1.isSelected())
       {
            if (decimal2.isSelected())
           {
               output.setText( binaryToDecimal(input.getText())  );
           }
           else if (binary2.isSelected())
           {
               output.setText(input.getText());
           }
          else if (octal2.isSelected())
           {
               output.setText( binaryToOctal(input.getText())  );
           }
          else if (hexdecimal2.isSelected())
           {
               output.setText( binaryToHexdecimal(input.getText())  );
           }
           else
          {
              output.setText("Please choose from the options listed below");
          }
       }
       //----------------------------------------------------------//
        else if (octal1.isSelected())
       {
            if (decimal2.isSelected())
           {
               output.setText( octalToDecimal(input.getText())  );
           }
           else if (binary2.isSelected())
           {
               output.setText( octalToBinary(input.getText())  );
           }
          else if (octal2.isSelected())
           {
               output.setText(input.getText());
           }
          else if (hexdecimal2.isSelected())
           {
               output.setText( octalToHexdecimal(input.getText())  );
           }
           else
          {
              output.setText("Please choose from the options listed below");
          } 
       }
        //--------------------------------------------------------//
       else if (hexdecimal1.isSelected())
       {
            if (decimal2.isSelected())
           {
               output.setText( hexdecimalToDecimal(input.getText())  );
           }
           else if (binary2.isSelected())
           {
               output.setText( hexdecimalToBinary(input.getText())  );
           }
          else if (octal2.isSelected())
           {
               output.setText( hexdecimalToOctal(input.getText())  );
           }
          else if (hexdecimal2.isSelected())
           {
               output.setText(input.getText());
           }
           else
          {
             output.setText("Please choose from the options listed below"); 
          }
       }
       //----------------------------------------------------------------//
       else
       {
           output.setText("Please choose from the above options");
       }
    }//GEN-LAST:event_convertbActionPerformed

    private void binary2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binary2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_binary2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        p1.setBackground(new java.awt.Color(0, 204, 255));
        decimal1.setBackground(new java.awt.Color(0, 204, 255));
        binary1.setBackground(new java.awt.Color(0, 204, 255));
        octal1.setBackground(new java.awt.Color(0, 204, 255));
        hexdecimal1.setBackground(new java.awt.Color(0, 204, 255));
                decimal2.setBackground(new java.awt.Color(0, 204, 255));
        binary2.setBackground(new java.awt.Color(0, 204, 255));
        octal2.setBackground(new java.awt.Color(0, 204, 255));
        hexdecimal2.setBackground(new java.awt.Color(0, 204, 255));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void reddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reddActionPerformed
        p1.setBackground(new java.awt.Color(255, 102, 102));
        decimal1.setBackground(new java.awt.Color(255, 102, 102));
        binary1.setBackground(new java.awt.Color(255, 102, 102));
        octal1.setBackground(new java.awt.Color(255, 102, 102));
        hexdecimal1.setBackground(new java.awt.Color(255, 102, 102));
                decimal2.setBackground(new java.awt.Color(255, 102, 102));
        binary2.setBackground(new java.awt.Color(255, 102, 102));
        octal2.setBackground(new java.awt.Color(255, 102, 102));
        hexdecimal2.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_reddActionPerformed

    private void greennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greennActionPerformed
                p1.setBackground(new java.awt.Color(204, 255, 204));
        decimal1.setBackground(new java.awt.Color(204, 255, 204));
        binary1.setBackground(new java.awt.Color(204, 255, 204));
        octal1.setBackground(new java.awt.Color(204, 255, 204));
        hexdecimal1.setBackground(new java.awt.Color(204, 255, 204));
                decimal2.setBackground(new java.awt.Color(204, 255, 204));
        binary2.setBackground(new java.awt.Color(204, 255, 204));
        octal2.setBackground(new java.awt.Color(204, 255, 204));
        hexdecimal2.setBackground(new java.awt.Color(204, 255, 204));
    }//GEN-LAST:event_greennActionPerformed

    private void defultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defultActionPerformed
                       p1.setBackground(new java.awt.Color(255, 204, 204));
        decimal1.setBackground(new java.awt.Color(255, 204, 204));
        binary1.setBackground(new java.awt.Color(255, 204, 204));
        octal1.setBackground(new java.awt.Color(255, 204, 204));
        hexdecimal1.setBackground(new java.awt.Color(255, 204, 204));
                decimal2.setBackground(new java.awt.Color(255, 204, 204));
        binary2.setBackground(new java.awt.Color(255, 204, 204));
        octal2.setBackground(new java.awt.Color(255, 204, 204));
        hexdecimal2.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_defultActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       

        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        JColorChooser ch = new JColorChooser ();
        ch.setVisible(true);
//        Color c;
//        c = ch.showDialog(null, "select color", Color.WHITE);
//        setColor (c);
    }//GEN-LAST:event_jMenuItem2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NsConverterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NsConverterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NsConverterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NsConverterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NsConverterFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton binary1;
    private javax.swing.JRadioButton binary2;
    private javax.swing.JMenu bluee;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton convertb;
    private javax.swing.JRadioButton decimal1;
    private javax.swing.JRadioButton decimal2;
    private javax.swing.JMenuItem defult;
    private javax.swing.JMenuItem greenn;
    private javax.swing.JRadioButton hexdecimal1;
    private javax.swing.JRadioButton hexdecimal2;
    private javax.swing.JTextField input;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton octal1;
    private javax.swing.JRadioButton octal2;
    private javax.swing.JLabel output;
    private javax.swing.JPanel p1;
    private javax.swing.JMenuItem redd;
    // End of variables declaration//GEN-END:variables

}
