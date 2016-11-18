package p000;

public final class kkz extends nyx<kkz> {
    private static volatile kkz[] f22108c;
    public Integer f22109a;
    public Integer f22110b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26331b(nyt);
    }

    public static kkz[] m26332d() {
        if (f22108c == null) {
            synchronized (nzc.c) {
                if (f22108c == null) {
                    f22108c = new kkz[0];
                }
            }
        }
        return f22108c;
    }

    public kkz() {
        m26333g();
    }

    private kkz m26333g() {
        this.f22109a = null;
        this.f22110b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22109a != null) {
            nyu.a(1, this.f22109a.intValue());
        }
        if (this.f22110b != null) {
            nyu.a(2, this.f22110b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22109a != null) {
            b += nyu.f(1, this.f22109a.intValue());
        }
        if (this.f22110b != null) {
            return b + nyu.f(2, this.f22110b.intValue());
        }
        return b;
    }

    private kkz m26331b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22109a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f22110b = Integer.valueOf(nyt.f());
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
