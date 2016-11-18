package p000;

public final class mvs extends nyx<mvs> {
    private static volatile mvs[] f28514c;
    public String f28515a;
    public mvy f28516b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33124b(nyt);
    }

    public static mvs[] m33125d() {
        if (f28514c == null) {
            synchronized (nzc.c) {
                if (f28514c == null) {
                    f28514c = new mvs[0];
                }
            }
        }
        return f28514c;
    }

    public mvs() {
        m33126g();
    }

    private mvs m33126g() {
        this.f28515a = "";
        this.f28516b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28515a == null || this.f28515a.equals(""))) {
            nyu.a(1, this.f28515a);
        }
        if (this.f28516b != null) {
            nyu.b(2, this.f28516b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28515a == null || this.f28515a.equals(""))) {
            b += nyu.b(1, this.f28515a);
        }
        if (this.f28516b != null) {
            return b + nyu.d(2, this.f28516b);
        }
        return b;
    }

    private mvs m33124b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28515a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f28516b == null) {
                        this.f28516b = new mvy();
                    }
                    nyt.a(this.f28516b);
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
