package pl.patrykpora.qgame.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHallo(Model model) {
        model.addAttribute("message", "some message");
        return "hello";
    }


}
