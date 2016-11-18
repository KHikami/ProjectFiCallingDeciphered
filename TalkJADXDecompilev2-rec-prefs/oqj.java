package p000;

public final class oqj extends nyx<oqj> {
    public oqk[] f33757a;

    public /* synthetic */ nzf m39182a(nyt nyt) {
        return m39180b(nyt);
    }

    public oqj() {
        m39181d();
    }

    private oqj m39181d() {
        this.f33757a = oqk.m39186d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39183a(nyu nyu) {
        if (this.f33757a != null && this.f33757a.length > 0) {
            for (nzf nzf : this.f33757a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39184b() {
        int b = super.b();
        if (this.f33757a != null && this.f33757a.length > 0) {
            for (nzf nzf : this.f33757a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oqj m39180b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33757a == null) {
                        a = 0;
                    } else {
                        a = this.f33757a.length;
                    }
                    Object obj = new oqk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33757a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqk();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqk();
                    nyt.m37101a(obj[a]);
                    this.f33757a = obj;
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
