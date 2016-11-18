package p000;

public final class lny extends nyx<lny> {
    private static volatile lny[] f25838c;
    public muu f25839a;
    public Integer f25840b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29689b(nyt);
    }

    public static lny[] m29690d() {
        if (f25838c == null) {
            synchronized (nzc.c) {
                if (f25838c == null) {
                    f25838c = new lny[0];
                }
            }
        }
        return f25838c;
    }

    public lny() {
        m29691g();
    }

    private lny m29691g() {
        this.f25839a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25839a != null) {
            nyu.b(1, this.f25839a);
        }
        if (this.f25840b != null) {
            nyu.a(2, this.f25840b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25839a != null) {
            b += nyu.d(1, this.f25839a);
        }
        if (this.f25840b != null) {
            return b + nyu.f(2, this.f25840b.intValue());
        }
        return b;
    }

    private lny m29689b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25839a == null) {
                        this.f25839a = new muu();
                    }
                    nyt.a(this.f25839a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25840b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
