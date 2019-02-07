package ru.itpark;

import java.util.Random;

public class Channel {
    private String channelName;
    private Program[] programs;
    private final int MAX_PROGRAMS = 10;
    private int button;
    private int position;
    private Random random = new Random();
//    private final int MIN_PROGRAMS = 5;
    private int currentprogram = 0;
//    private final String genrevariations[];

    public Channel (){
        this.programs = new Program[MAX_PROGRAMS];
        this.button = button;
        this.channelName = channelName;
    }

    public String getName(){
        return channelName;
    }
    public int getButtonNumber(){
        return button;
    }
    public void addProgram(Program program){
        this.programs[position] = program;
        position++;
    }
    public void showProgram(){
        for (int i = 0; i < this.programs.length ; i++) {
            System.out.println(programs[i].getName());
        }
    }
    public String randomProgram(){
        return programs[random.nextInt(MAX_PROGRAMS)].getName();
    }

//    String programmeNames [] = {"Новости",
//            "Спорт","Кино","Мультфильм",
//            "Аналитика","Сериал","Развлекательная программа", "Познавательная программа"};
//    Random random = new Random();
//    Program programs [] = new Program[24];

 //       for (int i = 0; i < programs.length; i++) {
 //       String randomName = programmeNames[random.nextInt(8)];
 //       programs[i] = new Program(randomName, random.nextInt(24) + 1);
 //   }
 //       for (int i = 0; i < programs.length; i++) {
 //       System.out.println(programs[i].programmeName + " " + programs[i].button);
//    }

}



