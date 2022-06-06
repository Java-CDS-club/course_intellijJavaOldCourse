package test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
        this.songs =  new ArrayList<Song>();
    }
    private Song findSong(String name)
    {
        for (int i = 0 ;i < songs.size() ; i++)
        {
            if (songs.get(i).getTitle().equals(name))
            {
                return songs.get(i);
            }
        }
        return null;
    }
    public boolean addSong(String title , double duration)
    {
        if (findSong(title)== null)
        {
            songs.add(new Song(title , duration));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(int number , LinkedList<Song> list)
    {
        if (number >= 0 && number <= songs.size())
        {
            list.add(songs.get(number));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String name , LinkedList<Song> list)
    {
        if (findSong(name) != null)
        {
            list.add(findSong(name));
            return true;
        }
        return false;
    }
}
