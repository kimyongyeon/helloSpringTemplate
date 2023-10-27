package com.hello.dev.hellospring.controller;

import com.hello.dev.hellospring.model.TodoDTO;
import com.hello.dev.hellospring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo")
    public String todoAdd(@RequestBody TodoDTO todoDTO) {
        todoService.todoAdd(todoDTO);
        return "redirect:/todos";
    }

    @PutMapping("/todo")
    public String todoUpdate(@RequestBody TodoDTO todoDTO) {
        todoService.todoUpdate(todoDTO);
        return "redirect:/todos";
    }

    @DeleteMapping("/todo")
    public String todoDelete(@RequestBody TodoDTO todoDTO) {
        todoService.todoDelete(todoDTO);
        return "redirect:/todos";
    }

    @GetMapping("/todos")
    public List<TodoDTO> list() {
        new TodoDTO.Builder().title("23423423").comYn(true).build();
        return todoService.list(new TodoDTO.Builder()
                .title("23423423")
                .comYn(true).build());
    }
}
