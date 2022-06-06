package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
    }
    public Song get(int index)
    {
        return songs.findSong(index);
    }
    public boolean addToPlayList(int number , LinkedList<Song> list)
    {
        if (number >= 0 && number <= songs.songs.size())
        {
            list.add(songs.songs.get(number));
            return true;
        }
        return false;
    }
    public boolean addSong(String title , double duration)
    {
        if (songs.findSong(title)== null)
        {
            songs.add(new Song(title , duration));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String name , LinkedList<Song> list)
    {
        if (songs.findSong(name) != null)
        {
            list.add(songs.findSong(name));
            return true;
        }
        return false;
    }
    private class SongList
    {
        private ArrayList<Song> songs;

        public SongList()
        {
            this.songs = new ArrayList<Song>();
        }
        private boolean add(Song song)
        {
            if (this.songs.contains(song))
            {
                return false;
            }
            this.songs.add(song);
            return true;
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
        private Song findSong(int trackNumber)
        {
            int index = trackNumber-1;
            if (index >= 0 && index <songs.size())
            {
                return songs.get(index);
            }
            return null;
        }
    }
}
