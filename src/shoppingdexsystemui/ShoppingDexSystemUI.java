/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package shoppingdexsystemui;

/**
 *
 * @author ADMIN
 */

// ? need to do create a dark mode and light mode function
// ? need to do create hover effect to the button 
//? need to create a background default image before the selection of brands
//? remove lines, and adjust the color gradients 



 import javax.swing.*;
 import javax.swing.border.Border;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 public class ShoppingDexSystemUI extends JFrame { 
     
    private JPanel centerDefault;
//     scrollpane content ---------------------------------------------------------------------------------------------------------------------------------------------//

     
     public void iPhoneScrollablePanel () {
        createHoverEffect hoverEffect = new createHoverEffect();

         JPanel scrollablePanel = new JPanel();
         scrollablePanel.setBackground(Color.WHITE);
         scrollablePanel.setLayout(new BoxLayout(scrollablePanel, BoxLayout.Y_AXIS));
 
         for (int i = 1; i <= 2; i++) {
            // Creating a panel for the each container of a product inside the scroll pane
            JPanel product = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 500));
            JPanel productWest = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(600, 0));
            JPanel productCenter = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 0));
            JPanel productEast = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(600, 0));
            product.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productWest.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productEast.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            product.add(productWest, BorderLayout.WEST);
            product.add(productCenter, BorderLayout.CENTER);
            product.add(productEast, BorderLayout.EAST);
            scrollablePanel.add(product);

            if(i <2){
                JPanel productWest1 = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 5,5), new Dimension(0, 350));
                JPanel productWest2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 70));
                JPanel productWest3 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 0));
                productWest.add(productWest1, BorderLayout.NORTH);
                productWest.add(productWest2, BorderLayout.SOUTH);
                productWest.add(productWest3, BorderLayout.CENTER);
                ImageIcon iPhone14Icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Bartolay, Jherson\\ShoppingDexSystemUI\\src\\img\\iPhone14Blue.png");
                Image iPhone14Img = iPhone14Icon.getImage().getScaledInstance(200, 330, Image.SCALE_SMOOTH);                    ImageIcon resizedIPhone14img = new ImageIcon(iPhone14Img);
                JLabel iPhone14Blue= new JLabel(resizedIPhone14img);
                productWest1.add(iPhone14Blue, BorderLayout.CENTER);
                    // Button for button 1 in productWest
                JButton productWestButton1 = createButton.button("BUY ITEM", Color.WHITE, Color.BLACK,null, false);
                productWestButton1.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton1, Color.BLACK, Color.WHITE);

                    // Button for button 2 in productWest
                JButton productWestButton2 = createButton.button("DETAILS", Color.WHITE, Color.BLACK,null, false);
                productWestButton2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton2, Color.BLACK, Color.WHITE);

                    // Button for button 3 in productWest
                JButton productWestButton3 = createButton.button("ADD FAVORITE", Color.WHITE, Color.BLACK,null, false);
                productWestButton3.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton3, Color.BLACK, Color.WHITE);
                    
                    // GridBagConstraints for button
                GridBagConstraints gbcbutton = new GridBagConstraints();
                gbcbutton.gridx = 0;
                gbcbutton.gridy = 0;
                gbcbutton.insets = new Insets(0, 10, 0, 10);
                gbcbutton.anchor = GridBagConstraints.CENTER;
                gbcbutton.fill = GridBagConstraints.HORIZONTAL;
                productWest2.add(productWestButton1, gbcbutton);
                gbcbutton.gridx = 1;
                gbcbutton.gridy = 0;
                productWest2.add(productWestButton2, gbcbutton);
                gbcbutton.gridx = 2;
                gbcbutton.gridy = 0;
                productWest2.add(productWestButton3, gbcbutton); 
                  
                productWest1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productWest2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productWest3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
                
                JPanel productCenter1 = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 5,5), new Dimension(0, 350));
                JPanel productCenter2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 70));
                JPanel productCenter3 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 0));
                productCenter.add(productCenter1, BorderLayout.NORTH);
                productCenter.add(productCenter2, BorderLayout.SOUTH);
                productCenter.add(productCenter3, BorderLayout.CENTER);

                ImageIcon iPhone15Icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Bartolay, Jherson\\ShoppingDexSystemUI\\src\\img\\iPhone15Blue.png");
                Image iPhone15Img = iPhone15Icon.getImage().getScaledInstance(200, 330, Image.SCALE_SMOOTH);
                ImageIcon resizedIPhone15img = new ImageIcon(iPhone15Img);
                JLabel iPhone15Blue= new JLabel(resizedIPhone15img);
                productCenter1.add(iPhone15Blue, BorderLayout.CENTER);

                    // Button for button Center in productWest
                JButton productCenterButton1 = createButton.button("BUY ITEM", Color.WHITE, Color.BLACK,null, false);
                productCenterButton1.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton1, Color.BLACK, Color.WHITE);
                    
                // Button for button 2 in productWest
                JButton productCenterButton2 = createButton.button("DETAILS", Color.WHITE, Color.BLACK,null, false);
                productCenterButton2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton2, Color.BLACK, Color.WHITE);

                    // Button for button 3 in productWest
                JButton productCenterButton3 = createButton.button("ADD FAVORITE", Color.WHITE, Color.BLACK,null, false);
                productCenterButton3.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton3, Color.BLACK, Color.WHITE);
                    
                    // GridBagConstraints for button
                GridBagConstraints gbcbuttonCenter = new GridBagConstraints();
                gbcbuttonCenter.gridx = 0;
                gbcbuttonCenter.gridy = 0;
                gbcbuttonCenter.insets = new Insets(0, 10, 0, 10);
                gbcbuttonCenter.anchor = GridBagConstraints.CENTER;
                gbcbuttonCenter.fill = GridBagConstraints.HORIZONTAL;
                productCenter2.add(productCenterButton1, gbcbuttonCenter);
                gbcbuttonCenter.gridx = 1;
                gbcbuttonCenter.gridy = 0;
                productCenter2.add(productCenterButton2, gbcbuttonCenter);
                gbcbuttonCenter.gridx = 2;
                gbcbuttonCenter.gridy = 0;
                productCenter2.add(productCenterButton3, gbcbuttonCenter);    
                productCenter1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productCenter2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productCenter3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
                   
                JPanel productEast1 = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 5,5), new Dimension(0, 350));
                JPanel productEast2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 70));
                JPanel productEast3 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 0));
                productEast.add(productEast1, BorderLayout.NORTH);
                productEast.add(productEast2, BorderLayout.SOUTH);
                productEast.add(productEast3, BorderLayout.CENTER);

                ImageIcon iPhone15ProIcon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Bartolay, Jherson\\ShoppingDexSystemUI\\src\\img\\iPhone15ProBlack.png");
                Image iPhone15ProImg = iPhone15ProIcon.getImage().getScaledInstance(200, 330, Image.SCALE_SMOOTH);
                ImageIcon resizedIPhone15Proimg = new ImageIcon(iPhone15ProImg);
                JLabel iPhone15ProBlack= new JLabel(resizedIPhone15Proimg);
                productEast1.add(iPhone15ProBlack, BorderLayout.CENTER);

                    // Button for button Center in productWest
                JButton productEastButton1 = createButton.button("BUY ITEM", Color.WHITE, Color.BLACK,null, false);
                productEastButton1.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productEastButton1, Color.BLACK, Color.WHITE);

                    // Button for button 2 in productWest
                JButton productEastButton2 = createButton.button("DETAILS", Color.WHITE, Color.BLACK,null, false);
                productEastButton2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productEastButton2, Color.BLACK, Color.WHITE);

                    // Button for button 3 in productWest
                JButton productEastButton3 = createButton.button("ADD FAVORITE", Color.WHITE, Color.BLACK,null, false);
                productEastButton3.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productEastButton3, Color.BLACK, Color.WHITE);
                    
                    // GridBagConstraints for button
                GridBagConstraints gbcbuttonEast = new GridBagConstraints();
                gbcbuttonEast.gridx = 0;
                gbcbuttonEast.gridy = 0;
                gbcbuttonEast.insets = new Insets(0, 10, 0, 10);
                gbcbuttonEast.anchor = GridBagConstraints.CENTER;
                gbcbuttonEast.fill = GridBagConstraints.HORIZONTAL;
                productEast2.add(productEastButton1, gbcbuttonEast);
                gbcbuttonEast.gridx = 1;
                gbcbuttonEast.gridy = 0;
                productEast2.add(productEastButton2, gbcbuttonEast);
                gbcbuttonEast.gridx = 2;
                gbcbuttonEast.gridy = 0;
                productEast2.add(productEastButton3, gbcbuttonEast);    
                productEast1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productEast2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productEast3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
            } else if (i > 1 && i < 3) {
                JPanel productWest1_2 = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 5,5), new Dimension(0, 350));
                JPanel productWest2_2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 70));
                JPanel productWest3_2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 0));
                productWest.add(productWest1_2, BorderLayout.NORTH);
                productWest.add(productWest2_2, BorderLayout.SOUTH);
                productWest.add(productWest3_2, BorderLayout.CENTER);
                ImageIcon iPhone14Icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Bartolay, Jherson\\ShoppingDexSystemUI\\src\\img\\iPhone16Black.png");
                Image iPhone16Img = iPhone14Icon.getImage().getScaledInstance(200, 330, Image.SCALE_SMOOTH);                    ImageIcon resizedIPhone14img = new ImageIcon(iPhone16Img);
                JLabel iPhone16Black= new JLabel(resizedIPhone14img);
                productWest1_2.add(iPhone16Black, BorderLayout.CENTER);
                    // Button for button 1 in productWest
                JButton productWestButton1_2 = createButton.button("BUY ITEM", Color.WHITE, Color.BLACK,null, false);
                productWestButton1_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton1_2, Color.BLACK, Color.WHITE);

                    // Button for button 2 in productWest
                JButton productWestButton2_2 = createButton.button("DETAILS", Color.WHITE, Color.BLACK,null, false);
                productWestButton2_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton2_2, Color.BLACK, Color.WHITE);

                    // Button for button 3 in productWest
                JButton productWestButton3_2 = createButton.button("ADD FAVORITE", Color.WHITE, Color.BLACK,null, false);
                productWestButton3_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productWestButton3_2, Color.BLACK, Color.WHITE);

                GridBagConstraints gbcbutton = new GridBagConstraints();
                gbcbutton.gridx = 0;
                gbcbutton.gridy = 0;
                gbcbutton.insets = new Insets(0, 10, 0, 10);
                gbcbutton.anchor = GridBagConstraints.CENTER;
                gbcbutton.fill = GridBagConstraints.HORIZONTAL;
                productWest2_2.add(productWestButton1_2, gbcbutton);
                gbcbutton.gridx = 1;
                gbcbutton.gridy = 0;
                productWest2_2.add(productWestButton2_2, gbcbutton);
                gbcbutton.gridx = 2;
                gbcbutton.gridy = 0;
                productWest2_2.add(productWestButton3_2, gbcbutton);  

                productWest1_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productWest2_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productWest3_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 

                JPanel productCenter1_2 = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 5,5), new Dimension(0, 350));
                JPanel productCenter2_2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 70));
                JPanel productCenter3_2 = createPanel.panel(Color.WHITE, new GridBagLayout(), new Dimension(0, 0));
                productCenter.add(productCenter1_2, BorderLayout.NORTH);
                productCenter.add(productCenter2_2, BorderLayout.SOUTH);
                productCenter.add(productCenter3_2, BorderLayout.CENTER);
 
                ImageIcon iPhone16ProIcon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Bartolay, Jherson\\ShoppingDexSystemUI\\src\\img\\iPhone16ProBlackTitanium.png");
                Image iPhone16ProImg = iPhone16ProIcon.getImage().getScaledInstance(200, 330, Image.SCALE_SMOOTH);
                ImageIcon resizedIPhone16Proimg = new ImageIcon(iPhone16ProImg);
                JLabel iPhone16ProBlue= new JLabel(resizedIPhone16Proimg);
                productCenter1_2.add(iPhone16ProBlue, BorderLayout.CENTER);

                    // Button for button Center in productWest
                JButton productCenterButton1_2 = createButton.button("BUY ITEM", Color.WHITE, Color.BLACK,null, false);
                productCenterButton1_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton1_2, Color.BLACK, Color.WHITE);
                    
                // Button for button 2 in productWest
                JButton productCenterButton2_2 = createButton.button("DETAILS", Color.WHITE, Color.BLACK,null, false);
                productCenterButton2_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton2_2, Color.BLACK, Color.WHITE);

                    // Button for button 3 in productWest
                JButton productCenterButton3_2 = createButton.button("ADD FAVORITE", Color.WHITE, Color.BLACK,null, false);
                productCenterButton3_2.setPreferredSize(new Dimension(130, 50));
                hoverEffect.createHoverEffect(productCenterButton3_2, Color.BLACK, Color.WHITE);
                    
                    // GridBagConstraints for button
                GridBagConstraints gbcbuttonCenter = new GridBagConstraints();
                gbcbuttonCenter.gridx = 0;
                gbcbuttonCenter.gridy = 0;
                gbcbuttonCenter.insets = new Insets(0, 10, 0, 10);
                gbcbuttonCenter.anchor = GridBagConstraints.CENTER;
                gbcbuttonCenter.fill = GridBagConstraints.HORIZONTAL;
                productCenter2_2.add(productCenterButton1_2, gbcbuttonCenter);
                gbcbuttonCenter.gridx = 1;
                gbcbuttonCenter.gridy = 0;
                productCenter2_2.add(productCenterButton2_2, gbcbuttonCenter);
                gbcbuttonCenter.gridx = 2;
                gbcbuttonCenter.gridy = 0;
                productCenter2_2.add(productCenterButton3_2, gbcbuttonCenter);    
                productCenter1_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productCenter2_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                productCenter3_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
            }
         }
 
         JScrollPane scrollPane = new JScrollPane(scrollablePanel);
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
     
     public void huaweiScrollablePanel () {
         JPanel scrollablePanel = new JPanel();
         scrollablePanel.setBackground(Color.WHITE);
         scrollablePanel.setLayout(new BoxLayout(scrollablePanel, BoxLayout.Y_AXIS));
 
         for (int i = 1; i <= 12; i++) {
             JPanel product = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 400));
             JPanel productWest = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));
             JPanel productCenter = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 0));
             JPanel productEast = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));

             JPanel productWest1 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 300));
             JPanel productWest2 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 200));

             productWest.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
             productWest1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
             productWest2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
             productCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
             productEast.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
             product.add(productWest, BorderLayout.WEST);
             product.add(productCenter, BorderLayout.CENTER);
             product.add(productEast, BorderLayout.EAST);
             scrollablePanel.add(product);
         }
 
         JScrollPane scrollPane = new JScrollPane(scrollablePanel);
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
     
     public void samsungScrollablePanel () {
         JPanel scrollablePanel = new JPanel();
         scrollablePanel.setBackground(Color.WHITE);
         scrollablePanel.setLayout(new BoxLayout(scrollablePanel, BoxLayout.Y_AXIS));
 
         for (int i = 1; i <= 12; i++) {
            JPanel product = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 400));
            JPanel productWest = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));
            JPanel productCenter = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 0));
            JPanel productEast = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));

            JPanel productWest1 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 300));
            JPanel productWest2 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 200));

            productWest.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productWest1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productWest2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productEast.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            product.add(productWest, BorderLayout.WEST);
            product.add(productCenter, BorderLayout.CENTER);
            product.add(productEast, BorderLayout.EAST);
            scrollablePanel.add(product);
         }
 
         JScrollPane scrollPane = new JScrollPane(scrollablePanel);
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
     
     public void xiaomiScrollablePanel () {
         JPanel scrollablePanel = new JPanel();
         scrollablePanel.setBackground(Color.WHITE);
         scrollablePanel.setLayout(new BoxLayout(scrollablePanel, BoxLayout.Y_AXIS));
 
         for (int i = 1; i <= 12; i++) {
            JPanel product = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 400));
            JPanel productWest = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));
            JPanel productCenter = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 0));
            JPanel productEast = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(500, 0));

            JPanel productWest1 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 300));
            JPanel productWest2 = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 200));

            productWest.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productWest1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productWest2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            productEast.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            product.add(productWest, BorderLayout.WEST);
            product.add(productCenter, BorderLayout.CENTER);
            product.add(productEast, BorderLayout.EAST);
            scrollablePanel.add(product);
         }
 
         JScrollPane scrollPane = new JScrollPane(scrollablePanel);
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

