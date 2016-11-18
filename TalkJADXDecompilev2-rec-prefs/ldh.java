package p000;

public final class ldh extends nyx<ldh> {
    private static volatile ldh[] f24663e;
    public String f24664a;
    public ldg f24665b;
    public lde f24666c;
    public ldi f24667d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28729b(nyt);
    }

    public static ldh[] m28730d() {
        if (f24663e == null) {
            synchronized (nzc.c) {
                if (f24663e == null) {
                    f24663e = new ldh[0];
                }
            }
        }
        return f24663e;
    }

    public ldh() {
        m28731g();
    }

    private ldh m28731g() {
        this.f24664a = null;
        this.f24665b = null;
        this.f24666c = null;
        this.f24667d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24664a != null) {
            nyu.a(1, this.f24664a);
        }
        if (this.f24666c != null) {
            nyu.b(2, this.f24666c);
        }
        if (this.f24667d != null) {
            nyu.b(3, this.f24667d);
        }
        if (this.f24665b != null) {
            nyu.b(4, this.f24665b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24664a != null) {
            b += nyu.b(1, this.f24664a);
        }
        if (this.f24666c != null) {
            b += nyu.d(2, this.f24666c);
        }
        if (this.f24667d != null) {
            b += nyu.d(3, this.f24667d);
        }
        if (this.f24665b != null) {
            return b + nyu.d(4, this.f24665b);
        }
        return b;
    }

    private ldh m28729b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24664a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f24666c == null) {
                        this.f24666c = new lde();
                    }
                    nyt.a(this.f24666c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f24667d == null) {
                        this.f24667d = new ldi();
                    }
                    nyt.a(this.f24667d);
                    continue;
                case 34:
                    if (this.f24665b == null) {
                        this.f24665b = new ldg();
                    }
                    nyt.a(this.f24665b);
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
