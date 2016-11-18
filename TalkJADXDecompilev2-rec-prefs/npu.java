package p000;

public final class npu extends nyx<npu> {
    private static volatile npu[] f30451h;
    public Integer f30452a;
    public npw f30453b;
    public String f30454c;
    public String f30455d;
    public nlz f30456e;
    public nqa f30457f;
    public Integer f30458g;

    public /* synthetic */ nzf m36082a(nyt nyt) {
        return m36079b(nyt);
    }

    public static npu[] m36080d() {
        if (f30451h == null) {
            synchronized (nzc.f31309c) {
                if (f30451h == null) {
                    f30451h = new npu[0];
                }
            }
        }
        return f30451h;
    }

    public npu() {
        m36081g();
    }

    private npu m36081g() {
        this.f30453b = null;
        this.f30454c = null;
        this.f30455d = null;
        this.f30456e = null;
        this.f30457f = null;
        this.f30458g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36083a(nyu nyu) {
        if (this.f30452a != null) {
            nyu.m37168a(1, this.f30452a.intValue());
        }
        if (this.f30453b != null) {
            nyu.m37182b(2, this.f30453b);
        }
        if (this.f30454c != null) {
            nyu.m37170a(4, this.f30454c);
        }
        if (this.f30455d != null) {
            nyu.m37170a(5, this.f30455d);
        }
        if (this.f30456e != null) {
            nyu.m37182b(6, this.f30456e);
        }
        if (this.f30457f != null) {
            nyu.m37182b(7, this.f30457f);
        }
        if (this.f30458g != null) {
            nyu.m37168a(8, this.f30458g.intValue());
        }
        super.a(nyu);
    }

    protected int m36084b() {
        int b = super.b();
        if (this.f30452a != null) {
            b += nyu.m37147f(1, this.f30452a.intValue());
        }
        if (this.f30453b != null) {
            b += nyu.m37145d(2, this.f30453b);
        }
        if (this.f30454c != null) {
            b += nyu.m37137b(4, this.f30454c);
        }
        if (this.f30455d != null) {
            b += nyu.m37137b(5, this.f30455d);
        }
        if (this.f30456e != null) {
            b += nyu.m37145d(6, this.f30456e);
        }
        if (this.f30457f != null) {
            b += nyu.m37145d(7, this.f30457f);
        }
        if (this.f30458g != null) {
            return b + nyu.m37147f(8, this.f30458g.intValue());
        }
        return b;
    }

    private npu m36079b(nyt nyt) {
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
                        case 5:
                        case 6:
                            this.f30452a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30453b == null) {
                        this.f30453b = new npw();
                    }
                    nyt.m37101a(this.f30453b);
                    continue;
                case 34:
                    this.f30454c = nyt.m37117j();
                    continue;
                case 42:
                    this.f30455d = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f30456e == null) {
                        this.f30456e = new nlz();
                    }
                    nyt.m37101a(this.f30456e);
                    continue;
                case 58:
                    if (this.f30457f == null) {
                        this.f30457f = new nqa();
                    }
                    nyt.m37101a(this.f30457f);
                    continue;
                case 64:
                    this.f30458g = Integer.valueOf(nyt.m37112f());
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
