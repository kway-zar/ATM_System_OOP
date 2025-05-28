/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author quasar
 */
public class TransactionIcon extends javax.swing.JPanel {

    Image img;
    Image scaledImage;
    int x,y;
    public TransactionIcon() {
        initComponents();
    }
    
    public void setIconImage(String urlString, int w, int h){
        img = new ImageIcon(getClass().getResource(urlString)).getImage();
        scaledImage = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        repaint();
        SwingUtilities.updateComponentTreeUI(this);
    }
    public void setIconImage(String urlString){
        img = new ImageIcon(getClass().getResource(urlString)).getImage();
        scaledImage = img;
        repaint();
        SwingUtilities.updateComponentTreeUI(this);
    }
    public void setIconPosition(int x, int y){
        this.x = x;
        this.y = y;
        
        repaint();
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(scaledImage, x , y, null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
