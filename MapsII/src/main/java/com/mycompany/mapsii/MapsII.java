// BUT :        Projet synthèse : Créer une application pour optimiser la qualité du réseau des transports.
// AUTEURS :    André Pinel, Jérémie Ouimet, William Goulet et Francis Painchaud
// DATE :       17 avril 2022


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mapsii;

import com.google.gson.Gson;
import com.mycompany.mapsii.obj.Location;
import com.mycompany.mapsii.obj.Preference;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/** 
 * Classe principale qui hérite de la classe JFrame
 */
public class MapsII extends javax.swing.JFrame {
    public static String pathToHere = "src/main/java/com/mycompany/mapsii/";
    private static String pathImg = pathToHere + "img/";
    private JDialog preferences;

    /**
     * Le constructeur de MapsII
     */
    public MapsII() {
        initComponents();
        this.setResizable(false);
        Preference.setInstance(readConfigFile());
        System.out.println(Preference.getInstance());
        this.setTitle("Maps II Trajet");
        this.btnItineraire.setEnabled(false);
        loadImage();

        /* Permet d'avoir la fenêtre de préférence en dialogue tout en ne fermant pas MapsII */
        preferences = new Preferences(this);
        preferences.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent arg0) {
                preferences.setVisible(false);
                System.out.println("qweqweq");
                setEnabled(true);
                setVisible(true);
            };
        });
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
    
    /**
     * La fonction close permet la transition entre les différentes fenêtres de l'application sans qu'elle se ferme complètement. 
     */
     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * Charge les images nécessaires pour l'écran lors de l'affichage du menu
     */
    public void loadImage() {
        this.btnConfig.setIcon(new ImageIcon(pathImg + "Roue.png"));
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
        btnConfig = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEscale1 = new javax.swing.JTextField();
        txtEscale1.setVisible(false);
        txtEscale2 = new javax.swing.JTextField();
        txtEscale2.setVisible(false);
        txtEscale3 = new javax.swing.JTextField();
        txtEscale3.setVisible(false);
        txtDepart = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblEscales = new javax.swing.JLabel();
        lblEscales.setVisible(false);
        btnAddEscale = new javax.swing.JButton();
        btnRemoveEscale = new javax.swing.JButton();
        btnItineraire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mapsii/images/Roue.png"))); // NOI18N
        btnConfig.setMaximumSize(new java.awt.Dimension(593, 521));
        btnConfig.setMinimumSize(new java.awt.Dimension(593, 521));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        jLabel2.setText("Adresse de départ");

        jLabel3.setText("Adresse de destination");

        txtEscale1.setToolTipText("");
        txtEscale1.setMinimumSize(new java.awt.Dimension(185, 22));
        txtEscale1.setPreferredSize(new java.awt.Dimension(185, 25));
        txtEscale1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale1KeyTyped(evt);
            }
        });

        txtEscale2.setToolTipText("");
        txtEscale2.setMinimumSize(new java.awt.Dimension(185, 22));
        txtEscale2.setPreferredSize(new java.awt.Dimension(185, 25));
        txtEscale2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale2KeyTyped(evt);
            }
        });

        txtEscale3.setToolTipText("");
        txtEscale3.setMinimumSize(new java.awt.Dimension(185, 22));
        txtEscale3.setPreferredSize(new java.awt.Dimension(185, 25));
        txtEscale3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscale3KeyTyped(evt);
            }
        });

        txtDepart.setMinimumSize(new java.awt.Dimension(185, 22));
        txtDepart.setPreferredSize(new java.awt.Dimension(185, 25));
        txtDepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartKeyTyped(evt);
            }
        });

        txtDestination.setMinimumSize(new java.awt.Dimension(185, 22));
        txtDestination.setPreferredSize(new java.awt.Dimension(185, 25));
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
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(608, 608, 608))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEscale1, txtEscale2, txtEscale3});

        btnAddEscale.setText("+");
        btnAddEscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEscaleActionPerformed(evt);
            }
        });

        btnRemoveEscale.setText("-");
        btnRemoveEscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEscaleActionPerformed(evt);
            }
        });

        btnItineraire.setText("ITINÉRAIRE");
        btnItineraire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItineraireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnItineraire, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddEscale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveEscale)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEscale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveEscale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnItineraire)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fonction appelée lors de l'évènement de l'utilisation du bouton d'itinéraire
     * @param evt
     */
    private void btnItineraireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItineraireActionPerformed
        // Création des objets départ et destination
        Location depart = new Location(txtDepart.getText());
        Location destination = new Location(txtDestination.getText());
        // La liste de locations
        List<Location> locations = new ArrayList<Location>();

        // Si le départ n'est pas valide, on affiche un message d'erreur,
        // s'il est valide, on l'ajoute à la liste
        if (!depart.isValid()) {
            txtDepart.setText("Adresse invalide");
            return;
        }
        locations.add(depart);

        // On créé des locations d'escales si on a des entrées pour celles-ci
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

        // Si l'escale1 n'est pas valide, on affiche un message d'erreur,
        // si elle est valide, on l'ajoute à la liste
        if (escale1 != null) {
            if (!escale1.isValid()) {
                txtEscale1.setText("Adresse invalide");
                return;
            }
            locations.add(escale1);
        }

        // Si l'escale2 n'est pas valide, on affiche un message d'erreur,
        // si elle est valide, on l'ajoute à la liste
        if (escale2 != null) {
            if (!escale2.isValid()) {
                txtEscale2.setText("Adresse invalide");
                return;
            }
            locations.add(escale2);
        }

        // Si l'escale3 n'est pas valide, on affiche un message d'erreur,
        // si elle est valide, on l'ajoute à la liste
        if (escale3 != null) {
            if (!escale3.isValid()) {
                txtEscale3.setText("Adresse invalide");
                return;
            }
            locations.add(escale3);
        }

        // Si la destination n'est pas valide, on affiche un message d'erreur,
        // si elle est valide, on l'ajoute à la liste
        if (!destination.isValid()) {
            txtDestination.setText("Adresse invalide");
            return;
        }

        locations.add(destination);

        close();
        // On appelle l'interface de recommandations en lui passant les locations en paramètre
        Recommandation pi = new Recommandation(depart.getName(), destination.getName(), locations);
        pi.setVisible(true);
    }//GEN-LAST:event_btnItineraireActionPerformed

    /**
     * Permet d'ouvrir le dialogue Preference
     * @param evt Event
     */
    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        //close();
        this.setEnabled(false);
        preferences.setVisible(true);
    }//GEN-LAST:event_btnConfigActionPerformed

    /**
     * Fonction appeler par le bouton "+" pour ajouter une escale, jusqu'à 3 escales 
     * @param evt 
     */
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

    /** 
     * Fonction appeler par le bouton "-" pour enlever/caché une escale et effacer leurs contenues
     * @param evt 
     */
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

    /**
     * Fonction appelée lors de l'évènement de l'entrée d'une touche dans le textBox
     * @param evt
     */
    private void txtDepartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartKeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtDepartKeyTyped

    /**
     * Fonction appelée lors de l'évènement de l'entrée d'une touche dans le textBox
     * @param evt
     */
    private void txtDestinationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinationKeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtDestinationKeyTyped

    /**
     * Fonction appelée lors de l'évènement de l'entrée d'une touche dans le textBox
     * @param evt
     */
    private void txtEscale3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale3KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale3KeyTyped

    /**
     * Fonction appelée lors de l'évènement de l'entrée d'une touche dans le textBox
     * @param evt
     */
    private void txtEscale2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale2KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale2KeyTyped

    /**
     * Fonction appelée lors de l'évènement de l'entrée d'une touche dans le textBox
     * @param evt
     */
    private void txtEscale1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscale1KeyTyped
        setBtnItineraireEnabled();
    }//GEN-LAST:event_txtEscale1KeyTyped

    /**
     * Fonction appelée pour mettre à jour le statut du bouton d'itinéraire
     */
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
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtEscale1;
    private javax.swing.JTextField txtEscale2;
    private javax.swing.JTextField txtEscale3;
    // End of variables declaration//GEN-END:variables
}
