package net.asasha.dominoes.model.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Bone {
    private Set<Integer> spots = new HashSet();

    public Bone(Integer... args) {
        if (args == null || args.length==0)
            return;

        spots.addAll(Arrays.asList(args));
    }

    public Set<Integer> getSpots() {
        return spots;
    }

    public boolean isContains(int number){
        return spots.contains(number);
    }

}
