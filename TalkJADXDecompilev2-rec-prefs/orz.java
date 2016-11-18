package p000;

public final class orz extends nyx<orz> {
    public oso f34099a;
    public ory[] f34100b;
    public oqu f34101c;
    public osd f34102d;
    public orc f34103e;

    public /* synthetic */ nzf m39516a(nyt nyt) {
        return m39514b(nyt);
    }

    public orz() {
        m39515d();
    }

    private orz m39515d() {
        this.f34099a = null;
        this.f34100b = ory.m39509d();
        this.f34101c = null;
        this.f34102d = null;
        this.f34103e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39517a(nyu nyu) {
        if (this.f34099a != null) {
            nyu.m37182b(1, this.f34099a);
        }
        if (this.f34100b != null && this.f34100b.length > 0) {
            for (nzf nzf : this.f34100b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34101c != null) {
            nyu.m37182b(3, this.f34101c);
        }
        if (this.f34102d != null) {
            nyu.m37182b(4, this.f34102d);
        }
        if (this.f34103e != null) {
            nyu.m37182b(5, this.f34103e);
        }
        super.a(nyu);
    }

    protected int m39518b() {
        int b = super.b();
        if (this.f34099a != null) {
            b += nyu.m37145d(1, this.f34099a);
        }
        if (this.f34100b != null && this.f34100b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34100b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34101c != null) {
            b += nyu.m37145d(3, this.f34101c);
        }
        if (this.f34102d != null) {
            b += nyu.m37145d(4, this.f34102d);
        }
        if (this.f34103e != null) {
            return b + nyu.m37145d(5, this.f34103e);
        }
        return b;
    }

    private orz m39514b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34099a == null) {
                        this.f34099a = new oso();
                    }
                    nyt.m37101a(this.f34099a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34100b == null) {
                        a = 0;
                    } else {
                        a = this.f34100b.length;
                    }
                    Object obj = new ory[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34100b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ory();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ory();
                    nyt.m37101a(obj[a]);
                    this.f34100b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f34101c == null) {
                        this.f34101c = new oqu();
                    }
                    nyt.m37101a(this.f34101c);
                    continue;
                case 34:
                    if (this.f34102d == null) {
                        this.f34102d = new osd();
                    }
                    nyt.m37101a(this.f34102d);
                    continue;
                case 42:
                    if (this.f34103e == null) {
                        this.f34103e = new orc();
                    }
                    nyt.m37101a(this.f34103e);
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
