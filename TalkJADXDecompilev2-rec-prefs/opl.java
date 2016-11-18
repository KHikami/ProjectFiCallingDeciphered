package p000;

public final class opl extends nyx<opl> {
    private static volatile opl[] f33560f;
    public String f33561a;
    public String f33562b;
    public opm[] f33563c;
    public oqu f33564d;
    public oqu f33565e;

    public /* synthetic */ nzf m39055a(nyt nyt) {
        return m39052b(nyt);
    }

    public static opl[] m39053d() {
        if (f33560f == null) {
            synchronized (nzc.f31309c) {
                if (f33560f == null) {
                    f33560f = new opl[0];
                }
            }
        }
        return f33560f;
    }

    public opl() {
        m39054g();
    }

    private opl m39054g() {
        this.f33561a = null;
        this.f33562b = null;
        this.f33563c = opm.m39059d();
        this.f33564d = null;
        this.f33565e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39056a(nyu nyu) {
        if (this.f33561a != null) {
            nyu.m37170a(1, this.f33561a);
        }
        if (this.f33562b != null) {
            nyu.m37170a(2, this.f33562b);
        }
        if (this.f33563c != null && this.f33563c.length > 0) {
            for (nzf nzf : this.f33563c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f33564d != null) {
            nyu.m37182b(4, this.f33564d);
        }
        if (this.f33565e != null) {
            nyu.m37182b(5, this.f33565e);
        }
        super.a(nyu);
    }

    protected int m39057b() {
        int b = super.b();
        if (this.f33561a != null) {
            b += nyu.m37137b(1, this.f33561a);
        }
        if (this.f33562b != null) {
            b += nyu.m37137b(2, this.f33562b);
        }
        if (this.f33563c != null && this.f33563c.length > 0) {
            int i = b;
            for (nzf nzf : this.f33563c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f33564d != null) {
            b += nyu.m37145d(4, this.f33564d);
        }
        if (this.f33565e != null) {
            return b + nyu.m37145d(5, this.f33565e);
        }
        return b;
    }

    private opl m39052b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33561a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33562b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f33563c == null) {
                        a = 0;
                    } else {
                        a = this.f33563c.length;
                    }
                    Object obj = new opm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33563c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opm();
                    nyt.m37101a(obj[a]);
                    this.f33563c = obj;
                    continue;
                case 34:
                    if (this.f33564d == null) {
                        this.f33564d = new oqu();
                    }
                    nyt.m37101a(this.f33564d);
                    continue;
                case 42:
                    if (this.f33565e == null) {
                        this.f33565e = new oqu();
                    }
                    nyt.m37101a(this.f33565e);
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
