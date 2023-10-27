package com.hello.dev.hellospring.service;

import com.hello.dev.hellospring.model.TodoDTO;
import com.hello.dev.hellospring.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    @Qualifier("dbRepository")
    private CommonRepository<TodoDTO> memRepository;

    public void todoAdd(TodoDTO todoDTO) {
        memRepository.add(todoDTO);
    }

    public List<TodoDTO> list (TodoDTO todoDTO) {
        return memRepository.list(todoDTO);
    }

    public void todoUpdate(TodoDTO todoDTO) {
    }

    public void todoDelete(TodoDTO todoDTO) {
    }
}
