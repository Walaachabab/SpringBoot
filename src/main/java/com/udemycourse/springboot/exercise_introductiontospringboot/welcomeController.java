package com.udemycourse.springboot.exercise_introductiontospringboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    // 1
    @GetMapping("/name")
    public String getName() {
        return "My name is Walaa";
    }

    // 2.
    @GetMapping("/age")
    public String getAge() {
        return "My age is 25";
    }

    // 3.
    @GetMapping("/check/status")
    public String getStatus() {
        return "Everything OK";
    }

    // 4.
    @GetMapping("/health")
    public String getHealth() {
        return "Server health is up and running";
    }

    // 5.
    @GetMapping("/names")
    public String[] getNames() {
        String[] names = {"Walaa", "Ahmed", "Sarah", "Ali"};
        return names;
    }





}
