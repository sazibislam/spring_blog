package blog.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {

    @GetMapping(value="/")
    public String index(){
        return "index called";
    }
}
