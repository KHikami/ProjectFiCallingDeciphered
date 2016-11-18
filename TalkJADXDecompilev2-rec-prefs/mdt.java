package p000;

public final class mdt extends nyx<mdt> {
    private static volatile mdt[] f27529e;
    public Long f27530a;
    public Boolean f27531b;
    public String f27532c;
    public String f27533d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31899b(nyt);
    }

    public static mdt[] m31900d() {
        if (f27529e == null) {
            synchronized (nzc.c) {
                if (f27529e == null) {
                    f27529e = new mdt[0];
                }
            }
        }
        return f27529e;
    }

    public mdt() {
        m31901g();
    }

    private mdt m31901g() {
        this.f27530a = null;
        this.f27531b = null;
        this.f27532c = null;
        this.f27533d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27530a != null) {
            nyu.b(1, this.f27530a.longValue());
        }
        if (this.f27531b != null) {
            nyu.a(2, this.f27531b.booleanValue());
        }
        if (this.f27532c != null) {
            nyu.a(5, this.f27532c);
        }
        if (this.f27533d != null) {
            nyu.a(6, this.f27533d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27530a != null) {
            b += nyu.f(1, this.f27530a.longValue());
        }
        if (this.f27531b != null) {
            this.f27531b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f27532c != null) {
            b += nyu.b(5, this.f27532c);
        }
        if (this.f27533d != null) {
            return b + nyu.b(6, this.f27533d);
        }
        return b;
    }

    private mdt m31899b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27530a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f27531b = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f27532c = nyt.j();
                    continue;
                case 50:
                    this.f27533d = nyt.j();
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
