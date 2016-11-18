package p000;

public final class kkk extends nyx<kkk> {
    private static volatile kkk[] f22053c;
    public klk f22054a;
    public String f22055b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26245b(nyt);
    }

    public static kkk[] m26246d() {
        if (f22053c == null) {
            synchronized (nzc.c) {
                if (f22053c == null) {
                    f22053c = new kkk[0];
                }
            }
        }
        return f22053c;
    }

    public kkk() {
        m26247g();
    }

    private kkk m26247g() {
        this.f22054a = null;
        this.f22055b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22054a != null) {
            nyu.b(1, this.f22054a);
        }
        if (this.f22055b != null) {
            nyu.a(2, this.f22055b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22054a != null) {
            b += nyu.d(1, this.f22054a);
        }
        if (this.f22055b != null) {
            return b + nyu.b(2, this.f22055b);
        }
        return b;
    }

    private kkk m26245b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22054a == null) {
                        this.f22054a = new klk();
                    }
                    nyt.a(this.f22054a);
                    continue;
                case wi.dH /*18*/:
                    this.f22055b = nyt.j();
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
