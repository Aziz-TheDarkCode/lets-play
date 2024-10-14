package zone01dakar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Add this line
public class Product {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
