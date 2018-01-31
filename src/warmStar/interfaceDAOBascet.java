package warmStar;

import java.util.ArrayList;

public interface interfaceDAOBascet {
    Basket getById(int id);
    void insert(Basket basket);
    ArrayList<Basket> getAllIDUser(int id);
//    void update(Basket basket);
    void deleteByIdUser(int id, String model, String smodel);
    void deleteAllIDUser(int id);
//    int getIDUser(String model, String smodel);
//    int getIDProduct(String model, String smodel);
//    boolean checkBikeModel(String model, String smodel);
}
