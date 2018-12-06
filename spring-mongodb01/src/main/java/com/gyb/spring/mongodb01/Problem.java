package com.gyb.spring.mongodb01;

import java.util.List;

public class Problem {
    private String id;
    private String title;
    private List<String> options;


    public Problem(String id, String title, List<String> options) {
        this.id = id;
        this.title = title;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", options=" + options +
                '}';
    }
}
