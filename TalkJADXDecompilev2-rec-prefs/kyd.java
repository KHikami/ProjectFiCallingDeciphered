package p000;

public final class kyd extends nyx<kyd> {
    private static volatile kyd[] f24012c;
    public String f24013a;
    public String f24014b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28038b(nyt);
    }

    public static kyd[] m28039d() {
        if (f24012c == null) {
            synchronized (nzc.c) {
                if (f24012c == null) {
                    f24012c = new kyd[0];
                }
            }
        }
        return f24012c;
    }

    public kyd() {
        m28040g();
    }

    private kyd m28040g() {
        this.f24013a = null;
        this.f24014b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24013a != null) {
            nyu.a(1, this.f24013a);
        }
        if (this.f24014b != null) {
            nyu.a(2, this.f24014b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24013a != null) {
            b += nyu.b(1, this.f24013a);
        }
        if (this.f24014b != null) {
            return b + nyu.b(2, this.f24014b);
        }
        return b;
    }

    private kyd m28038b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24013a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24014b = nyt.j();
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
