package com.example.welcomecontroller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C {
    @GetMapping("/name")
    public String getName() {
        return "My name is Ahmed";
    }

    @GetMapping("/age")
    public String getAge()
    {
        return "My age is 23";
    }

    @GetMapping("/check/status")
    public String getStatus()
    {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String getHealth()
    {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] getNames()
    {
        return new String[]{"Ahmed", "Ali", "Omar"};
    }
}