//     body content ---------------------------------------------------------------------------------------------------------------------------------------------//
     
     public void bodyPanel () {
        createHoverEffect hoverEffect = new createHoverEffect();


         JPanel north = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 150));
         centerDefault = createPanel.panel(new Color(0x2F2F2F), new BorderLayout(), new Dimension(0, 200));

         JPanel northComponentNorth = createPanel.panel(Color.WHITE, new BorderLayout(), new Dimension(0, 80));
         northComponentNorth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0x5e5e5e)));

         JLabel headerName = createLabel.label("FIND YOUR MOBILE", Color.BLACK, SwingConstants.CENTER, SwingConstants.CENTER);
         headerName.setFont(new Font("Arial", Font.BOLD, 34));
 
         JPanel northComponentSouth = createPanel.panel(Color.WHITE, new FlowLayout(FlowLayout.CENTER, 150, 10), new Dimension(0, 70));
         
         JButton iPhoneBtn = createButton.button("IPHONE", Color.WHITE, Color.BLACK, null, false);
         iPhoneBtn.setPreferredSize(new Dimension(190, 50));
         iPhoneBtn.setFont(new Font("Arial", Font.PLAIN, 20));
         hoverEffect.createHoverEffect(iPhoneBtn, Color.BLACK, Color.WHITE);
         
         JButton huaweiBtn = createButton.button("HUAWEI", Color.WHITE, Color.BLACK, null, false);
         huaweiBtn.setPreferredSize(new Dimension(190, 50));
         huaweiBtn.setFont(new Font("Arial", Font.PLAIN, 20));
         hoverEffect.createHoverEffect(huaweiBtn, Color.BLACK, Color.WHITE);
         
         JButton samsungBtn = createButton.button("SAMSUNG", Color.WHITE, Color.BLACK, null, false);
         samsungBtn.setPreferredSize(new Dimension(190, 50));
         samsungBtn.setFont(new Font("Arial", Font.PLAIN, 20));
         hoverEffect.createHoverEffect(samsungBtn, Color.BLACK, Color.WHITE);

         JButton xiaomiBtn = createButton.button("XIAOMI", Color.WHITE, Color.BLACK, null, false);
         xiaomiBtn.setPreferredSize(new Dimension(190, 50));
         xiaomiBtn.setFont(new Font("Arial", Font.PLAIN, 20));
         hoverEffect.createHoverEffect(xiaomiBtn, Color.BLACK, Color.WHITE);

