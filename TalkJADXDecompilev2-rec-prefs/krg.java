package p000;

public final class krg extends nyx<krg> {
    private static volatile krg[] f22887c;
    public Integer f22888a;
    public Integer f22889b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27177b(nyt);
    }

    public static krg[] m27178d() {
        if (f22887c == null) {
            synchronized (nzc.c) {
                if (f22887c == null) {
                    f22887c = new krg[0];
                }
            }
        }
        return f22887c;
    }

    public krg() {
        m27179g();
    }

    private krg m27179g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22888a != null) {
            nyu.a(1, this.f22888a.intValue());
        }
        if (this.f22889b != null) {
            nyu.a(2, this.f22889b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22888a != null) {
            b += nyu.f(1, this.f22888a.intValue());
        }
        if (this.f22889b != null) {
            return b + nyu.f(2, this.f22889b.intValue());
        }
        return b;
    }

    private krg m27177b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f22888a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                            this.f22889b = Integer.valueOf(a);
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
