package onlineshop;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    
    public MainWindow() {
        initComponents();
        testPanelContainer2.build(cart1, whishlist1);
        cart1.setMain(this);
        whishlist1.setMain(this);
        setMenu(homePanel);
    }

    public void setCartTotal() {
        cartTotal.setText("Összeg: " + cart1.getTotal() + "Ft");
    }
    
    public void setWhishlistTotal() {
        whishlistTotal.setText("Összeg: " + whishlist1.getTotal() + "Ft");
    }
    
    private void setMenu(JPanel panel) {
        homePanel.setVisible(homePanel.equals(panel));
        whishlistPanel.setVisible(whishlistPanel.equals(panel));
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
        searchField = new javax.swing.JTextField();
        searchType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        testPanelContainer2 = new onlineshop.Storage();
        jLabel7 = new javax.swing.JLabel();
        whishlistPanel = new javax.swing.JPanel();
        whishlist1 = new onlineshop.Whishlist();
        jLabel6 = new javax.swing.JLabel();
        whishlistTotal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cartPanel = new javax.swing.JPanel();
        cart1 = new onlineshop.Cart();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cartTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sideBar = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        homeMenuPoint = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        whishlistMenuPoint = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cartMenuPoint = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        homePanel.setBackground(new java.awt.Color(204, 255, 255));

        searchField.setToolTipText(null);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        searchType.setEditable(true);
        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nev", "Kategoria" }));
        searchType.setToolTipText(null);
        searchType.setFocusable(false);
        searchType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                searchTypeItemStateChanged(evt);
            }
        });

        jLabel5.setText("Keresés a következők szerint:");

        testPanelContainer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testPanelContainer2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HOME");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(testPanelContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testPanelContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        searchField.getAccessibleContext().setAccessibleName("");

        whishlistPanel.setBackground(new java.awt.Color(204, 255, 204));

        whishlist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whishlist1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WHISHLIST");

        whishlistTotal.setBackground(new java.awt.Color(255, 255, 255));
        whishlistTotal.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        whishlistTotal.setText("Összeg: 0Ft");

        javax.swing.GroupLayout whishlistPanelLayout = new javax.swing.GroupLayout(whishlistPanel);
        whishlistPanel.setLayout(whishlistPanelLayout);
        whishlistPanelLayout.setHorizontalGroup(
            whishlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whishlistPanelLayout.createSequentialGroup()
                .addGroup(whishlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whishlistPanelLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whishlistPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(whishlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(whishlistTotal)
                            .addComponent(whishlist1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        whishlistPanelLayout.setVerticalGroup(
            whishlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whishlistPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(whishlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whishlistTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        cartPanel.setBackground(new java.awt.Color(0, 153, 0));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CART");

        cartTotal.setBackground(new java.awt.Color(255, 255, 255));
        cartTotal.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cartTotal.setText("Összeg: 0Ft");
        cartTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTotalMouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel8))
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(cartPanelLayout.createSequentialGroup()
                                .addComponent(cartTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelsLayout = new javax.swing.GroupLayout(menuPanels);
        menuPanels.setLayout(menuPanelsLayout);
        menuPanelsLayout.setHorizontalGroup(
            menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(whishlistPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelsLayout.setVerticalGroup(
            menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(whishlistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        whishlistMenuPoint.setBackground(new java.awt.Color(255, 255, 255));
        whishlistMenuPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whishlistMenuPointMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                whishlistMenuPointMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                whishlistMenuPointMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Whislist");

        javax.swing.GroupLayout whishlistMenuPointLayout = new javax.swing.GroupLayout(whishlistMenuPoint);
        whishlistMenuPoint.setLayout(whishlistMenuPointLayout);
        whishlistMenuPointLayout.setHorizontalGroup(
            whishlistMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whishlistMenuPointLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        whishlistMenuPointLayout.setVerticalGroup(
            whishlistMenuPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whishlistMenuPointLayout.createSequentialGroup()
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
                    .addComponent(whishlistMenuPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(whishlistMenuPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartMenuPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setBackground(new java.awt.Color(255, 255, 204));
        logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JAVAslom hogy mukodj");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
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
    
    private void homeMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseClicked
        setMenu(homePanel);
    }//GEN-LAST:event_homeMenuPointMouseClicked

    private void homeMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_homeMenuPointMouseExited

    private void homeMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_homeMenuPointMouseEntered

    private void whishlistMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whishlistMenuPointMouseClicked
        setMenu(whishlistPanel);
    }//GEN-LAST:event_whishlistMenuPointMouseClicked

    private void whishlistMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whishlistMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_whishlistMenuPointMouseExited

    private void whishlistMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whishlistMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_whishlistMenuPointMouseEntered

    private void cartMenuPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseClicked
        setMenu(cartPanel);
    }//GEN-LAST:event_cartMenuPointMouseClicked

    private void cartMenuPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cartMenuPointMouseExited

    private void cartMenuPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMenuPointMouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cartMenuPointMouseEntered

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        search();
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_searchTypeItemStateChanged
        search();
    }//GEN-LAST:event_searchTypeItemStateChanged

    private void whishlist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whishlist1MouseClicked
//        whishlist1.getTotal();
        
    }//GEN-LAST:event_whishlist1MouseClicked

    private void cartTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTotalMouseClicked
        cartTotal.setText("Összeg: " + cart1.getTotal() + "Ft");
    }//GEN-LAST:event_cartTotalMouseClicked

    private void testPanelContainer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testPanelContainer2MouseClicked
        cartTotal.setText("Összeg: " + cart1.getTotal() + "Ft");
    }//GEN-LAST:event_testPanelContainer2MouseClicked

    private void search() {
        if (searchType.getSelectedIndex() == 0)
            testPanelContainer2.searchByName(searchField.getText());
        else if (searchType.getSelectedIndex() == 1)
            testPanelContainer2.searchByCategory(searchField.getText());
    }
    
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
    private onlineshop.Cart cart1;
    private javax.swing.JPanel cartMenuPoint;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel cartTotal;
    private javax.swing.JPanel homeMenuPoint;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuPanels;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JPanel sideBar;
    private onlineshop.Storage testPanelContainer2;
    private onlineshop.Whishlist whishlist1;
    private javax.swing.JPanel whishlistMenuPoint;
    private javax.swing.JPanel whishlistPanel;
    private javax.swing.JLabel whishlistTotal;
    // End of variables declaration//GEN-END:variables
}
