package ru.netology.authorizationserviceboot.service;

import ru.netology.authorizationserviceboot.enums.Authorities;
import ru.netology.authorizationserviceboot.exception.InvalidCredentials;
import ru.netology.authorizationserviceboot.exception.UnauthorizedUser;
import ru.netology.authorizationserviceboot.repository.UserRepository;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}