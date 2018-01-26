package warmStar;

import java.util.ArrayList;
import java.util.List;

public interface interfaceDAOCar {
    Car getById(int id);
    void insert(Car car);
    ArrayList<Car> getAll();
    void update(Car car);
    void deleteById(int id);
    void deleteAll();
    int getIDCar(String model, String smodel);
    boolean checkCarModel(String model, String smodel);
}
