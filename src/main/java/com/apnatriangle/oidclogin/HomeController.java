package com.apnatriangle.oidclogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World!!";
    }


    @GetMapping("/secured")
    public String secured()
    {
        return "Hello Secured!!";
    }
}
