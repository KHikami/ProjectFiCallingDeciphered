package p000;

public final class oyl extends nyx<oyl> {
    public oyq[] f34647a;
    public Long f34648b;
    public oyk f34649c;
    public Integer f34650d;
    public oym f34651e;
    public oyn f34652f;

    public /* synthetic */ nzf m39922a(nyt nyt) {
        return m39920b(nyt);
    }

    public oyl() {
        m39921d();
    }

    private oyl m39921d() {
        this.f34647a = oyq.m39946d();
        this.f34648b = null;
        this.f34649c = null;
        this.f34651e = null;
        this.f34652f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39923a(nyu nyu) {
        if (this.f34647a != null && this.f34647a.length > 0) {
            for (nzf nzf : this.f34647a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34648b != null) {
            nyu.m37181b(2, this.f34648b.longValue());
        }
        if (this.f34649c != null) {
            nyu.m37182b(3, this.f34649c);
        }
        if (this.f34650d != null) {
            nyu.m37168a(4, this.f34650d.intValue());
        }
        if (this.f34652f != null) {
            nyu.m37182b(5, this.f34652f);
        }
        if (this.f34651e != null) {
            nyu.m37182b(6, this.f34651e);
        }
        super.a(nyu);
    }

    protected int m39924b() {
        int b = super.b();
        if (this.f34647a != null && this.f34647a.length > 0) {
            for (nzf nzf : this.f34647a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f34648b != null) {
            b += nyu.m37148f(2, this.f34648b.longValue());
        }
        if (this.f34649c != null) {
            b += nyu.m37145d(3, this.f34649c);
        }
        if (this.f34650d != null) {
            b += nyu.m37147f(4, this.f34650d.intValue());
        }
        if (this.f34652f != null) {
            b += nyu.m37145d(5, this.f34652f);
        }
        if (this.f34651e != null) {
            return b + nyu.m37145d(6, this.f34651e);
        }
        return b;
    }

    private oyl m39920b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f34647a == null) {
                        a = 0;
                    } else {
                        a = this.f34647a.length;
                    }
                    Object obj = new oyq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34647a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oyq();
                    nyt.m37101a(obj[a]);
                    this.f34647a = obj;
                    continue;
                case 16:
                    this.f34648b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f34649c == null) {
                        this.f34649c = new oyk();
                    }
                    nyt.m37101a(this.f34649c);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f34650d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f34652f == null) {
                        this.f34652f = new oyn();
                    }
                    nyt.m37101a(this.f34652f);
                    continue;
                case 50:
                    if (this.f34651e == null) {
                        this.f34651e = new oym();
                    }
                    nyt.m37101a(this.f34651e);
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
