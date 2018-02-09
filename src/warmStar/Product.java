package warmStar;

import java.util.ArrayList;

public class Product {
    private ArrayList<Basket> products;

    public Product(){
        products = new ArrayList<>();
    }

    public void addProduct(Basket basket){
        products.add(basket);
    }

    public void addAllProduct(ArrayList<Basket> arrayList){
        System.out.println(arrayList.size());
        if(arrayList.size() > 0) {
            products.addAll(arrayList);
        }
    }

    public int getLength(){
        return products.size();
    }

    public void deleteProduct(String model, String smodel){
        for(Basket basket: products){
            if(basket.getModel().equals(model) && basket.getSmodel().equals(smodel)){
                products.remove(basket);
            }
        }
    }

    public void deleteAllProduct(){
        products.removeAll(products);
    }

    public ArrayList<Basket> getProducts(){
        return products;
    }


    public void products(){
        for(int i = 0; i < products.size();i++){
            System.out.println(" ID " + products.get(i).getId() + " IDUSER " + products.get(i).getIdUser() + " type " +
                    products.get(i).getTypeProduct() + " model " + products.get(i).getModel() + " smodel " + products.get(i).getSmodel() +
                    " cost " + products.get(i).getCost() + "IDpro " + products.get(i).getIdProduct());
        }
    }

    public int getAllCost(){
        int allCost = 0;
        for(int i = 0; i < products.size();i++){
            allCost += products.get(i).getCost();
        }
        return allCost;
    }

}
