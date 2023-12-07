package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private final EntityManager entityManager;

    public UserDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void add (User user) {
        entityManager.persist(user);
    }

    public void update (User user, long id) {
        user.setId(id);
        entityManager.merge(user);
    }

    public void delete (long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    public User getById (long id) {
        return entityManager.find(User.class, id);
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }
}