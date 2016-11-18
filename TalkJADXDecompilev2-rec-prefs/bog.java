package p000;

public final class bog {
    private static final boolean f4091a = false;
    private final ky<Integer, boe> f4092b = new ky();

    static {
        kae kae = glk.f15557d;
    }

    public boe m6289a(bko bko) {
        boe boe;
        int g = bko.m5638g();
        synchronized (this.f4092b) {
            boe = (boe) this.f4092b.get(Integer.valueOf(g));
            if (boe == null) {
                if (f4091a) {
                    String.format("Adding participant cache for %s - %d", new Object[]{bko.m5629a(), Integer.valueOf(g)});
                }
                boe = new boe(bko);
                this.f4092b.put(Integer.valueOf(g), boe);
            }
        }
        return boe;
    }
}
