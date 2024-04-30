package com.example.ranking.services;

import com.example.ranking.entities.User;
import com.example.ranking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> find(UUID id){
        return userRepository.findById(id);
    }
    public void saveUser (User user){
        userRepository.save(user);
    }
    public Optional<User> findUserByName(String firstName, String lastName){
        return userRepository.findByName(firstName, lastName);
    }
    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
