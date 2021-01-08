/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import javax.swing.JComboBox;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author iamhe
 */
public class MainMenu extends javax.swing.JFrame {

    private double roomCost;
    private double mealCost;
    private int duration;
    private double price;
    private boolean allInfo;
    private String[] roomDropDownMenu = {"", "Single (1) [£50]", "Double (2) [75]", "Family (4) [£105]"};
    private String[] mealDropDownMenu = {"", "self-catering [£0]", "half-board [£10]", "full board [£20]"};

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {

        initComponents();
        missingInformation.setVisible(false);
        understood.setVisible(false);
        receipt.setVisible(false);

        roomSize.setModel(new javax.swing.DefaultComboBoxModel<>(roomDropDownMenu));
        mealService.setModel(new javax.swing.DefaultComboBoxModel<>(mealDropDownMenu));
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receipt = new javax.swing.JPanel();
        costLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        understood = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        missingInformation = new javax.swing.JLabel();
        durationSpinner = new javax.swing.JSpinner();
        mealService = new javax.swing.JComboBox<>();
        roomSize = new javax.swing.JComboBox<>();
        headingThree = new javax.swing.JLabel();
        headingTwo = new javax.swing.JLabel();
        headingOne = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        receipt.setBackground(new java.awt.Color(204, 204, 204));

        costLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        discountLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        totalLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout receiptLayout = new javax.swing.GroupLayout(receipt);
        receipt.setLayout(receiptLayout);
        receiptLayout.setHorizontalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        receiptLayout.setVerticalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(costLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discountLabel)
                .addGap(18, 18, 18)
                .addComponent(totalLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(receipt);
        receipt.setBounds(290, 330, 450, 100);

        understood.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        understood.setText("Understood!");
        understood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                understoodActionPerformed(evt);
            }
        });
        getContentPane().add(understood);
        understood.setBounds(490, 580, 100, 21);

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate);
        calculate.setBounds(470, 440, 100, 23);

        missingInformation.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        missingInformation.setText("1 or more missing data!!");
        getContentPane().add(missingInformation);
        missingInformation.setBounds(420, 550, 240, 30);
        getContentPane().add(durationSpinner);
        durationSpinner.setBounds(590, 150, 150, 20);

        mealService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealServiceActionPerformed(evt);
            }
        });
        getContentPane().add(mealService);
        mealService.setBounds(590, 260, 150, 20);

        roomSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomSizeActionPerformed(evt);
            }
        });
        getContentPane().add(roomSize);
        roomSize.setBounds(590, 200, 150, 20);

        headingThree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headingThree.setText("                           Duration:");
        getContentPane().add(headingThree);
        headingThree.setBounds(250, 150, 220, 20);

        headingTwo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headingTwo.setText("  Choose meal service:");
        getContentPane().add(headingTwo);
        headingTwo.setBounds(290, 250, 190, 30);

        headingOne.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headingOne.setText("     Choose room type:");
        getContentPane().add(headingOne);
        headingOne.setBounds(290, 190, 190, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15e8fd101fe6a744c3a2fb7b5e092587.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1024, 682);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mealServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealServiceActionPerformed
        JComboBox jcmbType = (JComboBox) evt.getSource();
        String cmbType = (String) jcmbType.getSelectedItem();
        //System.out.println(cmbType);

        int x = 0;
        for (int i = 0; i < 4; i++) {
            if (mealDropDownMenu[i].equals(cmbType)) {
                x = i;
            }
        }
        if (cmbType.equals("") || cmbType.equals(null)) {
            x = 4;
        }
        switch (x) {
            case 1:
                allInfo = true;
                mealCost = 0;
                break;
            case 2:
                allInfo = true;
                mealCost = 10;
                break;
            case 3:
                allInfo = true;
                mealCost = 20;
                System.out.println(mealCost);
                break;
            case 4:
                allInfo = false;
                break;
            default:
                System.out.println("Error: Switch statement no functioning as intended");
        }

    }//GEN-LAST:event_mealServiceActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        duration = (Integer)durationSpinner.getValue();
        if (!allInfo || duration == 0) {
            missingInformation.setVisible(true);
            understood.setVisible(true);
        }

        getCost();
        receipt.setVisible(true);
    }//GEN-LAST:event_calculateActionPerformed

    private void understoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_understoodActionPerformed
        missingInformation.setVisible(false);
        understood.setVisible(false);
    }//GEN-LAST:event_understoodActionPerformed

    private void roomSizeActionPerformed(java.awt.event.ActionEvent evt) {
        JComboBox jcmbType = (JComboBox) evt.getSource();
        String cmbType = (String) jcmbType.getSelectedItem();
        //System.out.println(cmbType);

        int x = 0;
        for (int i = 0; i < 4; i++) {
            if (roomDropDownMenu[i].equals(cmbType)) {
                x = i;
            }
        }
        if (cmbType.equals("") || cmbType.equals(null)) {
            x = 4;
        }
        switch (x) {
            case 1:
                allInfo = true;
                roomCost = 50;
                break;
            case 2:
                allInfo = true;
                roomCost = 75;
                break;
            case 3:
                allInfo = true;
                roomCost = 105;
                break;
            case 4:
                allInfo = false;
                break;
            default:
                System.out.println("Error: Switch statement no functioning as intended");
        }

    }

    private void getCost() {
        double cost;
        double discount = 0;
        double totalCost;

        if (duration > 7) {
            discount = ((roomCost + mealCost) * 0.2) * (duration - 7);
        }
        System.out.println(duration);
        System.out.println(roomCost);
        System.out.println(mealCost);
        cost = (roomCost + mealCost) * duration;
        totalCost = cost - discount;

        System.out.println("Cost  (without discount) :       £" + cost);
        costLabel.setText("Cost  (without discount) :       £" + cost);
        discountLabel.setText("Discount                           :        £" + discount);
        totalLabel.setText("Total Cost                :      £" + totalCost);

    }

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JSpinner durationSpinner;
    private javax.swing.JLabel headingOne;
    private javax.swing.JLabel headingThree;
    private javax.swing.JLabel headingTwo;
    private javax.swing.JComboBox<String> mealService;
    private javax.swing.JLabel missingInformation;
    private javax.swing.JPanel receipt;
    private javax.swing.JComboBox<String> roomSize;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton understood;
    // End of variables declaration//GEN-END:variables
}
