package p000;

public final class nin extends nyx<nin> {
    public Integer f29897a;
    public nil[] f29898b;
    public String f29899c;

    public /* synthetic */ nzf m35116a(nyt nyt) {
        return m35114b(nyt);
    }

    public nin() {
        m35115d();
    }

    private nin m35115d() {
        this.f29897a = null;
        this.f29898b = nil.m35104d();
        this.f29899c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35117a(nyu nyu) {
        if (this.f29897a != null) {
            nyu.m37168a(1, this.f29897a.intValue());
        }
        if (this.f29898b != null && this.f29898b.length > 0) {
            for (nzf nzf : this.f29898b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f29899c != null) {
            nyu.m37170a(3, this.f29899c);
        }
        super.a(nyu);
    }

    protected int m35118b() {
        int b = super.b();
        if (this.f29897a != null) {
            b += nyu.m37147f(1, this.f29897a.intValue());
        }
        if (this.f29898b != null && this.f29898b.length > 0) {
            int i = b;
            for (nzf nzf : this.f29898b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f29899c != null) {
            return b + nyu.m37137b(3, this.f29899c);
        }
        return b;
    }

    private nin m35114b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29897a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29898b == null) {
                        a = 0;
                    } else {
                        a = this.f29898b.length;
                    }
                    Object obj = new nil[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29898b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nil();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nil();
                    nyt.m37101a(obj[a]);
                    this.f29898b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f29899c = nyt.m37117j();
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
