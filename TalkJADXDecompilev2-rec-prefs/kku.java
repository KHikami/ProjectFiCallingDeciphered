package p000;

public final class kku extends nyx<kku> {
    private static volatile kku[] f22095c;
    public klk f22096a;
    public String f22097b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26303b(nyt);
    }

    public static kku[] m26304d() {
        if (f22095c == null) {
            synchronized (nzc.c) {
                if (f22095c == null) {
                    f22095c = new kku[0];
                }
            }
        }
        return f22095c;
    }

    public kku() {
        m26305g();
    }

    private kku m26305g() {
        this.f22096a = null;
        this.f22097b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22096a != null) {
            nyu.b(1, this.f22096a);
        }
        if (this.f22097b != null) {
            nyu.a(2, this.f22097b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22096a != null) {
            b += nyu.d(1, this.f22096a);
        }
        if (this.f22097b != null) {
            return b + nyu.b(2, this.f22097b);
        }
        return b;
    }

    private kku m26303b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22096a == null) {
                        this.f22096a = new klk();
                    }
                    nyt.a(this.f22096a);
                    continue;
                case wi.dH /*18*/:
                    this.f22097b = nyt.j();
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
