package p000;

public final class kra extends nyx<kra> {
    private static volatile kra[] f22846e;
    public kqd f22847a;
    public kpi f22848b;
    public String f22849c;
    public Boolean f22850d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27143b(nyt);
    }

    public static kra[] m27144d() {
        if (f22846e == null) {
            synchronized (nzc.c) {
                if (f22846e == null) {
                    f22846e = new kra[0];
                }
            }
        }
        return f22846e;
    }

    public kra() {
        m27145g();
    }

    private kra m27145g() {
        this.f22847a = null;
        this.f22848b = null;
        this.f22849c = null;
        this.f22850d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22847a != null) {
            nyu.b(1, this.f22847a);
        }
        if (this.f22848b != null) {
            nyu.b(2, this.f22848b);
        }
        if (this.f22849c != null) {
            nyu.a(3, this.f22849c);
        }
        if (this.f22850d != null) {
            nyu.a(4, this.f22850d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22847a != null) {
            b += nyu.d(1, this.f22847a);
        }
        if (this.f22848b != null) {
            b += nyu.d(2, this.f22848b);
        }
        if (this.f22849c != null) {
            b += nyu.b(3, this.f22849c);
        }
        if (this.f22850d == null) {
            return b;
        }
        this.f22850d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private kra m27143b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22847a == null) {
                        this.f22847a = new kqd();
                    }
                    nyt.a(this.f22847a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22848b == null) {
                        this.f22848b = new kpi();
                    }
                    nyt.a(this.f22848b);
                    continue;
                case wi.dx /*26*/:
                    this.f22849c = nyt.j();
                    continue;
                case 32:
                    this.f22850d = Boolean.valueOf(nyt.i());
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
