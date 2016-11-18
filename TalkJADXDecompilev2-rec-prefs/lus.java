package p000;

public final class lus extends nyx<lus> {
    private static volatile lus[] f26528c;
    public Integer f26529a;
    public Boolean f26530b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30647b(nyt);
    }

    public static lus[] m30648d() {
        if (f26528c == null) {
            synchronized (nzc.c) {
                if (f26528c == null) {
                    f26528c = new lus[0];
                }
            }
        }
        return f26528c;
    }

    public lus() {
        m30649g();
    }

    private lus m30649g() {
        this.f26530b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26529a != null) {
            nyu.a(1, this.f26529a.intValue());
        }
        if (this.f26530b != null) {
            nyu.a(2, this.f26530b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26529a != null) {
            b += nyu.f(1, this.f26529a.intValue());
        }
        if (this.f26530b == null) {
            return b;
        }
        this.f26530b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private lus m30647b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f26529a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26530b = Boolean.valueOf(nyt.i());
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
