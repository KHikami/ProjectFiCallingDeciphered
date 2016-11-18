package p000;

public final class kux extends nyx<kux> {
    private static volatile kux[] f23520d;
    public Double f23521a;
    public String f23522b;
    public kuz[] f23523c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27635b(nyt);
    }

    public static kux[] m27636d() {
        if (f23520d == null) {
            synchronized (nzc.c) {
                if (f23520d == null) {
                    f23520d = new kux[0];
                }
            }
        }
        return f23520d;
    }

    public kux() {
        m27637g();
    }

    private kux m27637g() {
        this.f23521a = null;
        this.f23522b = null;
        this.f23523c = kuz.m27647d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23521a.doubleValue());
        if (this.f23522b != null) {
            nyu.a(2, this.f23522b);
        }
        if (this.f23523c != null && this.f23523c.length > 0) {
            for (nzf nzf : this.f23523c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23521a.doubleValue();
        b += nyu.h(1) + 8;
        if (this.f23522b != null) {
            b += nyu.b(2, this.f23522b);
        }
        if (this.f23523c == null || this.f23523c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23523c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private kux m27635b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23521a = Double.valueOf(nyt.b());
                    continue;
                case wi.dH /*18*/:
                    this.f23522b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f23523c == null) {
                        a = 0;
                    } else {
                        a = this.f23523c.length;
                    }
                    Object obj = new kuz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23523c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuz();
                    nyt.a(obj[a]);
                    this.f23523c = obj;
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
