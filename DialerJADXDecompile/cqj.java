import java.util.Comparator;

final class cqj implements Comparator {
    cqj(cqi cqi) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((cql) obj).getClass().getCanonicalName().compareTo(((cql) obj2).getClass().getCanonicalName());
    }
}
