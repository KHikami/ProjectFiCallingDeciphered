package p000;

public final class mua extends nyx<mua> {
    private static volatile mua[] f28331c;
    public String[] f28332a;
    public String f28333b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32914b(nyt);
    }

    public static mua[] m32915d() {
        if (f28331c == null) {
            synchronized (nzc.c) {
                if (f28331c == null) {
                    f28331c = new mua[0];
                }
            }
        }
        return f28331c;
    }

    public mua() {
        m32916g();
    }

    private mua m32916g() {
        this.f28332a = nzl.f;
        this.f28333b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28332a != null && this.f28332a.length > 0) {
            for (String str : this.f28332a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f28333b != null) {
            nyu.a(2, this.f28333b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f28332a == null || this.f28332a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f28332a.length) {
                String str = this.f28332a[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f28333b != null) {
            return i + nyu.b(2, this.f28333b);
        }
        return i;
    }

    private mua m32914b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    a = this.f28332a == null ? 0 : this.f28332a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28332a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f28332a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f28333b = nyt.j();
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
