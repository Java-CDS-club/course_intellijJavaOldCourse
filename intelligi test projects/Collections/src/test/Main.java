package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }
    public void command() {
        Map<String , String> d =  new HashMap<>();
        d.put("QUIT" , "Q");
        d.put("SOUTH" , "S");
        d.put("NORTH", "N");
        d.put("EAST" , "E");
        d.put("WEST" , "W");
        int loc = 0;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println(locations.get(loc));
            System.out.println("Available exits are ");
            Map<String , Integer> exits = locations.get(loc).getExits();
            for (String i : exits.keySet())
            {
                System.out.print(i+", ");
            }
            String s = scanner.nextLine().toUpperCase();
            String []s2 = s.split(" ");
            for (String s0 : s2)
            {
                if (d.containsKey(s0))
                {
                    s= s0;
                    break;
                }
            }
            if (exits.containsKey(s))
            {
                loc = exits.get(s);
            }
            else
            {
                System.out.println("you cannot go in that direction");
            }

        }
    }
}