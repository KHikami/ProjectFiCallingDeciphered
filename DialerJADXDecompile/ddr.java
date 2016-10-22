import java.util.LinkedHashMap;

/* compiled from: PG */
final class ddr {
    int a;
    private LinkedHashMap b;

    public ddr(int i) {
        this.a = i;
        this.b = new dds(this, ((i << 2) / 3) + 1, 0.75f, true);
    }

    public final synchronized Object a(Object obj) {
        return this.b.get(obj);
    }

    public final synchronized void a(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }
}
