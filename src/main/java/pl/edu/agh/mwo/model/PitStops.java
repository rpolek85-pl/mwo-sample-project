package pl.edu.agh.mwo.model;

import java.util.ArrayList;
import java.util.List;

public class PitStops {
    private List<PitStop> pitStops;

    public List<PitStop> getPitStops() {
        return pitStops;
    }

    public void setPitStops(List<PitStop> pitStops) {
        this.pitStops = pitStops;
    }

    public PitStops() {
        pitStops = new ArrayList<PitStop>();
    }

    public void addPitStop(PitStop pitStop) {
        pitStops.add(pitStop);
    }
}
