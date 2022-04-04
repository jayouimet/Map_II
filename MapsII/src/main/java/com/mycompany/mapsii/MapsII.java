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


/**
 *
 * @author Andre
 */
public class MapsII extends javax.swing.JFrame {
    public static String pathToHere = "src/main/java/com/mycompany/mapsii/";

    private Engine engine;
    
    private String pathImg = "src/main/java/com/mycompany/mapsii/img/";
    private List<Location> choices;
    private String selectedDepart = null;
    private String selectedDestination = null;
    
    /**
     * Creates new form MapsII
     */
    public MapsII() {
        System.out.println(Preference.getInstance());
        initComponents();
        this.engine = new Engine();
        this.choices = engine.getLocations();
        init();
        this.setTitle("Maps II Trajet");
        this.btnItineraire.setEnabled(false);
        loadImage();
    }
    
    private void init() {
        initConfig();

        for (Location c: choices) {
            cboDepart.addItem(c.getName());
            cboDestination.addItem(c.getName());
        }
        cboDepart.setSelectedItem(null);
        cboDestination.setSelectedItem(null);

        cboDepart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboDestination.getSelectedItem() != null)
                    selectedDestination = cboDestination.getSelectedItem().toString();

                cboDestination.removeAllItems();
                for (Location c: choices) {
                    if (!c.getName().equals(cboDepart.getSelectedItem())) {
                        cboDestination.addItem(c.getName());
                    }
                }
                cboDestination.setSelectedItem(selectedDestination);

                btnItineraire.setEnabled(
                        cboDestination.getSelectedItem() != null && cboDepart.getSelectedItem() != null
                );
            }
        });

        cboDestination.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboDepart.getSelectedItem() != null)
                    selectedDepart = cboDepart.getSelectedItem().toString();;

                cboDepart.removeAllItems();
                for (Location c: choices) {
                    if (!c.getName().equals(cboDestination.getSelectedItem())) {
                        cboDepart.addItem(c.getName());
                    }
                }
                cboDepart.setSelectedItem(selectedDepart);

                btnItineraire.setEnabled(
                        cboDestination.getSelectedItem() != null && cboDepart.getSelectedItem() != null
                );
            }
        });
    }

    private void initConfig() {
        Preference.setInstance(readConfigFile());
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
        cboDepart = new javax.swing.JComboBox<>();
        cboDestination = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        cboDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartActionPerformed(evt);
            }
        });

        jLabel2.setText("Depart");

        jLabel3.setText("Destination");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnItineraire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDepart, 0, 185, Short.MAX_VALUE)
                    .addComponent(cboDestination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnItineraire)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnItineraireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItineraireActionPerformed
        close();
        String depart = cboDepart.getSelectedItem().toString();
        String destination = cboDestination.getSelectedItem().toString();
        List<Location> locations = new ArrayList<Location>();
        
        for (Location l: engine.getLocations()) {
            if (l.getName() == depart) {
                locations.add(l);
                break;
            }
        }
        
        for (Location l: engine.getLocations()) {
            if (l.getName() == destination) {
                locations.add(l);
                break;
            }
        }
        
        engine.generateParcours(locations);
        
        Recommandation pi = new Recommandation(depart, destination, engine);
        pi.setVisible(true);
    }//GEN-LAST:event_btnItineraireActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        close();
        Preferences pi = new Preferences();
        pi.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigActionPerformed

    private void cboDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDepartActionPerformed

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
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnItineraire;
    private javax.swing.JComboBox<String> cboDepart;
    private javax.swing.JComboBox<String> cboDestination;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMap;
    // End of variables declaration//GEN-END:variables
}
