package p000;

public final class lsz extends nyx<lsz> {
    private static volatile lsz[] f26356b;
    public ofm f26357a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30397b(nyt);
    }

    public static lsz[] m30398d() {
        if (f26356b == null) {
            synchronized (nzc.c) {
                if (f26356b == null) {
                    f26356b = new lsz[0];
                }
            }
        }
        return f26356b;
    }

    public lsz() {
        m30399g();
    }

    private lsz m30399g() {
        this.f26357a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26357a != null) {
            nyu.b(1, this.f26357a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26357a != null) {
            return b + nyu.d(1, this.f26357a);
        }
        return b;
    }

    private lsz m30397b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26357a == null) {
                        this.f26357a = new ofm();
                    }
                    nyt.a(this.f26357a);
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
