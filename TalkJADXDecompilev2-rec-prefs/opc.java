package p000;

public final class opc extends nyx<opc> {
    public String f33521a;
    public oqu f33522b;
    public opd[] f33523c;

    public /* synthetic */ nzf m39008a(nyt nyt) {
        return m39006b(nyt);
    }

    public opc() {
        m39007d();
    }

    private opc m39007d() {
        this.f33521a = null;
        this.f33522b = null;
        this.f33523c = opd.m39012d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39009a(nyu nyu) {
        if (this.f33521a != null) {
            nyu.m37170a(1, this.f33521a);
        }
        if (this.f33522b != null) {
            nyu.m37182b(2, this.f33522b);
        }
        if (this.f33523c != null && this.f33523c.length > 0) {
            for (nzf nzf : this.f33523c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39010b() {
        int b = super.b();
        if (this.f33521a != null) {
            b += nyu.m37137b(1, this.f33521a);
        }
        if (this.f33522b != null) {
            b += nyu.m37145d(2, this.f33522b);
        }
        if (this.f33523c == null || this.f33523c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f33523c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private opc m39006b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33521a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33522b == null) {
                        this.f33522b = new oqu();
                    }
                    nyt.m37101a(this.f33522b);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f33523c == null) {
                        a = 0;
                    } else {
                        a = this.f33523c.length;
                    }
                    Object obj = new opd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33523c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opd();
                    nyt.m37101a(obj[a]);
                    this.f33523c = obj;
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
