package p000;

public final class kwv extends nyx<kwv> {
    private static volatile kwv[] f23802c;
    public String f23803a;
    public String[] f23804b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27857b(nyt);
    }

    public static kwv[] m27858d() {
        if (f23802c == null) {
            synchronized (nzc.c) {
                if (f23802c == null) {
                    f23802c = new kwv[0];
                }
            }
        }
        return f23802c;
    }

    public kwv() {
        m27859g();
    }

    private kwv m27859g() {
        this.f23803a = null;
        this.f23804b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23803a != null) {
            nyu.a(1, this.f23803a);
        }
        if (this.f23804b != null && this.f23804b.length > 0) {
            for (String str : this.f23804b) {
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
        if (this.f23803a != null) {
            b += nyu.b(1, this.f23803a);
        }
        if (this.f23804b == null || this.f23804b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f23804b.length) {
            String str = this.f23804b[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kwv m27857b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23803a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f23804b == null ? 0 : this.f23804b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23804b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23804b = obj;
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
