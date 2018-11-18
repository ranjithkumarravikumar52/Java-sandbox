package collections.adventuregame;

import java.util.HashMap;
import java.util.Map;

/**
 * Colossal cave adventure game is a text-based adventure game based from the 70s. <br>
 * One of the earliest form of video games <br>
 * To understand the feel of the game, watch the video from the link (https://www.youtube.com/watch?v=O3etkSoHrR8)<br>
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
    }

    //GETTERS AND SETTERS
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    /**
     * The reason we are returning a new copy of the exits is not to modify the original copy of exits map.
     * @return duplicate copy of exit map
     */
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }

    /**
     * This method will add an exit location for our game. <br>
     */
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
