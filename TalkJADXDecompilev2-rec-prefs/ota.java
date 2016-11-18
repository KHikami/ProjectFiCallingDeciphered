package p000;

public final class ota extends nyx<ota> {
    private static volatile ota[] f34220g;
    public int f34221a;
    public String f34222b;
    public boolean f34223c;
    public String f34224d;
    public String f34225e;
    public String f34226f;

    public /* synthetic */ nzf m39658a(nyt nyt) {
        return m39656b(nyt);
    }

    public static ota[] m39657d() {
        if (f34220g == null) {
            synchronized (nzc.f31309c) {
                if (f34220g == null) {
                    f34220g = new ota[0];
                }
            }
        }
        return f34220g;
    }

    public ota() {
        this.f34221a = 0;
        this.f34222b = "";
        this.f34223c = false;
        this.f34224d = "";
        this.f34225e = "";
        this.f34226f = "";
        this.cachedSize = -1;
    }

    public void m39659a(nyu nyu) {
        if (this.f34221a != 0) {
            nyu.m37168a(1, this.f34221a);
        }
        if (!(this.f34222b == null || this.f34222b.equals(""))) {
            nyu.m37170a(2, this.f34222b);
        }
        if (!(this.f34224d == null || this.f34224d.equals(""))) {
            nyu.m37170a(3, this.f34224d);
        }
        if (!(this.f34225e == null || this.f34225e.equals(""))) {
            nyu.m37170a(4, this.f34225e);
        }
        if (!(this.f34226f == null || this.f34226f.equals(""))) {
            nyu.m37170a(5, this.f34226f);
        }
        if (this.f34223c) {
            nyu.m37172a(6, this.f34223c);
        }
        super.a(nyu);
    }

    protected int m39660b() {
        int b = super.b();
        if (this.f34221a != 0) {
            b += nyu.m37147f(1, this.f34221a);
        }
        if (!(this.f34222b == null || this.f34222b.equals(""))) {
            b += nyu.m37137b(2, this.f34222b);
        }
        if (!(this.f34224d == null || this.f34224d.equals(""))) {
            b += nyu.m37137b(3, this.f34224d);
        }
        if (!(this.f34225e == null || this.f34225e.equals(""))) {
            b += nyu.m37137b(4, this.f34225e);
        }
        if (!(this.f34226f == null || this.f34226f.equals(""))) {
            b += nyu.m37137b(5, this.f34226f);
        }
        if (!this.f34223c) {
            return b;
        }
        boolean z = this.f34223c;
        return b + (nyu.m37154h(6) + 1);
    }

    private ota m39656b(nyt nyt) {
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
                            this.f34221a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f34222b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34224d = nyt.m37117j();
                    continue;
                case 34:
                    this.f34225e = nyt.m37117j();
                    continue;
                case 42:
                    this.f34226f = nyt.m37117j();
                    continue;
                case 48:
                    this.f34223c = nyt.m37116i();
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
