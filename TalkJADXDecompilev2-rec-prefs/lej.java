package p000;

public final class lej extends nyx<lej> {
    public leq f24828a;
    public String f24829b;
    public String[] f24830c;
    public lek f24831d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28871b(nyt);
    }

    public lej() {
        m28872d();
    }

    private lej m28872d() {
        this.f24828a = null;
        this.f24829b = null;
        this.f24830c = nzl.f;
        this.f24831d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24828a != null) {
            nyu.b(1, this.f24828a);
        }
        if (this.f24829b != null) {
            nyu.a(2, this.f24829b);
        }
        if (this.f24830c != null && this.f24830c.length > 0) {
            for (String str : this.f24830c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f24831d != null) {
            nyu.b(4, this.f24831d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24828a != null) {
            b += nyu.d(1, this.f24828a);
        }
        if (this.f24829b != null) {
            b += nyu.b(2, this.f24829b);
        }
        if (this.f24830c != null && this.f24830c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f24830c.length) {
                String str = this.f24830c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f24831d != null) {
            return b + nyu.d(4, this.f24831d);
        }
        return b;
    }

    private lej m28871b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24828a == null) {
                        this.f24828a = new leq();
                    }
                    nyt.a(this.f24828a);
                    continue;
                case wi.dH /*18*/:
                    this.f24829b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.f24830c == null ? 0 : this.f24830c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24830c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24830c = obj;
                    continue;
                case 34:
                    if (this.f24831d == null) {
                        this.f24831d = new lek();
                    }
                    nyt.a(this.f24831d);
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
