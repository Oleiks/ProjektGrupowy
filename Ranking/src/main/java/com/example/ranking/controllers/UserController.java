package com.example.ranking.controllers;

import com.example.ranking.dto.UserDTO;
import com.example.ranking.entities.User;
import com.example.ranking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/ranking/users")
    public ResponseEntity<List<UserDTO>> GetUsers(){
        List<User> users = userService.findAllUsers();
        List<UserDTO> usersDTO = users.stream().map(u -> UserDTO.builder()
                .firstName(u.getFirstName())
                .lastName(u.getLastName())
                .score(u.getScore())
                .build()).sorted(new Comparator<UserDTO>() {
            @Override
            public int compare(UserDTO o1, UserDTO o2) {
                if (o1.getScore()>o2.getScore()){
                    return -1;
                } else if (o1.getScore()<o2.getScore()) {
                    return 1;
                }
                int firstName = o1.getFirstName().toLowerCase().compareTo(o2.getFirstName().toLowerCase());
                if (firstName!=0) {
                    return firstName;
                }
                else{
                    return o1.getFirstName().toLowerCase().compareTo(o2.getFirstName().toLowerCase());
                }
            }
        }).toList();
        return ResponseEntity.ok(usersDTO);
    }
    @GetMapping("/ranking/user/{firstName}/{lastName}")
     public ResponseEntity<UserDTO> GetUser(@PathVariable ("firstName") String firstName, @PathVariable ("lastName") String lastName){
        Optional<User> user = userService.findUserByName(firstName, lastName);
        if (user.isPresent()){
            UserDTO userDTO = UserDTO.builder()
                    .firstName(user.get().getFirstName())
                    .lastName(user.get().getLastName())
                    .score(user.get().getScore())
                    .build();
            return ResponseEntity.ok(userDTO);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/ranking/user")
    public ResponseEntity<String> CreateUser(@RequestBody UserDTO request){
        Optional<User> user = userService.findUserByName(request.getFirstName(), request.getLastName());
        if(user.isPresent()){
            if(user.get().getScore()<request.getScore()) {
                user.get().setFirstName(request.getFirstName());
                user.get().setLastName(request.getLastName());
                user.get().setScore(request.getScore());
                userService.saveUser(user.get());
                return ResponseEntity.ok("Updated existing user");
            }
            else{
                return ResponseEntity.ok("Current score is higher");
            }
        }
        else {
            User newUser = User.builder()
                    .id(UUID.randomUUID())
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .score(request.getScore())
                    .build();
            userService.saveUser(newUser);
            return ResponseEntity.status(HttpStatus.CREATED).body("Created new user");
        }
    }
    @DeleteMapping("/ranking/user/{firstName}/{lastName}")
    public ResponseEntity<String> DeleteUser(@PathVariable ("firstName") String firstName, @PathVariable ("lastName") String lastName){
        Optional<User> user = userService.findUserByName(firstName, lastName);
        if(user.isPresent()){
            userService.deleteUser(user.get());
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
