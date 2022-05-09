package com.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HelloWorldService {

    private final HelloWorldRepository repository;


    public HelloWorldService(HelloWorldRepository repository) {
        this.repository = repository;
    }

    public List<HelloWorld> findAll(){
        return repository.findAll();
    }

    public HelloWorld getOrDefault(UUID identifier){
        return repository.find(identifier).orElseGet(() -> new HelloWorld(null,"HelloWorld"));
    }

    public HelloWorld create(String message){
        return repository.save(new HelloWorld(null, message));
    }
}
