package p000;

public final class nak extends nyx<nak> {
    public nam[] f29364a;
    public nal[] f29365b;

    public /* synthetic */ nzf m34055a(nyt nyt) {
        return m34053b(nyt);
    }

    public nak() {
        m34054d();
    }

    private nak m34054d() {
        this.f29364a = nam.m34065d();
        this.f29365b = nal.m34059d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34056a(nyu nyu) {
        int i = 0;
        if (this.f29364a != null && this.f29364a.length > 0) {
            for (nzf nzf : this.f29364a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29365b != null && this.f29365b.length > 0) {
            while (i < this.f29365b.length) {
                nzf nzf2 = this.f29365b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m34057b() {
        int i = 0;
        int b = super.b();
        if (this.f29364a != null && this.f29364a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f29364a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f29365b != null && this.f29365b.length > 0) {
            while (i < this.f29365b.length) {
                nzf nzf2 = this.f29365b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private nak m34053b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29364a == null) {
                        a = 0;
                    } else {
                        a = this.f29364a.length;
                    }
                    obj = new nam[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29364a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nam();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nam();
                    nyt.m37101a(obj[a]);
                    this.f29364a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29365b == null) {
                        a = 0;
                    } else {
                        a = this.f29365b.length;
                    }
                    obj = new nal[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29365b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nal();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nal();
                    nyt.m37101a(obj[a]);
                    this.f29365b = obj;
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
