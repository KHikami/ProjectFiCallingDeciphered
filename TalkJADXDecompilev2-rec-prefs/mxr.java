package p000;

public final class mxr extends nyx<mxr> {
    public Integer f29077a;
    public myg f29078b;
    public mxn f29079c;
    public mxd f29080d;
    public Boolean f29081e;

    public /* synthetic */ nzf m33721a(nyt nyt) {
        return m33719b(nyt);
    }

    public mxr() {
        m33720d();
    }

    private mxr m33720d() {
        this.f29078b = null;
        this.f29079c = null;
        this.f29080d = null;
        this.f29081e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33722a(nyu nyu) {
        if (this.f29077a != null) {
            nyu.m37168a(1, this.f29077a.intValue());
        }
        if (this.f29078b != null) {
            nyu.m37182b(2, this.f29078b);
        }
        if (this.f29079c != null) {
            nyu.m37182b(3, this.f29079c);
        }
        if (this.f29080d != null) {
            nyu.m37182b(4, this.f29080d);
        }
        if (this.f29081e != null) {
            nyu.m37172a(5, this.f29081e.booleanValue());
        }
        super.a(nyu);
    }

    protected int m33723b() {
        int b = super.b();
        if (this.f29077a != null) {
            b += nyu.m37147f(1, this.f29077a.intValue());
        }
        if (this.f29078b != null) {
            b += nyu.m37145d(2, this.f29078b);
        }
        if (this.f29079c != null) {
            b += nyu.m37145d(3, this.f29079c);
        }
        if (this.f29080d != null) {
            b += nyu.m37145d(4, this.f29080d);
        }
        if (this.f29081e == null) {
            return b;
        }
        this.f29081e.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private mxr m33719b(nyt nyt) {
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                            this.f29077a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29078b == null) {
                        this.f29078b = new myg();
                    }
                    nyt.m37101a(this.f29078b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29079c == null) {
                        this.f29079c = new mxn();
                    }
                    nyt.m37101a(this.f29079c);
                    continue;
                case 34:
                    if (this.f29080d == null) {
                        this.f29080d = new mxd();
                    }
                    nyt.m37101a(this.f29080d);
                    continue;
                case 40:
                    this.f29081e = Boolean.valueOf(nyt.m37116i());
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
