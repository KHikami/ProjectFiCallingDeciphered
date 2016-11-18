package p000;

public final class nfk extends nyx<nfk> {
    public Integer f29679a;
    public nhx[] f29680b;

    public /* synthetic */ nzf m34688a(nyt nyt) {
        return m34686b(nyt);
    }

    public nfk() {
        m34687d();
    }

    private nfk m34687d() {
        this.f29679a = null;
        this.f29680b = nhx.m35028d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34689a(nyu nyu) {
        if (this.f29679a != null) {
            nyu.m37168a(1, this.f29679a.intValue());
        }
        if (this.f29680b != null && this.f29680b.length > 0) {
            for (nzf nzf : this.f29680b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34690b() {
        int b = super.b();
        if (this.f29679a != null) {
            b += nyu.m37147f(1, this.f29679a.intValue());
        }
        if (this.f29680b == null || this.f29680b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29680b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nfk m34686b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29679a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29680b == null) {
                        a = 0;
                    } else {
                        a = this.f29680b.length;
                    }
                    Object obj = new nhx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29680b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nhx();
                    nyt.m37101a(obj[a]);
                    this.f29680b = obj;
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
