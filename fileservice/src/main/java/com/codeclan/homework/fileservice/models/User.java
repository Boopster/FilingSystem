package com.codeclan.homework.fileservice.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<File> files;

    public User(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
