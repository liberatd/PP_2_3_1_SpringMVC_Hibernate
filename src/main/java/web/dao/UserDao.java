package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    void add (User user);
    void update (User user, long id);
    void delete (long id);
    User getById (long id);
    List<User> getAllUsers();
}
