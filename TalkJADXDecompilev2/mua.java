package defpackage;

public final class mua extends nyx<mua> {
    private static volatile mua[] c;
    public String[] a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mua[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new mua[0];
                }
            }
        }
        return c;
    }

    public mua() {
        g();
    }

    private mua g() {
        this.a = nzl.f;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.a.length) {
                String str = this.a[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.b != null) {
            return i + nyu.b(2, this.b);
        }
        return i;
    }

    private mua b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    a = this.a == null ? 0 : this.a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
