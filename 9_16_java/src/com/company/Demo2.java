package com.company;

import java.text.ParseException;

interface Demo{
    void login()throws NullPointerException;
    void register()throws IllegalArgumentException;
    void update()throws IndexOutOfBoundsException;
    void delete()throws ParseException;
}

public class Demo2 implements Demo{
    @Override
    public void login() throws NullPointerException {

    }

    @Override
    public void register() throws IllegalArgumentException {

    }

    @Override
    public void update() throws IndexOutOfBoundsException {

    }

    @Override
    public void delete() throws ParseException {

    }
}

