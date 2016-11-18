package p000;

public final class nag extends nyx<nag> {
    public Long f29352a;
    public oyq[] f29353b;
    public nus f29354c;

    public /* synthetic */ nzf m34036a(nyt nyt) {
        return m34034b(nyt);
    }

    public nag() {
        m34035d();
    }

    private nag m34035d() {
        this.f29352a = null;
        this.f29353b = oyq.m39946d();
        this.f29354c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34037a(nyu nyu) {
        if (this.f29352a != null) {
            nyu.m37181b(1, this.f29352a.longValue());
        }
        if (this.f29353b != null && this.f29353b.length > 0) {
            for (nzf nzf : this.f29353b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f29354c != null) {
            nyu.m37182b(3, this.f29354c);
        }
        super.a(nyu);
    }

    protected int m34038b() {
        int b = super.b();
        if (this.f29352a != null) {
            b += nyu.m37148f(1, this.f29352a.longValue());
        }
        if (this.f29353b != null && this.f29353b.length > 0) {
            int i = b;
            for (nzf nzf : this.f29353b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f29354c != null) {
            return b + nyu.m37145d(3, this.f29354c);
        }
        return b;
    }

    private nag m34034b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29352a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29353b == null) {
                        a = 0;
                    } else {
                        a = this.f29353b.length;
                    }
                    Object obj = new oyq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29353b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oyq();
                    nyt.m37101a(obj[a]);
                    this.f29353b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f29354c == null) {
                        this.f29354c = new nus();
                    }
                    nyt.m37101a(this.f29354c);
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
