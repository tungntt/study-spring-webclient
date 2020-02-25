package vn.tungnt.study.spring.rb.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Runtime Bundle";
    }
}
