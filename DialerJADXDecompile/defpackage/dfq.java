package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: dfq */
public final class dfq {
    public static final dfq a;
    public final ConcurrentMap b;

    static {
        a = new dfq(new dfn(), dfo.a);
    }

    private dfq(dfp... dfpArr) {
        this.b = new ConcurrentHashMap();
        for (dfp dfp : dfpArr) {
            this.b.put(dfp.a(), dfp);
        }
    }
}
