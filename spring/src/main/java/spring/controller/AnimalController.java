package spring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.exception.MyException;
import spring.exception.MySecondException;
import spring.model.Animal;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@AllArgsConstructor
@Slf4j
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

    @GetMapping("/err")
    public String err(@RequestParam String error) throws MyException, MySecondException {
        if(error.equals("1")){
            throw new MyException("Ошибка");
        }else if(error.equals("2")){
            throw new MySecondException("Ошибка номер 2");
        }
        return "cookie";
    }

    @ExceptionHandler(MyException.class)
    public String error() throws MyException {
        return "index";
    }
}
