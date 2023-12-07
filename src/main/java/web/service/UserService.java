package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;


public interface UserService {
    void add (User user);
    void update (User user, long id);
    void delete (long id);
    User getById (long id);
    List<User> getAllUsers();
}
