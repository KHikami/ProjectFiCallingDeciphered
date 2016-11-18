package p000;

public final class nal extends nyx<nal> {
    private static volatile nal[] f29366d;
    public Integer f29367a;
    public Integer f29368b;
    public nam[] f29369c;

    public /* synthetic */ nzf m34061a(nyt nyt) {
        return m34058b(nyt);
    }

    public static nal[] m34059d() {
        if (f29366d == null) {
            synchronized (nzc.f31309c) {
                if (f29366d == null) {
                    f29366d = new nal[0];
                }
            }
        }
        return f29366d;
    }

    public nal() {
        m34060g();
    }

    private nal m34060g() {
        this.f29368b = null;
        this.f29369c = nam.m34065d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34062a(nyu nyu) {
        if (this.f29367a != null) {
            nyu.m37168a(1, this.f29367a.intValue());
        }
        if (this.f29368b != null) {
            nyu.m37168a(2, this.f29368b.intValue());
        }
        if (this.f29369c != null && this.f29369c.length > 0) {
            for (nzf nzf : this.f29369c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34063b() {
        int b = super.b();
        if (this.f29367a != null) {
            b += nyu.m37147f(1, this.f29367a.intValue());
        }
        if (this.f29368b != null) {
            b += nyu.m37147f(2, this.f29368b.intValue());
        }
        if (this.f29369c == null || this.f29369c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29369c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private nal m34058b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29367a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29368b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29369c == null) {
                        a = 0;
                    } else {
                        a = this.f29369c.length;
                    }
                    Object obj = new nam[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29369c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nam();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nam();
                    nyt.m37101a(obj[a]);
                    this.f29369c = obj;
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
