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


}
