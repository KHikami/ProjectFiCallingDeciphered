package p000;

public final class nrl extends nyx<nrl> {
    public nrq f30597a;
    public nrs f30598b;
    public nrm f30599c;
    public nrm[] f30600d;
    public Boolean f30601e;

    public /* synthetic */ nzf m36267a(nyt nyt) {
        return m36266b(nyt);
    }

    public nrl() {
        this.f30600d = nrm.m36271d();
        this.f30601e = null;
        this.cachedSize = -1;
    }

    public void m36268a(nyu nyu) {
        if (this.f30597a != null) {
            nyu.m37182b(1, this.f30597a);
        }
        if (this.f30598b != null) {
            nyu.m37182b(2, this.f30598b);
        }
        if (this.f30599c != null) {
            nyu.m37182b(3, this.f30599c);
        }
        if (this.f30601e != null) {
            nyu.m37172a(4, this.f30601e.booleanValue());
        }
        if (this.f30600d != null && this.f30600d.length > 0) {
            for (nzf nzf : this.f30600d) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36269b() {
        int b = super.b();
        if (this.f30597a != null) {
            b += nyu.m37145d(1, this.f30597a);
        }
        if (this.f30598b != null) {
            b += nyu.m37145d(2, this.f30598b);
        }
        if (this.f30599c != null) {
            b += nyu.m37145d(3, this.f30599c);
        }
        if (this.f30601e != null) {
            this.f30601e.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f30600d == null || this.f30600d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30600d) {
            if (nzf != null) {
                i += nyu.m37145d(5, nzf);
            }
        }
        return i;
    }

    private nrl m36266b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30597a == null) {
                        this.f30597a = new nrq();
                    }
                    nyt.m37101a(this.f30597a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30598b == null) {
                        this.f30598b = new nrs();
                    }
                    nyt.m37101a(this.f30598b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30599c == null) {
                        this.f30599c = new nrm();
                    }
                    nyt.m37101a(this.f30599c);
                    continue;
                case 32:
                    this.f30601e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f30600d == null) {
                        a = 0;
                    } else {
                        a = this.f30600d.length;
                    }
                    Object obj = new nrm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30600d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nrm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nrm();
                    nyt.m37101a(obj[a]);
                    this.f30600d = obj;
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
