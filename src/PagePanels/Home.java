/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PagePanels;

import ImportantFunctions.userInfo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author quasar
 */
public class Home extends javax.swing.JPanel {

    /**
     * @return the info
     */
    public userInfo getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(userInfo info) {
        this.info = info;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the index
     */
    
    

    public int getIndex() {
        return index;
    }

    private int index = 2;

    public void setUsername(String username, String language) {
        this.username = username;
        String formattedString = "";
        if(language == "English"){
            formattedString = String.format("Hello! %s", username);
        } else {
        
            formattedString = String.format("Kamusta! %s", username);
        }
        jLabel1.setText(formattedString);
    }
    
    private userInfo info;
    
    private String username = "";
    JPanel[] p = new JPanel[5];
    
    
    
    
    public Home() {
        
        
        setOpaque(false);
        initComponents();
        p[0] = jPanel1; p[1] = checkBalance1; p[2] = withdrawPage1; p[3] = deposit1; p[4] = transferPage1;
        
        withdrawPage1.setVisible(false);
        checkBalance1.setVisible(false);
        deposit1.setVisible(false);
        transferPage1.setVisible(false);
        
        withdrawPage1.getBackButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    disablePanelsExcept(0);
                }
            }
        });
        checkBalance1.getBackButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    
                    disablePanelsExcept(0);
                }
            }
        });
        deposit1.getBackButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    
                    disablePanelsExcept(0);
                }
            }
        });
        transferPage1.getBackButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    
                    disablePanelsExcept(0);
                }
            }
        });

        
        
    }

    public void disablePanelsExcept(int index){
        for(int i = 0; i < p.length; i++){
            if(i != index){
                if(p[i] != null){
                    p[i].setVisible(false);
                }
            }
            else {p[i].setVisible(true);}
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferPage1 = new PagePanels.TransferPage();
        deposit1 = new PagePanels.Deposit();
        checkBalance1 = new PagePanels.CheckBalance();
        withdrawPage1 = new PagePanels.WithdrawPage();
        jPanel1 = new javax.swing.JPanel();
        background1 = new components.background(){
            @Override
            public void paintComponent(Graphics g){

                g.setColor(new Color(0,0,0,60));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                transactionIcon1.setIconPosition(getWidth() / 3, getHeight()/ 4);

            }

        };
        jLabel2 = new javax.swing.JLabel();
        transactionIcon1 = new components.TransactionIcon();
        background2 = new components.background(){
            @Override
            public void paintComponent(Graphics g){

                g.setColor(new Color(0,0,0,60));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }

        };
        jLabel3 = new javax.swing.JLabel();
        transactionIcon2 = new components.TransactionIcon();
        background3 = new components.background(){
            @Override
            public void paintComponent(Graphics g){

                g.setColor(new Color(0,0,0,60));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                transactionIcon4.setIconPosition(getWidth() / 4, getHeight()/ 4);
            }

        };
        jLabel5 = new javax.swing.JLabel();
        transactionIcon4 = new components.TransactionIcon();
        background4 = new components.background(){
            @Override
            public void paintComponent(Graphics g){

                g.setColor(new Color(0,0,0,60));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }

        };
        jLabel4 = new javax.swing.JLabel();
        transactionIcon3 = new components.TransactionIcon();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(transferPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        add(deposit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1070, 570));
        add(checkBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1070, 590));
        add(withdrawPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1070, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                background1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Balance");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        transactionIcon1.setIconImage("/resource/balance.png");

        javax.swing.GroupLayout transactionIcon1Layout = new javax.swing.GroupLayout(transactionIcon1);
        transactionIcon1.setLayout(transactionIcon1Layout);
        transactionIcon1Layout.setHorizontalGroup(
            transactionIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        transactionIcon1Layout.setVerticalGroup(
            transactionIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transactionIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, -1, 376));

        background2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                background2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Withdraw");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        transactionIcon2.setIconImage("/resource/withdraw.png");

        javax.swing.GroupLayout transactionIcon2Layout = new javax.swing.GroupLayout(transactionIcon2);
        transactionIcon2.setLayout(transactionIcon2Layout);
        transactionIcon2Layout.setHorizontalGroup(
            transactionIcon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        transactionIcon2Layout.setVerticalGroup(
            transactionIcon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(transactionIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(transactionIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 111, -1, -1));

        background3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                background3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Transfer");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        transactionIcon4.setIconImage("/resource/transfer.png");

        javax.swing.GroupLayout transactionIcon4Layout = new javax.swing.GroupLayout(transactionIcon4);
        transactionIcon4.setLayout(transactionIcon4Layout);
        transactionIcon4Layout.setHorizontalGroup(
            transactionIcon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        transactionIcon4Layout.setVerticalGroup(
            transactionIcon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(transactionIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                .addComponent(transactionIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 111, -1, 376));

        background4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                background4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Deposit");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        transactionIcon3.setIconImage("/resource/deposit.png");

        javax.swing.GroupLayout transactionIcon3Layout = new javax.swing.GroupLayout(transactionIcon3);
        transactionIcon3.setLayout(transactionIcon3Layout);
        transactionIcon3Layout.setHorizontalGroup(
            transactionIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        transactionIcon3Layout.setVerticalGroup(
            transactionIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background4Layout = new javax.swing.GroupLayout(background4);
        background4.setLayout(background4Layout);
        background4Layout.setHorizontalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background4Layout.createSequentialGroup()
                .addGroup(background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(transactionIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        background4Layout.setVerticalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(transactionIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 306, -1, -1));

        jLabel1.setFont(new java.awt.Font("Garet Book", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 6, 429, 68));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void background2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background2MouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            withdrawPage1.setInfo(info);
            disablePanelsExcept(2);
        }
    }//GEN-LAST:event_background2MouseClicked

    private void background1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background1MouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            checkBalance1.setInfo(info);
            checkBalance1.reloadPage();
            disablePanelsExcept(1);
        }
    }//GEN-LAST:event_background1MouseClicked

    private void background4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background4MouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            deposit1.setInfo(info);
            disablePanelsExcept(3);
        }
    }//GEN-LAST:event_background4MouseClicked

    private void background3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background3MouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            transferPage1.setInfo(info);
            disablePanelsExcept(4);
        }
    }//GEN-LAST:event_background3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.background background1;
    private components.background background2;
    private components.background background3;
    private components.background background4;
    private PagePanels.CheckBalance checkBalance1;
    private PagePanels.Deposit deposit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private components.TransactionIcon transactionIcon1;
    private components.TransactionIcon transactionIcon2;
    private components.TransactionIcon transactionIcon3;
    private components.TransactionIcon transactionIcon4;
    private PagePanels.TransferPage transferPage1;
    private PagePanels.WithdrawPage withdrawPage1;
    // End of variables declaration//GEN-END:variables
}
