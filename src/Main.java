import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main {

    ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

         LinkedList<Song> playList = new LinkedList<Song>();

        Album album1 = new Album();
        Album album2 = new Album();
        album1.addSong(new Song("ahang1",2.0));
        album2.addSong(new Song("ahang2",3.0));
        playList.add(album1.getSongs().get(0));
        playList.add(album2.getSongs().get(0));
        printOptions();

        playSong(playList);


    }

    private static void printOptions() {
        System.out.println("0 - quit \n" +
                "1 - skip forward to the next song \n"+
                "2 - skip backward to the previous song \n" +
                "3 - replay the current song \n" +
                "4 - list the songs");
    }

    private static void playSong(LinkedList<Song> playList) {

        ListIterator<Song> listIterator =playList.listIterator();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(! quit){
            int i = scanner.nextInt();
            switch (i) {
                case 0:
                    quit=true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println(listIterator.next().getTitle());
                            break;
                    }
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous().getTitle());
                        listIterator.remove();
                        break;
                    }
                case 3:
                    break;

                case 4:

                    printList(playList);
                    break;

            }



        }
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }


}
