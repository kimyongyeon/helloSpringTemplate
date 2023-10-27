package com.hello.dev.hellospring.repository;

import com.hello.dev.hellospring.model.TodoDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemRepository implements CommonRepository<TodoDTO> {
    List<TodoDTO> list = new ArrayList();

    @Override
    public void add(TodoDTO todoDTO) {
        list.add(todoDTO);
    }

    @Override
    public void update(TodoDTO todoDTO) {
        list.stream().filter(p -> p.equals(todoDTO)).map(p -> p.equals(todoDTO));
    }

    @Override
    public void delete(TodoDTO todoDTO) {
        list.remove(todoDTO);
    }

    @Override
    public List list(TodoDTO todoDTO) {
        return list;
    }
}
