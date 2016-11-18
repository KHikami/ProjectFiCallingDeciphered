package p000;

public final class mwz extends nyx<mwz> {
    private static volatile mwz[] f28643c;
    public mwp f28644a;
    public mxa[] f28645b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33279b(nyt);
    }

    public static mwz[] m33280d() {
        if (f28643c == null) {
            synchronized (nzc.c) {
                if (f28643c == null) {
                    f28643c = new mwz[0];
                }
            }
        }
        return f28643c;
    }

    public mwz() {
        this.f28645b = mxa.m33285d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28644a != null) {
            nyu.b(1, this.f28644a);
        }
        if (this.f28645b != null && this.f28645b.length > 0) {
            for (nzf nzf : this.f28645b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28644a != null) {
            b += nyu.d(1, this.f28644a);
        }
        if (this.f28645b == null || this.f28645b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28645b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private mwz m33279b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28644a == null) {
                        this.f28644a = new mwp();
                    }
                    nyt.a(this.f28644a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f28645b == null) {
                        a = 0;
                    } else {
                        a = this.f28645b.length;
                    }
                    Object obj = new mxa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28645b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxa();
                    nyt.a(obj[a]);
                    this.f28645b = obj;
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
