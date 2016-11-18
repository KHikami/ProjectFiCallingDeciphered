package p000;

public final class lqw extends nyx<lqw> {
    private static volatile lqw[] f26181c;
    public lqv f26182a;
    public Boolean f26183b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30109b(nyt);
    }

    public static lqw[] m30110d() {
        if (f26181c == null) {
            synchronized (nzc.c) {
                if (f26181c == null) {
                    f26181c = new lqw[0];
                }
            }
        }
        return f26181c;
    }

    public lqw() {
        m30111g();
    }

    private lqw m30111g() {
        this.f26182a = null;
        this.f26183b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26182a != null) {
            nyu.b(1, this.f26182a);
        }
        if (this.f26183b != null) {
            nyu.a(2, this.f26183b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26182a != null) {
            b += nyu.d(1, this.f26182a);
        }
        if (this.f26183b == null) {
            return b;
        }
        this.f26183b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private lqw m30109b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26182a == null) {
                        this.f26182a = new lqv();
                    }
                    nyt.a(this.f26182a);
                    continue;
                case 16:
                    this.f26183b = Boolean.valueOf(nyt.i());
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
