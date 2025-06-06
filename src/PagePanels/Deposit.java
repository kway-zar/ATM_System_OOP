package PagePanels;
import ImportantFunctions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Deposit extends JPanel {

    public void setInfo(userInfo info) {
        this.info = info;
    }
    private userInfo info;
    Timer timer;
    ActionListener taskPerformer;

    public Deposit() {
        setOpaque(false);
        initComponents();

        // Focus listener only added once
       taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(!numpadContainer2.getInput().isEmpty()){
                    depositamm.setText("$" + numpadContainer2.getInput());
                
                }
                else{
                    depositamm.setText("$0.00");
                    
                }
                if(info != null){
                    balamm.setText("$" + String.valueOf(info.getAccountBalance()));
                    button1.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mouseClicked(java.awt.event.MouseEvent evt){
                            if(SwingUtilities.isLeftMouseButton(evt)){
                                int lastIndex = depositamm.getText().lastIndexOf(".");
                                String trimmedStr = (lastIndex != -1) ? depositamm.getText().substring(0, lastIndex) : depositamm.getText();
                                
                                if(depositamm.getText().length() > 0 && Integer.parseInt(trimmedStr.replace("$", "").replace(",", ""))>= 40){
                                        System.out.println("Deposit");
                                        double amount = Double.parseDouble(trimmedStr.replace("$", "").replace(",", ""));
                                        
                                        DepositLogic d = new DepositLogic();
                                        d.deposit(amount, info);
                                        JOptionPane.showMessageDialog(null, "Successful Transaction");
                                        double oldBalance = info.getAccountBalance();
                                        ATM_System atm = new ATM_System();
                                        info = atm.setUserInfo(info.getCARD_NO(), info.getPIN_CODE(), false, 0);
                                        
                                        if(printrec.isSelected()){
                                            Reciept reciept = new Reciept(info, oldBalance, amount, 0);
 
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
                                        
                                        
                                        depositamm.setText("");

                                }else if(depositamm.getText().length() > 1 && Integer.parseInt(trimmedStr.replace("$", "").replace(",", "")) < 40){
                                    JOptionPane.showMessageDialog(null, "Deposit amount must exceed or reach 40");
                                    depositamm.setText("");
                                    
                                }

                            }

                        }
                    });
                
                }
                
            }
        };
        
        timer = new Timer(500, taskPerformer);
        timer.start();
    }
    
    public javax.swing.JLabel getBackButton() {
        return jLabel2;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Make sure proper painting occurs
        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numpadContainer2 = new components.numpadContainer();
        jLabel1 = new javax.swing.JLabel();
        background1 = new components.background(){
            @Override
            public void paintComponent(Graphics g) {

                g.setColor(new Color(0,0,0,70));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

            }

        };
        onehando = new components.ValueButton();
        onetao = new components.ValueButton();
        fivehando = new components.ValueButton();
        totao = new components.ValueButton();
        fortao = new components.ValueButton();
        faitao = new components.ValueButton();
        tentao = new components.ValueButton();
        printrec = new javax.swing.JCheckBox();
        depositamm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        balamm = new javax.swing.JLabel();
        button1 = new components.Button();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0, 0));
        setForeground(new Color(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1048, 562));

        jLabel1.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cash Deposit");

        background1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        background1.setPreferredSize(new java.awt.Dimension(566, 309));

        onehando.setFont(new java.awt.Font("Garet", 1, 14));
        onehando.setForeground(new java.awt.Color(255,255,255));
        onehando.setText("100");
        onehando.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        onehando.setPreferredSize(new java.awt.Dimension(130, 30));
        onehando.setRadius(30);
        onehando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onehandoActionPerformed(evt);
            }
        });

        onetao.setFont(new java.awt.Font("Garet", 1, 14));
        onetao.setForeground(new java.awt.Color(255,255,255));
        onetao.setText("1000");
        onetao.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        onetao.setPreferredSize(new java.awt.Dimension(130, 30));
        onetao.setRadius(30);
        onetao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetaoActionPerformed(evt);
            }
        });

        fivehando.setFont(new java.awt.Font("Garet", 1, 14));
        fivehando.setForeground(new java.awt.Color(255,255,255));
        fivehando.setText("500");
        fivehando.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        fivehando.setPreferredSize(new java.awt.Dimension(130, 30));
        fivehando.setRadius(30);
        fivehando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivehandoActionPerformed(evt);
            }
        });

        totao.setFont(new java.awt.Font("Garet", 1, 14));
        totao.setForeground(new java.awt.Color(255,255,255));
        totao.setText("2000");
        totao.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        totao.setPreferredSize(new java.awt.Dimension(160, 30));
        totao.setRadius(30);
        totao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaoActionPerformed(evt);
            }
        });

        fortao.setFont(new java.awt.Font("Garet", 1, 14));
        fortao.setForeground(new java.awt.Color(255,255,255));
        fortao.setText("4000");
        fortao.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        fortao.setPreferredSize(new java.awt.Dimension(160, 30));
        fortao.setRadius(30);
        fortao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fortaoActionPerformed(evt);
            }
        });

        faitao.setFont(new java.awt.Font("Garet", 1, 14));
        faitao.setForeground(new java.awt.Color(255,255,255));
        faitao.setText("5000");
        faitao.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        faitao.setPreferredSize(new java.awt.Dimension(160, 30));
        faitao.setRadius(30);
        faitao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faitaoActionPerformed(evt);
            }
        });

        tentao.setFont(new java.awt.Font("Garet", 1, 14));
        tentao.setForeground(new java.awt.Color(255,255,255));
        tentao.setText("10000");
        tentao.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        tentao.setPreferredSize(new java.awt.Dimension(160, 30));
        tentao.setRadius(30);
        tentao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentaoActionPerformed(evt);
            }
        });

        printrec.setFont(new java.awt.Font("Garet Book", 0, 12)); // NOI18N
        printrec.setForeground(new java.awt.Color(255, 255, 255));
        printrec.setText("Print Reciept");
        printrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printrecActionPerformed(evt);
            }
        });

        depositamm.setFont(new java.awt.Font("Garet Book", 0, 36)); // NOI18N
        depositamm.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(546, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(onehando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(fivehando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(onetao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(background1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faitao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fortao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tentao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(depositamm, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(printrec)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(depositamm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onehando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onetao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fivehando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faitao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tentao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(printrec)
                .addGap(23, 23, 23))
        );

        balamm.setFont(new java.awt.Font("Garet Book", 0, 36)); // NOI18N
        balamm.setForeground(new java.awt.Color(255, 255, 255));
        balamm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        balamm.setText("50,000,000,000,000.00");

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Deposit");
        button1.setRadius(50);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Garet", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/left.png"))); // NOI18N
        jLabel2.setText("BACK");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numpadContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balamm, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balamm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numpadContainer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void totaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("200.00");
        
    }//GEN-LAST:event_totaoActionPerformed

    private void faitaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faitaoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("5000.00");
    }//GEN-LAST:event_faitaoActionPerformed

    private void fivehandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivehandoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("500.00");
    }//GEN-LAST:event_fivehandoActionPerformed

    private void onetaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetaoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("1000.00");
    }//GEN-LAST:event_onetaoActionPerformed

    private void fortaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fortaoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("4000.00");
    }//GEN-LAST:event_fortaoActionPerformed

    private void tentaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentaoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("10000.00");
    }//GEN-LAST:event_tentaoActionPerformed

    private void printrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printrecActionPerformed

    private void onehandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onehandoActionPerformed
        // TODO add your handling code here:
        numpadContainer2.getNumpad().setTextString("100.00");
    }//GEN-LAST:event_onehandoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.background background1;
    private javax.swing.JLabel balamm;
    private components.Button button1;
    private javax.swing.JLabel depositamm;
    private components.ValueButton faitao;
    private components.ValueButton fivehando;
    private components.ValueButton fortao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private components.numpadContainer numpadContainer2;
    private components.ValueButton onehando;
    private components.ValueButton onetao;
    private javax.swing.JCheckBox printrec;
    private components.ValueButton tentao;
    private components.ValueButton totao;
    // End of variables declaration//GEN-END:variables
}
