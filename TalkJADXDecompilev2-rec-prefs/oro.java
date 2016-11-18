package p000;

public final class oro extends nyx<oro> {
    public String f34052a;
    public Integer f34053b;
    public orp[] f34054c;

    public /* synthetic */ nzf m39456a(nyt nyt) {
        return m39454b(nyt);
    }

    public oro() {
        m39455d();
    }

    private oro m39455d() {
        this.f34052a = null;
        this.f34053b = null;
        this.f34054c = orp.m39460d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39457a(nyu nyu) {
        if (this.f34052a != null) {
            nyu.m37170a(1, this.f34052a);
        }
        if (this.f34053b != null) {
            nyu.m37168a(2, this.f34053b.intValue());
        }
        if (this.f34054c != null && this.f34054c.length > 0) {
            for (nzf nzf : this.f34054c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39458b() {
        int b = super.b();
        if (this.f34052a != null) {
            b += nyu.m37137b(1, this.f34052a);
        }
        if (this.f34053b != null) {
            b += nyu.m37147f(2, this.f34053b.intValue());
        }
        if (this.f34054c == null || this.f34054c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f34054c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private oro m39454b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34052a = nyt.m37117j();
                    continue;
                case 16:
                    this.f34053b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f34054c == null) {
                        a = 0;
                    } else {
                        a = this.f34054c.length;
                    }
                    Object obj = new orp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34054c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orp();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orp();
                    nyt.m37101a(obj[a]);
                    this.f34054c = obj;
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
