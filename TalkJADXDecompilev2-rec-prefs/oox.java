package p000;

public final class oox extends nyx<oox> {
    private static volatile oox[] f33503f;
    public oqu f33504a;
    public String f33505b;
    public String f33506c;
    public String f33507d;
    public Integer f33508e;

    public /* synthetic */ nzf m38981a(nyt nyt) {
        return m38978b(nyt);
    }

    public static oox[] m38979d() {
        if (f33503f == null) {
            synchronized (nzc.f31309c) {
                if (f33503f == null) {
                    f33503f = new oox[0];
                }
            }
        }
        return f33503f;
    }

    public oox() {
        m38980g();
    }

    private oox m38980g() {
        this.f33504a = null;
        this.f33505b = null;
        this.f33506c = null;
        this.f33507d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38982a(nyu nyu) {
        if (this.f33504a != null) {
            nyu.m37182b(1, this.f33504a);
        }
        if (this.f33505b != null) {
            nyu.m37170a(2, this.f33505b);
        }
        if (this.f33506c != null) {
            nyu.m37170a(3, this.f33506c);
        }
        if (this.f33507d != null) {
            nyu.m37170a(4, this.f33507d);
        }
        if (this.f33508e != null) {
            nyu.m37168a(5, this.f33508e.intValue());
        }
        super.a(nyu);
    }

    protected int m38983b() {
        int b = super.b();
        if (this.f33504a != null) {
            b += nyu.m37145d(1, this.f33504a);
        }
        if (this.f33505b != null) {
            b += nyu.m37137b(2, this.f33505b);
        }
        if (this.f33506c != null) {
            b += nyu.m37137b(3, this.f33506c);
        }
        if (this.f33507d != null) {
            b += nyu.m37137b(4, this.f33507d);
        }
        if (this.f33508e != null) {
            return b + nyu.m37147f(5, this.f33508e.intValue());
        }
        return b;
    }

    private oox m38978b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33504a == null) {
                        this.f33504a = new oqu();
                    }
                    nyt.m37101a(this.f33504a);
                    continue;
                case wi.dH /*18*/:
                    this.f33505b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33506c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33507d = nyt.m37117j();
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f33508e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
