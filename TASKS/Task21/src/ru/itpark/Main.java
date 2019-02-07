package ru.itpark;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String channelNames [] = {"h1",
                "h2","h3","h4",
                "h5","h6","h7", "h8"};
        Random random = new Random();
        Channel channels [] = new Channel[8];

        for (int i = 0; i < channels.length; i++) {
//            String randomName = channelNames[random.nextInt(8)];
            String randomName = channelNames[random.nextInt(8)];
            channels[i] = new Channel(randomName, random.nextInt(24) + 1);
        }
        for (int i = 0; i < channels.length; i++) {
            System.out.println(channels[i].channelName + " " + channels[i].button);
        }

    }
}