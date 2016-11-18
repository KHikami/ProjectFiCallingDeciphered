package p000;

public final class mwa extends nyx<mwa> {
    private static volatile mwa[] f28538a;
    private int f28539b;
    private String f28540c;
    private byte[] f28541d;
    private boolean f28542e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33166b(nyt);
    }

    public static mwa[] m33167d() {
        if (f28538a == null) {
            synchronized (nzc.c) {
                if (f28538a == null) {
                    f28538a = new mwa[0];
                }
            }
        }
        return f28538a;
    }

    public mwa() {
        m33168g();
    }

    private mwa m33168g() {
        this.f28539b = 0;
        this.f28540c = "";
        this.f28541d = nzl.h;
        this.f28542e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if ((this.f28539b & 1) != 0) {
            nyu.a(1, this.f28540c);
        }
        if ((this.f28539b & 2) != 0) {
            nyu.a(2, this.f28541d);
        }
        if ((this.f28539b & 4) != 0) {
            nyu.a(3, this.f28542e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if ((this.f28539b & 1) != 0) {
            b += nyu.b(1, this.f28540c);
        }
        if ((this.f28539b & 2) != 0) {
            b += nyu.b(2, this.f28541d);
        }
        if ((this.f28539b & 4) == 0) {
            return b;
        }
        boolean z = this.f28542e;
        return b + (nyu.h(3) + 1);
    }

    private mwa m33166b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28540c = nyt.j();
                    this.f28539b |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.f28541d = nyt.k();
                    this.f28539b |= 2;
                    continue;
                case wi.dA /*24*/:
                    this.f28542e = nyt.i();
                    this.f28539b |= 4;
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
