package p000;

public final class ntc extends nyx<ntc> {
    private static volatile ntc[] f30740b;
    public int f30741a;

    public /* synthetic */ nzf m36446a(nyt nyt) {
        return m36444b(nyt);
    }

    public static ntc[] m36445d() {
        if (f30740b == null) {
            synchronized (nzc.f31309c) {
                if (f30740b == null) {
                    f30740b = new ntc[0];
                }
            }
        }
        return f30740b;
    }

    public ntc() {
        this.f30741a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36447a(nyu nyu) {
        if (this.f30741a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30741a);
        }
        super.a(nyu);
    }

    protected int m36448b() {
        int b = super.b();
        if (this.f30741a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f30741a);
        }
        return b;
    }

    private ntc m36444b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f30741a = a;
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
