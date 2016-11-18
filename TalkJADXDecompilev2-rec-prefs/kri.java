package p000;

public final class kri extends nyx<kri> {
    private static volatile kri[] f22892d;
    public Integer f22893a;
    public kre[] f22894b;
    public Boolean f22895c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27188b(nyt);
    }

    public static kri[] m27189d() {
        if (f22892d == null) {
            synchronized (nzc.c) {
                if (f22892d == null) {
                    f22892d = new kri[0];
                }
            }
        }
        return f22892d;
    }

    public kri() {
        m27190g();
    }

    private kri m27190g() {
        this.f22894b = kre.m27167d();
        this.f22895c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f22893a.intValue());
        if (this.f22894b != null && this.f22894b.length > 0) {
            for (nzf nzf : this.f22894b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f22895c != null) {
            nyu.a(3, this.f22895c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int f = nyu.f(1, this.f22893a.intValue()) + super.mo147b();
        if (this.f22894b != null && this.f22894b.length > 0) {
            for (nzf nzf : this.f22894b) {
                if (nzf != null) {
                    f += nyu.d(2, nzf);
                }
            }
        }
        if (this.f22895c == null) {
            return f;
        }
        this.f22895c.booleanValue();
        return f + (nyu.h(3) + 1);
    }

    private kri m27188b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22893a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22894b == null) {
                        a = 0;
                    } else {
                        a = this.f22894b.length;
                    }
                    Object obj = new kre[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22894b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kre();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kre();
                    nyt.a(obj[a]);
                    this.f22894b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f22895c = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
