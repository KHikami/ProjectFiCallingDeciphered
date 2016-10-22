import java.util.Map;
import java.util.WeakHashMap;

public abstract class gur {
    private static final Map<Object, gur> a;
    private static final Object b;

    static {
        a = new WeakHashMap();
        b = new Object();
    }

    public abstract void a();
}
