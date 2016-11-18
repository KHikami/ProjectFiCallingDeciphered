package p000;

public final class kxn extends nyx<kxn> {
    private static volatile kxn[] f23861c;
    public String f23862a;
    public String[] f23863b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27943b(nyt);
    }

    public static kxn[] m27944d() {
        if (f23861c == null) {
            synchronized (nzc.c) {
                if (f23861c == null) {
                    f23861c = new kxn[0];
                }
            }
        }
        return f23861c;
    }

    public kxn() {
        this.f23862a = null;
        this.f23863b = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23862a != null) {
            nyu.a(1, this.f23862a);
        }
        if (this.f23863b != null && this.f23863b.length > 0) {
            for (String str : this.f23863b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23862a != null) {
            b += nyu.b(1, this.f23862a);
        }
        if (this.f23863b == null || this.f23863b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f23863b.length) {
            String str = this.f23863b[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kxn m27943b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23862a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f23863b == null ? 0 : this.f23863b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23863b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23863b = obj;
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
