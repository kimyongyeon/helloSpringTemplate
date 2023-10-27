package com.hello.dev.hellospring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoDTO {
    private String title;
    private String regDate;
    private boolean comYn;
}