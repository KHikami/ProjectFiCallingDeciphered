package p000;

public final class len extends nyx<len> {
    public lem[] f24842a;
    public Boolean f24843b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28893b(nyt);
    }

    public len() {
        m28894d();
    }

    private len m28894d() {
        this.f24842a = lem.m28888d();
        this.f24843b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24842a != null && this.f24842a.length > 0) {
            for (nzf nzf : this.f24842a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24843b != null) {
            nyu.a(2, this.f24843b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24842a != null && this.f24842a.length > 0) {
            for (nzf nzf : this.f24842a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24843b == null) {
            return b;
        }
        this.f24843b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private len m28893b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24842a == null) {
                        a = 0;
                    } else {
                        a = this.f24842a.length;
                    }
                    Object obj = new lem[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24842a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lem();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lem();
                    nyt.a(obj[a]);
                    this.f24842a = obj;
                    continue;
                case 16:
                    this.f24843b = Boolean.valueOf(nyt.i());
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
