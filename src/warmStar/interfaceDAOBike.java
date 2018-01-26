package warmStar;

import java.util.ArrayList;
import java.util.List;

public interface interfaceDAOBike {
    Bike getById(int id);
    void insert(Bike bike);
    ArrayList<Bike> getAll();
    void update(Bike bike);
    void deleteById(int id);
    void deleteAll();
    int getIDBike(String model, String smodel);
    boolean checkBikeModel(String model, String smodel);
}
