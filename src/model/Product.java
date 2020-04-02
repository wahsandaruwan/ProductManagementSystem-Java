package model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int stock;
    private String seller;
    
    public Product(int pid, String pname, float pprice, int pstock, String pseller){
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.stock = pstock;
        this.seller = pseller;
    }
   
    public void setID(int pid){
        this.id=pid;
    }
    public void setName(String pname){
        this.name=pname;
    }
    public void setPrice(float pprice){
        this.price=pprice;
    }
    public void setStock(int pstock){
        this.stock=pstock;
    }
    public void setSeller(String pseller){
        this.seller=pseller;
    }
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public String getSeller(){
        return seller;
    }
    
}
