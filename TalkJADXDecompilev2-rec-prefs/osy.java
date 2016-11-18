package p000;

public final class osy extends nyx<osy> {
    private static volatile osy[] f34211f;
    public String f34212a;
    public String f34213b;
    public String f34214c;
    public Boolean f34215d;
    public String f34216e;

    public /* synthetic */ nzf m39648a(nyt nyt) {
        return m39645b(nyt);
    }

    public static osy[] m39646d() {
        if (f34211f == null) {
            synchronized (nzc.f31309c) {
                if (f34211f == null) {
                    f34211f = new osy[0];
                }
            }
        }
        return f34211f;
    }

    public osy() {
        m39647g();
    }

    private osy m39647g() {
        this.f34212a = null;
        this.f34213b = null;
        this.f34214c = null;
        this.f34215d = null;
        this.f34216e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39649a(nyu nyu) {
        if (this.f34212a != null) {
            nyu.m37170a(1, this.f34212a);
        }
        if (this.f34213b != null) {
            nyu.m37170a(2, this.f34213b);
        }
        if (this.f34214c != null) {
            nyu.m37170a(3, this.f34214c);
        }
        if (this.f34215d != null) {
            nyu.m37172a(4, this.f34215d.booleanValue());
        }
        if (this.f34216e != null) {
            nyu.m37170a(5, this.f34216e);
        }
        super.a(nyu);
    }

    protected int m39650b() {
        int b = super.b();
        if (this.f34212a != null) {
            b += nyu.m37137b(1, this.f34212a);
        }
        if (this.f34213b != null) {
            b += nyu.m37137b(2, this.f34213b);
        }
        if (this.f34214c != null) {
            b += nyu.m37137b(3, this.f34214c);
        }
        if (this.f34215d != null) {
            this.f34215d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f34216e != null) {
            return b + nyu.m37137b(5, this.f34216e);
        }
        return b;
    }

    private osy m39645b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34212a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34213b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34214c = nyt.m37117j();
                    continue;
                case 32:
                    this.f34215d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    this.f34216e = nyt.m37117j();
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
