package p000;

public final class leg extends nyx<leg> {
    private static volatile leg[] f24818b;
    public String f24819a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28854b(nyt);
    }

    public static leg[] m28855d() {
        if (f24818b == null) {
            synchronized (nzc.c) {
                if (f24818b == null) {
                    f24818b = new leg[0];
                }
            }
        }
        return f24818b;
    }

    public leg() {
        m28856g();
    }

    private leg m28856g() {
        this.f24819a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24819a != null) {
            nyu.a(1, this.f24819a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24819a != null) {
            return b + nyu.b(1, this.f24819a);
        }
        return b;
    }

    private leg m28854b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24819a = nyt.j();
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
