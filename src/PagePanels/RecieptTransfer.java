/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PagePanels;

import ImportantFunctions.userInfo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JA Landoy
 */
public class RecieptTransfer extends javax.swing.JPanel {


    public RecieptTransfer(userInfo info, double oldBalance, double amount) {
        setOpaque(false);
        initComponents();
        
        Name.setText(info.getName());
        AccountNum.setText(info.getCARD_NO());
        BalanceNum.setText("$" + String.valueOf(oldBalance));
        TransferredNum.setText("$" + amount);
        RemainingNum.setText("$" + info.getAccountBalance());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // White color with 60% opacity (255 * 0.6 ≈ 153)
                g2.setColor(new Color(255, 255, 255, 153));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }

        };
        NameSym = new javax.swing.JLabel();
        logo1 = new components.logo();
        AccountNo = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        TranfferTo = new javax.swing.JLabel();
        Transferred = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        AccountNum = new javax.swing.JLabel();
        BalanceNum = new javax.swing.JLabel();
        TransferToNum = new javax.swing.JLabel();
        TransferredNum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Remaing = new javax.swing.JLabel();
        RemainingNum = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255,60));
        jPanel1.setOpaque(false);

        NameSym.setFont(new java.awt.Font("Garet Book", 0, 22)); // NOI18N
        NameSym.setForeground(new java.awt.Color(0, 0, 0));
        NameSym.setText("Name:");

        logo1.setMaximumSize(new java.awt.Dimension(152, 100));
        logo1.setMinimumSize(new java.awt.Dimension(152, 100));

        AccountNo.setFont(new java.awt.Font("Garet Book", 0, 22)); // NOI18N
        AccountNo.setForeground(new java.awt.Color(0, 0, 0));
        AccountNo.setText("Account No.:");

        Balance.setFont(new java.awt.Font("Garet Book", 0, 22)); // NOI18N
        Balance.setForeground(new java.awt.Color(0, 0, 0));
        Balance.setText("Balance:");

        TranfferTo.setFont(new java.awt.Font("Garet Book", 0, 22)); // NOI18N
        TranfferTo.setForeground(new java.awt.Color(0, 0, 0));
        TranfferTo.setText("Transfered to:");

        Transferred.setFont(new java.awt.Font("Garet Book", 0, 22)); // NOI18N
        Transferred.setForeground(new java.awt.Color(0, 0, 0));
        Transferred.setText("Transferred:");

        Name.setFont(new java.awt.Font("Garet Book", 0, 26)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.setText("Maranguis, Jeriana P. ");

        AccountNum.setFont(new java.awt.Font("Garet Book", 0, 21)); // NOI18N
        AccountNum.setForeground(new java.awt.Color(0, 0, 0));
        AccountNum.setText("111111111111");

        BalanceNum.setFont(new java.awt.Font("Garet Book", 0, 21)); // NOI18N
        BalanceNum.setForeground(new java.awt.Color(0, 0, 0));
        BalanceNum.setText("$ 50, 000");

        TransferToNum.setFont(new java.awt.Font("Garet Book", 0, 21)); // NOI18N
        TransferToNum.setForeground(new java.awt.Color(0, 0, 0));
        TransferToNum.setText("Current");

        TransferredNum.setFont(new java.awt.Font("Garet Book", 0, 21)); // NOI18N
        TransferredNum.setForeground(new java.awt.Color(0, 0, 0));
        TransferredNum.setText("$3,000");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        Remaing.setFont(new java.awt.Font("Garet Book", 0, 23)); // NOI18N
        Remaing.setForeground(new java.awt.Color(0, 0, 0));
        Remaing.setText("Remaining:");

        RemainingNum.setFont(new java.awt.Font("Garet Book", 0, 25)); // NOI18N
        RemainingNum.setForeground(new java.awt.Color(0, 0, 0));
        RemainingNum.setText("$53,000");

        Date.setFont(new java.awt.Font("Garet Book", 0, 13)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm | E, dd/MM");

        String formattedDate = myDateObj.format(myFormatObj);
        Date.setText(formattedDate);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(4, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NameSym)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addComponent(Name))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccountNum))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Remaing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RemainingNum))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Balance)
                                    .addComponent(TranfferTo)
                                    .addComponent(Transferred))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BalanceNum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TransferToNum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TransferredNum, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Date)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameSym)
                    .addComponent(Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNo)
                    .addComponent(AccountNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BalanceNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TranfferTo)
                    .addComponent(TransferToNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transferred)
                    .addComponent(TransferredNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remaing)
                    .addComponent(RemainingNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNo;
    private javax.swing.JLabel AccountNum;
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel BalanceNum;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameSym;
    private javax.swing.JLabel Remaing;
    private javax.swing.JLabel RemainingNum;
    private javax.swing.JLabel TranfferTo;
    private javax.swing.JLabel TransferToNum;
    private javax.swing.JLabel Transferred;
    private javax.swing.JLabel TransferredNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private components.logo logo1;
    // End of variables declaration//GEN-END:variables
}
