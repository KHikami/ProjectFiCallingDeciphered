package p000;

public final class mwp extends nyx<mwp> {
    private static volatile mwp[] f28609f;
    public Float f28610a;
    public Float f28611b;
    public Float f28612c;
    public Float f28613d;
    public Float f28614e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33235b(nyt);
    }

    public static mwp[] m33236d() {
        if (f28609f == null) {
            synchronized (nzc.c) {
                if (f28609f == null) {
                    f28609f = new mwp[0];
                }
            }
        }
        return f28609f;
    }

    public mwp() {
        this.f28610a = null;
        this.f28611b = null;
        this.f28612c = null;
        this.f28613d = null;
        this.f28614e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28610a != null) {
            nyu.a(1, this.f28610a.floatValue());
        }
        if (this.f28611b != null) {
            nyu.a(2, this.f28611b.floatValue());
        }
        if (this.f28612c != null) {
            nyu.a(3, this.f28612c.floatValue());
        }
        if (this.f28613d != null) {
            nyu.a(4, this.f28613d.floatValue());
        }
        if (this.f28614e != null) {
            nyu.a(5, this.f28614e.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28610a != null) {
            this.f28610a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28611b != null) {
            this.f28611b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28612c != null) {
            this.f28612c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f28613d != null) {
            this.f28613d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.f28614e == null) {
            return b;
        }
        this.f28614e.floatValue();
        return b + (nyu.h(5) + 4);
    }

    private mwp m33235b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28610a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f28611b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f28612c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f28613d = Float.valueOf(nyt.c());
                    continue;
                case 45:
                    this.f28614e = Float.valueOf(nyt.c());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
