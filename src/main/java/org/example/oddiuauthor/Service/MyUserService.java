package org.example.oddiuauthor.Service;

import org.example.oddiuauthor.entity.User;


public interface MyUserService {
    User create(User user);
    User getUser(Integer id);
    void DeleteUser(Integer id);
}
