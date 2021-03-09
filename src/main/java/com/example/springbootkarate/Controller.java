package com.example.springbootkarate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class Controller {
    @GetMapping
    public String getHello(){
        return "hello world";
    }

    @GetMapping("by-name")
    public String getHelloByName(@RequestParam String name){
        return "hello " + name;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ApiTestDTO dto) throws URISyntaxException {
        return ResponseEntity.created(new URI("http://localhost:8080")).build();
    }
}
