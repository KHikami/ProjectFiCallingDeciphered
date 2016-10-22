import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class dgj {
    public final List a;

    public dgj(List list) {
        cob.a(!list.isEmpty(), (Object) "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dgj) {
            return this.a.equals(((dgj) obj).a);
        }
        return false;
    }
}
