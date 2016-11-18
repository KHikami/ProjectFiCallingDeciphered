package p000;

public final class nmp extends nyx<nmp> {
    public nmo[] f30253a;

    public /* synthetic */ nzf m35670a(nyt nyt) {
        return m35668b(nyt);
    }

    public nmp() {
        m35669d();
    }

    private nmp m35669d() {
        this.f30253a = nmo.m35663d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35671a(nyu nyu) {
        if (this.f30253a != null && this.f30253a.length > 0) {
            for (nzf nzf : this.f30253a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35672b() {
        int b = super.b();
        if (this.f30253a != null && this.f30253a.length > 0) {
            for (nzf nzf : this.f30253a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nmp m35668b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30253a == null) {
                        a = 0;
                    } else {
                        a = this.f30253a.length;
                    }
                    Object obj = new nmo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30253a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nmo();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nmo();
                    nyt.m37101a(obj[a]);
                    this.f30253a = obj;
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
