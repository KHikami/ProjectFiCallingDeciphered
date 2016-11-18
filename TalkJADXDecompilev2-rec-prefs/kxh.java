package p000;

public final class kxh extends nyx<kxh> {
    public kxf[] f23845a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27917b(nyt);
    }

    public kxh() {
        m27918d();
    }

    private kxh m27918d() {
        this.f23845a = kxf.m27907d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23845a != null && this.f23845a.length > 0) {
            for (nzf nzf : this.f23845a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23845a != null && this.f23845a.length > 0) {
            for (nzf nzf : this.f23845a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kxh m27917b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f23845a == null) {
                        a = 0;
                    } else {
                        a = this.f23845a.length;
                    }
                    Object obj = new kxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23845a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxf();
                    nyt.a(obj[a]);
                    this.f23845a = obj;
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
