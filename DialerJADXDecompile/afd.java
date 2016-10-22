import java.util.Comparator;
import java.util.Objects;

/* compiled from: PG */
final class afd implements Comparator {
    afd() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        agd agd = (agd) obj;
        agd agd2 = (agd) obj2;
        if (Objects.equals(agd.a, agd2.a) && Objects.equals(agd.b, agd2.b) && Objects.equals(agd.c, agd2.c)) {
            return 0;
        }
        if (agd2.a == null || agd2.b == null) {
            return -1;
        }
        if (agd.a == null || agd.b == null) {
            return 1;
        }
        int compareTo = agd.a.compareTo(agd2.a);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = agd.b.compareTo(agd2.b);
        if (compareTo != 0) {
            return compareTo;
        }
        if (agd.c == null) {
            return -1;
        }
        if (agd2.c != null) {
            return agd.c.compareTo(agd2.c);
        }
        return 1;
    }
}
