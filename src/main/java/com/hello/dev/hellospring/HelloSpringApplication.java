package com.hello.dev.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HelloSpringApplication {

    @Service
    public static class HelloService {
        List<Person> list = new ArrayList<>();

        public void add(Person person) {
            list.add(person);
        }
        public List<Person> list() {
            return list;
        }
        public void remove(Person person) {
            list.remove(person);
        }
        public void update(Person person) {
            list.remove(person);
            list.add(person);
        }
    }

    @RestController
    public static class HelloController {

        @Autowired
        HelloService helloService;

        @GetMapping("/hello")
        public List<Person> hello() {
//            helloService.add(new Person("John1", 20));
//            helloService.add(new Person("John2", 21));
//            helloService.add(new Person("John3", 22));

            return helloService.list();

        }

        @GetMapping("/hello1/{name}")
        public String hello1(@PathVariable String name) {
            return String.format("Hello, %s!", name);
        }

        @GetMapping("/hello2/{name}")
        public String hello2(@PathVariable String name, @RequestParam int age) {
            return String.format("Hello, %s! You are %d years old.", name, age);
        }

        @PostMapping("/hello3")
        public String hello3(@RequestBody Person person) {
            return String.format("Hello, %s! You are %d years old.", person.getName(), person.getAge());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
