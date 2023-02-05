package ru.netology.authorizationserviceboot.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationserviceboot.enums.Authorities;
import ru.netology.authorizationserviceboot.model.User;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final Map <User, List<Authorities>> userListMap = new ConcurrentHashMap<>();

    public UserRepository() {};

    public void save(String username, String password, List<Authorities> authorities){
        userListMap.put(new User(username,password), authorities );
    }

    public List<Authorities> getUserAuthorities(String username, String password) {
        return userListMap.get(new User(username, password));
    }
}
