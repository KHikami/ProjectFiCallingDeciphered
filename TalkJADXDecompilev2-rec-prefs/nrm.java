package p000;

public final class nrm extends nyx<nrm> {
    private static volatile nrm[] f30602c;
    public nrs f30603a;
    public nrp[] f30604b;

    public /* synthetic */ nzf m36272a(nyt nyt) {
        return m36270b(nyt);
    }

    public static nrm[] m36271d() {
        if (f30602c == null) {
            synchronized (nzc.f31309c) {
                if (f30602c == null) {
                    f30602c = new nrm[0];
                }
            }
        }
        return f30602c;
    }

    public nrm() {
        this.f30604b = nrp.m36284d();
        this.cachedSize = -1;
    }

    public void m36273a(nyu nyu) {
        if (this.f30603a != null) {
            nyu.m37182b(1, this.f30603a);
        }
        if (this.f30604b != null && this.f30604b.length > 0) {
            for (nzf nzf : this.f30604b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36274b() {
        int b = super.b();
        if (this.f30603a != null) {
            b += nyu.m37145d(1, this.f30603a);
        }
        if (this.f30604b == null || this.f30604b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30604b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nrm m36270b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30603a == null) {
                        this.f30603a = new nrs();
                    }
                    nyt.m37101a(this.f30603a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30604b == null) {
                        a = 0;
                    } else {
                        a = this.f30604b.length;
                    }
                    Object obj = new nrp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30604b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nrp();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nrp();
                    nyt.m37101a(obj[a]);
                    this.f30604b = obj;
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
