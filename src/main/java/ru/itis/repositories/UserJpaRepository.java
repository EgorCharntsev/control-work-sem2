package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
