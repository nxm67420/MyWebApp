package com.mycompany.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //Variables
    @Autowired private UserRepository repo;

    //Methods
    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    /*public void delete(User user) {
        repo.delete(user);
    }*/
}
