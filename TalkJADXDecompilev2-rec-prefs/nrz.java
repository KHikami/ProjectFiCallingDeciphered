package p000;

public final class nrz extends nyx<nrz> {
    public Integer f30634a;
    public Integer f30635b;
    public int f30636c;
    public nru f30637d;
    public nry f30638e;
    public nsd f30639f;
    public nrv f30640g;

    public /* synthetic */ nzf m36325a(nyt nyt) {
        return m36324b(nyt);
    }

    public nrz() {
        this.f30634a = null;
        this.f30635b = null;
        this.f30636c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36326a(nyu nyu) {
        if (this.f30634a != null) {
            nyu.m37168a(1, this.f30634a.intValue());
        }
        if (this.f30635b != null) {
            nyu.m37168a(2, this.f30635b.intValue());
        }
        if (this.f30636c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f30636c);
        }
        if (this.f30637d != null) {
            nyu.m37182b(4, this.f30637d);
        }
        if (this.f30638e != null) {
            nyu.m37182b(5, this.f30638e);
        }
        if (this.f30639f != null) {
            nyu.m37182b(6, this.f30639f);
        }
        if (this.f30640g != null) {
            nyu.m37182b(7, this.f30640g);
        }
        super.a(nyu);
    }

    protected int m36327b() {
        int b = super.b();
        if (this.f30634a != null) {
            b += nyu.m37147f(1, this.f30634a.intValue());
        }
        if (this.f30635b != null) {
            b += nyu.m37147f(2, this.f30635b.intValue());
        }
        if (this.f30636c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f30636c);
        }
        if (this.f30637d != null) {
            b += nyu.m37145d(4, this.f30637d);
        }
        if (this.f30638e != null) {
            b += nyu.m37145d(5, this.f30638e);
        }
        if (this.f30639f != null) {
            b += nyu.m37145d(6, this.f30639f);
        }
        if (this.f30640g != null) {
            return b + nyu.m37145d(7, this.f30640g);
        }
        return b;
    }

    private nrz m36324b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30634a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30635b = Integer.valueOf(nyt.m37112f());
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
                            this.f30636c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f30637d == null) {
                        this.f30637d = new nru();
                    }
                    nyt.m37101a(this.f30637d);
                    continue;
                case 42:
                    if (this.f30638e == null) {
                        this.f30638e = new nry();
                    }
                    nyt.m37101a(this.f30638e);
                    continue;
                case 50:
                    if (this.f30639f == null) {
                        this.f30639f = new nsd();
                    }
                    nyt.m37101a(this.f30639f);
                    continue;
                case 58:
                    if (this.f30640g == null) {
                        this.f30640g = new nrv();
                    }
                    nyt.m37101a(this.f30640g);
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
