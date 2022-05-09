package com.example;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HelloWorldRepository {

    Optional<HelloWorld> find(UUID identifier);

    List<HelloWorld> findAll();

    HelloWorld save(HelloWorld helloWorldEntry);
}
