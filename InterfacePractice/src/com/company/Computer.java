package com.company;

interface USB{
    public abstract void Open();

    public abstract void Off();
}

public class Computer {
    public void PowerOn(){
        System.out.println("电脑开机");
    }
    public void PowerOff(){
        System.out.println("电脑关机");
    }

    public void UserDevice(USB usb){
        usb.Open();

        usb.Off();
    }
}
