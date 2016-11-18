package p000;

public final class ngb extends nyx<ngb> {
    public String f29754a;
    public Integer f29755b;
    public ngc[] f29756c;

    public /* synthetic */ nzf m34778a(nyt nyt) {
        return m34776b(nyt);
    }

    public ngb() {
        m34777d();
    }

    private ngb m34777d() {
        this.f29754a = null;
        this.f29756c = ngc.m34782d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34779a(nyu nyu) {
        if (this.f29754a != null) {
            nyu.m37170a(1, this.f29754a);
        }
        if (this.f29755b != null) {
            nyu.m37168a(2, this.f29755b.intValue());
        }
        if (this.f29756c != null && this.f29756c.length > 0) {
            for (nzf nzf : this.f29756c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34780b() {
        int b = super.b();
        if (this.f29754a != null) {
            b += nyu.m37137b(1, this.f29754a);
        }
        if (this.f29755b != null) {
            b += nyu.m37147f(2, this.f29755b.intValue());
        }
        if (this.f29756c == null || this.f29756c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29756c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private ngb m34776b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29754a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f29755b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29756c == null) {
                        a = 0;
                    } else {
                        a = this.f29756c.length;
                    }
                    Object obj = new ngc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29756c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ngc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ngc();
                    nyt.m37101a(obj[a]);
                    this.f29756c = obj;
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
