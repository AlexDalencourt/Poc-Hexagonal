package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public List<HelloWorld> getAll(){
        return helloWorldService.findAll();
    }

    @GetMapping("/get")
    public HelloWorld getOrDefault(@RequestParam(value = "id", required = false) UUID id){
        return helloWorldService.getOrDefault(id);
    }

    @PostMapping
    public HelloWorld create(@RequestBody String message){
        return helloWorldService.create(message);
    }
}
