import java.util.ArrayList;

public final class jrf {
    static jrh a;
    static final ThreadLocal<ArrayList<jrh>> b;
    private static final long c;

    static {
        a = null;
        c = kdt.a("picasasync.metrics.time", 100);
        b = new jrg();
    }

    public static void a(long j) {
        ArrayList arrayList = (ArrayList) b.get();
        int size = arrayList.size();
        if (size > 0) {
            jrh jrh = (jrh) arrayList.get(size - 1);
            jrh.a += j;
        }
    }
}
