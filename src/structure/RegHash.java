package structure;

import java.util.HashSet;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class RegHash implements RegStructure {

    private HashSet<String> structure = new HashSet<>();

    public boolean insert(String reg) {
        return structure.add(reg);
    }

}
