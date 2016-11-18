package p000;

public final class llr extends nyx<llr> {
    private static volatile llr[] f25395g;
    public Integer f25396a;
    public Integer f25397b;
    public lls f25398c;
    public Integer f25399d;
    public Integer f25400e;
    public llt f25401f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29389b(nyt);
    }

    public static llr[] m29390d() {
        if (f25395g == null) {
            synchronized (nzc.c) {
                if (f25395g == null) {
                    f25395g = new llr[0];
                }
            }
        }
        return f25395g;
    }

    public llr() {
        m29391g();
    }

    private llr m29391g() {
        this.f25397b = null;
        this.f25398c = null;
        this.f25401f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25396a != null) {
            nyu.a(1, this.f25396a.intValue());
        }
        if (this.f25397b != null) {
            nyu.a(2, this.f25397b.intValue());
        }
        if (this.f25398c != null) {
            nyu.b(3, this.f25398c);
        }
        if (this.f25399d != null) {
            nyu.a(4, this.f25399d.intValue());
        }
        if (this.f25400e != null) {
            nyu.a(5, this.f25400e.intValue());
        }
        if (this.f25401f != null) {
            nyu.b(6, this.f25401f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25396a != null) {
            b += nyu.f(1, this.f25396a.intValue());
        }
        if (this.f25397b != null) {
            b += nyu.f(2, this.f25397b.intValue());
        }
        if (this.f25398c != null) {
            b += nyu.d(3, this.f25398c);
        }
        if (this.f25399d != null) {
            b += nyu.f(4, this.f25399d.intValue());
        }
        if (this.f25400e != null) {
            b += nyu.f(5, this.f25400e.intValue());
        }
        if (this.f25401f != null) {
            return b + nyu.d(6, this.f25401f);
        }
        return b;
    }

    private llr m29389b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
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
                            this.f25396a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25397b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.f25398c == null) {
                        this.f25398c = new lls();
                    }
                    nyt.a(this.f25398c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f25399d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25400e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f25401f == null) {
                        this.f25401f = new llt();
                    }
                    nyt.a(this.f25401f);
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
