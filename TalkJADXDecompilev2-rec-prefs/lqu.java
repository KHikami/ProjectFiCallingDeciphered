package p000;

public final class lqu extends nyx<lqu> {
    private static volatile lqu[] f26174c;
    public Integer f26175a;
    public String f26176b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30097b(nyt);
    }

    public static lqu[] m30098d() {
        if (f26174c == null) {
            synchronized (nzc.c) {
                if (f26174c == null) {
                    f26174c = new lqu[0];
                }
            }
        }
        return f26174c;
    }

    public lqu() {
        m30099g();
    }

    private lqu m30099g() {
        this.f26176b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26175a != null) {
            nyu.a(1, this.f26175a.intValue());
        }
        if (this.f26176b != null) {
            nyu.a(2, this.f26176b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26175a != null) {
            b += nyu.f(1, this.f26175a.intValue());
        }
        if (this.f26176b != null) {
            return b + nyu.b(2, this.f26176b);
        }
        return b;
    }

    private lqu m30097b(nyt nyt) {
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
                            this.f26175a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26176b = nyt.j();
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
