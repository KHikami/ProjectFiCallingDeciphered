package p000;

public final class nei extends nyx<nei> {
    public Long f29608a;
    public nej[] f29609b;

    public /* synthetic */ nzf m34547a(nyt nyt) {
        return m34545b(nyt);
    }

    public nei() {
        m34546d();
    }

    private nei m34546d() {
        this.f29608a = null;
        this.f29609b = nej.m34551d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34548a(nyu nyu) {
        if (this.f29608a != null) {
            nyu.m37181b(1, this.f29608a.longValue());
        }
        if (this.f29609b != null && this.f29609b.length > 0) {
            for (nzf nzf : this.f29609b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34549b() {
        int b = super.b();
        if (this.f29608a != null) {
            b += nyu.m37148f(1, this.f29608a.longValue());
        }
        if (this.f29609b == null || this.f29609b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29609b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nei m34545b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29608a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29609b == null) {
                        a = 0;
                    } else {
                        a = this.f29609b.length;
                    }
                    Object obj = new nej[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29609b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nej();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nej();
                    nyt.m37101a(obj[a]);
                    this.f29609b = obj;
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