// action listener for button when being clicked
         iPhoneBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 iPhoneScrollablePanel();
             }
         });
         
         huaweiBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 huaweiScrollablePanel();
             }
         });
 
         samsungBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 huaweiScrollablePanel();
             }
         });
         xiaomiBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 huaweiScrollablePanel();
             }
         });        

         northComponentSouth.add(iPhoneBtn);
         northComponentSouth.add(huaweiBtn);
         northComponentSouth.add(samsungBtn);
         northComponentSouth.add(xiaomiBtn);
         add(north, BorderLayout.NORTH);
         add(centerDefault, BorderLayout.CENTER);
         north.add(northComponentNorth, BorderLayout.NORTH);
         northComponentNorth.add(headerName, BorderLayout.CENTER);
         north.add(northComponentSouth, BorderLayout.SOUTH);
     }
 
     public ShoppingDexSystemUI () {
         setTitle("TECHDEX");
         setSize(1800, 920);
         setLayout(new BorderLayout());
         setMinimumSize(new Dimension(1000, 900));
         getContentPane().setBackground(new Color(0x171d2e));
         setDefaultCloseOperation(EXIT_ON_CLOSE);
 
         bodyPanel(); 
     }
 
     public static void main(String[] args) {
        new ShoppingDexSystemUI().setVisible(true);           
     }
 }