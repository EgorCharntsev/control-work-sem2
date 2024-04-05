package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.model.Post;

@Repository
public interface PostJpaRepository extends JpaRepository<Post, Long> {
}
