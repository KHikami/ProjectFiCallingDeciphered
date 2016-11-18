package p000;

public final class mwe extends nyx<mwe> {
    private static volatile mwe[] f28547b;
    public mwd f28548a;
    private int f28549c;
    private String f28550d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33185b(nyt);
    }

    public static mwe[] m33186d() {
        if (f28547b == null) {
            synchronized (nzc.c) {
                if (f28547b == null) {
                    f28547b = new mwe[0];
                }
            }
        }
        return f28547b;
    }

    public mwe() {
        m33187g();
    }

    private mwe m33187g() {
        this.f28549c = 0;
        this.f28550d = "";
        this.f28548a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28548a != null) {
            nyu.b(2, this.f28548a);
        }
        if ((this.f28549c & 1) != 0) {
            nyu.a(3, this.f28550d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28548a != null) {
            b += nyu.d(2, this.f28548a);
        }
        if ((this.f28549c & 1) != 0) {
            return b + nyu.b(3, this.f28550d);
        }
        return b;
    }

    private mwe m33185b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f28548a == null) {
                        this.f28548a = new mwd();
                    }
                    nyt.a(this.f28548a);
                    continue;
                case wi.dx /*26*/:
                    this.f28550d = nyt.j();
                    this.f28549c |= 1;
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
