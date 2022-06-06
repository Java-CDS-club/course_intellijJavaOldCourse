import java.util.*;

public class Main
{
    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args)
    {
        Album album = new Album("Storm bringer","Deep purple");
        album.addSong("Storm bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("holy man", 4.3);
        album.addSong("hold on", 5.6);
        album.addSong("lady double dealer", 3.21);
        album.addSong("you can't do it right", 6.23);
        album.addSong("high ball shooter", 4.27);
        album.addSong("the gypsy", 4.2);
        album.addSong("soldier of fortune", 3.13);
        albums.add(album);
        album = new Album("For those about to rock ", "Ac/Dc");
        album.addSong("for those about t rock" , 5.44);
        album.addSong("i put the finger on you" , 3.25);
        album.addSong("lets go" , 3.45);
        album.addSong("Inject the venom" , 3.33);
        album.addSong("snowballed" , 4.51);
        album.addSong("Evil walks" , 3.45);
        album.addSong("C.D.D" , 5.25);
        album.addSong("Breaking the rules" , 5.32);
        album.addSong("Night of the long knives" , 5.12);
        albums.add(album);
        List<Song>playList = new ArrayList<>();
        albums.get(0).addToPlayList("you can't do it right" , playList);
        albums.get(0).addToPlayList("holy man" , playList);
        albums.get(0).addToPlayList("speed king" , playList);
        albums.get(0).addToPlayList(9 , playList);
        albums.get(0).addToPlayList(8 , playList);
        albums.get(0).addToPlayList(3 , playList);
        albums.get(0).addToPlayList(2 , playList);
        albums.get(0).addToPlayList(24 , playList);

        play(playList);


    }
    private static void play(List<Song>playList)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0)
        {
            System.out.println("No Songs in playList");
        }
        else
        {
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }
        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action)
            {
                case 0 :
                    System.out.println("Play list complete.");
                    quit =true;
                    break;
                case 1 :
                    if (!forward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now Playing "+listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("We have reached the end of the playList");
                        forward =false;
                    }
                    break;
                case 2 :
                    if (forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward =false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now Playing "+listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("We are at the start of the playList");
                        forward =true;
                    }
                    break;
                case 3 :
                    if (forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward = false;
                        }
                        else
                        {
                            System.out.println("we are at the start of the list");
                        }
                    }
                    else
                    {
                        if (listIterator.hasNext())
                        {
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward =true;
                        }
                        else
                        {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4 :
                   printList(playList);
                    break;
                case 5 :
                    printMenu();
                    break;
                case 6 :
                    if (playList.size() > 0)
                    {
                        listIterator.remove();
                        if (listIterator.hasNext())
                        {
                            System.out.println("Now playing "+listIterator.next());
                        }else if (listIterator.hasNext())
                        {
                            System.out.println("now playing "+listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu()
    {
        System.out.println("Available actions ; \n press");
        System.out.println("0 - quit \n" +
                "1 - to play next song \n" +
                "2 - to play previous song\n " +
                "3 - to replay the current song\n" +
                "4 - list songs in the playList\n" +
                "5 - print available actions \n" +
                "6 - delete current song from playlisy");
    }
    private static void printList(List<Song> playList)
    {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
        System.out.println("============================");
    }


}
