package com.example.test;

import com.example.test.model.Artist;
import com.example.test.model.Datasource;
import com.example.test.model.Song;
import com.example.test.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Datasource datasource = new Datasource();
        if (!datasource.open())
        {
            System.out.println("Can't open dataSource");
            return;
        }
        List<Artist> artists = datasource.queryArtist(Datasource.ORDER_BY_ASC);
        if (artists == null)
        {
            System.out.println("No artists!");
            return;
        }
        for (Artist artist : artists)
        {
            System.out.println("ID = "+artist.getId()+", Name = "+artist.getName());
        }
        List<String> albumsForArtist= datasource.queryAlbumsForArtist("Pink Floyd",Datasource.ORDER_BY_DESC);
        for (String album : albumsForArtist)
        {
            System.out.println(album);
        }
        List<SongArtist> songArtists = datasource.queryArtistForSong("She's On Fire" , Datasource.ORDER_BY_DESC);
        if (songArtists == null)
        {
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for (SongArtist artist :  songArtists)
        {
            System.out.println("Artist name = "+artist.getArtistName() +" Album name = "+artist.getAlbumName() +" Track = "+artist.getTrack());
        }
        datasource.querySongMetaData();
        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is :"+count);
        datasource.createViewForSongArtists();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title");
        String title = scanner.nextLine();
        songArtists = datasource.querySongInfoView(title);
        if (songArtists == null)
        {
            System.out.println("Couldn't find the artist for the song");
        }
        for (SongArtist artist : songArtists)
        {
            System.out.println("FROM VIEW - ARTIST name = "+artist.getArtistName()+" Album name = "+artist.getAlbumName()+" Track number = "+artist.getTrack());
        }
        datasource.insertSong("Touch of Grey","Grateful Dead","In The Dark",1);
        datasource.close();
    }
}
