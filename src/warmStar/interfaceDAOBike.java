package warmStar;

import java.util.List;

public interface interfaceDAOBike {
    Bike getById(int id);
    void insert(Bike bike);
    List<Bike> getAll();
    void update(Bike bike);
    void deleteById(int id);
    void deleteAll();
}
