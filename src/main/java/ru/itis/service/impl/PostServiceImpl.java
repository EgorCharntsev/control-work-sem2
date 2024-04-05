package ru.itis.service.impl;

import org.springframework.stereotype.Service;
import ru.itis.dto.PostDto;
import ru.itis.model.Post;
import ru.itis.repositories.PostJpaRepository;
import ru.itis.service.PostService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private final PostJpaRepository repository;

    public PostServiceImpl(PostJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Post getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }

    @Override
    public List<PostDto> findAll() {
        return repository.findAll()
                .stream()
                .map(x -> PostDto.builder()
                        .title(x.getTitle())
                        .description(x.getDescription())
                        .text(x.getText())
                        .price(x.getPrice())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return false;
    }

    @Override
    public Long create(Post post) {
       repository.save(post);
       return post.getId();
    }

    @Override
    public Post update(PostDto post, Long id) {
        return null;
    }
}
