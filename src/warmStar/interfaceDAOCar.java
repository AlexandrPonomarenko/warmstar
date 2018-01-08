package warmStar;

import java.util.List;

public interface interfaceDAOCar {
    Car getById(int id);
    void insert(Car car);
    List<Car> getAll();
    void update(Car car);
    void deleteById(int id);
    void deleteAll();
}
