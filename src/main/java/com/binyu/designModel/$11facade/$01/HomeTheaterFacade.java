package com.binyu.designModel.$11facade.$01;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private PopcornMachine popcornMachine;
    private Projecter projecter;
    private Screen screen;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcornMachine = PopcornMachine.getInstance();
        this.projecter = Projecter.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready(){
        popcornMachine.on();
        popcornMachine.pop();
        screen.down();
        projecter.on();
        stereo.on();
        dvdPlayer.on();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        popcornMachine.off();
        screen.up();
        projecter.off();
        stereo.off();
        dvdPlayer.off();
    }

}
