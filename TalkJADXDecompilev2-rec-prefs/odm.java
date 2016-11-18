package p000;

public final class odm extends nyx<odm> {
    public odr[] f32431a;
    public Long f32432b;
    public odl f32433c;
    public int f32434d;
    public odn f32435e;
    public odo f32436f;

    public /* synthetic */ nzf m37870a(nyt nyt) {
        return m37869b(nyt);
    }

    public odm() {
        this.f32431a = odr.m37890d();
        this.f32432b = null;
        this.f32434d = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37871a(nyu nyu) {
        if (this.f32431a != null && this.f32431a.length > 0) {
            for (nzf nzf : this.f32431a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f32432b != null) {
            nyu.m37181b(2, this.f32432b.longValue());
        }
        if (this.f32433c != null) {
            nyu.m37182b(3, this.f32433c);
        }
        if (this.f32434d != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f32434d);
        }
        if (this.f32436f != null) {
            nyu.m37182b(5, this.f32436f);
        }
        if (this.f32435e != null) {
            nyu.m37182b(6, this.f32435e);
        }
        super.a(nyu);
    }

    protected int m37872b() {
        int b = super.b();
        if (this.f32431a != null && this.f32431a.length > 0) {
            for (nzf nzf : this.f32431a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f32432b != null) {
            b += nyu.m37148f(2, this.f32432b.longValue());
        }
        if (this.f32433c != null) {
            b += nyu.m37145d(3, this.f32433c);
        }
        if (this.f32434d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f32434d);
        }
        if (this.f32436f != null) {
            b += nyu.m37145d(5, this.f32436f);
        }
        if (this.f32435e != null) {
            return b + nyu.m37145d(6, this.f32435e);
        }
        return b;
    }

    private odm m37869b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32431a == null) {
                        a = 0;
                    } else {
                        a = this.f32431a.length;
                    }
                    Object obj = new odr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32431a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odr();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odr();
                    nyt.m37101a(obj[a]);
                    this.f32431a = obj;
                    continue;
                case 16:
                    this.f32432b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f32433c == null) {
                        this.f32433c = new odl();
                    }
                    nyt.m37101a(this.f32433c);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f32434d = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f32436f == null) {
                        this.f32436f = new odo();
                    }
                    nyt.m37101a(this.f32436f);
                    continue;
                case 50:
                    if (this.f32435e == null) {
                        this.f32435e = new odn();
                    }
                    nyt.m37101a(this.f32435e);
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
