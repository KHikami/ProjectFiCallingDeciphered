package p000;

public final class nmm extends nyx<nmm> {
    private static volatile nmm[] f30245c;
    public String f30246a;
    public nmn[] f30247b;

    public /* synthetic */ nzf m35653a(nyt nyt) {
        return m35650b(nyt);
    }

    public static nmm[] m35651d() {
        if (f30245c == null) {
            synchronized (nzc.f31309c) {
                if (f30245c == null) {
                    f30245c = new nmm[0];
                }
            }
        }
        return f30245c;
    }

    public nmm() {
        m35652g();
    }

    private nmm m35652g() {
        this.f30246a = null;
        this.f30247b = nmn.m35657d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35654a(nyu nyu) {
        if (this.f30246a != null) {
            nyu.m37170a(1, this.f30246a);
        }
        if (this.f30247b != null && this.f30247b.length > 0) {
            for (nzf nzf : this.f30247b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35655b() {
        int b = super.b();
        if (this.f30246a != null) {
            b += nyu.m37137b(1, this.f30246a);
        }
        if (this.f30247b == null || this.f30247b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30247b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nmm m35650b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30246a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30247b == null) {
                        a = 0;
                    } else {
                        a = this.f30247b.length;
                    }
                    Object obj = new nmn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30247b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nmn();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nmn();
                    nyt.m37101a(obj[a]);
                    this.f30247b = obj;
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
