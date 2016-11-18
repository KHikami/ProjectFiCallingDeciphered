package p000;

public final class lsp extends nyx<lsp> {
    private static volatile lsp[] f26334c;
    public lor f26335a;
    public String[] f26336b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30345b(nyt);
    }

    public static lsp[] m30346d() {
        if (f26334c == null) {
            synchronized (nzc.c) {
                if (f26334c == null) {
                    f26334c = new lsp[0];
                }
            }
        }
        return f26334c;
    }

    public lsp() {
        m30347g();
    }

    private lsp m30347g() {
        this.f26335a = null;
        this.f26336b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26335a != null) {
            nyu.b(2, this.f26335a);
        }
        if (this.f26336b != null && this.f26336b.length > 0) {
            for (String str : this.f26336b) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26335a != null) {
            b += nyu.d(2, this.f26335a);
        }
        if (this.f26336b == null || this.f26336b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26336b.length) {
            String str = this.f26336b[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lsp m30345b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f26335a == null) {
                        this.f26335a = new lor();
                    }
                    nyt.a(this.f26335a);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    a = this.f26336b == null ? 0 : this.f26336b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26336b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26336b = obj;
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
