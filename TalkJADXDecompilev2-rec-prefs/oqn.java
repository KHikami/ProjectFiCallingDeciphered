package p000;

public final class oqn extends nyx<oqn> {
    public oqm[] f33771a;
    public oqm[] f33772b;
    public String f33773c;

    public /* synthetic */ nzf m39205a(nyt nyt) {
        return m39203b(nyt);
    }

    public oqn() {
        m39204d();
    }

    private oqn m39204d() {
        this.f33771a = oqm.m39198d();
        this.f33772b = oqm.m39198d();
        this.f33773c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39206a(nyu nyu) {
        int i = 0;
        if (this.f33771a != null && this.f33771a.length > 0) {
            for (nzf nzf : this.f33771a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33772b != null && this.f33772b.length > 0) {
            while (i < this.f33772b.length) {
                nzf nzf2 = this.f33772b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        if (this.f33773c != null) {
            nyu.m37170a(3, this.f33773c);
        }
        super.a(nyu);
    }

    protected int m39207b() {
        int i = 0;
        int b = super.b();
        if (this.f33771a != null && this.f33771a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33771a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f33772b != null && this.f33772b.length > 0) {
            while (i < this.f33772b.length) {
                nzf nzf2 = this.f33772b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        if (this.f33773c != null) {
            return b + nyu.m37137b(3, this.f33773c);
        }
        return b;
    }

    private oqn m39203b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f33771a == null) {
                        a = 0;
                    } else {
                        a = this.f33771a.length;
                    }
                    obj = new oqm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33771a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqm();
                    nyt.m37101a(obj[a]);
                    this.f33771a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33772b == null) {
                        a = 0;
                    } else {
                        a = this.f33772b.length;
                    }
                    obj = new oqm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33772b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqm();
                    nyt.m37101a(obj[a]);
                    this.f33772b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f33773c = nyt.m37117j();
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
