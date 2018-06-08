package gr.parisk85.springbootjokeappdemo.controller;

import gr.parisk85.springbootjokeappdemo.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    @Autowired
    private JokeService jokeService;

    @GetMapping("/")
    public String joke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
