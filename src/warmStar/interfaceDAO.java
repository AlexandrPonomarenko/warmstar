package warmStar;

import java.util.List;

public interface interfaceDAO {
    User getById(int id);
    void insert(User user);
    List<User> getAll();
    void update(User user);
    void deleteById(int id);
    void deleteAll();
    boolean getByLogin(String login);
    boolean validationUser(String login, String password);
    int getIdUser(String name);
}
