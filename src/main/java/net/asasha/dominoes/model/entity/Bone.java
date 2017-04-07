package net.asasha.dominoes.model.entity;

/**
 *
 */
public class Bone {
    private final int [] spots = new int[2];

    public Bone(int... args) {
        if (args == null || args.length==0)
            return;

        spots[0] = spots[1] = args[0];
        spots[1] = args.length>1 ? args[1]: args[0];
    }

    public int[] getSpots() {
        return spots;
    }

    public boolean isContains(int number){
        return spots[0]== number || spots[1] == number;
    }

}
