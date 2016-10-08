package structure;

import java.util.TreeSet;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class RegBST implements RegStructure {

    private TreeSet<String> structure;

    public RegBST() {
        structure = new TreeSet();
    }

    @Override
    public boolean insert(String reg) {
        return structure.add(reg);
    }
}
