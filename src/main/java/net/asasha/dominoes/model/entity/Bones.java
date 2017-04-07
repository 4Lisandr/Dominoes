package net.asasha.dominoes.model.entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Bones {
    private static Set<Bone> market = new HashSet<>();
    public static final int MAX_SPOTS = 6;

    public static Set<Bone> market(){
        for (int i = MAX_SPOTS; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                market.add(new Bone(i,j));
            }
        }
        return market;
    }

}
