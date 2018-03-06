package warmStar;

import java.util.ArrayList;

public interface interfaceDAOBascet {
    Basket getById(int id);
    void insert(Basket basket);
    ArrayList<Basket> getAllIDUser(int id);
    void deleteByIdUser(int id, String model, String smodel);
    void deleteAllIDUser(int id);
}
