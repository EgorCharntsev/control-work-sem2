package ru.itis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.UserDto;
import ru.itis.model.User;
import ru.itis.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    List<UserDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    User getById(@PathVariable("id") Long id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    boolean delete(@PathVariable("id") Long id){
        return service.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Long create(@RequestBody User user){
        return  service.create(user);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    User update(@RequestBody UserDto user, Long id){
        return service.update(user, id);
    }
}
