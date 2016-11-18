package p000;

public final class lxf extends nyx<lxf> {
    private static volatile lxf[] f26751c;
    public ltr f26752a;
    public Long f26753b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30981b(nyt);
    }

    public static lxf[] m30982d() {
        if (f26751c == null) {
            synchronized (nzc.c) {
                if (f26751c == null) {
                    f26751c = new lxf[0];
                }
            }
        }
        return f26751c;
    }

    public lxf() {
        m30983g();
    }

    private lxf m30983g() {
        this.f26752a = null;
        this.f26753b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26752a != null) {
            nyu.b(1, this.f26752a);
        }
        if (this.f26753b != null) {
            nyu.a(2, this.f26753b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26752a != null) {
            b += nyu.d(1, this.f26752a);
        }
        if (this.f26753b != null) {
            return b + nyu.e(2, this.f26753b.longValue());
        }
        return b;
    }

    private lxf m30981b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26752a == null) {
                        this.f26752a = new ltr();
                    }
                    nyt.a(this.f26752a);
                    continue;
                case 16:
                    this.f26753b = Long.valueOf(nyt.d());
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
