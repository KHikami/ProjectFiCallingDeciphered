package p000;

public final class lsi extends nyx<lsi> {
    private static volatile lsi[] f26322d;
    public lsl f26323a;
    public lsj f26324b;
    public lsk f26325c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30308b(nyt);
    }

    public static lsi[] m30309d() {
        if (f26322d == null) {
            synchronized (nzc.c) {
                if (f26322d == null) {
                    f26322d = new lsi[0];
                }
            }
        }
        return f26322d;
    }

    public lsi() {
        m30310g();
    }

    private lsi m30310g() {
        this.f26323a = null;
        this.f26324b = null;
        this.f26325c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26323a != null) {
            nyu.b(1, this.f26323a);
        }
        if (this.f26324b != null) {
            nyu.b(2, this.f26324b);
        }
        if (this.f26325c != null) {
            nyu.b(3, this.f26325c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26323a != null) {
            b += nyu.d(1, this.f26323a);
        }
        if (this.f26324b != null) {
            b += nyu.d(2, this.f26324b);
        }
        if (this.f26325c != null) {
            return b + nyu.d(3, this.f26325c);
        }
        return b;
    }

    private lsi m30308b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26323a == null) {
                        this.f26323a = new lsl();
                    }
                    nyt.a(this.f26323a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26324b == null) {
                        this.f26324b = new lsj();
                    }
                    nyt.a(this.f26324b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26325c == null) {
                        this.f26325c = new lsk();
                    }
                    nyt.a(this.f26325c);
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
