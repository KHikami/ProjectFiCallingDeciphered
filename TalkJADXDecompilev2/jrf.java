package defpackage;

import java.util.ArrayList;

public final class jrf {
    static jrh a = null;
    static final ThreadLocal<ArrayList<jrh>> b = new jrg();
    private static final long c = kdt.a("picasasync.metrics.time", 100);

    public static void a(long j) {
        ArrayList arrayList = (ArrayList) b.get();
        int size = arrayList.size();
        if (size > 0) {
            jrh jrh = (jrh) arrayList.get(size - 1);
            jrh.a += j;
        }
    }
}
