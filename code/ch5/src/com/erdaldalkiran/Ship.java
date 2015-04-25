package com.erdaldalkiran;

import java.util.List;

public class Ship {
    private final List<Integer> locations;
    private int numberOfHits = 0;

    public Ship(List<Integer> locations) {

        this.locations = locations;
    }

    public ShotResult checkShot(int shot) {
        if(isShipHit(shot)){
            incrementNumberOfHits();

            if(isShipKilled()){
                return ShotResult.KILL;
            }

            return ShotResult.HIT;
        }

        return ShotResult.MISS;
    }

    private int incrementNumberOfHits() {
        return numberOfHits++;
    }

    private boolean isShipHit(int shot) {
        return locations.contains(shot);
    }

    private boolean isShipKilled() {
        return numberOfHits == locations.size();
    }
}
