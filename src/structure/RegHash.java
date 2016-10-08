package structure;

import gnu.trove.set.hash.TLongHashSet;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class RegHash implements RegStructure {

    private static final int INITIAL_CAP = 7000000;
    private static final float LOAD_FACTOR = 1F;

    private TLongHashSet structure = new TLongHashSet(INITIAL_CAP, LOAD_FACTOR);

    public boolean insert(String reg) {

        Long parsed = Long.parseLong(reg, 36);
        return structure.add(parsed);
    }

}
