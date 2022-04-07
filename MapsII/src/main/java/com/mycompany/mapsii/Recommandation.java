/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mapsii;

import com.mycompany.mapsii.obj.*;
import com.mycompany.mapsii.obj.Enums.TransportEnum;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andre
 */
public class Recommandation extends javax.swing.JFrame {
    private Engine engine;
    private static String pathImg = "src/main/java/com/mycompany/mapsii/img/";
    private Color defaultBgColor;
    
    public Recommandation() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Maps II Recommandations"); 
        loadImage();
    }
    
    public Recommandation(String depart, String destination, List<Location> locationList) {
        initComponents();
        this.setResizable(false);
        this.setTitle("Maps II Recommandations"); 
        this.engine = new Engine(locationList);
        txtDepart.setText(depart);
        txtDestination.setText(destination);
        txtDepart.setEditable(false);
        txtDestination.setEditable(false);
        loadImage();

        defaultBgColor = btnCar.getBackground();

        Map.Entry<TransportEnum, Trajet> best = engine.getParcours().getBest();

        setSelectedButton(best.getKey());
        setAffichage(best.getValue());
    }

    private void setSelectedButton(TransportEnum transportEnum) {
        resetButtons();

        switch (transportEnum) {
            case Walk -> btnWalk.setBackground(new Color(128, 128, 128));
            case Taxi -> btnTaxi.setBackground(new Color(128, 128, 128));
            case Bus -> btnBus.setBackground(new Color(128, 128, 128));
            case Car -> btnCar.setBackground(new Color(128, 128, 128));
            case Metro -> btnMetro.setBackground(new Color(128, 128, 128));
            case Bicycle -> btnBike.setBackground(new Color(128, 128, 128));
        }
    }

    private void resetButtons() {
        btnWalk.setBackground(defaultBgColor);
        btnTaxi.setBackground(defaultBgColor);
        btnBus.setBackground(defaultBgColor);
        btnCar.setBackground(defaultBgColor);
        btnMetro.setBackground(defaultBgColor);
        btnBike.setBackground(defaultBgColor);
    }
    
    public void setAffichage(Trajet trajet){
        txtScore.setText(String.valueOf(trajet.calculateScore()));
        txtDistance.setText(String.format("%.2f",(trajet.getDistance())) + " km");
        txtEmission.setText(String.format("%.2f", trajet.calculateCarbonEmission()) + " g");
        txtDuration.setText(toDateFormat(trajet.calculateDuration()));
        txtEstimatedCosts.setText(String.format("%.2f",trajet.calculatePrice()) + " $");
    }

    private String toDateFormat(int seconds) {
        int h, m, s;

        h = seconds / 3600;
        seconds %= 3600;
        m = seconds / 60;
        seconds %= 60;
        s = seconds;

        return h + ":" + (m < 10 ? ("0" + m) : m) + ":" + (s < 10 ? ("0" + s) : s);
    }

     public Location createLocation(String nom){
        Location location = new Location("",0,0);
        switch(nom){
            case "Maison":
                location = new Location("Maison",0,0);
                break;
            case "Bibliothèque":
                location = new Location("Bibliothèque",1,1);
                break;
            case "Université":
                location = new Location("Université",25,25);
                break;
            case "Travail":
                location = new Location("Travail",30,23);
                break;
            case "Cinéma":
                location = new Location("Cinéma",20,2);
                break;
            case "Aéroport":
                location = new Location("Aéroport",25,-25);
                break;
            case "Dépanneur":
                location = new Location("Dépanneur",0,-1);
                break;
            case "Gare":
                location = new Location("Gare",-2,-2);
                break;
            case "Costco":
                location = new Location("Costco",-5,-10);
                break;
            case "Chalet des Érables":
                location = new Location("Chalet des Érables",13,10);
                break;
            default:
                break;
        }
        return location;
    }
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void loadImage() {
        this.btnReturn.setIcon(new javax.swing.ImageIcon(pathImg + "sideswipe.png"));
        this.lblMap.setIcon(new javax.swing.ImageIcon(pathImg + "Map1.png"));
        
        this.btnCar.setIcon(new javax.swing.ImageIcon(pathImg + "city-car.png"));
        this.btnBus.setIcon(new javax.swing.ImageIcon(pathImg + "bus.png"));
        this.btnMetro.setIcon(new javax.swing.ImageIcon(pathImg + "subway.png"));
        this.btnTaxi.setIcon(new javax.swing.ImageIcon(pathImg + "Taxi.png"));
        this.btnBike.setIcon(new javax.swing.ImageIcon(pathImg + "bike.png"));
        this.btnWalk.setIcon(new javax.swing.ImageIcon(pathImg + "walking.png"));
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEmission = new javax.swing.JTextField();
        txtDistance = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        txtDuration = new javax.swing.JTextField();
        txtDepart = new javax.swing.JTextField();
        txtEstimatedCosts = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        lblScore = new javax.swing.JLabel();
        btnCar = new javax.swing.JButton();
        lblEmission = new javax.swing.JLabel();
        btnBike = new javax.swing.JButton();
        lblDistance = new javax.swing.JLabel();
        btnWalk = new javax.swing.JButton();
        lblDuration = new javax.swing.JLabel();
        btnBus = new javax.swing.JButton();
        lblEstimatedCosts = new javax.swing.JLabel();
        btnTaxi = new javax.swing.JButton();
        txtScore = new javax.swing.JTextField();
        btnMetro = new javax.swing.JButton();
        lblMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtEmission.setText("jTextField4");

        txtDistance.setText("jTextField5");

        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        txtDuration.setText("jTextField6");

        txtDepart.setText("Adresse de départ");

        txtEstimatedCosts.setText("jTextField7");

        txtDestination.setText("Adresse de destination");

        lblScore.setText("Score (NomApp) :");

        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        lblEmission.setText("Émission de CO2 :");

        btnBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBikeActionPerformed(evt);
            }
        });

        lblDistance.setText("Distance :");

        btnWalk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWalkActionPerformed(evt);
            }
        });

        lblDuration.setText("Durée :");

        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });

        lblEstimatedCosts.setText("Coût estimé :");

        btnTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxiActionPerformed(evt);
            }
        });

        txtScore.setText("jTextField3");

        btnMetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblEstimatedCosts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDistance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmission, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(txtEstimatedCosts)
                                .addComponent(txtEmission)
                                .addComponent(txtDistance)
                                .addComponent(txtScore)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMetro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBike, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnWalk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDepart))
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBike, btnBus, btnCar, btnMetro, btnTaxi, btnWalk});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBus)
                                    .addComponent(btnBike, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCar)
                                    .addComponent(btnWalk))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblScore)
                                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmission)
                                    .addComponent(txtEmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDistance)
                                    .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDuration)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstimatedCosts)
                                    .addComponent(txtEstimatedCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnMetro)))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBike, btnBus, btnCar, btnMetro, btnTaxi, btnWalk});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        close();
        MapsII pi = new MapsII();
        pi.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnWalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWalkActionPerformed
        setSelectedButton(TransportEnum.Walk);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Walk));
    }//GEN-LAST:event_btnWalkActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        setSelectedButton(TransportEnum.Bus);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Bus));
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxiActionPerformed
        setSelectedButton(TransportEnum.Taxi);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Taxi));
    }//GEN-LAST:event_btnTaxiActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        setSelectedButton(TransportEnum.Car);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Car));
    }//GEN-LAST:event_btnCarActionPerformed

    private void btnMetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetroActionPerformed
        setSelectedButton(TransportEnum.Metro);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Metro));
    }//GEN-LAST:event_btnMetroActionPerformed

    private void btnBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBikeActionPerformed
        setSelectedButton(TransportEnum.Bicycle);
        setAffichage(engine.getParcours().getTrajet(TransportEnum.Bicycle));
    }//GEN-LAST:event_btnBikeActionPerformed

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
            java.util.logging.Logger.getLogger(Recommandation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recommandation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recommandation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recommandation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recommandation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBike;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnCar;
    private javax.swing.JButton btnMetro;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnTaxi;
    private javax.swing.JButton btnWalk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblEmission;
    private javax.swing.JLabel lblEstimatedCosts;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtEmission;
    private javax.swing.JTextField txtEstimatedCosts;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
