package utils.hashable;

import java.util.Objects;

/**
 * Created by ollesvensson on 09/10/16.
 */
public abstract class HashableLong {

    protected Long value;

    public HashableLong(Long value) { this.value = value; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HashableLong) {
            return value == (((HashableLong)obj).value).longValue();
        }
        return false;
    }

    @Override
    public abstract int hashCode();

}
