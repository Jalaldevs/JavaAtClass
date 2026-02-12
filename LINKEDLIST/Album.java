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
    }

    public CancionNasheed findSong(String titulo) {
        for (CancionNasheed  c : CancionesNasheed ) {
            if ( c.getTitulo().equals(titulo) ) {
                return c;
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        for ( CancionNasheed c : CancionesNasheed ) {
            if (c.getTitulo().equals(titulo)) {
                return false;
            }
        }
        return true;
    }

    public boolean addToPlayList(int numeroPista, LinkedList<CancionNasheed> playList) {

    }

    public boolean addToPlayList(String titulo, LinkedList<CancionNasheed> playList) {

    }




}
