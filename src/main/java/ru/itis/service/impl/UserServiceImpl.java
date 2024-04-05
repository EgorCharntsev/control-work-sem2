package ru.itis.service.impl;

import org.springframework.stereotype.Service;
import ru.itis.dto.UserDto;
import ru.itis.model.User;
import ru.itis.repositories.UserJpaRepository;
import ru.itis.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserJpaRepository repository;
    public UserServiceImpl(UserJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }

    @Override
    public List<UserDto> findAll() {
        return repository.findAll()
                .stream()
                .map(x -> UserDto.builder()
                        .name(x.getName())
                        .lastname(x.getLastname())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return false;
    }

    @Override
    public Long create(User user) {
        repository.save(user);
        return user.getId();
    }

    @Override
    public User update(UserDto user, Long id) {
        return null;
    }
}
