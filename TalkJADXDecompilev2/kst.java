package defpackage;

public final class kst extends nyx<kst> {
    private static volatile kst[] f;
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kst[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new kst[0];
                }
            }
        }
        return f;
    }

    public kst() {
        g();
    }

    private kst g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e == null) {
            return b;
        }
        this.e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private kst b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
