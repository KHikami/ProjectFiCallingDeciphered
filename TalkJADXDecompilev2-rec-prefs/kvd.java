package p000;

public final class kvd extends nyx<kvd> {
    private static volatile kvd[] f23565d;
    public Double f23566a;
    public String f23567b;
    public kvf[] f23568c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27664b(nyt);
    }

    public static kvd[] m27665d() {
        if (f23565d == null) {
            synchronized (nzc.c) {
                if (f23565d == null) {
                    f23565d = new kvd[0];
                }
            }
        }
        return f23565d;
    }

    public kvd() {
        this.f23566a = null;
        this.f23567b = null;
        this.f23568c = kvf.m27674d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23566a.doubleValue());
        if (this.f23567b != null) {
            nyu.a(2, this.f23567b);
        }
        if (this.f23568c != null && this.f23568c.length > 0) {
            for (nzf nzf : this.f23568c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23566a.doubleValue();
        b += nyu.h(1) + 8;
        if (this.f23567b != null) {
            b += nyu.b(2, this.f23567b);
        }
        if (this.f23568c == null || this.f23568c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23568c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private kvd m27664b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23566a = Double.valueOf(nyt.b());
                    continue;
                case wi.dH /*18*/:
                    this.f23567b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f23568c == null) {
                        a = 0;
                    } else {
                        a = this.f23568c.length;
                    }
                    Object obj = new kvf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23568c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvf();
                    nyt.a(obj[a]);
                    this.f23568c = obj;
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
