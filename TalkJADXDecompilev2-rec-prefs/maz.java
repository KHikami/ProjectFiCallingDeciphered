package p000;

public final class maz extends nyx<maz> {
    private static volatile maz[] f27188c;
    public String f27189a;
    public String f27190b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31513b(nyt);
    }

    public static maz[] m31514d() {
        if (f27188c == null) {
            synchronized (nzc.c) {
                if (f27188c == null) {
                    f27188c = new maz[0];
                }
            }
        }
        return f27188c;
    }

    public maz() {
        m31515g();
    }

    private maz m31515g() {
        this.f27189a = null;
        this.f27190b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27189a != null) {
            nyu.a(1, this.f27189a);
        }
        if (this.f27190b != null) {
            nyu.a(2, this.f27190b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27189a != null) {
            b += nyu.b(1, this.f27189a);
        }
        if (this.f27190b != null) {
            return b + nyu.b(2, this.f27190b);
        }
        return b;
    }

    private maz m31513b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27189a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27190b = nyt.j();
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
