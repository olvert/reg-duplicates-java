package utils.collision;

import java.util.ArrayList;

/**
 * Created by ollesvensson on 09/10/16.
 */
public class CollisionResult {

    public final int numOfCollisions;
    public final int maxIterations;
    public final int totalIterations;

    public CollisionResult(int numOfCollisions, int maxIterations, int totalIterations) {
        this.numOfCollisions = numOfCollisions;
        this.maxIterations = maxIterations;
        this.totalIterations = totalIterations;
    }

}
