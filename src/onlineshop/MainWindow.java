package onlineshop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dnyyy
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    
    private final Storage testStorage;
    private final Cart cart;
    
    public MainWindow() {
        initComponents();
        
        testStorage = new Storage();
        cart = new Cart(testStorage);
        
        testStorage.testList();
        
        List<String[]> asd = testStorage.searchByName("k");
        if (asd != null) {
            asd.forEach((a) -> {
                System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
            });
        }
       
        
        
//        setTable();
        
        setMenu(homePanel);
    }

    private void setTable() {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        
//        model.setColumnCount(0);
//        model.setRowCount(0);
//        
//        String identifiers[] = {"Id", "Name", "Price", "Category", "Available"};
//        model.setColumnIdentifiers(identifiers);
//        
//        List<String[]> products = testStorage.getAllProducts();
//        
//        for (String prod[] : products) {
//            model.addRow(prod);
//        }
//        
//        table.getTableHeader().setReorderingAllowed(false);
//        
//        table.setEnabled(false);
    }
    
    private void setMenu(javax.swing.JPanel panel) {        
        homePanel.setVisible(homePanel.equals(panel));
        shopPanel.setVisible(shopPanel.equals(panel));
        cartPanel.setVisible(cartPanel.equals(panel));
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanels = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        shopPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        answer = new javax.swing.JLabel();
        myCheck = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        buySomething = new javax.swing.JButton();
        sideBar = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        homeMenuPoint = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        shopMenuPoint = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cartMenuPoint = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePanel.setBackground(new java.awt.Color(204, 255, 255));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        shopPanel.setBackground(new java.awt.Color(204, 0, 0));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        javax.swing.GroupLayout shopPanelLayout = new javax.swing.GroupLayout(shopPanel);
        shopPanel.setLayout(shopPanelLayout);
        shopPanelLayout.setHorizontalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        shopPanelLayout.setVerticalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        cartPanel.setBackground(new java.awt.Color(0, 153, 0));

        answer.setText("Ha ez nem mukodik buzi vagy");

        myCheck.setText("jCheckBox1");
        myCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myCheckMouseClicked(evt);
            }
        });

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        buySomething.setText("vegyunk kiflit");
        buySomething.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buySomethingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buySomething)
                    .addComponent(myCheck)
                    .addComponent(answer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(answer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(buySomething)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout menuPanelsLayout = new javax.swing.GroupLayout(menuPanels);
        menuPanels.setLayout(menuPanelsLayout);
        menuPanelsLayout.setHorizontalGroup(
            menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(shopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelsLayout.setVerticalGroup(
            menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(shopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(204, 204, 204));

        homeMenuPoint.setBackground(new java.awt.Color(255, 255, 255));
        homeMenuPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuPointMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMenuPointMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMenuPointMouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        javax.swing.GroupLayout homeMenuPointLayout = new javax.swing.GroupLayout(homeMenuPoint);
        homeMenuPoint.setLayout(homeMenuPointLayout);
        homeMenuPointLayout.setHorizontalGroup(
            homeMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeMenuPointLayout.setVerticalGroup(
            homeMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        shopMenuPoint.setBackground(new java.awt.Color(255, 255, 255));
        shopMenuPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopMenuPointMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shopMenuPointMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shopMenuPointMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shop");

        javax.swing.GroupLayout shopMenuPointLayout = new javax.swing.GroupLayout(shopMenuPoint);
        shopMenuPoint.setLayout(shopMenuPointLayout);
        shopMenuPointLayout.setHorizontalGroup(
            shopMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shopMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        shopMenuPointLayout.setVerticalGroup(
            shopMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        cartMenuPoint.setBackground(new java.awt.Color(255, 255, 255));
        cartMenuPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMenuPointMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartMenuPointMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartMenuPointMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cart");

        javax.swing.GroupLayout cartMenuPointLayout = new javax.swing.GroupLayout(cartMenuPoint);
        cartMenuPoint.setLayout(cartMenuPointLayout);
        cartMenuPointLayout.setHorizontalGroup(
            cartMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartMenuPointLayout.setVerticalGroup(
            cartMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shopMenuPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartMenuPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeMenuPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeMenuPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shopMenuPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartMenuPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setBackground(new java.awt.Color(255, 255, 204));
        logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("nem");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table1MouseClicked

    private void myCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myCheckMouseClicked
        System.out.println(myCheck.isSelected());
    }//GEN-LAST:event_myCheckMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        JList theList = (JList) evt.getSource();
        if (evt.getClickCount() == 1) {
            
            int index = theList.locationToIndex(evt.getPoint());
            if (index >= 0) {
                Object o = theList.getModel().getElementAt(index);
            }
        } else if (evt.getClickCount() == 2) {
            
        }
    }//GEN-LAST:event_listMouseClicked

    private void homeMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseClicked
        setMenu(homePanel);
    }//GEN-LAST:event_homeMenuPointMouseClicked

    private void homeMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_homeMenuPointMouseExited

    private void homeMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_homeMenuPointMouseEntered

    private void shopMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMenuPointMouseClicked
        setMenu(shopPanel);
    }//GEN-LAST:event_shopMenuPointMouseClicked

    private void shopMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_shopMenuPointMouseExited

    private void shopMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_shopMenuPointMouseEntered

    private void cartMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseClicked
        setMenu(cartPanel);
    }//GEN-LAST:event_cartMenuPointMouseClicked

    private void cartMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cartMenuPointMouseExited

    private void cartMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cartMenuPointMouseEntered

    private void buySomethingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buySomethingActionPerformed
        // TODO add your handling code here:
        try {
            cart.add(3, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane optionPane = new JOptionPane(e.getMessage(), JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Mennyiseg hiba!");
            dialog.setLocationByPlatform(true);
            dialog.setLocationRelativeTo(this);
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
    }//GEN-LAST:event_buySomethingActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer;
    private javax.swing.JButton buySomething;
    private javax.swing.JPanel cartMenuPoint;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel homeMenuPoint;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuPanels;
    private javax.swing.JCheckBox myCheck;
    private javax.swing.JPanel shopMenuPoint;
    private javax.swing.JPanel shopPanel;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(Object object, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
