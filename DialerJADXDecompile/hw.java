import java.util.Map;

/* compiled from: PG */
final class hw extends ib {
    private /* synthetic */ hv d;

    hw(hv hvVar) {
        this.d = hvVar;
    }

    protected final int a() {
        return this.d.c;
    }

    protected final Object a(int i, int i2) {
        return this.d.b[(i << 1) + i2];
    }

    protected final int a(Object obj) {
        return this.d.a(obj);
    }

    protected final int b(Object obj) {
        return this.d.b(obj);
    }

    protected final Map b() {
        return this.d;
    }

    protected final void a(Object obj, Object obj2) {
        this.d.put(obj, obj2);
    }

    protected final Object a(int i, Object obj) {
        return this.d.a(i, obj);
    }

    protected final void a(int i) {
        this.d.d(i);
    }

    protected final void c() {
        this.d.clear();
    }
}
