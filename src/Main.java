
import ImportantFunctions.userInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author quasar
 */
public class Main extends javax.swing.JFrame {

    /**
     * @param info the info to set
     */
    public void setInfo(userInfo info) {
        this.info = info;
    }

    /**
     * Creates new form Main
     */
    Timer timer;
    Timer loadTimer;
    
    ActionListener taskPerformer;
    ActionListener loadPage;
    
    private userInfo info = new userInfo();
    int pageIndex = 0;
    public Main() {
        initComponents();
        LoginSession();
        
        
    }
    
    
    public void LoginSession(){
        loadPage = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt) {
                    if(enterCardPage1.isNext() == true){
                        pageIndex++;
                        enterCardPage1.setVisible(false);
                        enterPinPage1.setVisible(true);
                        enterPinPage1.setCardNo(enterCardPage1.getCardNo());
                        
                        
                        
                        if(enterPinPage1.isLoggedIn() == true){
                            pageIndex = 3;
                            info = enterPinPage1.getInfo();
                            home1.setInfo(info);
                            
                            enterPinPage1.setVisible(false);
                            //System.out.println(info.getName());
                            home1.setUsername(info.getName(), languageButton1.getLanguage());
                            home1.setVisible(true);
                            
                            
                            
                        }

                    }

                }

            };
            loadTimer = new Timer(50, loadPage);
            loadTimer.start();
    
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background1 = new components.background();
        circle1 = new components.Circle();
        languageButton1 = new buttons.LanguageButton();
        dateAndTimeLabel1 = new components.DateAndTimeLabel();
        logo2 = new components.logo();
        enterCardPage1 = new PagePanels.EnterCardPage();
        enterPinPage1 = new PagePanels.EnterPinPage();
        home1 = new PagePanels.Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        circle1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        languageButton1.setSecondButtonInvisible();
        languageButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                languageButton1MouseEntered(evt);
            }
        });
        languageButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                languageButton1PropertyChange(evt);
            }
        });
        circle1.add(languageButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 6, -1, -1));
        circle1.add(dateAndTimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));
        circle1.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 60));
        circle1.add(enterCardPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        enterPinPage1.setVisible(false);
        circle1.add(enterPinPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        circle1.add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1100, 560));
        home1.setVisible(false);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(circle1, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(circle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void languageButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_languageButton1MouseEntered
        
        taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(languageButton1.noMouseActivity() == true){
                    languageButton1.setSecondButtonInvisible();
                }
            }
        };
        timer = new Timer(500, taskPerformer);
        timer.start();
    }//GEN-LAST:event_languageButton1MouseEntered

    private void languageButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_languageButton1PropertyChange
        
        if(enterPinPage1.isLoggedIn() == true){
            home1.setUsername(info.getName(), languageButton1.getLanguage());
        }
    }//GEN-LAST:event_languageButton1PropertyChange


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.background background1;
    private components.Circle circle1;
    private components.DateAndTimeLabel dateAndTimeLabel1;
    private PagePanels.EnterCardPage enterCardPage1;
    private PagePanels.EnterPinPage enterPinPage1;
    private PagePanels.Home home1;
    private javax.swing.JPanel jPanel1;
    private buttons.LanguageButton languageButton1;
    private components.logo logo2;
    // End of variables declaration//GEN-END:variables
}
