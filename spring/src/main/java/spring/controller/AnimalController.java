package spring.controller;

import spring.beaninitialization.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@AllArgsConstructor
public class AnimalController {

    private final Animal animal;

    @GetMapping("/animal")
    public String getAnimal(Model model) {
        String name = animal.getName();
        model.addAttribute("name", name);
        return "animal";
    }

    @GetMapping("/cookie")
    public String getCookie(HttpServletResponse response) {
        response.addCookie(new Cookie("dogcookie", "dog"));
        return "cookie";
    }

    @GetMapping("/")
    public String index(HttpServletResponse response) {
        return "index";
    }
}
