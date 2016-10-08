import structure.RegHash;
import structure.RegStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class RegSolver {

    public static boolean solve(String filePath) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(filePath));

        RegStructure rs = new RegHash();
        String line;

        while ((line = bf.readLine()) != null ) {

            if (!rs.insert(line)){
                return true;
            }

        }

        return false;
    }
}
