package p000;

public final class orm extends nyx<orm> {
    private static volatile orm[] f34033b;
    public String f34034a;

    public /* synthetic */ nzf m39446a(nyt nyt) {
        return m39443b(nyt);
    }

    public static orm[] m39444d() {
        if (f34033b == null) {
            synchronized (nzc.f31309c) {
                if (f34033b == null) {
                    f34033b = new orm[0];
                }
            }
        }
        return f34033b;
    }

    public orm() {
        m39445g();
    }

    private orm m39445g() {
        this.f34034a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39447a(nyu nyu) {
        if (this.f34034a != null) {
            nyu.m37170a(1, this.f34034a);
        }
        super.a(nyu);
    }

    protected int m39448b() {
        int b = super.b();
        if (this.f34034a != null) {
            return b + nyu.m37137b(1, this.f34034a);
        }
        return b;
    }

    private orm m39443b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34034a = nyt.m37117j();
                    continue;
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
