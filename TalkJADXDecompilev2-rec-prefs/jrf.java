package p000;

import java.util.ArrayList;

public final class jrf {
    static jrh f20833a = null;
    static final ThreadLocal<ArrayList<jrh>> f20834b = new jrg();
    private static final long f20835c = kdt.m25604a("picasasync.metrics.time", 100);

    public static void m25061a(long j) {
        ArrayList arrayList = (ArrayList) f20834b.get();
        int size = arrayList.size();
        if (size > 0) {
            jrh jrh = (jrh) arrayList.get(size - 1);
            jrh.f20836a += j;
        }
    }
}
