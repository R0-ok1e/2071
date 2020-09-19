package com.company;

interface USB{
    public abstract void Open();

    public abstract void Off();

}

class Mouse implements USB{
    @Override
    public void Open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Off() {
        System.out.println("关闭鼠标");
    }

    public void Click(){
        System.out.println("点击鼠标");
    }
}

class KeyBoard implements USB{

    @Override
    public void Open() {
        System.out.println("打开键盘");
    }

    @Override
    public void Off() {
        System.out.println("关闭键盘");
    }

    public void Print(){
        System.out.println("打字");
    }
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

    public void usbFunction(USB usb){
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;// 向下转型
            mouse.Click();
        }
        else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.Print();
        }
    }
}

class Test{
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.PowerOn();
        Mouse mouse = new Mouse();
        USB usb = mouse; // 向上转型
        computer.usbFunction(usb);

        computer.UserDevice(usb);
        USB usb2 = new KeyBoard();

        computer.UserDevice(usb2);
        computer.usbFunction(usb2);

        computer.PowerOff();


    }
}