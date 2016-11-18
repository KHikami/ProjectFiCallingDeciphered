package p000;

public final class niz extends nyx<niz> {
    public Integer f29949a;
    public Integer f29950b;
    public Integer f29951c;
    public niw f29952d;
    public niy f29953e;
    public nja f29954f;
    public nix f29955g;

    public /* synthetic */ nzf m35178a(nyt nyt) {
        return m35176b(nyt);
    }

    public niz() {
        m35177d();
    }

    private niz m35177d() {
        this.f29949a = null;
        this.f29950b = null;
        this.f29952d = null;
        this.f29953e = null;
        this.f29954f = null;
        this.f29955g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35179a(nyu nyu) {
        if (this.f29949a != null) {
            nyu.m37168a(1, this.f29949a.intValue());
        }
        if (this.f29950b != null) {
            nyu.m37168a(2, this.f29950b.intValue());
        }
        if (this.f29951c != null) {
            nyu.m37168a(3, this.f29951c.intValue());
        }
        if (this.f29952d != null) {
            nyu.m37182b(4, this.f29952d);
        }
        if (this.f29953e != null) {
            nyu.m37182b(5, this.f29953e);
        }
        if (this.f29954f != null) {
            nyu.m37182b(6, this.f29954f);
        }
        if (this.f29955g != null) {
            nyu.m37182b(7, this.f29955g);
        }
        super.a(nyu);
    }

    protected int m35180b() {
        int b = super.b();
        if (this.f29949a != null) {
            b += nyu.m37147f(1, this.f29949a.intValue());
        }
        if (this.f29950b != null) {
            b += nyu.m37147f(2, this.f29950b.intValue());
        }
        if (this.f29951c != null) {
            b += nyu.m37147f(3, this.f29951c.intValue());
        }
        if (this.f29952d != null) {
            b += nyu.m37145d(4, this.f29952d);
        }
        if (this.f29953e != null) {
            b += nyu.m37145d(5, this.f29953e);
        }
        if (this.f29954f != null) {
            b += nyu.m37145d(6, this.f29954f);
        }
        if (this.f29955g != null) {
            return b + nyu.m37145d(7, this.f29955g);
        }
        return b;
    }

    private niz m35176b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29949a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29950b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f29951c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f29952d == null) {
                        this.f29952d = new niw();
                    }
                    nyt.m37101a(this.f29952d);
                    continue;
                case 42:
                    if (this.f29953e == null) {
                        this.f29953e = new niy();
                    }
                    nyt.m37101a(this.f29953e);
                    continue;
                case 50:
                    if (this.f29954f == null) {
                        this.f29954f = new nja();
                    }
                    nyt.m37101a(this.f29954f);
                    continue;
                case 58:
                    if (this.f29955g == null) {
                        this.f29955g = new nix();
                    }
                    nyt.m37101a(this.f29955g);
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
