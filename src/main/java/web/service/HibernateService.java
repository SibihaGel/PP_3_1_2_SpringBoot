package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.DAO;
import web.models.User;

import java.util.List;

@Service
public class HibernateService implements web.service.Service {
    private final DAO dao;

    @Autowired
    public HibernateService(DAO dao) {
        this.dao = dao;
    }
    @Override
    public void saveUser(User user) {
    }
    @Override
    public List<User> AllUser() {
        return null;
    }
    @Override
    public void updateUser(int id, User updateUser) {
    }
    @Override
    public void delete(int id) {
    }
    @Override
    public User getUserById(int id) {
        return null;
    }
}

