package ru.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.service.UserService;

@Controller
@RequestMapping("/users")
public class UserViewController {
    private final UserService service;

    public UserViewController(UserService service) {
        this.service = service;
    }

    @GetMapping
    String findAll(Model model){
        model.addAttribute("users", service.findAll());
        return "users";
    }
}
