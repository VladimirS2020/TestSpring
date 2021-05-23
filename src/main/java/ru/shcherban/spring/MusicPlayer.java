package ru.shcherban.spring;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setMusic(Music music) {
        this.music = music;
    }

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }
    // пустой конструктор
    public MusicPlayer() {

    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}

