package utils.collision;

import gnu.trove.impl.HashFunctions;
import gnu.trove.set.hash.TLongHashSet;

import java.util.DoubleSummaryStatistics;

/**
 * Created by ollesvensson on 09/10/16.
 */
public class ColTLongHashSet extends TLongHashSet{

    private int numOfCollisions;
    private int maxIterations;
    private int totalIterations;

    public ColTLongHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
        numOfCollisions = 0;
        maxIterations = 0;
        totalIterations = 0;
    }

    /*
     * Measures the number of iterations needed to find a FREE slot in states
     * after collision.
     */
    private void measureIterationLength(long val, int index, int hash, byte state) {

        /* Compute the double hash */
        final int length = _set.length;
        int probe = 1 + (hash % (length - 2));
        final int loopIndex = index;

        /* Count var */
        int localIterations = 0;

        do {

            localIterations++;

            index -= probe;
            if (index < 0) {
                index += length;
            }
            state = _states[index];

            /* A FREE slot or duplicate value stops the search
             * Not looking for REMOVED since solution only uses insert
             */
            if (state == FREE || (state == FULL && _set[index] == val)) {

                if (localIterations > maxIterations) { maxIterations = localIterations; }
                totalIterations += localIterations;

                return;
            }

        /* Detect loop */
        } while (index != loopIndex);

        /* If there are no FREE slots */
        throw new IllegalStateException("Could not find any FREE slots.");
    }

    @Override
    protected int insertKey( long val ) {
        int hash, index;

        hash = HashFunctions.hash(val) & 0x7fffffff;
        index = hash % _states.length;
        byte state = _states[index];

        /* We have a collision */
        if (state == FULL) {
            numOfCollisions++;
            measureIterationLength(val, index, hash, state);
        }

        return super.insertKey(val);
    }

    public void clearCollisions() { numOfCollisions = 0; }

    public int getNumOfCollisions() { return numOfCollisions; }

    public int getMaxIterations() { return maxIterations; }

    public int getTotalIterations() { return totalIterations; }


}
