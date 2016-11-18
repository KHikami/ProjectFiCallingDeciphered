package defpackage;

public final class nsg extends nyx<nsg> {
    private static volatile nsg[] f;
    public non a;
    public nqc b;
    public Float c;
    public Float d;
    public nsh e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nsg[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new nsg[0];
                }
            }
        }
        return f;
    }

    public nsg() {
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.floatValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            this.c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.e != null) {
            return b + nyu.d(5, this.e);
        }
        return b;
    }

    private nsg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new non();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nqc();
                    }
                    nyt.a(this.b);
                    continue;
                case 29:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nsh();
                    }
                    nyt.a(this.e);
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
