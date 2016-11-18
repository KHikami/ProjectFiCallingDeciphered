package p000;

public final class nzv extends nyx<nzv> {
    public Long f31392a;
    public String f31393b;
    public nzx[] f31394c;
    public String f31395d;

    public /* synthetic */ nzf m37308a(nyt nyt) {
        return m37306b(nyt);
    }

    public nzv() {
        m37307d();
    }

    private nzv m37307d() {
        this.f31392a = null;
        this.f31393b = null;
        this.f31394c = nzx.m37317d();
        this.f31395d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37309a(nyu nyu) {
        if (this.f31392a != null) {
            nyu.m37181b(1, this.f31392a.longValue());
        }
        if (this.f31393b != null) {
            nyu.m37170a(2, this.f31393b);
        }
        if (this.f31394c != null && this.f31394c.length > 0) {
            for (nzf nzf : this.f31394c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f31395d != null) {
            nyu.m37170a(4, this.f31395d);
        }
        super.a(nyu);
    }

    protected int m37310b() {
        int b = super.b();
        if (this.f31392a != null) {
            b += nyu.m37148f(1, this.f31392a.longValue());
        }
        if (this.f31393b != null) {
            b += nyu.m37137b(2, this.f31393b);
        }
        if (this.f31394c != null && this.f31394c.length > 0) {
            int i = b;
            for (nzf nzf : this.f31394c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f31395d != null) {
            return b + nyu.m37137b(4, this.f31395d);
        }
        return b;
    }

    private nzv m37306b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31392a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f31393b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f31394c == null) {
                        a = 0;
                    } else {
                        a = this.f31394c.length;
                    }
                    Object obj = new nzx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31394c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nzx();
                    nyt.m37101a(obj[a]);
                    this.f31394c = obj;
                    continue;
                case 34:
                    this.f31395d = nyt.m37117j();
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
