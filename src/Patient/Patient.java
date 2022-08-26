/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;


import MainMenu.MainMenu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Patient extends javax.swing.JFrame {
private JFrame frame;
    /**
     * Creates new form Patient
     */
    public Patient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TABSelection = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TABSelection1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        p5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        p6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        p7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        p8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MainMenuBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        p9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(908, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABSelection.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TABSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a Selection", "Male", "Female", "Other" }));
        TABSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TABSelectionActionPerformed(evt);
            }
        });
        getContentPane().add(TABSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        TABSelection1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TABSelection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a Selection", "A +ve", "A -ve", "B +ve", "B -ve", "AB +ve", "AB -ve", "O  +ve", "O  -ve", " " }));
        TABSelection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TABSelection1ActionPerformed(evt);
            }
        });
        getContentPane().add(TABSelection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Enter Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Birth Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        p2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        p3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Phone No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        p4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Email ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        p5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Reg Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        p6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Age");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        p7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("City");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        p8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 200, 30));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 910, 50));

        MainMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MainMenuBtn.setText("Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MainMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 465, 130, 30));

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(0, 153, 0));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 465, 120, 30));

        ViewBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 465, 110, 30));

        RESET.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RESET.setForeground(new java.awt.Color(102, 102, 0));
        RESET.setText("Reset");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        getContentPane().add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 465, 120, 30));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Exit.setForeground(new java.awt.Color(204, 51, 0));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 465, 110, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Symptomps");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        p9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TABSelectionActionPerformed
        
    }//GEN-LAST:event_TABSelectionActionPerformed

    private void TABSelection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TABSelection1ActionPerformed


    }//GEN-LAST:event_TABSelection1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p8ActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        this.setVisible(false);
        MainMenu mob=new MainMenu();
        mob.setVisible(true);
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        String k1=p1.getText().toString();
        String k2=p2.getText().toString();
        String k3=p3.getText().toString();
        String k5=p5.getText().toString();
        String k6=p6.getText().toString();
        String k7=p7.getText().toString();
        String k8=p8.getText().toString();
        try{
            FileWriter writer=new FileWriter("patient.txt",true);
            writer.write(k1);
            writer.write("  ");
            writer.write(k2);
            writer.write("  ");
            writer.write(k3);
            writer.write("  ");
            writer.write(k5);
            writer.write("  ");
            writer.write(k6);
            writer.write("  ");
            writer.write(k7);
            writer.write("  ");
            writer.write(k8);
            writer.write("  ");
           
            writer.write(System.getProperty("line.separator"));
            writer.close();
            JOptionPane.showMessageDialog(rootPane,"Success!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error!");
        }

    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        try{
            Scanner inFile = new Scanner(new File("G:\\Hospital Management System(Final)/patient.txt"));
            String[] s=new String[10000];
            int i=0;
            while(inFile.hasNext())
            {
                String check = inFile.nextLine();
                s[i]=check;
                i++;

            }
            JOptionPane.showMessageDialog(null, s, "Checking Patient's Data", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(rootPane,"No File!");
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        p1.setText("");
        p2.setText("");
        p3.setText("");

        p5.setText("");
        p6.setText("");
        p7.setText("");
        p8.setText("");
       
        TABSelection.getModel().setSelectedItem("Make a Selection");
    }//GEN-LAST:event_RESETActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        frame=new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Hospital Management Systems",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p9ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Patient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JButton RESET;
    private javax.swing.JComboBox<String> TABSelection;
    private javax.swing.JComboBox<String> TABSelection1;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField p7;
    private javax.swing.JTextField p8;
    private javax.swing.JTextField p9;
    // End of variables declaration//GEN-END:variables
}