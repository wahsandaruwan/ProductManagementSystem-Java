package model;

public class Seller {
    private int id;
    private String name;
    private String address;
    private int phone;
   
    public void setID(int pid){
        this.id=pid;
    }
    public void setName(String pname){
        this.name=pname;
    }
    public void setAddress(String saddress){
        this.address=saddress;
    }
    public void setPhone(int sphone){
        this.phone=sphone;
    }
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhone(){
        return phone;
    }
}
