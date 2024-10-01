package ie.atu.week2springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")

public class RequestController {
    @GetMapping("/hello")
    public String getHello() {return "hello";}

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name) {
        return "greeting " + name;}




}
