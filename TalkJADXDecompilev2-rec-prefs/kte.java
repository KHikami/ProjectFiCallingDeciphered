package p000;

public final class kte extends nyx<kte> {
    private static volatile kte[] f23212c;
    public String f23213a;
    public ktf[] f23214b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27422b(nyt);
    }

    public static kte[] m27423d() {
        if (f23212c == null) {
            synchronized (nzc.c) {
                if (f23212c == null) {
                    f23212c = new kte[0];
                }
            }
        }
        return f23212c;
    }

    public kte() {
        this.f23213a = null;
        this.f23214b = ktf.m27428d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23213a != null) {
            nyu.a(1, this.f23213a);
        }
        if (this.f23214b != null && this.f23214b.length > 0) {
            for (nzf nzf : this.f23214b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23213a != null) {
            b += nyu.b(1, this.f23213a);
        }
        if (this.f23214b == null || this.f23214b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23214b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kte m27422b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23213a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23214b == null) {
                        a = 0;
                    } else {
                        a = this.f23214b.length;
                    }
                    Object obj = new ktf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23214b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ktf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ktf();
                    nyt.a(obj[a]);
                    this.f23214b = obj;
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
