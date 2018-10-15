/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author DELL
 */
public class Complaint_form extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static String xo;
    
    public Complaint_form(String p) {
        initComponents();
        xo = p;
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup2.add(jRadioButton8);
        buttonGroup2.add(jRadioButton9);
        buttonGroup2.add(jRadioButton10);
        buttonGroup2.add(jRadioButton11);
        
        buttonGroup3.add(jRadioButton12);
        buttonGroup3.add(jRadioButton13);
        
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        sysconnection();
        
    }
    
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPane1 = new JTextPane();
        jScrollPane1 = new JScrollPane();
        jTextField1 = new JTextField();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        jTabbedPane1 = new JTabbedPane();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jLabel3 = new JLabel();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jRadioButton8 = new JRadioButton();
        jRadioButton9 = new JRadioButton();
        jRadioButton10 = new JRadioButton();
        jRadioButton11 = new JRadioButton();
        jComboBox1 = new JComboBox<>();
        jLabel4 = new JLabel();
        jRadioButton12 = new JRadioButton();
        jRadioButton13 = new JRadioButton();
        jComboBox2 = new JComboBox<>();
        jTextField2 = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jRadioButton14 = new JRadioButton();
        jRadioButton15 = new JRadioButton();
        jRadioButton16 = new JRadioButton();
        jButton1 = new JButton();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();

        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextField1);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jLabel8.setFont(new Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("Complaint Form");

        jLabel1.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Describe your complaint");

        jLabel2.setText("<html>\n<ul><li>Select the type of waste:");

        jRadioButton1.setText("Waste Dump");
        jRadioButton1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("River Weed");
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Floating Algae");

        jRadioButton4.setText("Human Generated Waste");
        jRadioButton4.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jRadioButton4StateChanged(evt);
            }
        });

        jRadioButton5.setText("Industrial Waste");
        jRadioButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("<html><ul><li>How is the waste affecting nearby resedential areas?");

        jRadioButton6.setText("Not Affecting");
        jRadioButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("Foul Smell");

        jRadioButton8.setText("Mosquitoes");
        jRadioButton8.setToolTipText("");
        jRadioButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Spreading Diseases");

        jRadioButton10.setText("Deteriorating Air Quality");

        jRadioButton11.setText("Spoiling Scenic Beauty");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Wet", "Dry", "Electronic", "Workshop" }));

        jLabel4.setText("<html><ul><li>Source of waste generation? (eg: xyz industry)");

        jRadioButton12.setText("Known");
        jRadioButton12.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jRadioButton12StateChanged(evt);
            }
        });

        jRadioButton13.setText("Unknown");

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Toxic Foam", "Decolourisation" }));
        jComboBox2.setToolTipText("");

        jLabel5.setText("Specify:");

        jLabel6.setText("<html><ul><li>Specify its distance from residential areas");

        jRadioButton14.setText("0 - 100 metres");
        jRadioButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jRadioButton15.setText("100 - 500 metres");

        jRadioButton16.setText("500 + metres");

        jButton1.setText("<html><p>Next &#8594</p>");
        jButton1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton4, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(jRadioButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(jTextField2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton13, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addGap(108, 108, 108))
                            .addComponent(jLabel6))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton12)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton13))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton15))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton16))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Describe", jPanel2);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Locate", jPanel3);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Attach", jPanel4);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void sysconnection(){
        
    }
    
    
    private void jTextField1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton1StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jComboBox1.setVisible(true);
        }
        else
        {
            jComboBox1.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton4StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jRadioButton4StateChanged
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){
            jComboBox2.setVisible(true);
        }
        else
        {
            jComboBox2.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton4StateChanged

    private void jRadioButton12StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jRadioButton12StateChanged
        // TODO add your handling code here:
        if(jRadioButton12.isSelected()){
            jLabel5.setVisible(true);
            jTextField2.setVisible(true);
        }
        else
        {
            jLabel5.setVisible(false);
            jTextField2.setVisible(false);
        }
        
    }//GEN-LAST:event_jRadioButton12StateChanged

    private void jRadioButton14ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1MousePressed(MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1MousePressed

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
            java.util.logging.Logger.getLogger(Complaint_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Complaint_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Complaint_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Complaint_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Complaint_form("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton10;
    private JRadioButton jRadioButton11;
    private JRadioButton jRadioButton12;
    private JRadioButton jRadioButton13;
    private JRadioButton jRadioButton14;
    private JRadioButton jRadioButton15;
    private JRadioButton jRadioButton16;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JRadioButton jRadioButton9;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}