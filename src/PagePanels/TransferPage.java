/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PagePanels;

import ImportantFunctions.ATM_System;
import ImportantFunctions.userInfo;
import ImportantFunctions.Withdraw;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author rowaine
 */
public class TransferPage extends javax.swing.JPanel {

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setInfo(userInfo info) {
        this.info = info;
    }
    private userInfo info;

    Timer timer;
    ActionListener taskPerformer;
    private int index = 4;

    public TransferPage() {
        setOpaque(false);
        initComponents();
        timer = new Timer(100, (ActionListener) -> {
            if (info != null) {
                jLabel3.setText("$" + String.valueOf(info.getAccountBalance()));
            }

        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accSelector1 = new components.AccSelector();
        accSelector2 = new components.AccSelector();
        background2 = new components.background(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(new Color(0,0,0,70));
                g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
            }

        };
        background3 = new components.background() {
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(new Color(0,0,0,70));
                g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
            }

        }; ;
        valueButton1 = new components.ValueButton();
        valueButton2 = new components.ValueButton();
        valueButton3 = new components.ValueButton();
        valueButton4 = new components.ValueButton();
        valueButton5 = new components.ValueButton();
        valueButton6 = new components.ValueButton();
        valueButton7 = new components.ValueButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new components.Button();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Garet", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bank Transfer");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Garet", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Garet", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("To");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        accSelector1.setLabelText("Savings");
        add(accSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, 50));
        add(accSelector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 190, 50));
        add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 350, 280));

        valueButton2.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton1.setForeground(new java.awt.Color(255, 255, 255));
        valueButton1.setText("500");
        valueButton1.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton1.setRadius(50);
        valueButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton1ActionPerformed(evt);
            }
        });

        valueButton1.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton2.setForeground(new java.awt.Color(255, 255, 255));
        valueButton2.setText("100");
        valueButton2.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton2.setRadius(50);
        valueButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton2ActionPerformed(evt);
            }
        });

        valueButton3.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton3.setForeground(new java.awt.Color(255, 255, 255));
        valueButton3.setText("1000");
        valueButton3.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton3ActionPerformed(evt);
            }
        });

        valueButton4.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton4.setForeground(new java.awt.Color(255, 255, 255));
        valueButton4.setForeground(new java.awt.Color(255, 255, 255));
        valueButton4.setText("2,000");
        valueButton4.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton4ActionPerformed(evt);
            }
        });

        valueButton5.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton5.setForeground(new java.awt.Color(255, 255, 255));
        valueButton5.setForeground(new java.awt.Color(255, 255, 255));
        valueButton5.setText("4,000");
        valueButton5.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton5ActionPerformed(evt);
            }
        });

        valueButton6.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton6.setForeground(new java.awt.Color(255, 255, 255));
        valueButton6.setForeground(new java.awt.Color(255, 255, 255));
        valueButton6.setText("5,000");
        valueButton6.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton6ActionPerformed(evt);
            }
        });

        valueButton7.setFont(new java.awt.Font("Garet", 1, 17));
        valueButton7.setForeground(new java.awt.Color(255, 255, 255));
        valueButton7.setForeground(new java.awt.Color(255, 255, 255));
        valueButton7.setText("10,000");
        valueButton7.setPreferredSize(new java.awt.Dimension(76, 30));
        valueButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueButton7ActionPerformed(evt);
            }
        });

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Garet", 1, 17));
        jCheckBox1.setText("Print Receipt");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(322, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Garet", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background3Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                                        .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(background3Layout.createSequentialGroup()
                                                .addComponent(valueButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(valueButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(background3Layout.createSequentialGroup()
                                                .addComponent(valueButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(valueButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(78, 78, 78)))
                                .addGroup(background3Layout.createSequentialGroup()
                                    .addComponent(valueButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(valueButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(valueButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))))
                        .addGroup(background3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(19, 19, 19))
        );

        add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Garet", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/left.png"))); // NOI18N
        jLabel1.setText("BACK");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setFont(new java.awt.Font("Garet", 1, 17));
        button1.setText("TRANSFER");
        button1.setRadius(50);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 130, 50));

        jLabel3.setFont(new java.awt.Font("Garet", 0, 40)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("$500,000.00");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 110, 350, 60));
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JLabel getBackButton() {
        return jLabel1;
    }
    private void valueButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton1ActionPerformed
        jLabel5.setText("$500");
    }//GEN-LAST:event_valueButton1ActionPerformed

    private void valueButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton2ActionPerformed
        jLabel5.setText("$100");
    }//GEN-LAST:event_valueButton2ActionPerformed

    private void valueButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton3ActionPerformed
        jLabel5.setText("$1000");
    }//GEN-LAST:event_valueButton3ActionPerformed

    private void valueButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton4ActionPerformed
        jLabel5.setText("$2000");
    }//GEN-LAST:event_valueButton4ActionPerformed

    private void valueButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton5ActionPerformed
        jLabel5.setText("$4000");
    }//GEN-LAST:event_valueButton5ActionPerformed

    private void valueButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton6ActionPerformed
        jLabel5.setText("$5000");
    }//GEN-LAST:event_valueButton6ActionPerformed

    private void valueButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueButton7ActionPerformed
        jLabel5.setText("$10000");
    }//GEN-LAST:event_valueButton7ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:

        int amount = Integer.parseInt(jLabel5.getText().replace("$", ""));
        Withdraw w = new Withdraw();
        boolean validAmount = w.withdraw(amount, info);
        if (validAmount == true) {
            double oldBalance = info.getAccountBalance();
            ATM_System atm = new ATM_System();
            info = atm.setUserInfo(info.getCARD_NO(), info.getPIN_CODE(), false, 0);
            JOptionPane.showMessageDialog(null, "Successful Transaction");

            if (jCheckBox1.isSelected()) {
                RecieptTransfer reciept = new RecieptTransfer(info, oldBalance, amount);
                setLayout(new GridBagLayout());
                // Remove every componentttsssss
                Component[] components = getComponents();
                for (Component component : components) {
                    remove(component);
                }
                add(reciept);
                //force UI to refresh
                revalidate();
                repaint();
            }

        }
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.AccSelector accSelector1;
    private components.AccSelector accSelector2;
    private components.background background2;
    private components.background background3;
    private components.Button button1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private components.ValueButton valueButton1;
    private components.ValueButton valueButton2;
    private components.ValueButton valueButton3;
    private components.ValueButton valueButton4;
    private components.ValueButton valueButton5;
    private components.ValueButton valueButton6;
    private components.ValueButton valueButton7;
    // End of variables declaration//GEN-END:variables
}
