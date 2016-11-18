package p000;

public final class ldx extends nyx<ldx> {
    private static volatile ldx[] f24731c;
    public String f24732a;
    public String f24733b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28805b(nyt);
    }

    public static ldx[] m28806d() {
        if (f24731c == null) {
            synchronized (nzc.c) {
                if (f24731c == null) {
                    f24731c = new ldx[0];
                }
            }
        }
        return f24731c;
    }

    public ldx() {
        m28807g();
    }

    private ldx m28807g() {
        this.f24732a = null;
        this.f24733b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24732a != null) {
            nyu.a(1, this.f24732a);
        }
        if (this.f24733b != null) {
            nyu.a(2, this.f24733b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24732a != null) {
            b += nyu.b(1, this.f24732a);
        }
        if (this.f24733b != null) {
            return b + nyu.b(2, this.f24733b);
        }
        return b;
    }

    private ldx m28805b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24732a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24733b = nyt.j();
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
