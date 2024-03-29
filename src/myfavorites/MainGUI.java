//This class was created on 2019.09.28 by Jaco van Stryp
package myfavorites;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaco van Stryp
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        for (int i = 1; i < 10; i++) {
            this.loadNamesSmart(i);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMode = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 128, 37));

        btnMode.setBackground(new java.awt.Color(255, 51, 51));
        btnMode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMode.setForeground(new java.awt.Color(255, 255, 255));
        btnMode.setText("Toggle Mode [Active]");
        btnMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 0, 51));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Click To Set");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 0, 51));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Click To Set");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 0, 51));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Click To Set");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 0, 51));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("Click To Set");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 0, 51));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("Click To Set");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 0, 51));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("Click To Set");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 0, 51));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("Click To Set");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 0, 51));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("Click To Set");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 0, 51));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("Click To Set");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnMode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 490, 300));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quick Run");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
boolean editing = false;
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (editing == true) {
            setupButton(1);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(1);
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (editing == true) {
            setupButton(2);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(2);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (editing == true) {
            setupButton(3);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(3);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (editing == true) {
            setupButton(4);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(4);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (editing == true) {
            setupButton(5);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(5);
        }

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (editing == true) {
            setupButton(6);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(6);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (editing == true) {
            setupButton(7);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(7);
        }

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (editing == true) {
            setupButton(8);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(8);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (editing == true) {
            setupButton(9);
            btnMode.setText("Toggle Mode [Active]");
        } else {
            runButton(9);
        }

    }//GEN-LAST:event_btn9ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeActionPerformed
        if (editing == false) {
            editing = true;
            btnMode.setText("Toggle Mode [Editing]");
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
        } else {
            editing = false;
            btnMode.setText("Toggle Mode [Active]");
            for (int i = 1; i < 10; i++) {
                loadNamesSmart(i);
            }
        }

    }//GEN-LAST:event_btnModeActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    public void runButton(int btnVal) {

        try {
            Scanner scFile = new Scanner(new File("" + btnVal + ".txt"));
            String url = scFile.nextLine();
            System.out.println("Attempting to open: " + url);
            System.out.println(url.substring(0, 3));
            if (url.substring(0, 3).equalsIgnoreCase("www") || url.substring(0, 4).equalsIgnoreCase("http")) {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(url);
                desktop.browse(oURL);
            } else {
                Desktop.getDesktop().open(new File(url));
            }

            scFile.close();
        } catch (Exception e) {
            setupButton(btnVal);
        }

    }

    public void setupButton(int btnVal) {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter("" + btnVal + ".txt", false));
            String input = JOptionPane.showInputDialog("Enter the location of the file linked to this button");
            printer.print(input);
            printer.close();
            System.out.println("Printing " + input + " to " + "" + btnVal + ".txt");
            loadNames(btnVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadNames(int curName) {
        if (editing == true) {
            editing = false;

            try {
                String input = JOptionPane.showInputDialog("What is the name of this file?");
                PrintWriter printer = new PrintWriter(new FileWriter(curName + "-N.txt", false));
                printer.println(input);
                printer.close();
            } catch (Exception d) {
                d.printStackTrace();
            }

            for (int i = 1; i < 10; i++) {
                loadNamesSmart(i);

            }

        } else {

            try {
                Scanner scFile = new Scanner(new File(curName + "-N.txt"));
                String scLine = scFile.nextLine();
                switch (curName) {
                    case 1:
                        btn1.setText(scLine);
                        break;
                    case 2:
                        btn2.setText(scLine);
                        break;
                    case 3:
                        btn3.setText(scLine);
                        break;
                    case 4:
                        btn4.setText(scLine);
                        break;
                    case 5:
                        btn5.setText(scLine);
                        break;
                    case 6:
                        btn6.setText(scLine);
                        break;
                    case 7:
                        btn7.setText(scLine);
                        break;
                    case 8:
                        btn8.setText(scLine);
                        break;
                    case 9:
                        btn9.setText(scLine);
                        break;

                    default:
                    // code block
                }
            } catch (Exception e) {
                try {
                    String input = JOptionPane.showInputDialog("Enter the name for button #" + curName);
                    PrintWriter printer = new PrintWriter(new FileWriter(curName + "-N.txt", false));
                    printer.println(input);
                    printer.close();
                    loadNames(curName);
                } catch (Exception d) {
                    d.printStackTrace();
                }
            }
        }
    }

    public void loadNamesSmart(int curName) {
        try {
            Scanner scFile = new Scanner(new File(curName + "-N.txt"));
            String scLine = scFile.nextLine();
            switch (curName) {
                case 1:
                    btn1.setText(scLine);
                    break;
                case 2:
                    btn2.setText(scLine);
                    break;
                case 3:
                    btn3.setText(scLine);
                    break;
                case 4:
                    btn4.setText(scLine);
                    break;
                case 5:
                    btn5.setText(scLine);
                    break;
                case 6:
                    btn6.setText(scLine);
                    break;
                case 7:
                    btn7.setText(scLine);
                    break;
                case 8:
                    btn8.setText(scLine);
                    break;
                case 9:
                    btn9.setText(scLine);
                    break;

                default:
                // code block
                }
        } catch (Exception e) {
            switch (curName) {
                case 1:
                    btn1.setVisible(false);
                    break;
                case 2:
                    btn2.setVisible(false);

                    break;
                case 3:
                    btn3.setVisible(false);

                    break;
                case 4:
                    btn4.setVisible(false);

                    break;
                case 5:
                    btn5.setVisible(false);

                    break;
                case 6:
                    btn6.setVisible(false);

                    break;
                case 7:
                    btn7.setVisible(false);

                    break;
                case 8:
                    btn8.setVisible(false);

                    break;
                case 9:
                    btn9.setVisible(false);

                    break;

                default:
                // code block
                }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
