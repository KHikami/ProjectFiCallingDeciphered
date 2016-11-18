package p000;

public final class nao extends nyx<nao> {
    public nap[] f29374a;

    public /* synthetic */ nzf m34076a(nyt nyt) {
        return m34074b(nyt);
    }

    public nao() {
        m34075d();
    }

    private nao m34075d() {
        this.f29374a = nap.m34080d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34077a(nyu nyu) {
        if (this.f29374a != null && this.f29374a.length > 0) {
            for (nzf nzf : this.f29374a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34078b() {
        int b = super.b();
        if (this.f29374a != null && this.f29374a.length > 0) {
            for (nzf nzf : this.f29374a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nao m34074b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29374a == null) {
                        a = 0;
                    } else {
                        a = this.f29374a.length;
                    }
                    Object obj = new nap[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29374a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nap();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nap();
                    nyt.m37101a(obj[a]);
                    this.f29374a = obj;
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
