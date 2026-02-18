package LINKEDLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String nombre;
    private String artista;
    private ArrayList<CancionNasheed> CancionesNasheed;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.CancionesNasheed = new ArrayList<>();
    }

    private CancionNasheed findSong(String titulo) {
        for (CancionNasheed  c : CancionesNasheed ) {
            if ( c.getTitulo().equals(titulo) ) {
                return c;
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        if (findSong(titulo) == null) {
            CancionesNasheed.add(new CancionNasheed(titulo, duracion));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int numeroPista, LinkedList<CancionNasheed> playList) {
        int index = numeroPista - 1;
        if (index >= 0 && index <= playList.size()) {
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titulo, LinkedList<CancionNasheed> playList) {
        if (findSong(titulo) != null) {
            return true;
        }
        return false;
    }

}
