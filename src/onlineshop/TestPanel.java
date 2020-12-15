/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

/**
 *
 * @author dnyyy
 */
public class TestPanel extends javax.swing.JPanel {

    private int id;
    private String name;
    private int price;
    private String category;
    private int available;
    
    /**
     * Creates new form TestPanel
     * @param id
     * @param name
     * @param price
     * @param category
     * @param available
     */
    
    public TestPanel(int id, String name, int price, String category, int available) {
        initComponents();
        
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
        
        setLabels(new String[]{
            String.valueOf(id),
            name,
            String.valueOf(price),
            category,
            String.valueOf(available)
        });
    }
    
    public TestPanel(String product[]) {
        initComponents();
        
        this.id = Integer.parseInt(product[0]);
        this.name = product[1];
        this.price = Integer.parseInt(product[2]);
        this.category = product[3];
        this.available = Integer.parseInt(product[4]);
        
        setLabels(new String[]{
            String.valueOf(id),
            name,
            String.valueOf(price),
            category,
            String.valueOf(available)
        });
    }
    
    public TestPanel() {
        initComponents();
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public int getAvailable() {
        return available;
    }
    
    public void setAvailable(int available) {
        this.available = available;
    }
    
    private void setLabels(String labelTexts[]) {
        labelId.setText(labelTexts[0]);
        labelName.setText(labelTexts[1]);
        labelPrice.setText(labelTexts[2] + "Ft");
        labelCategory.setText(labelTexts[3]);
        labelAvailable.setText(labelTexts[4] + "db");
    }
    
    public void setLabelsByArray(String product[]) {
        labelId.setText(product[0]);
        labelName.setText(product[1]);
        labelPrice.setText(product[2] + "Ft");
        labelCategory.setText(product[3]);
        labelAvailable.setText(product[4] + "db");
        
        this.id = Integer.parseInt(product[0]);
        this.name = product[1];
        this.price = Integer.parseInt(product[2]);
        this.category = product[3];
        this.available = Integer.parseInt(product[4]);
    }
    
    public void setLabelsByParameters(int id, String name, int price, String category, int available) {
        labelId.setText(String.valueOf(id));
        labelName.setText(name);
        labelPrice.setText(String.valueOf(price) + "Ft");
        labelCategory.setText(category);
        labelAvailable.setText(String.valueOf(available) + "db");
        
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        labelId = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelAvailable = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 28));
        setMinimumSize(new java.awt.Dimension(400, 28));
        setPreferredSize(new java.awt.Dimension(400, 28));
        setSize(new java.awt.Dimension(400, 28));

        labelId.setText("jLabel2");

        labelName.setText("jLabel3");

        labelPrice.setText("jLabel4");

        labelCategory.setText("jLabel5");

        labelAvailable.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(labelPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(labelCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(labelAvailable)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelId)
                    .addComponent(labelName)
                    .addComponent(labelPrice)
                    .addComponent(labelCategory)
                    .addComponent(labelAvailable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAvailable;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    // End of variables declaration//GEN-END:variables
}
