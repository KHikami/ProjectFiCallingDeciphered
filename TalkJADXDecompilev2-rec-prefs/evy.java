package p000;

import java.io.Serializable;

public final class evy implements Serializable {
    private static final long serialVersionUID = 2;
    private final int f12399a;
    private final int f12400b;
    private final int f12401c;
    private final String f12402d;
    private long f12403e = 0;

    public evy(int i, int i2, int i3, String str) {
        this.f12399a = i;
        this.f12400b = i2;
        this.f12401c = i3;
        this.f12402d = str;
    }

    public String m14695a() {
        return this.f12402d;
    }

    public long m14697b() {
        return this.f12403e;
    }

    public void m14696a(long j) {
        this.f12403e = j;
    }

    private static mrr m14694a(int i) {
        mrr mrr = new mrr();
        mrr.f28219a = "bbl";
        mrr.f28220b = Integer.valueOf(i);
        return mrr;
    }

    public lrw m14698c() {
        lrw lrw = new lrw();
        mrp mrp = new mrp();
        mrp.f28194e = evy.m14694a(this.f12400b);
        mrp.f28195f = evy.m14694a(this.f12399a);
        lrw.f26285a = mrp;
        lrx lrx = new lrx();
        lvz lvz = new lvz();
        lvz.f26629a = Integer.valueOf(this.f12401c);
        lvz.f26630b = Long.valueOf(this.f12403e);
        lrx.f26290d = lvz;
        lrw.f26286b = lrx;
        return lrw;
    }
}
