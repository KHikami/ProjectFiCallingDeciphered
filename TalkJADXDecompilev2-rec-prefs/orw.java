package p000;

public final class orw extends nyx<orw> {
    public String f34082a;
    public orv[] f34083b;
    public Long f34084c;

    public /* synthetic */ nzf m39500a(nyt nyt) {
        return m39498b(nyt);
    }

    public orw() {
        m39499d();
    }

    private orw m39499d() {
        this.f34082a = null;
        this.f34083b = orv.m39493d();
        this.f34084c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39501a(nyu nyu) {
        if (this.f34082a != null) {
            nyu.m37170a(1, this.f34082a);
        }
        if (this.f34083b != null && this.f34083b.length > 0) {
            for (nzf nzf : this.f34083b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34084c != null) {
            nyu.m37181b(3, this.f34084c.longValue());
        }
        super.a(nyu);
    }

    protected int m39502b() {
        int b = super.b();
        if (this.f34082a != null) {
            b += nyu.m37137b(1, this.f34082a);
        }
        if (this.f34083b != null && this.f34083b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34083b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34084c != null) {
            return b + nyu.m37148f(3, this.f34084c.longValue());
        }
        return b;
    }

    private orw m39498b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34082a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34083b == null) {
                        a = 0;
                    } else {
                        a = this.f34083b.length;
                    }
                    Object obj = new orv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34083b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orv();
                    nyt.m37101a(obj[a]);
                    this.f34083b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f34084c = Long.valueOf(nyt.m37110e());
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
