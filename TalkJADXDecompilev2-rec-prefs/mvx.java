package p000;

public final class mvx extends nyx<mvx> {
    private static volatile mvx[] f28526c;
    public String f28527a;
    public String f28528b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33150b(nyt);
    }

    public static mvx[] m33151d() {
        if (f28526c == null) {
            synchronized (nzc.c) {
                if (f28526c == null) {
                    f28526c = new mvx[0];
                }
            }
        }
        return f28526c;
    }

    public mvx() {
        m33152g();
    }

    private mvx m33152g() {
        this.f28527a = "";
        this.f28528b = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28527a == null || this.f28527a.equals(""))) {
            nyu.a(1, this.f28527a);
        }
        if (!(this.f28528b == null || this.f28528b.equals(""))) {
            nyu.a(2, this.f28528b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28527a == null || this.f28527a.equals(""))) {
            b += nyu.b(1, this.f28527a);
        }
        if (this.f28528b == null || this.f28528b.equals("")) {
            return b;
        }
        return b + nyu.b(2, this.f28528b);
    }

    private mvx m33150b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28527a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28528b = nyt.j();
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
