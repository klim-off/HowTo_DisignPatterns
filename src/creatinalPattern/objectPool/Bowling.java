package creatinalPattern.objectPool;

import java.util.*;

public class Bowling {

    private final   Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();

    public Bowling(int tracksNumber) {

        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        Random r = new Random();
        int low = 38;
        int high = 45;
       for (int i = 1; i <=50 ; i++) {
           int size = r.nextInt(high-low) + low;
            shoesShelf.add(new PairOfShoes( size));
        }
        System.out.println(shoesShelf.size());

    }

    public synchronized Track acquireTrack() {
        if (tracks.isEmpty()) { return null;}

        tracks.peek().setPrice(100 - ((tracks.size()-1) * 10));
        return tracks.poll();
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.add(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size()<number){return null;}

        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        for (PairOfShoes shoe : shoes) {
            shoesShelf.add(shoe);

        }
    }
}
