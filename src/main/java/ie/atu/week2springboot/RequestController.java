package ie.atu.week2springboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")

public class RequestController {
    @GetMapping("/hello")
    public String getHello() {return "hello";}

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name) {
        return "greeting " + name;}

    @GetMapping("/details")
    public String getDetails(@RequestParam String name, @RequestParam int age){
        return "name " + name + " age " + age;
    }


}
