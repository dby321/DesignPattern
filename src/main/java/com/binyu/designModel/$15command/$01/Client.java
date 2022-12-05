package com.binyu.designModel.$15command.$01;

public class Client {
    public static void main(String[] args) {
        RemoteController remoteController=new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.undoButtonWasPushed();
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
        remoteController.undoButtonWasPushed();
        remoteController.undoButtonWasPushed();
    }
}
