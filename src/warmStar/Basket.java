package warmStar;

public class Basket {
    private int id;
    private int idUser;
    private int idProduct;
    private String typeProduct;
    private String model;
    private String smodel;
    private int cost;

    public Basket(){}

    public Basket(int id, int idUser, int idProduct, String typeProduct, String model, String smodel, int cost){
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.typeProduct = typeProduct;
        this.model = model;
        this.smodel = smodel;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSmodel() {
        return smodel;
    }

    public void setSmodel(String smodel) {
        this.smodel = smodel;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", idUser=" + idUser + ", idProduct=" + ", typeProduct=" + typeProduct +
                ", model=" + model + ", smodel=" + smodel + "}";
    }
}
