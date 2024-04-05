package ru.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.service.PostService;

@Controller
@RequestMapping("/posts")
public class PostViewController {
    private final PostService service;

    public PostViewController(PostService service) {
        this.service = service;
    }

    @GetMapping
    String findAll(Model model){
        model.addAttribute("posts", service.findAll());
        return "posts";
    }
}
