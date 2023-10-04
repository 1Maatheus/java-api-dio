package me.dio.projetosantander.service;

import me.dio.projetosantander.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
