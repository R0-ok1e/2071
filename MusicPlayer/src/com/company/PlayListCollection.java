package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class PlayListCollection {
    private HashMap<Integer,PlayList> PlayListMap;
    private String name;

    public PlayListCollection(String name) {
        this.name = name;
    }

    public void AddList(PlayList list){
        PlayListMap.put(list.hashCode(),list);
    }

    public void DeleteList(PlayList list){
        if (PlayListMap.containsKey(list.hashCode()))
            PlayListMap.remove(list.hashCode());
        else
            System.out.println("未找到列表");
    }

    public String getName() {
        return name;
    }

    public PlayList SearchByName(String name){
        //
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlayListCollection{" +
                "PlayListMap=" + PlayListMap +
                ", name='" + name + '\'' +
                '}';
    }
}
