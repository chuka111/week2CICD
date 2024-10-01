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

    @GetMapping("/calculator")
    public String getCalculation(@RequestParam String operation, @RequestParam float num1, @RequestParam float num2){
        switch(operation) {
            case "add":
                return "Operation "+ operation + " Answer " + (num1+num2);
            case "subtract":
                return "Operation "+ operation + " Answer " + (num1-num2);
            case "multiply":
                return "Operation "+ operation + " Answer " + (num1*num2);
            case "divide":
                if(num2 == 0){
                    throw new IllegalArgumentException("cannot divide by zero");
                }
                else{
                    return "Operation "+ operation + " Answer " + (num1/num2);
                }

            default:
                throw new IllegalArgumentException("invalid");
        }
    }
}
