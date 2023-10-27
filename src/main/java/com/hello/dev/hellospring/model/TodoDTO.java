package com.hello.dev.hellospring.model;

import lombok.Builder;

public class TodoDTO {
    private String title;
    private String regDate;
    private boolean comYn;

    private TodoDTO(Builder builder) {
        this.title = builder.title;
        this.regDate = builder.regDate;
        this.comYn = builder.comYn;
    }

    public String getTitle() {
        return title;
    }

    public String getRegDate() {
        return regDate;
    }

    public boolean isComYn() {
        return comYn;
    }

    public static class Builder {
        private String title;
        private String regDate;
        private boolean comYn;

        public Builder() {
        }



        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder regDate(String regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder comYn(boolean comYn) {
            this.comYn = comYn;
            return this;
        }

        public TodoDTO build() {
            return new TodoDTO(this);
        }
    }
}