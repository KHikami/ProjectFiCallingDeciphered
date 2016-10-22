package defpackage;

import java.io.Serializable;

/* renamed from: evy */
public final class evy implements Serializable {
    private static final long serialVersionUID = 2;
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private long e;

    public evy(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = 0;
    }

    public String a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    private static mrr a(int i) {
        mrr mrr = new mrr();
        mrr.a = "bbl";
        mrr.b = Integer.valueOf(i);
        return mrr;
    }

    public lrw c() {
        lrw lrw = new lrw();
        mrp mrp = new mrp();
        mrp.e = evy.a(this.b);
        mrp.f = evy.a(this.a);
        lrw.a = mrp;
        lrx lrx = new lrx();
        lvz lvz = new lvz();
        lvz.a = Integer.valueOf(this.c);
        lvz.b = Long.valueOf(this.e);
        lrx.d = lvz;
        lrw.b = lrx;
        return lrw;
    }
}
