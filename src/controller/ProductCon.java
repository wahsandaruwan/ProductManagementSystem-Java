package controller;

import Product.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;

public class ProductCon {
    Database db = new Database();
    
    //Fill Arraylist with default db data
    public ArrayList<Product> getProductList(){
        ArrayList<Product> productList = new ArrayList<Product>();
            Connection con = db.getConnection();
            String qur = "select *from products_data";
            
            Statement st;
            ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(qur);
            Product product;
            while(rs.next()){
                product = new Product(rs.getInt("id"),rs.getString("name"),Float.parseFloat(rs.getString("price")),rs.getInt("stock"),rs.getString("seller"));
                /*product.setID(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(Float.parseFloat(rs.getString("price")));
                product.setStock(rs.getInt("stock"));
                product.setSeller(rs.getString("seller"));*/
                productList.add(product);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return productList;
    }
    
    //Fill Arraylist with search db data
    public ArrayList<Product> getSearchList(String valToSearch){
        ArrayList<Product> productList = new ArrayList<Product>();
            Connection con = db.getConnection();
            String qur = "select *from products_data where concat(name,stock,price,seller) like'%"+valToSearch+"%'";
            
            Statement st;
            ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(qur);
            Product product;
            while(rs.next()){
                product = new Product(rs.getInt("id"),rs.getString("name"),Float.parseFloat(rs.getString("price")),rs.getInt("stock"),rs.getString("seller"));
                /*product.setID(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(Float.parseFloat(rs.getString("price")));
                product.setStock(rs.getInt("stock"));
                product.setSeller(rs.getString("seller"));*/
                productList.add(product);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return productList;
    }
}
