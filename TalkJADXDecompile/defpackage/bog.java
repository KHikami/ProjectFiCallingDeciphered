package defpackage;

/* renamed from: bog */
public final class bog {
    private static final boolean a;
    private final ky<Integer, boe> b;

    public bog() {
        this.b = new ky();
    }

    static {
        kae kae = glk.d;
        a = false;
    }

    public boe a(bko bko) {
        boe boe;
        int g = bko.g();
        synchronized (this.b) {
            boe = (boe) this.b.get(Integer.valueOf(g));
            if (boe == null) {
                if (a) {
                    String.format("Adding participant cache for %s - %d", new Object[]{bko.a(), Integer.valueOf(g)});
                }
                boe = new boe(bko);
                this.b.put(Integer.valueOf(g), boe);
            }
        }
        return boe;
    }
}
