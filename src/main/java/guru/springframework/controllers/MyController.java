package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String Hello(){
        System.out.println("Hello!");

        return "foo";
    }
}
