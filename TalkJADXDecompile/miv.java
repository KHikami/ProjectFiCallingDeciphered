import java.util.Collection;

public final class miv {
    static final meu a;

    static boolean a(Collection<?> collection, Object obj) {
        boolean z = false;
        bm.a((Object) collection);
        try {
            z = collection.contains(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return z;
    }

    static StringBuilder a(int i) {
        gwb.d(i, "size");
        return new StringBuilder((int) Math.min(((long) i) << 3, 1073741824));
    }

    public static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    static {
        a = meu.a(", ").b("null");
    }
}
