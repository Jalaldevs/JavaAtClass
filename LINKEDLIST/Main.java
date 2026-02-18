package LINKEDLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    static void main() {

        // Variable Direccion De Reproduccion
        ArrayList<Album> listaAlbums = new ArrayList<>();
        LinkedList<CancionNasheed> playList = new LinkedList<>();

        Services s = new Services();
        Album a = new Album("Noor al-Qalb", "Ihsan Al-Hadi");
        Album c = new Album("Dhikr al-Layl", "Aminah Saadi");

        playList.add(new CancionNasheed("Noor al-Qalb", 3.45));
        playList.add(new CancionNasheed("Saut al-Iman", 4.10));
        playList.add(new CancionNasheed("Dhikr al-Layl", 5.05));
        playList.add(new CancionNasheed("Qalb al-Salaam", 3.50));
        playList.add(new CancionNasheed("Tajalli Noor", 4.25));

        Services.play(playList);

    }

}
