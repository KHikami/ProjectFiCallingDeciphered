package p000;

public final class kxa extends nyx<kxa> {
    public kxf[] f23824a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27881b(nyt);
    }

    public kxa() {
        m27882d();
    }

    private kxa m27882d() {
        this.f23824a = kxf.m27907d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23824a != null && this.f23824a.length > 0) {
            for (nzf nzf : this.f23824a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23824a != null && this.f23824a.length > 0) {
            for (nzf nzf : this.f23824a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kxa m27881b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f23824a == null) {
                        a = 0;
                    } else {
                        a = this.f23824a.length;
                    }
                    Object obj = new kxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23824a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxf();
                    nyt.a(obj[a]);
                    this.f23824a = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
