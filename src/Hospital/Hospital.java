/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;


import LogIn.LogIn;
import MainMenu.MainMenu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MOIN
 */
public class Hospital extends javax.swing.JFrame {
    private JFrame frame;
    /**
     * Creates new form Hospital
     */
    public Hospital() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presarea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        UpdateBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        presBTN = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TABSelection = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p5 = new javax.swing.JTextField();
        p6 = new javax.swing.JTextField();
        p7 = new javax.swing.JTextField();
        p8 = new javax.swing.JTextField();
        p9 = new javax.swing.JTextField();
        p10 = new javax.swing.JTextField();
        p11 = new javax.swing.JTextField();
        p12 = new javax.swing.JTextField();
        p13 = new javax.swing.JTextField();
        p15 = new javax.swing.JTextField();
        p17 = new javax.swing.JTextField();
        p16 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Hospital Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 3, 740, 104));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1370, 110));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        presarea.setColumns(20);
        presarea.setRows(5);
        jScrollPane1.setViewportView(presarea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 410, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 410, 520));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Prescription");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 3, -1, 84));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 960, 90));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(0, 153, 0));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        ViewBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        presBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        presBTN.setForeground(new java.awt.Color(0, 102, 0));
        presBTN.setText("Prescription");
        presBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presBTNActionPerformed(evt);
            }
        });

        RESET.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RESET.setForeground(new java.awt.Color(102, 102, 0));
        RESET.setText("Reset");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Exit.setForeground(new java.awt.Color(204, 51, 0));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        MainMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MainMenuBtn.setText("Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(presBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(MainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBtn)
                    .addComponent(RESET)
                    .addComponent(presBTN)
                    .addComponent(Exit)
                    .addComponent(UpdateBtn)
                    .addComponent(MainMenuBtn))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1380, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Reference no:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        TABSelection.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TABSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a Selection", "Ibuprofen", "Co-codamol", "Paracetamol", "Amlodipine" }));
        TABSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TABSelectionActionPerformed(evt);
            }
        });
        getContentPane().add(TABSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Name of the Tablet");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Number of the Tablet:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Dose(mg):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Issued Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Storage Advice:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Further Information:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("How to Use Medication:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Driving and Using Machines:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Patient Name:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Patient ID:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Patient Address:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Date of Birth:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Possible Side Effects:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Daily Dose:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Exp Date:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        p2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 160, -1));

        p3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 160, -1));

        p5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 160, -1));

        p6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 160, -1));

        p7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 160, -1));

        p8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 160, -1));

        p9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 210, -1));

        p10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });
        getContentPane().add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 210, -1));

        p11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        getContentPane().add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 210, -1));

        p12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });
        getContentPane().add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 210, -1));

        p13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });
        getContentPane().add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 210, -1));

        p15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15ActionPerformed(evt);
            }
        });
        getContentPane().add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 210, -1));

        p17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p17ActionPerformed(evt);
            }
        });
        getContentPane().add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 210, -1));

        p16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16ActionPerformed(evt);
            }
        });
        getContentPane().add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

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

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p9ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p10ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p11ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p12ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p13ActionPerformed

    private void p15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p15ActionPerformed

    private void p17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p17ActionPerformed

    private void p16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p16ActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
      try{
       Scanner inFile = new Scanner(new File("G:\\Hospital Management System(Final)/azim.txt"));
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

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
   String k1=p1.getText().toString();
         String k2=p2.getText().toString();
           String k3=p3.getText().toString();
               String k5=p5.getText().toString();
                 String k6=p6.getText().toString();
                   String k7=p7.getText().toString();
                     String k8=p8.getText().toString();
                       String k9=p9.getText().toString();
                         String k10=p10.getText().toString();
                           String k11=p11.getText().toString();
                             String k12=p12.getText().toString();
                               String k13=p13.getText().toString();
              
                                   String k15=p15.getText().toString();
                                     String k16=p16.getText().toString();
                                       String k17=p17.getText().toString();
    try{
        FileWriter writer=new FileWriter("hms.txt",true);
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
         writer.write(k9);
        writer.write("  ");
         writer.write(k10);
        writer.write("  ");
         writer.write(k11);
        writer.write("  ");
         writer.write(k12);
        writer.write("  ");
         writer.write(k13);
        writer.write("  ");
         writer.write(k15);
        writer.write("  ");
         writer.write(k16);
        writer.write("  ");
         writer.write(k17);
        writer.write(System.getProperty("line.separator"));
        writer.close();
        JOptionPane.showMessageDialog(rootPane,"Success!");
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane,"Error!");
    }
        
        
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void presBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presBTNActionPerformed
                                             
        String Qty1 = (p1.getText());
        String Qty2 = (p2.getText());
        String Qty3 = (p3.getText());
        String Qty5 = (p7.getText());
        String Qty6 = (p8.getText());
        String Qty7 = (p9.getText());
        String Qty8 = (p12.getText());
        String Qty9 = (p13.getText());
        String Qty10 = (p15.getText());
        String Qty11= (p16.getText());
        String Qty12= (p17.getText());
        String Qty13= "";
        if(TABSelection.getSelectedItem().equals("Ibuprofen"))
        {
            Qty13= "Ibuprofen";
        }
        else if(TABSelection.getSelectedItem().equals("Co-codamol"))
        {
            Qty13="Co-codamol";
        }
        
        else if(TABSelection.getSelectedItem().equals("Amlodipine"))
        {
            Qty13="Amlodipine";
        }
         else if(TABSelection.getSelectedItem().equals("Paracetamol"))
        {
            Qty13="Paracetamol";
        }
       
            presarea.setText("");
            presarea.append("\t\n\tHospital Management System\n"
        +"\nPatient Name:\t"+Qty10 
         +"\nDate of Birth:\t"+Qty11
           +"\nPatient Address:\t"+Qty12 
             +"\nPrescription:\t"+Qty13
                +"\n\nReference :\t"+Qty1 
         +"\nDose(mg):\t\t"+Qty2
           +"\nNumber of Tablets\t"+Qty3
                +"\nDaily Dose:\t"+Qty5
         +"\nPossible Side Effects:\t"+Qty6
           +"\nFurther Information:\t"+Qty7
             +"\nHow to Use Medication:\t"+Qty8
                +"\nPatient ID:\t"+Qty9
                +"\n\n\tPatient Instruction we have introduced a \n\tfree text confirmation\n\t"
+"TEXT REMINDS FOR APPOINTMENT");
      
    }//GEN-LAST:event_presBTNActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
             p1.setText("");
                    p2.setText("");
                     p3.setText("");
                   
                      p5.setText("");
                       p6.setText("");
                         p7.setText("");
                          p8.setText("");
                           p9.setText("");
                            p10.setText("");
                             p11.setText("");
                              p12.setText("");
                               p13.setText("");
                                 p15.setText("");
                                  p16.setText("");
                                   p17.setText("");
                              TABSelection.getModel().setSelectedItem("Make a Selection");
    }//GEN-LAST:event_RESETActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
   frame=new JFrame();
   if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Hospital Management Systems",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void TABSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TABSelectionActionPerformed
        if(TABSelection.getSelectedItem().equals("Ibuprofen"))
                {
                    p1.setText("Ibu8739");
                    p2.setText("2");
                     p3.setText("32");
                     //  p5.setText("26/10/2019");
                      //  p6.setText("26/10/2020");
                         p7.setText("4");
                          p8.setText("Bleeding");
                           p9.setText("Place Dispensary");
                            p10.setText("Less than 20%");
                             p11.setText("No");
                              p12.setText("Use water,No Alchohol");
                              // p13.setText("");
                               
                }
      else if(TABSelection.getSelectedItem().equals("Co-codamol"))
                {
                    p1.setText("Coco8721");
                    p2.setText("500");
                     p3.setText("30");
                     //  p5.setText("26/10/2019");
                       // p6.setText("26/10/2020");
                         p7.setText("2");
                          p8.setText("Dizziness");
                           p9.setText("Place Dispensary");
                            p10.setText("Less than 20%");
                             p11.setText("No");
                              p12.setText("Use water,No Alchohol");
                              // p13.setText("");
                               
                }
        else if(TABSelection.getSelectedItem().equals("Paracetamol"))
                {
                    p1.setText("Para7639");
                    p2.setText("500");
                     p3.setText("16");
                     //  p5.setText("26/10/2019");
                       // p6.setText("26/10/2020");
                         p7.setText("2");
                          p8.setText("Feeling Sick");
                           p9.setText("Place Dispensary");
                            p10.setText("Less than 25%");
                             p11.setText("No");
                              p12.setText("Use water,No Alchohol");
                              // p13.setText("");
                               
                }
        else if(TABSelection.getSelectedItem().equals("Amlodipine"))
                {
                    p1.setText("Am99992");
                    p2.setText("5");
                     p3.setText("28");
                     //  p5.setText("26/10/2019");
                       // p6.setText("26/10/2020");
                         p7.setText("1");
                          p8.setText("Liver Disease");
                           p9.setText("Effects Driving");
                            p10.setText("LNo Special Storage");
                             p11.setText("No");
                              p12.setText("Use water,No Alchohol");
                              // p13.setText("");
                               
                }
        else if(TABSelection.getSelectedItem().equals("Make a Selection"))
                {
                    p1.setText("");
                    p2.setText("");
                     p3.setText("");
                     //  p5.setText("26/10/2019");
                       // p6.setText("26/10/2020");
                         p7.setText("");
                          p8.setText("");
                           p9.setText("");
                            p10.setText("");
                             p11.setText("");
                              p12.setText("");
                              // p13.setText("");
                               
                }
        
    }//GEN-LAST:event_TABSelectionActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        this.setVisible(false);
        MainMenu mob=new MainMenu();
        mob.setVisible(true);
    }//GEN-LAST:event_MainMenuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JButton RESET;
    private javax.swing.JComboBox<String> TABSelection;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p10;
    private javax.swing.JTextField p11;
    private javax.swing.JTextField p12;
    private javax.swing.JTextField p13;
    private javax.swing.JTextField p15;
    private javax.swing.JTextField p16;
    private javax.swing.JTextField p17;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField p7;
    private javax.swing.JTextField p8;
    private javax.swing.JTextField p9;
    private javax.swing.JButton presBTN;
    private javax.swing.JTextArea presarea;
    // End of variables declaration//GEN-END:variables
}