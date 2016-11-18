package defpackage;

public final class lyz extends nyx<lyz> {
    public String a;
    public lzj b;
    public String[] c;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lyz() {
        d();
    }

    private lyz d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.c.length) {
            String str = this.c[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lyz b(nyt nyt) {
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
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lzj();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
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
