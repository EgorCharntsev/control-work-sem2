package ru.itis.service;

import ru.itis.dto.UserDto;
import ru.itis.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    List<UserDto> findAll();
    boolean deleteById(Long id);
    Long create(User user);
    User update(UserDto user, Long id);
}
