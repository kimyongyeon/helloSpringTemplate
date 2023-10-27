package com.hello.dev.hellospring.repository;

import java.util.List;

public interface CommonRepository<T> {

    void add(T t);
    void update(T t);
    void delete(T t);
    List<T> list(T t);

}
