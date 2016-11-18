package p000;

public final class lov extends nyx<lov> {
    private static volatile lov[] f25943c;
    public lor f25944a;
    public String f25945b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29812b(nyt);
    }

    public static lov[] m29813d() {
        if (f25943c == null) {
            synchronized (nzc.c) {
                if (f25943c == null) {
                    f25943c = new lov[0];
                }
            }
        }
        return f25943c;
    }

    public lov() {
        m29814g();
    }

    private lov m29814g() {
        this.f25944a = null;
        this.f25945b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25944a != null) {
            nyu.b(1, this.f25944a);
        }
        if (this.f25945b != null) {
            nyu.a(2, this.f25945b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25944a != null) {
            b += nyu.d(1, this.f25944a);
        }
        if (this.f25945b != null) {
            return b + nyu.b(2, this.f25945b);
        }
        return b;
    }

    private lov m29812b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25944a == null) {
                        this.f25944a = new lor();
                    }
                    nyt.a(this.f25944a);
                    continue;
                case wi.dH /*18*/:
                    this.f25945b = nyt.j();
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
