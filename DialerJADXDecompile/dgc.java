import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
public final class dgc {
    public static final dgc a;
    public final ConcurrentMap b;

    static {
        a = new dgc(new dgd(new dfn(), true), new dgd(dfo.a, false));
    }

    public final Set a() {
        Set hashSet = new HashSet(this.b.size());
        for (Entry entry : this.b.entrySet()) {
            if (((dgd) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private dgc(dgd... dgdArr) {
        this.b = new ConcurrentHashMap();
        for (dgd dgd : dgdArr) {
            this.b.put(dgd.a.a(), dgd);
        }
    }
}
