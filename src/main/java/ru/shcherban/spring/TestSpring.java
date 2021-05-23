package ru.shcherban.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println("Указывают ли муз.плейер1 и муз.плейер2 на один и тот же участок памяти? - " + comparison);

        System.out.println();

        System.out.println("ПЕРВЫЙ муз.плейер: " + firstMusicPlayer);
        System.out.println("ВТОРОЙ муз.плейер: " + secondMusicPlayer);

        System.out.println();

        firstMusicPlayer.setVolume(10); // у муз.плейера1 изменили звук
        System.out.println("Звук ПЕРВОГО муз.плейера: " + firstMusicPlayer.getVolume());
        System.out.println("Звук ВТОРОГО муз.плейера: " + secondMusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
