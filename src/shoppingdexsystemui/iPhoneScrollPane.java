/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingdexsystemui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author ADMIN
 */
public class iPhoneScrollPane {
    private JPanel centerDefault;
    
    public void iPhoneScrollablePanel () {
         JPanel scrollablePanel = new JPanel();
         scrollablePanel.setBackground(Color.WHITE);
         scrollablePanel.setLayout(new BoxLayout(scrollablePanel, BoxLayout.Y_AXIS));
 
         for (int i = 1; i <= 12; i++) {
             JPanel product = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 200));
             scrollablePanel.add(product);
         }
 
         JScrollPane scrollPane = new JScrollPane(scrollablePanel);
        //  scrollPane.setPreferredSize(new Dimension(0, 0));
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         scrollPane.getVerticalScrollBar().setUnitIncrement(30); 
 
         scrollPane.addMouseWheelListener(e -> {
             JScrollBar vertical = scrollPane.getVerticalScrollBar();
             int notches = e.getWheelRotation();
             int currentValue = vertical.getValue();
             int newValue = currentValue + notches * 30; 
             vertical.setValue(newValue);
         });
 
         centerDefault.removeAll();
         centerDefault.add(scrollPane);
         centerDefault.revalidate();
         centerDefault.repaint();
     }
}
