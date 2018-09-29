package utils.collision;

import utils.hashable.HashableLong;
import utils.hashable.LongConverter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by ollesvensson on 09/10/16.
 */
public class CollisionTest {

    public static final int INITIAL_CAP = 7000000;
    public static final float LOAD_FACTOR = 1F;

    public static CollisionResult runTest(String filePath, LongConverter lc) throws Exception {


        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ColTLongHashSet set = new ColTLongHashSet(INITIAL_CAP, LOAD_FACTOR);

        String line;

        while ((line = reader.readLine()) != null ) {

            Long parsed = Long.parseLong(line, 36);
            set.add(parsed);
        }

        int numOfCollisions = set.getNumOfCollisions();

        return new CollisionResult( set.getNumOfCollisions(),
                                    set.getMaxIterations(),
                                    set.getTotalIterations());
    }
}
