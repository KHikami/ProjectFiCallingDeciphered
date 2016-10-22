import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
final class cwp implements cwl {
    private static cwp b;
    final cva a;
    private final ConcurrentHashMap c;
    private final cwo d;

    private cwp(cxc cxc, cuy cuy, int i) {
        buf.B((Object) cxc);
        this.d = new cwo();
        this.a = new cvg(cxc, cuy, i);
        this.c = new ConcurrentHashMap();
        cwj.a.a((cwl) this);
    }

    static synchronized cwp a(cxc cxc, cuy cuy) {
        cwp a;
        synchronized (cwp.class) {
            a = a(cxc, cuy, cvf.b);
        }
        return a;
    }

    private static synchronized cwp a(cxc cxc, cuy cuy, int i) {
        cwp cwp;
        synchronized (cwp.class) {
            if (b == null) {
                buf.B((Object) cxc);
                b = new cwp(cxc, cuy, i);
            }
            cwp = b;
        }
        return cwp;
    }

    public final void a(cwj cwj) {
        if (cwj.c) {
            this.c.clear();
        }
    }
}
