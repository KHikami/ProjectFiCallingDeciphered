package p000;

public final class lcu extends nyx<lcu> {
    private static volatile lcu[] f24619b;
    public Integer f24620a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28658b(nyt);
    }

    public static lcu[] m28659d() {
        if (f24619b == null) {
            synchronized (nzc.c) {
                if (f24619b == null) {
                    f24619b = new lcu[0];
                }
            }
        }
        return f24619b;
    }

    public lcu() {
        m28660g();
    }

    private lcu m28660g() {
        this.f24620a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24620a != null) {
            nyu.a(1, this.f24620a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24620a != null) {
            return b + nyu.f(1, this.f24620a.intValue());
        }
        return b;
    }

    private lcu m28658b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24620a = Integer.valueOf(nyt.f());
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
