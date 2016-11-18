package p000;

public final class ktg extends nyx<ktg> {
    private static volatile ktg[] f23217c;
    public String f23218a;
    public kth[] f23219b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27432b(nyt);
    }

    public static ktg[] m27433d() {
        if (f23217c == null) {
            synchronized (nzc.c) {
                if (f23217c == null) {
                    f23217c = new ktg[0];
                }
            }
        }
        return f23217c;
    }

    public ktg() {
        m27434g();
    }

    private ktg m27434g() {
        this.f23218a = null;
        this.f23219b = kth.m27439d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23218a != null) {
            nyu.a(1, this.f23218a);
        }
        if (this.f23219b != null && this.f23219b.length > 0) {
            for (nzf nzf : this.f23219b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23218a != null) {
            b += nyu.b(1, this.f23218a);
        }
        if (this.f23219b == null || this.f23219b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23219b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private ktg m27432b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23218a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23219b == null) {
                        a = 0;
                    } else {
                        a = this.f23219b.length;
                    }
                    Object obj = new kth[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23219b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kth();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kth();
                    nyt.a(obj[a]);
                    this.f23219b = obj;
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
