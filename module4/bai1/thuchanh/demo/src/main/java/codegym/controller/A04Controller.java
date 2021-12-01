package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A04Controller {
@GetMapping("")
    public String showView(){
        return "index";
}
@GetMapping("/abc")
    public String showABC(){
        return "a04";
    }
}
