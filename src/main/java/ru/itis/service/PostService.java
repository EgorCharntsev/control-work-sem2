package ru.itis.service;

import ru.itis.dto.PostDto;
import ru.itis.model.Post;

import java.util.List;
public interface PostService {
    Post getById(Long id);
    List<PostDto> findAll();
    boolean deleteById(Long id);
    Long create(Post post);
    Post update(PostDto post, Long id);
}
