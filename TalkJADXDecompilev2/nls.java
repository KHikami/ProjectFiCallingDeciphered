package defpackage;

public final class nls extends nyx<nls> {
    private static volatile nls[] f;
    public njp a;
    public njw b;
    public Float c;
    public Float d;
    public nlt e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nls[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new nls[0];
                }
            }
        }
        return f;
    }

    public nls() {
        g();
    }

    private nls g() {
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

    private nls b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new njp();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new njw();
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
                        this.e = new nlt();
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
