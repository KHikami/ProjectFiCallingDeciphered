package p000;

public final class ltr extends nyx<ltr> {
    private static volatile ltr[] f26401c;
    public String f26402a;
    public String f26403b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30491b(nyt);
    }

    public static ltr[] m30492d() {
        if (f26401c == null) {
            synchronized (nzc.c) {
                if (f26401c == null) {
                    f26401c = new ltr[0];
                }
            }
        }
        return f26401c;
    }

    public ltr() {
        m30493g();
    }

    private ltr m30493g() {
        this.f26402a = null;
        this.f26403b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26403b != null) {
            nyu.a(1, this.f26403b);
        }
        if (this.f26402a != null) {
            nyu.a(2, this.f26402a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26403b != null) {
            b += nyu.b(1, this.f26403b);
        }
        if (this.f26402a != null) {
            return b + nyu.b(2, this.f26402a);
        }
        return b;
    }

    private ltr m30491b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26403b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26402a = nyt.j();
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
