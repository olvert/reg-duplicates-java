package utils.hashable;

/**
 * Created by ollesvensson on 09/10/16.
 */
public class JavaHash extends HashableLong {

    public JavaHash(Long value) {
        super(value);
    }

    @Override
    public int hashCode() { return value.hashCode(); }
}
