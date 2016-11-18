package p000;

public final class muu extends nyx<muu> {
    private static volatile muu[] f28410c;
    public String f28411a;
    public muv f28412b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33009b(nyt);
    }

    public static muu[] m33010d() {
        if (f28410c == null) {
            synchronized (nzc.c) {
                if (f28410c == null) {
                    f28410c = new muu[0];
                }
            }
        }
        return f28410c;
    }

    public muu() {
        m33011g();
    }

    private muu m33011g() {
        this.f28411a = null;
        this.f28412b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28411a != null) {
            nyu.a(1, this.f28411a);
        }
        if (this.f28412b != null) {
            nyu.b(2, this.f28412b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28411a != null) {
            b += nyu.b(1, this.f28411a);
        }
        if (this.f28412b != null) {
            return b + nyu.d(2, this.f28412b);
        }
        return b;
    }

    private muu m33009b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28411a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f28412b == null) {
                        this.f28412b = new muv();
                    }
                    nyt.a(this.f28412b);
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
