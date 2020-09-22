package com.company;

import java.util.Iterator;
import java.util.List;

public class PlayList {
    private String playListName;
    private List<Song> musicList;

    public PlayList(String playListName) {
        this.playListName = playListName;
    }

    public void AddToPlayList(Song song){
        musicList.add(song);
    }

    public void DisplayAllSong(){
        for (Iterator it = musicList.listIterator(); it.hasNext();){
            System.out.println(it.next().toString());
        }
    }

    public Song searchSongById(String id){
        Song temp;
        for (Song search:musicList){
            if (search.getId().equals(id)){
                temp = search;
                return temp;
            }
        }
        System.out.println("未找到歌曲");
        return null;
    }

    public Song searchSongByName(String name){
        Song temp;
        for (Song search:musicList){
            if (search.getName().equals(name)){
                temp = search;
                return temp;
            }
        }
        System.out.println("未找到歌曲");
        return null;
    }

    public void UpdateSong(String id,Song song){
        Song old = searchSongById(id);
        for (int i=0;i<musicList.size();i++){
            if (old.equals(musicList.get(i))){
                musicList.set(i,song);
            }
        }
    }


    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }
}
