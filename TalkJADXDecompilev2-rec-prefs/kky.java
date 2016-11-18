package p000;

public final class kky extends nyx<kky> {
    private static volatile kky[] f22105c;
    public kkz[] f22106a;
    public String f22107b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26325b(nyt);
    }

    public static kky[] m26326d() {
        if (f22105c == null) {
            synchronized (nzc.c) {
                if (f22105c == null) {
                    f22105c = new kky[0];
                }
            }
        }
        return f22105c;
    }

    public kky() {
        m26327g();
    }

    private kky m26327g() {
        this.f22106a = kkz.m26332d();
        this.f22107b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22106a != null && this.f22106a.length > 0) {
            for (nzf nzf : this.f22106a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22107b != null) {
            nyu.a(2, this.f22107b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22106a != null && this.f22106a.length > 0) {
            for (nzf nzf : this.f22106a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f22107b != null) {
            return b + nyu.b(2, this.f22107b);
        }
        return b;
    }

    private kky m26325b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f22106a == null) {
                        a = 0;
                    } else {
                        a = this.f22106a.length;
                    }
                    Object obj = new kkz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22106a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kkz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kkz();
                    nyt.a(obj[a]);
                    this.f22106a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f22107b = nyt.j();
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
