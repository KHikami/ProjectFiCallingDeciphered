package p000;

public final class ndk extends nyx<ndk> {
    public Long f29562a;
    public ndl[] f29563b;

    public /* synthetic */ nzf m34427a(nyt nyt) {
        return m34426b(nyt);
    }

    public ndk() {
        this.f29562a = null;
        this.f29563b = ndl.m34431d();
        this.cachedSize = -1;
    }

    public void m34428a(nyu nyu) {
        if (this.f29562a != null) {
            nyu.m37181b(1, this.f29562a.longValue());
        }
        if (this.f29563b != null && this.f29563b.length > 0) {
            for (nzf nzf : this.f29563b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34429b() {
        int b = super.b();
        if (this.f29562a != null) {
            b += nyu.m37148f(1, this.f29562a.longValue());
        }
        if (this.f29563b == null || this.f29563b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29563b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private ndk m34426b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29562a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29563b == null) {
                        a = 0;
                    } else {
                        a = this.f29563b.length;
                    }
                    Object obj = new ndl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29563b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ndl();
                    nyt.m37101a(obj[a]);
                    this.f29563b = obj;
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
