package p000;

public final class lxc extends nyx<lxc> {
    private static volatile lxc[] f26746c;
    public Integer f26747a;
    public String f26748b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30965b(nyt);
    }

    public static lxc[] m30966d() {
        if (f26746c == null) {
            synchronized (nzc.c) {
                if (f26746c == null) {
                    f26746c = new lxc[0];
                }
            }
        }
        return f26746c;
    }

    public lxc() {
        m30967g();
    }

    private lxc m30967g() {
        this.f26748b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26747a != null) {
            nyu.a(1, this.f26747a.intValue());
        }
        if (this.f26748b != null) {
            nyu.a(2, this.f26748b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26747a != null) {
            b += nyu.f(1, this.f26747a.intValue());
        }
        if (this.f26748b != null) {
            return b + nyu.b(2, this.f26748b);
        }
        return b;
    }

    private lxc m30965b(nyt nyt) {
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
                            this.f26747a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26748b = nyt.j();
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
