/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mapsii;

import com.google.gson.Gson;
import com.mycompany.mapsii.obj.Engine;
import com.mycompany.mapsii.obj.Location;
import com.mycompany.mapsii.obj.Preference;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import java.awt.Dimension;


/**
 *
 * @author Andre
 */
public class MapsII extends javax.swing.JFrame {
    public static String pathToHere = "src/main/java/com/mycompany/mapsii/";
    
    private static String pathImg = pathToHere + "img/";
    private String selectedDepart = null;
    private String selectedDestination = null;
    
    /**
     * Creates new form MapsII
     */
    public MapsII() {
        System.out.println(Preference.getInstance());
        initComponents();
        this.setResizable(false);
        Preference.setInstance(readConfigFile());
        this.setTitle("Maps II Trajet");
        this.btnItineraire.setEnabled(false);
        loadImage();
    }

    private Preference readConfigFile() {
        Gson g = new Gson();
        String file = new File(pathToHere + "/config.json").getAbsolutePath();

        try {
            Preference pref = g.fromJson(new FileReader(file), Preference.class);
            return pref;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

     
    public void loadImage() {
        this.btnConfig.setIcon(new ImageIcon(pathImg + "Roue.png"));
        this.lblMap.setIcon(new ImageIcon(pathImg + "Map1.png"));
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
        btnItineraire = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        lblMap = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddEscale = new javax.swing.JButton();
        txtEscale1 = new javax.swing.JTextField();
        txtEscale1.setVisible(false);
        txtEscale2 = new javax.swing.JTextField();
        txtEscale2.setVisible(false);
        txtEscale3 = new javax.swing.JTextField();
        txtEscale3.setVisible(false);
        btnRemoveEscale = new javax.swing.JButton();
        txtDepart = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblEscales = new javax.swing.JLabel();
        lblEscales.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnItineraire.setText("ITINÉRAIRE");
        btnItineraire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItineraireActionPerformed(evt);
            }
        });

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mapsii/images/Roue.png"))); // NOI18N
        btnConfig.setMaximumSize(new java.awt.Dimension(593, 521));
        btnConfig.setMinimumSize(new java.awt.Dimension(593, 521));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        jLabel2.setText("Depart");

        jLabel3.setText("Destination");

        btnAddEscale.setText("+");
        btnAddEscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEscaleActionPerformed(evt);
            }
        });

        txtEscale1.setToolTipText("");
        txtEscale1.setPreferredSize(new java.awt.Dimension(185, 24));
        txtEscale1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale1KeyTyped(evt);
            }
        });

        txtEscale2.setToolTipText("");
        txtEscale2.setPreferredSize(new java.awt.Dimension(185, 24));
        txtEscale2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale2KeyTyped(evt);
            }
        });

        txtEscale3.setToolTipText("");
        txtEscale3.setPreferredSize(new java.awt.Dimension(185, 24));
        txtEscale3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale3KeyTyped(evt);
            }
        });

        btnRemoveEscale.setText("-");
        btnRemoveEscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEscaleActionPerformed(evt);
            }
        });

        txtDepart.setPreferredSize(new java.awt.Dimension(185, 24));
        txtDepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartKeyTyped(evt);
            }
        });

        txtDestination.setPreferredSize(new java.awt.Dimension(185, 24));
        txtDestination.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinationKeyTyped(evt);
            }
        });

        lblEscales.setText("Escales:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEscale1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtEscale2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtEscale3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEscales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddEscale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveEscale))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnItineraire, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEscale1, txtEscale2, txtEscale3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEscale1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEscale2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEscale3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddEscale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveEscale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItineraire)))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEscale1, txtEscale2, txtEscale3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnItineraireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItineraireActionPerformed

        Location depart = new Location(txtDepart.getText());

        Location escale1 = null, escale2 = null, escale3 = null;
        if (txtEscale1.isVisible() && txtEscale1.getText().length() > 0) {
            escale1 = new Location(txtEscale1.getText());
        }
        
        if (txtEscale2.isVisible() && txtEscale2.getText().length() > 0) {
            escale2 = new Location(txtEscale2.getText());
        }
        
        if (txtEscale3.isVisible() && txtEscale3.getText().length() > 0) {
            escale3 = new Location(txtEscale3.getText());
        }

        Location destination = new Location(txtDestination.getText());

        List<Location> locations = new ArrayList<Location>();

        if (!depart.isValid()) {
            txtDepart.setText("Adresse invalide");
            return;
        }
        locations.add(depart);

        if (!destination.isValid()) {
            txtDestination.setText("Adresse invalide");
            return;
        }
        locations.add(destination);
        
        if (escale1 != null) {
            if (!escale1.isValid()) {
                txtEscale1.setText("Adresse invalide");
                return;
            }
            locations.add(escale1);
        }
        
        if (escale2 != null) {
            if (!escale2.isValid()) {
                txtEscale2.setText("Adresse invalide");
                return;
            }
            locations.add(escale2);
        }
        
        if (escale3 != null) {
            if (!escale3.isValid()) {
                txtEscale3.setText("Adresse invalide");
                return;
            }
            locations.add(escale3);
        }

        if (!destination.isValid()) {
            txtDestination.setText("Adresse invalide");
            return;
        }
        locations.add(destination);
        
        close();
        Recommandation pi = new Recommandation(depart.getName(), destination.getName(), locations);
        pi.setVisible(true);
    }//GEN-LAST:event_btnItineraireActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        close();
        Preferences pi = new Preferences();
        pi.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnAddEscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEscaleActionPerformed

        if(!txtEscale1.isVisible()) {
            this.txtEscale1.setVisible(true);
            this.lblEscales.setVisible(true);
        }
        else if (!txtEscale2.isVisible())
            this.txtEscale2.setVisible(true);
        
        else if (!txtEscale3.isVisible())
            this.txtEscale3.setVisible(true);
        
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_btnAddEscaleActionPerformed

    private void btnRemoveEscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEscaleActionPerformed
        if(txtEscale3.isVisible()) {
            this.txtEscale3.setVisible(false);
            this.txtEscale3.setText("");
        }
        else if (txtEscale2.isVisible()) {
            this.txtEscale2.setVisible(false);
            this.txtEscale2.setText("");
        }
        else if (txtEscale1.isVisible()) {
            this.txtEscale1.setVisible(false);
            this.txtEscale1.setText("");
            this.lblEscales.setVisible(false);
        }
        
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_btnRemoveEscaleActionPerformed

    private void txtDepartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartKeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtDepartKeyTyped

    private void txtDestinationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinationKeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtDestinationKeyTyped

    private void txtEscale1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale1KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale1KeyTyped

    private void txtEscale2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale2KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale2KeyTyped

    private void txtEscale3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale3KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale3KeyTyped

    private void setBtnItineraireEnabled() {
        btnItineraire.setEnabled(
                txtDepart.getText().length() > 0 && 
                txtDestination.getText().length() > 0 && 
                (!txtEscale1.isVisible() || txtEscale1.getText().length() > 0) &&
                (!txtEscale2.isVisible() || txtEscale2.getText().length() > 0) &&
                (!txtEscale3.isVisible() || txtEscale3.getText().length() > 0)
        );
    }

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
            java.util.logging.Logger.getLogger(MapsII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapsII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapsII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapsII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapsII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEscale;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnItineraire;
    private javax.swing.JButton btnRemoveEscale;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEscales;
    private javax.swing.JLabel lblMap;
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtEscale1;
    private javax.swing.JTextField txtEscale2;
    private javax.swing.JTextField txtEscale3;
    // End of variables declaration//GEN-END:variables
}
