package p000;

public final class kmd extends nyx<kmd> {
    private static volatile kmd[] f22343f;
    public klk f22344a;
    public String f22345b;
    public String f22346c;
    public String f22347d;
    public kme[] f22348e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26505b(nyt);
    }

    public static kmd[] m26506d() {
        if (f22343f == null) {
            synchronized (nzc.c) {
                if (f22343f == null) {
                    f22343f = new kmd[0];
                }
            }
        }
        return f22343f;
    }

    public kmd() {
        m26507g();
    }

    private kmd m26507g() {
        this.f22344a = null;
        this.f22345b = null;
        this.f22346c = null;
        this.f22347d = null;
        this.f22348e = kme.m26512d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22344a != null) {
            nyu.b(1, this.f22344a);
        }
        if (this.f22345b != null) {
            nyu.a(2, this.f22345b);
        }
        if (this.f22346c != null) {
            nyu.a(3, this.f22346c);
        }
        if (this.f22347d != null) {
            nyu.a(4, this.f22347d);
        }
        if (this.f22348e != null && this.f22348e.length > 0) {
            for (nzf nzf : this.f22348e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22344a != null) {
            b += nyu.d(1, this.f22344a);
        }
        if (this.f22345b != null) {
            b += nyu.b(2, this.f22345b);
        }
        if (this.f22346c != null) {
            b += nyu.b(3, this.f22346c);
        }
        if (this.f22347d != null) {
            b += nyu.b(4, this.f22347d);
        }
        if (this.f22348e == null || this.f22348e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22348e) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private kmd m26505b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22344a == null) {
                        this.f22344a = new klk();
                    }
                    nyt.a(this.f22344a);
                    continue;
                case wi.dH /*18*/:
                    this.f22345b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22346c = nyt.j();
                    continue;
                case 34:
                    this.f22347d = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f22348e == null) {
                        a = 0;
                    } else {
                        a = this.f22348e.length;
                    }
                    Object obj = new kme[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22348e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kme();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kme();
                    nyt.a(obj[a]);
                    this.f22348e = obj;
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
