package p000;

public final class nah extends nyx<nah> {
    public naj[] f29355a;
    public nai[] f29356b;

    public /* synthetic */ nzf m34040a(nyt nyt) {
        return m34039b(nyt);
    }

    public nah() {
        this.f29355a = naj.m34049d();
        this.f29356b = nai.m34044d();
        this.cachedSize = -1;
    }

    public void m34041a(nyu nyu) {
        int i = 0;
        if (this.f29355a != null && this.f29355a.length > 0) {
            for (nzf nzf : this.f29355a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29356b != null && this.f29356b.length > 0) {
            while (i < this.f29356b.length) {
                nzf nzf2 = this.f29356b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m34042b() {
        int i = 0;
        int b = super.b();
        if (this.f29355a != null && this.f29355a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f29355a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f29356b != null && this.f29356b.length > 0) {
            while (i < this.f29356b.length) {
                nzf nzf2 = this.f29356b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private nah m34039b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29355a == null) {
                        a = 0;
                    } else {
                        a = this.f29355a.length;
                    }
                    obj = new naj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29355a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new naj();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new naj();
                    nyt.m37101a(obj[a]);
                    this.f29355a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29356b == null) {
                        a = 0;
                    } else {
                        a = this.f29356b.length;
                    }
                    obj = new nai[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29356b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nai();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nai();
                    nyt.m37101a(obj[a]);
                    this.f29356b = obj;
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
