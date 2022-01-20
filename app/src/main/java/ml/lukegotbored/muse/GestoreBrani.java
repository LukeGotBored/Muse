package ml.lukegotbored.muse;

import android.widget.Spinner;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Song> songList;
    public GestoreBrani() {
        songList = new ArrayList<Song>();
    }


    public void addBrano(String titolo){

        Song nb = new Song(titolo);
        songList.add(nb);
    }
}
