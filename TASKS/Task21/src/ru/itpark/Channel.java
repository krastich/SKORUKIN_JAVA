package ru.itpark;

public class Channel {
    private String name;
    int button;
    private Program program;

    Channel (String name, int button){
        this.name = name;
        this.button = button;
        this.program = new Program();
    }


    }

