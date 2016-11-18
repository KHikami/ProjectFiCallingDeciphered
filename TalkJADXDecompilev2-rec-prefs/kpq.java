package p000;

public final class kpq extends nyx<kpq> {
    private static volatile kpq[] f22683f;
    public String f22684a;
    public String f22685b;
    public kpk f22686c;
    public String f22687d;
    public String f22688e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26952b(nyt);
    }

    public static kpq[] m26953d() {
        if (f22683f == null) {
            synchronized (nzc.c) {
                if (f22683f == null) {
                    f22683f = new kpq[0];
                }
            }
        }
        return f22683f;
    }

    public kpq() {
        m26954g();
    }

    private kpq m26954g() {
        this.f22684a = null;
        this.f22685b = null;
        this.f22686c = null;
        this.f22687d = null;
        this.f22688e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22684a != null) {
            nyu.a(1, this.f22684a);
        }
        if (this.f22685b != null) {
            nyu.a(2, this.f22685b);
        }
        if (this.f22686c != null) {
            nyu.b(3, this.f22686c);
        }
        if (this.f22687d != null) {
            nyu.a(4, this.f22687d);
        }
        if (this.f22688e != null) {
            nyu.a(5, this.f22688e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22684a != null) {
            b += nyu.b(1, this.f22684a);
        }
        if (this.f22685b != null) {
            b += nyu.b(2, this.f22685b);
        }
        if (this.f22686c != null) {
            b += nyu.d(3, this.f22686c);
        }
        if (this.f22687d != null) {
            b += nyu.b(4, this.f22687d);
        }
        if (this.f22688e != null) {
            return b + nyu.b(5, this.f22688e);
        }
        return b;
    }

    private kpq m26952b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22684a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22685b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f22686c == null) {
                        this.f22686c = new kpk();
                    }
                    nyt.a(this.f22686c);
                    continue;
                case 34:
                    this.f22687d = nyt.j();
                    continue;
                case 42:
                    this.f22688e = nyt.j();
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
