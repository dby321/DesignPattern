package com.binyu.designModel.$15command.$01;

import java.util.Stack;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands;

    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
        }
        for(int i=0;i<5;i++){
            offCommands[i]=new NoCommand();
        }
        undoCommands=new Stack<>();
    }
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommands.push(onCommands[no]);
    }
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommands.push(offCommands[no]);
    }
    public void undoButtonWasPushed(){
        if(undoCommands.size()>0){
            undoCommands.pop().undo();
        }else{
            System.out.println("can't undo");
        }

    }
}
