package ru.itis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.PostDto;
import ru.itis.model.Post;
import ru.itis.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    List<PostDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Post getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    boolean delete(@PathVariable("id") Long id) {
        return service.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Long create(@RequestBody Post post) {
        return service.create(post);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Post update(@RequestBody PostDto post, Long id) {
        return service.update(post, id);

    }
}
