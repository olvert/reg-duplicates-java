import utils.collision.CollisionResult;
import utils.collision.CollisionTest;
import utils.hashable.HashableLong;
import utils.hashable.JavaHash;
import utils.hashable.LongConverter;

import java.io.*;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
/*
        long start = System.nanoTime();

        String filePath = args[0];
        Boolean duplicates = RegSolver.solve(filePath);
        String result = duplicates ? "Dubbletter" : "Ej dubbletter";
        System.out.println(result);

        long end = System.nanoTime();
        double diff = (end - start) / 1e6;

        System.out.println("Tid i ms: " + diff);
*/

        String filePath = args[0];

        CollisionResult cr = CollisionTest.runTest(filePath, new LongConverter() {
            @Override
            public HashableLong convert(Long l) {
                return new JavaHash(l);
            }
        });

        double average = (double) cr.totalIterations / (double) cr.numOfCollisions;

        System.out.println("Collisions: " + cr.numOfCollisions);
        System.out.println("Max iterations: " + cr.maxIterations);
        System.out.println("Average iterations per collision: " + average);

    }


}
