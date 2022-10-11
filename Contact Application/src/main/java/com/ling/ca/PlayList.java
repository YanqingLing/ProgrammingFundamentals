package com.ling.ca;

import java.util.ArrayList;

public class PlayList {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Song1");
        desertIslandPlaylist.add("Song2");
        desertIslandPlaylist.add("Song3");
        desertIslandPlaylist.add("Song4");
        desertIslandPlaylist.add("Song5");
        desertIslandPlaylist.add("Song6");
        desertIslandPlaylist.add("Song7");
        desertIslandPlaylist.remove("Song6");
        desertIslandPlaylist.remove("Song7");
        System.out.println(desertIslandPlaylist.size());
        String a = desertIslandPlaylist.get(0);
        String b = desertIslandPlaylist.get(1);
        desertIslandPlaylist.set(0, b);
        desertIslandPlaylist.set(1, a);
        System.out.println(desertIslandPlaylist);





    }
}
