/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author dnyyy
 */
public class Cart extends Table {

    private final List<CartElement> allProducts;
    
    /**
     * Creates new from StoragePanel
     */
    //
    
    // constructor:
    public Cart() {
        allProducts = new ArrayList();
    }

    // add the given product into cart
    public void addToCart(Product product) {
        allProducts.add(new CartElement(this));
        addNewRow(product.getId(), product.getName(), product.getPrice(), product.getCategory(), product.getAvailable(), allProducts);
        main.setCartTotal();
    }
    
    // remove the given cartElement from cart (cart element contains a product and unique button(s))
    public void removeFromCart(CartElement cartElement) {
        resetTable();
        allProducts.remove(cartElement);
        List<CartElement> modifiedList = new ArrayList();
        for (CartElement element : allProducts) {
            modifiedList.add(element);
            Product product = element.getProductPanel();
            // new list needed
            addNewRow(product.getId(), product.getName(), product.getPrice(), product.getCategory(), product.getAvailable(), modifiedList);
        }
        main.setCartTotal();
    }
    
    // returns the carts size (how many elements it has)
    public int getCartSize() {
        return allProducts.size();
    }
    
    // returns true if the given product is included in the cart less or equal than its availability
    public boolean quantityVerification(Product product) {
        int counter = 0;
        counter = allProducts.stream().filter((element) -> (element.getProductPanel().find(product.getId()) != null)).map((_item) -> 1).reduce(counter, Integer::sum);
        
        return counter >= product.getAvailable();
    }

    // returns the whole list of products 
    public List<Product> getProducts() {
        List<Product> products = new ArrayList();
        for (CartElement element : allProducts) {
            products.add(element.getProductPanel());
        }
        return products;
    }
        
    // returns cart's total converted into string
    public String getTotal() {
        int sum = 0;
        for (CartElement element : allProducts) {
            sum += element.getProductPanel().getPrice();
        }
        return String.valueOf(sum);
    }
    
    // remove all elements from cart
    @Override public void removeAll() {
        resetTable();
        allProducts.removeAll(allProducts);
    }
    
    // load cart elements from json file
    public void loadCart() {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("./src/onlineshop/Files/cart.json"));
            JSONArray storageList = (JSONArray) jsonObject.get("cart");
            Iterator<JSONObject> it = storageList.iterator();
            
            while (it.hasNext()) {
                JSONObject prod = (JSONObject) it.next();

                int id = Integer.parseInt(prod.get("id").toString());
                String name = prod.get("name").toString();
                int price = Integer.parseInt(prod.get("price").toString());
                String category = prod.get("category").toString();
                int available = Integer.parseInt(prod.get("available").toString());
                
                addToCart(new Product(id, name, price, category, available));
            }
        } catch (Exception e) {
            throwMessage(e, "Fajl beolvasasi hiba", JOptionPane.WARNING_MESSAGE);
        }
    
    }
    
    // save datas into json file
    public void saveCart() {
        JSONArray wishlistList = new JSONArray();
        
        for (CartElement element : allProducts) {
            Product product = element.getProductPanel();
            JSONObject obj = new JSONObject();
            
            obj.put("id", product.getId());
            obj.put("name", product.getName());
            obj.put("price", product.getPrice());
            obj.put("category", product.getCategory());
            obj.put("available", product.getAvailable());
            
            wishlistList.add(obj);
        }
        JSONObject result = new JSONObject();
        result.put("cart", wishlistList);
        
        FileWriter file;
        try {
            file = new FileWriter("./src/onlineshop/Files/cart.json");
            file.write(result.toJSONString());
            file.close();
        } catch(IOException e) {
            throwMessage(e, "Fajl kiiras problema", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    // add a new row to the table and the given list by the appropriate product parameters
    public void addNewRow(int id, String name, int price, String category, int available, List<CartElement> list) {
        
        CartElement lastElement = list.get(list.size() - 1);
        lastElement.setLabels(id, name, price, category, available);
        addRowSettings(list.size());
        // verifying how many elements the list has
        if (list.size() == 1) lastElement.setLocation(margin, 6);
        else lastElement.setLocation(margin, list.get(list.size() - 2).getY() + height + margin);
        
        // treat horizontal scroll
        if (this.getSize().width < minWidth) lastElement.setSize(minWidth, height);
        else lastElement.setSize(this.getSize().width - 25, height);
        
        addCartElement(lastElement);
        lastElement.setVisible(true);
    }
}
