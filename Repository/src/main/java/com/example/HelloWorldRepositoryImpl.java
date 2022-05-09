package com.example;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HelloWorldRepositoryImpl implements HelloWorldRepository {
    private static final Map<UUID, HelloWorld> database = new HashMap<>();

    @Override
    public Optional<HelloWorld> find(UUID identifier) {
        return Optional.ofNullable(database.get(identifier));
    }

    @Override
    public List<HelloWorld> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public HelloWorld save(HelloWorld helloWorldEntry) {
        return database.put(helloWorldEntry.identifier(), helloWorldEntry);
    }
}
