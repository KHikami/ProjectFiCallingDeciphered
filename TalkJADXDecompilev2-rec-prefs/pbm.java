package p000;

public final class pbm extends nyx<pbm> {
    public int f34946a;
    public pbq[] f34947b;
    public pbw f34948c;
    public pbv f34949d;
    public pbp f34950e;
    public Long f34951f;

    public /* synthetic */ nzf m40203a(nyt nyt) {
        return m40202b(nyt);
    }

    public pbm() {
        this.f34946a = nzf.UNSET_ENUM_VALUE;
        this.f34947b = pbq.m40219d();
        this.f34951f = null;
        this.cachedSize = -1;
    }

    public void m40204a(nyu nyu) {
        if (this.f34946a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f34946a);
        }
        if (this.f34947b != null && this.f34947b.length > 0) {
            for (nzf nzf : this.f34947b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34948c != null) {
            nyu.m37182b(3, this.f34948c);
        }
        if (this.f34949d != null) {
            nyu.m37182b(4, this.f34949d);
        }
        if (this.f34950e != null) {
            nyu.m37182b(5, this.f34950e);
        }
        if (this.f34951f != null) {
            nyu.m37181b(6, this.f34951f.longValue());
        }
        super.a(nyu);
    }

    protected int m40205b() {
        int b = super.b();
        if (this.f34946a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f34946a);
        }
        if (this.f34947b != null && this.f34947b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34947b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34948c != null) {
            b += nyu.m37145d(3, this.f34948c);
        }
        if (this.f34949d != null) {
            b += nyu.m37145d(4, this.f34949d);
        }
        if (this.f34950e != null) {
            b += nyu.m37145d(5, this.f34950e);
        }
        if (this.f34951f != null) {
            return b + nyu.m37148f(6, this.f34951f.longValue());
        }
        return b;
    }

    private pbm m40202b(nyt nyt) {
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f34946a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34947b == null) {
                        a = 0;
                    } else {
                        a = this.f34947b.length;
                    }
                    Object obj = new pbq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34947b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new pbq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new pbq();
                    nyt.m37101a(obj[a]);
                    this.f34947b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f34948c == null) {
                        this.f34948c = new pbw();
                    }
                    nyt.m37101a(this.f34948c);
                    continue;
                case 34:
                    if (this.f34949d == null) {
                        this.f34949d = new pbv();
                    }
                    nyt.m37101a(this.f34949d);
                    continue;
                case 42:
                    if (this.f34950e == null) {
                        this.f34950e = new pbp();
                    }
                    nyt.m37101a(this.f34950e);
                    continue;
                case 48:
                    this.f34951f = Long.valueOf(nyt.m37110e());
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
