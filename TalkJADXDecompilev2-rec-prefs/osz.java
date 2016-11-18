package p000;

public final class osz extends nyx<osz> {
    public Integer f34217a;
    public osy[] f34218b;
    public Integer f34219c;

    public /* synthetic */ nzf m39653a(nyt nyt) {
        return m39651b(nyt);
    }

    public osz() {
        m39652d();
    }

    private osz m39652d() {
        this.f34218b = osy.m39646d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39654a(nyu nyu) {
        if (this.f34217a != null) {
            nyu.m37168a(1, this.f34217a.intValue());
        }
        if (this.f34218b != null && this.f34218b.length > 0) {
            for (nzf nzf : this.f34218b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34219c != null) {
            nyu.m37168a(3, this.f34219c.intValue());
        }
        super.a(nyu);
    }

    protected int m39655b() {
        int b = super.b();
        if (this.f34217a != null) {
            b += nyu.m37147f(1, this.f34217a.intValue());
        }
        if (this.f34218b != null && this.f34218b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34218b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34219c != null) {
            return b + nyu.m37147f(3, this.f34219c.intValue());
        }
        return b;
    }

    private osz m39651b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f34217a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34218b == null) {
                        a = 0;
                    } else {
                        a = this.f34218b.length;
                    }
                    Object obj = new osy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34218b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osy();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osy();
                    nyt.m37101a(obj[a]);
                    this.f34218b = obj;
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f34219c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
