package defpackage;

public final class kxn extends nyx<kxn> {
    private static volatile kxn[] c;
    public String a;
    public String[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kxn[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new kxn[0];
                }
            }
        }
        return c;
    }

    public kxn() {
        this.a = null;
        this.b = nzl.f;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (String str : this.b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.b.length) {
            String str = this.b[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kxn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.b = obj;
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
