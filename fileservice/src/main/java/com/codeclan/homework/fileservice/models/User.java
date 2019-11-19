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
}
