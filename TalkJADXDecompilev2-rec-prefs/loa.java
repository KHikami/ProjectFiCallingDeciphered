package p000;

public final class loa extends nyx<loa> {
    private static volatile loa[] f25842e;
    public muu f25843a;
    public Integer f25844b;
    public mdu f25845c;
    public Boolean f25846d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29700b(nyt);
    }

    public static loa[] m29701d() {
        if (f25842e == null) {
            synchronized (nzc.c) {
                if (f25842e == null) {
                    f25842e = new loa[0];
                }
            }
        }
        return f25842e;
    }

    public loa() {
        m29702g();
    }

    private loa m29702g() {
        this.f25843a = null;
        this.f25845c = null;
        this.f25846d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25843a != null) {
            nyu.b(1, this.f25843a);
        }
        if (this.f25844b != null) {
            nyu.a(2, this.f25844b.intValue());
        }
        if (this.f25845c != null) {
            nyu.b(3, this.f25845c);
        }
        if (this.f25846d != null) {
            nyu.a(4, this.f25846d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25843a != null) {
            b += nyu.d(1, this.f25843a);
        }
        if (this.f25844b != null) {
            b += nyu.f(2, this.f25844b.intValue());
        }
        if (this.f25845c != null) {
            b += nyu.d(3, this.f25845c);
        }
        if (this.f25846d == null) {
            return b;
        }
        this.f25846d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private loa m29700b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25843a == null) {
                        this.f25843a = new muu();
                    }
                    nyt.a(this.f25843a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f25844b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f25845c == null) {
                        this.f25845c = new mdu();
                    }
                    nyt.a(this.f25845c);
                    continue;
                case 32:
                    this.f25846d = Boolean.valueOf(nyt.i());
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
