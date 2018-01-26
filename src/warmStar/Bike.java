package warmStar;

import java.sql.Date;

public class Bike {
    private int id;
    private String model;
    private String smodel;
    private String color;
    private int price;
    private String type;
    private Date dateadd;
    private int quantity;
    private String path1;
    private String path2;
    private String path3;

    public Bike(){

    }

    public Bike(int id, String model, String smodel, String color, int price, String type, Date dateadd, int quantity, String path1, String path2, String path3) {
        this.id = id;
        this.model = model;
        this.smodel = smodel;
        this.color = color;
        this.price = price;
        this.type = type;
        this.dateadd = dateadd;
        this.quantity = quantity;
        this.path1 = path1;
        this.path2 = path2;
        this.path3 = path3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSmodel(String smodel) {
        this.smodel = smodel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDateadd(Date dateadd) {
        this.dateadd = dateadd;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    public void setPath3(String path3) {
        this.path3 = path3;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getSmodel() {
        return smodel;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Date getDateadd() {
        return dateadd;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPath1() {
        return path1;
    }

    public String getPath2() {
        return path2;
    }

    public String getPath3() {
        return path3;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", model=" + model + ", smodel=" + smodel + ", color=" + color +
                ", price=" + price + ",type=" + type + ", dateadd=" + dateadd + ", quantity=" + quantity +
                ", path1=" + path1 +", path2=" + path2 +", path3=" + path3 +"}";
    }
}
