/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.interfaces;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dtos.FireAlarmSensor;
import interfaces.IFireAlarmService;
import response.models.FireAlarmSensorMultipleResponse;
import rmi.client.Client;

/**
 *
 * @author Supun Randima
 */


public class mainUI extends javax.swing.JFrame {

    public static String user;
    private IFireAlarmService stub = null;
	private Client client = new Client();
	private List<FireAlarmSensor> list;
    /**
     * Creates new form mainUI
     */
     public mainUI() {
        this.stub = client.getStub();
        this.getData();
        initComponents();
    }
     
    public void getData() {
    	try {
    		FireAlarmSensorMultipleResponse res = this.stub.getFireAlarmSensorList();
        	this.list = res.getData();
        	System.out.println(res.getStatus());
    	} catch (Exception e) {
			// TODO: handle exception
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

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlerts = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnAddSensor = new javax.swing.JButton();
        btnEditSensor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSensors = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Total Sensors");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Monitors");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("value");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("value");

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fire Alarm System");
        
        String[] cols = {"Sensor", "Floor No", "Room No", "CO2 Level", "Smoke Level", "Status"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        
        for (FireAlarmSensor s : this.list) {
        	Object[] row = {s.get_id(), s.getFloor_no(), s.getRoom_no(), s.getCo2_level(), s.getSmoke_level(), s.isStatus()};
        	model.addRow(row);
        }
        
        tblAlerts.setModel(model);
   
    jScrollPane1.setViewportView(tblAlerts);

    jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 0, 0));
    jLabel3.setText("Alerts");

    btnAddSensor.setBackground(new java.awt.Color(153, 0, 204));
    btnAddSensor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnAddSensor.setForeground(new java.awt.Color(255, 255, 255));
    btnAddSensor.setText("Add Fire Alarm ");
    btnAddSensor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddSensorActionPerformed(evt);
        }
    });

    btnEditSensor.setBackground(new java.awt.Color(51, 51, 255));
    btnEditSensor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnEditSensor.setForeground(new java.awt.Color(255, 255, 255));
    btnEditSensor.setText("Edit Fire Alarm ");
    btnEditSensor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditSensorActionPerformed(evt);
        }
    });

    jLabel11.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(0, 255, 0));
    jLabel11.setText("Sensors");

    tblSensors.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {1, 4, 25, 19,1,10},
            {2, 2, 26, 25, 19,1},
            {3, 1, 8, 16 , 26, 15},
            {4, 3, 2, 26, 15,  17},
            {1, 4, 25, 19,1,10},
            {2, 2, 26, 25, 19,1},
            {3, 1, 8, 16 , 26, 15},
            {4, 3, 2, 26, 15,  17},
            {1, 4, 25, 19,1,10},
            {2, 2, 26, 25, 19,1},
            {3, 1, 8, 16 , 26, 15},
            {4, 3, 2, 26, 15,  17}
        },
        new String [] {
            "Sensor", "Floor No", "Room No", "CO2 Level", "Smoke Level", "Temperature"
        }
    ));
    jScrollPane2.setViewportView(tblSensors);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(28, 28, 28)))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addGap(175, 175, 175)
                            .addComponent(btnAddSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(37, 37, 37))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9))
                    .addGap(61, 61, 61)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(btnAddSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addComponent(btnEditSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(63, 63, 63)
            .addComponent(jLabel11)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(36, Short.MAX_VALUE))
    );

//    if(user.equals("admin")) btnAddSensor.setVisible(true);
//    else btnAddSensor.setVisible(false);
//    if(user.equals("admin")) btnEditSensor.setVisible(true);
//    else btnEditSensor.setVisible(false);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSensorActionPerformed
        // TODO add your handling code here:
        new editSensorUI().setVisible(true);
    }//GEN-LAST:event_btnEditSensorActionPerformed

    private void btnAddSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSensorActionPerformed
        // TODO add your handling code here:
        new newSensorUI().setVisible(true);
    }//GEN-LAST:event_btnAddSensorActionPerformed

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
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //user = args[0];
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Sensor","Floor","Room No","CO2 Level", "Smoke Level", "Temperature"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
       JTable jTable = new JTable();
       jTable.setModel(model);
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new mainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSensor;
    private javax.swing.JButton btnEditSensor;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAlerts;
    private javax.swing.JTable tblSensors;
    // End of variables declaration//GEN-END:variables
}
