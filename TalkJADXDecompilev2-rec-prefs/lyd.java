package p000;

public final class lyd extends nyx<lyd> {
    public String f26854a;
    public String f26855b;
    public lzj f26856c;
    public String[] f26857d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31111b(nyt);
    }

    public lyd() {
        m31112d();
    }

    private lyd m31112d() {
        this.requestHeader = null;
        this.f26854a = null;
        this.f26855b = null;
        this.f26856c = null;
        this.f26857d = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26854a != null) {
            nyu.a(2, this.f26854a);
        }
        if (this.f26855b != null) {
            nyu.a(3, this.f26855b);
        }
        if (this.f26856c != null) {
            nyu.b(4, this.f26856c);
        }
        if (this.f26857d != null && this.f26857d.length > 0) {
            for (String str : this.f26857d) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26854a != null) {
            b += nyu.b(2, this.f26854a);
        }
        if (this.f26855b != null) {
            b += nyu.b(3, this.f26855b);
        }
        if (this.f26856c != null) {
            b += nyu.d(4, this.f26856c);
        }
        if (this.f26857d == null || this.f26857d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26857d.length) {
            String str = this.f26857d[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lyd m31111b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.f26854a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26855b = nyt.j();
                    continue;
                case 34:
                    if (this.f26856c == null) {
                        this.f26856c = new lzj();
                    }
                    nyt.a(this.f26856c);
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f26857d == null ? 0 : this.f26857d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26857d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26857d = obj;
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
