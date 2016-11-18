package p000;

public final class nnj extends nyx<nnj> {
    public nnk[] f30290a;

    public /* synthetic */ nzf m35771a(nyt nyt) {
        return m35769b(nyt);
    }

    public nnj() {
        m35770d();
    }

    private nnj m35770d() {
        this.f30290a = nnk.m35775d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35772a(nyu nyu) {
        if (this.f30290a != null && this.f30290a.length > 0) {
            for (nzf nzf : this.f30290a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35773b() {
        int b = super.b();
        if (this.f30290a != null && this.f30290a.length > 0) {
            for (nzf nzf : this.f30290a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nnj m35769b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30290a == null) {
                        a = 0;
                    } else {
                        a = this.f30290a.length;
                    }
                    Object obj = new nnk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30290a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nnk();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nnk();
                    nyt.m37101a(obj[a]);
                    this.f30290a = obj;
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
