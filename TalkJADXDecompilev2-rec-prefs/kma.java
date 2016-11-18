package p000;

public final class kma extends nyx<kma> {
    private static volatile kma[] f22334c;
    public klk f22335a;
    public String f22336b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26488b(nyt);
    }

    public static kma[] m26489d() {
        if (f22334c == null) {
            synchronized (nzc.c) {
                if (f22334c == null) {
                    f22334c = new kma[0];
                }
            }
        }
        return f22334c;
    }

    public kma() {
        m26490g();
    }

    private kma m26490g() {
        this.f22335a = null;
        this.f22336b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22335a != null) {
            nyu.b(1, this.f22335a);
        }
        if (this.f22336b != null) {
            nyu.a(2, this.f22336b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22335a != null) {
            b += nyu.d(1, this.f22335a);
        }
        if (this.f22336b != null) {
            return b + nyu.b(2, this.f22336b);
        }
        return b;
    }

    private kma m26488b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22335a == null) {
                        this.f22335a = new klk();
                    }
                    nyt.a(this.f22335a);
                    continue;
                case wi.dH /*18*/:
                    this.f22336b = nyt.j();
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
