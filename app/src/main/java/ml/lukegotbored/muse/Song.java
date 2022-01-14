package ml.lukegotbored.muse;

import java.util.Date;

public class Song {
    private String titolo;
    private String genere;
    private String autore;
    private Date datapublicazione;

    public Song(String titolo){
        this.titolo = titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public String getTitolo(){
        return this.titolo;
    }

}
